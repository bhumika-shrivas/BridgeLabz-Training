package com.reflection.intermediatelevel.retrieveannotation;

public class AnnotationReadDemo {

    public static void main(String[] args) {

        try {
            Class<Book> cls = Book.class;

            // Check if annotation is present
            if (cls.isAnnotationPresent(Author.class)) {

                Author author = cls.getAnnotation(Author.class);

                System.out.println("Author name is " + author.name());
            } else {
                System.out.println("Author annotation not found");
            }

        } catch (Exception e) {
            System.out.println("Error while reading annotation");
        }
    }
}

