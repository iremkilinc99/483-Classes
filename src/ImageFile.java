public class ImageFile implements Print{
    CourseContent courseContent;

    public ImageFile(CourseContent courseContent){
        this.courseContent = courseContent;
        courseContent.files();
        print();
    }

    @Override
    public void print() {
        if(courseContent.fileCreated == 1)
            System.out.println("Audio File is added.");
    }
}
