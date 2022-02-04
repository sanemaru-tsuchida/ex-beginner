package com.example.From;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserFrom {
	@NotBlank(message="名前は必須です。")
	private String name;
	
	@Pattern(regexp ="^[0-9]+$",message="半角数字を入力してください。")
	private String age;
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Size(min=1,max=127,message="一文字以上五百文字以内で記述してください。")
	private String comment;
	
	public String getName() {
		return name;
	}
	
	public String getComment() {
		return comment;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
}
