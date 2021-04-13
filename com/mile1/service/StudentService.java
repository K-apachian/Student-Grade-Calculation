package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

	public int findNumberOfNullMarks(Student data[]){
		int nullmarkscount=0;
		for(int i=0;i<data.length;i++){
			try{
				data[i].getMarks();
			}
			catch(Exception e) {
				nullmarkscount++;
			}
		}
		return nullmarkscount;
	}
	public int findNumberOfNullNames(Student data[]){
		int nullnamescount=0;
		for(int i=0;i<data.length;i++){
			try {
				data[i].getName();
			}
			catch(Exception e) {
				nullnamescount++;
			}
		}
		return nullnamescount;
	}
	public int findNumberOfNullObjects(Student data[]){
		int nullobjectscount=0;
		for(int i=0;i<data.length;i++){
			if(data[i]==null) 
				nullobjectscount++;
		}
		return nullobjectscount;
	}
}
