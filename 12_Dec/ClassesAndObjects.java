public class ClassesAndObjects {
    
}
/**
 * the concept of classes and objects in java is same as in c++ with the following changes 
 * 1] each data member is individualy defined as private or public
 * 2] the object of class is always created dynamically using the 'new' operator unlikes C++. java does not create
 * an object directly but creates a reference variable, object is created with the help of "'new'" and 
 * its address is stored in reference variable in C++ the object is assign to another object where as in java the 
 * references are copied
 * 3] the member functions are termed as 'methods'
 * 
 *  emp e1; ------------> +----------+
 * Reference vars       /^| name     |
 *                     /  | age      |
 *                    /   | bs       |
 *                   /    | display()|
 *              emp e3;   |          |
 *                        |__________|
 * 
 * 
 * 
 * the object creation process in java does not use the class defination but uses the compiled version of the class 
 * that does not use class emp but uses emp.class 
 */
