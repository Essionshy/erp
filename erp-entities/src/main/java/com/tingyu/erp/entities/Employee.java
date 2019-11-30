package com.tingyu.erp.entities;

import java.util.Date;

public class Employee {
    private Long id;

    private String empId;

    private String userName;

    private String password;

    private String empName;

    private String gender;

    private String email;

    private String phone;

    private String address;

    private Byte age;

    private Date birth;

    private String idNumber;

    private Boolean education;

    private String institution;

    private String major;

    private Short graduationDate;

    private String nationality;

    private Byte political;

    private String maried;

    private String linkman;

    private Boolean linkmanRelation;

    private String linkmanPhone;

    private String nativePlace;

    private String leaderId;

    private String deptId;

    private Date gmtCreate;

    private Date gmtModified;
    
    private Department dept;
    
    
    
    @Override
	public String toString() {
		return "Employee [id=" + id + ", empId=" + empId + ", userName=" + userName + ", password=" + password
				+ ", empName=" + empName + ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", address="
				+ address + ", age=" + age + ", birth=" + birth + ", idNumber=" + idNumber + ", education=" + education
				+ ", institution=" + institution + ", major=" + major + ", graduationDate=" + graduationDate
				+ ", nationality=" + nationality + ", political=" + political + ", maried=" + maried + ", linkman="
				+ linkman + ", linkmanRelation=" + linkmanRelation + ", linkmanPhone=" + linkmanPhone + ", nativePlace="
				+ nativePlace + ", leaderId=" + leaderId + ", deptId=" + deptId + ", gmtCreate=" + gmtCreate
				+ ", gmtModified=" + gmtModified + ", dept=" + dept + "]";
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public Boolean getEducation() {
        return education;
    }

    public void setEducation(Boolean education) {
        this.education = education;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution == null ? null : institution.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Short getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Short graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public Byte getPolitical() {
        return political;
    }

    public void setPolitical(Byte political) {
        this.political = political;
    }

    public String getMaried() {
        return maried;
    }

    public void setMaried(String maried) {
        this.maried = maried == null ? null : maried.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public Boolean getLinkmanRelation() {
        return linkmanRelation;
    }

    public void setLinkmanRelation(Boolean linkmanRelation) {
        this.linkmanRelation = linkmanRelation;
    }

    public String getLinkmanPhone() {
        return linkmanPhone;
    }

    public void setLinkmanPhone(String linkmanPhone) {
        this.linkmanPhone = linkmanPhone == null ? null : linkmanPhone.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId == null ? null : leaderId.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}