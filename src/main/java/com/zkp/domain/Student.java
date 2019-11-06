package com.zkp.domain;

public class Student {
		private Integer sid;
		private String sname;
		private String sex;
		private String love;
		public Integer getSid() {
			return sid;
		}
		public void setSid(Integer sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getLove() {
			return love;
		}
		public void setLove(String love) {
			this.love = love;
		}
		public Student(Integer sid, String sname, String sex, String love) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.sex = sex;
			this.love = love;
		}
		public Student() {
			super();
		}
		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", sex=" + sex + ", love=" + love + "]";
		}
		
		
}
