package com.day2.universitysystem;

class Undergraduate extends Student 
{
    Undergraduate(String name) 
    {
        super(name);
    }
}

class Postgraduate extends Student 
{
    Postgraduate(String name, String elective) 
    {
        super(name, elective);
    }
}
