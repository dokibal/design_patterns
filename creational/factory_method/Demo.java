package factory_method;
enum SystemType{
    WINDOWS,
    HTML
};

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure(SystemType.WINDOWS);
        dialog.renderWindow();
    }

    public static void configure(SystemType systemType){
        if(systemType == SystemType.HTML){
            dialog = new HTMLDialog();
        }
        else{
            dialog = new WindowsDialog();
        }
    }
}
