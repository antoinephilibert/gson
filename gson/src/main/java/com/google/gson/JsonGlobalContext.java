package com.google.gson;

import com.praxem.google.ext.SaveMethod;

public interface JsonGlobalContext
{
   public JsonGlobalContext getContext();
   
   public SaveMethod getSaveMethod();
   
   public boolean isRandomNumberActive();
   
   public double getRandomDouble();
}
