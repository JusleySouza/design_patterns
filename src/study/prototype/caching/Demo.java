package study.prototype.caching;

import study.prototype.caching.cache.BundledShapeCache;
import study.prototype.example.shapes.Shape;

public class Demo {
	
	 public static void main(String[] args) {
	        BundledShapeCache cache = new BundledShapeCache();

	        Shape shape1 = cache.get("Big green circle");
	        Shape shape2 = cache.get("Medium blue rectangle");
	        Shape shape3 = cache.get("Medium blue rectangle");

	        if (shape1 != shape2 && !shape1.equals(shape2)) {
	            System.out.println("Big green circle != Medium blue rectangle (yes!)");
	        } else {
	            System.out.println("Big green circle == Medium blue rectangle (not!)");
	        }

	        if (shape2 != shape3) {
	            System.out.println("Medium blue rectangles are two different objects (yes!)");
	            if (shape2.equals(shape3)) {
	                System.out.println("And they are identical (yes!)");
	            } else {
	                System.out.println("But they are not identical (not!)");
	            }
	        } else {
	            System.out.println("Rectangle objects are the same (not!)");
	        }
	    }

}
