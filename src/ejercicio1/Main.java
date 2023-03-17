package ejercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        NoGenericMethod<Integer, Integer, Integer> prueba= new NoGenericMethod<>(1,2,3);
        System.out.println(prueba.getT1()+" "+prueba.getT2()+" "+prueba.getT3());
        NoGenericMethod <String,Integer,String> prueba2= new NoGenericMethod<>("Bill",2,"Ali");
        System.out.println(prueba2.getT1()+" "+prueba2.getT2()+" "+prueba2.getT3());

	}

}
