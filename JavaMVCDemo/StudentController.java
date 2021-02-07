public class StudentController {
   private StudentModel _model;
   private StudentView _view;

   public StudentController(StudentModel model, StudentView view){
      this._model = model;
      this._view = view;
   }

   public void setStudentName(String name){
      _model.setName(name);		
   }

   public String getStudentName(){
      return _model.getName();		
   }

   public void setStudentRegNo(String regNo){
      _model.setRegNo(regNo);		
   }

   public String getStudentRegNo(){
      return _model.getRegNo();		
   }

   public void updateView(){				
      _view.printStudentDetails(_model.getName(), _model.getRegNo());
   }	
}