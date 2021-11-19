package day01;


import java.lang.reflect.Method;

public class AnnoUse {

	public static void main(String[] args)throws Exception {
		for(Method mtd : Service.class.getDeclaredMethods()) {

			if(mtd.isAnnotationPresent(SampleAnnoWons.class)) {
				SampleAnnoWons annoWons = mtd.getAnnotation(SampleAnnoWons.class);
				System.out.println(mtd.getName() + "메서드에는 어노테이션이 붙어 있습니다.");
				for(int i = 0; i < annoWons.number(); i++ ) {
					System.out.print(annoWons.value());
				}
				System.out.println();
				
			}else {
				System.out.println(mtd.getName() + "메서드에는 어노테이션이 붙어 있지 않습니다.");
			}
			
		}


	}

}
