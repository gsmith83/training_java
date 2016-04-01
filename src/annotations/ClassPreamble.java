package annotations;

import java.lang.annotation.Documented;

// Declaring an annotation type
@Documented     // make information here appear in Javadoc-generated documenation
@interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "n/a";
    String lastModifiedBy() default "n/a";
    // Note use of array
    String[] reviewers();
}
