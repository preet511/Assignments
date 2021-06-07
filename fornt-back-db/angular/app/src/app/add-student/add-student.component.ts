import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';
import { FormControl, FormGroup, Validators} from '@angular/forms';
import { Student } from '../student';

@Component({
  selector: 'app-add-student',
  templateUrl: './abc.component.html',
  styleUrls: ['./add-student.component.css']
})
export class AddStudentComponent implements OnInit {
  static studenetsaveform: any;

  constructor(private studentservice:StudentService) { }

  /* created the object of student class */
  student : Student = new Student();

  submitted = false;

  ngOnInit() {

	  console.log("print");
    this.submitted=false;
  }



/* mapping html  values */
 studentsaveform=new FormGroup({
  student_name:new FormControl('' , [Validators.nullValidator ,Validators.required , Validators.minLength(5) ] ),
  student_email:new FormControl('',[Validators.nullValidator, Validators.required,Validators.email]),
  student_branch:new FormControl()
  });

  get StudentName(){
    return this.studentsaveform.get('student_name');
  }

  get StudentEmail(){
    return this.studentsaveform.get('student_email');
  }

  get StudentBranch(){
    return this.studentsaveform.get('student_branch');
  }


  /*  save method */


  saveStudent(saveStudent: any){
    this.student=new Student();
    this.student.student_name = this.StudentName?.value;
    this.student.student_email = this.StudentEmail?.value;
    this.student.student_branch = this.StudentBranch?.value;
    this.submitted = true;
    this.save();
  }

  /* inset logic here */    /*this method is resposible dumping values to the backend*/

  save() {
    this.studentservice.createStudent(this.student)
      .subscribe(data => console.log(data), error => console.log(error));
    this.student = new Student();
  }

  addStudentForm(){
    this.submitted=false;
    this.studentsaveform.reset();
  }

  resetData() : void{
    this.studentsaveform.reset;
  }
}
