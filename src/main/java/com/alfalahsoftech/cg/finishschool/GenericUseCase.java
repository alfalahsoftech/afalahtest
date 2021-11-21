package com.alfalahsoftech.cg.finishschool;

public class GenericUseCase {

}

 interface Repos<T>{
	
	public T findAll(T t);
	public T create(T po);
}
