package com.campusdual.classroom;

public class Tractor implements IMachine{

	protected int horsePower = 0;
	
	public Tractor(int hp) {
		this.horsePower = hp;
	}

	public void start(){
		System.out.println("Tractor encendido");
	}
	public void stop(){
		System.out.println("Tractor apagado");
	}

	public void maintenance() {
		System.out.println("Tractor en mantenimiento)");
	}

	public void forward() {
		System.out.println("El tractor avanza");
	}

	public void backward() {
		System.out.println("El tractor retrocede");
	}

}
