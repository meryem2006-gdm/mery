import view.*;
import dao.*;
import model.*;
import controller.EmployerController;

public class Allah {
    public static void main(String[] args) {
        new EmployerController( new FormFrame(), new EmployerLogic(new EmployerDAO()));
    }
}
