package annotations;

//Using our annotation type
@ClassPreamble(
        author = "John Doe",
        date = "04/01/2016",
        currentRevision = 2,
        lastModified = "04/01/2016",
        lastModifiedBy = "Jane Doe",
        //Note array notation
        reviewers = {"Zeus", "Ydris", "Xxactl"}
)
public class AnnotationBasics {
    
    /**
     * @deprecated
     * explanation why method is deprecated
     * use something_else instead
     */
    @Deprecated
    void deprecatedMethod(){System.out.println("In deprecated method");}
    
    
    // Mark a method as a superclass method that has been overridden
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
    
    // Suppress the deprecated warning
    @SuppressWarnings("deprecation")    // why is this unnecessary?
    void useDeprecatedMethod(){
        deprecatedMethod();
    }
    
    
    
    public static void main(String[] args){
        AnnotationBasics ann = new AnnotationBasics();
        
        ann.useDeprecatedMethod();
    }
}
