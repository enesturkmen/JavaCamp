package hw2;
public class Main {

	public static void main(String[] args) {
		
		CourseManager courseManager = new CourseManager();
		Courses course1 = new Courses(1, "Java", "Engin Demirog");
		Courses course2 = new Courses(2, "C#", "Engin Demirog");
		
		Category category1 = new Category(1, "Programming");
		Category category2 = new Category(1, "Algorthm");
		
		Category[] categories = {category1, category2};
		
		for(Category category : categories) {
			System.out.println(category.catName + " listelendi.");
		}
		
		
		
		courseManager.Start(course1);
		courseManager.Start(course2);

	}

}