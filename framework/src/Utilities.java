/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu1794.framework;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author rango
 */
public class Utilities {
    
    public static List<Class<?>> getClasses(String scannedPackage) throws Exception {
        
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            String path = scannedPackage.replace('.', '/');
            System.out.println(path);
            Enumeration<URL> resources = classLoader.getResources(path);
            System.out.println(resources);
            List<File> dirs = new ArrayList<>();
            while (resources.hasMoreElements()) {
                URL resource = resources.nextElement();
                dirs.add(new File(resource.getFile()));
            }
            List<Class<?>> classes = new ArrayList<>();
            for (File directory : dirs) {
                classes.addAll(findClasses(directory, scannedPackage));
            }
            return classes;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error on gettimg classes in package");
        }
        
    }

    private static List<Class<?>> findClasses(File dirFile, String packageName) throws Exception {
        List<Class<?>> classes = new ArrayList<>();
        String dir = dirFile.getPath().replace("%20", " ");
        File directory = new File(dir);
        System.out.println("directory :" + directory);
        
        try {
            if (!directory.exists()) {
                System.out.println("directory not found");
                return classes;
            }
            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    assert !file.getName().contains(".");
                    classes.addAll(findClasses(file, packageName + "." + file.getName()));
                } else if (file.getName().endsWith(".class")) {
                    String className = packageName + '.' + file.getName().substring(0, file.getName().length() - 6);
                    classes.add(Class.forName(className));
                }
            }
            System.out.println("classes :" + classes);
            return classes;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error on getting classes in a specific directory");
        }
    }
    
    public static HashMap<String,Mapping> getAnnotatedMethods(String packageName, Class<? extends Annotation> annotationClass) throws Exception {
        try {
            List<Class<?>> classes = getClasses(packageName);
            HashMap<String,Mapping> annotatedMethods = new HashMap<String,Mapping>();
            for (Class<?> cls : classes) {
                Method[] methods = cls.getDeclaredMethods();
                for (Method method : methods) {
                    Annotation annotation = method.getAnnotation(annotationClass);
                    if (annotation != null) {
                        annotatedMethods.put(((AnnotedClass) annotation).methodName(), new Mapping( cls.getName(), method.getName()));
                    }
                }
            }
            return annotatedMethods;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error on getting all methods annoted");
        }
       
    }
}
