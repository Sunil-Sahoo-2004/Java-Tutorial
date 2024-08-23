package DatetimeAPI;

// ** Annotation is a Type od metadata that can added to a class, method, field, parameter, or other program element to provide additional information about the element **
// ** Annotation are used by the compiler, runtime, and other tools to generate code, Perform runtime chacks and provide documentation and other information **
// ** Annotion are represented using @ Symbol folled by the name of the annotation, and they can take parameters that provide additional Information


// Funstional Interface
    // ** When a Interface is contain Only one Abstruct Method is called FunctionalInterface ** 
    @FunctionalInterface
    interface Demo{
        void desp();
    }
    
    // This is a parent Class
       // ** Deprecated Annotation says "If we making an object of this class this could not be run properly" **
    @Deprecated
    class plane{
        public void PlaneFliesAtGoodHeight(){
            System.out.println("Plane flies");
        }
    }
    // This is child class or sub-class
    class cargoPlane extends plane{
        // Overwriden method from parent class
           // **  Override only applicable for the Methods If we use it on the class then it shows Error  **
        @Override
        public void PlaneFliesAtGoodHeight(){
            System.out.println("Cargo plane flies low");
        }
    }

public class Annotation {
    public static void main(String[] args) {
        plane cp = new cargoPlane();
        cp.PlaneFliesAtGoodHeight();
    }
}
