package com.example.test.es;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "projdoc")
public class ProjDoc implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -5855518849808155423L;
	
	@Id
    @Field(type= FieldType.Text)
	private String id;
	@Field(type= FieldType.Text)
	private String filename;
	@Field(type= FieldType.Text)
    private String projectname;
	@Field(type= FieldType.Text)
    private String projectmember;
    @Field(type= FieldType.Text)
    private String allContent;
    @Field(type= FieldType.Text)
    private String researchOne;
    @Field(type= FieldType.Date,pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    private Date createTime;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getProjectmember() {
		return projectmember;
	}
	public void setProjectmember(String projectmember) {
		this.projectmember = projectmember;
	}
	public String getAllContent() {
		return allContent;
	}
	public void setAllContent(String allContent) {
		this.allContent = allContent;
	}
	public String getResearchOne() {
		return researchOne;
	}
	public void setResearchOne(String researchOne) {
		this.researchOne = researchOne;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public ProjDoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProjDoc(String id, String filename, String projectname, String projectmember, String allContent,
			String researchOne, Date createTime) {
		super();
		this.id = id;
		this.filename = filename;
		this.projectname = projectname;
		this.projectmember = projectmember;
		this.allContent = allContent;
		this.researchOne = researchOne;
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "ProjDoc [id=" + id + ", filename=" + filename + ", projectname=" + projectname + ", projectmember="
				+ projectmember + ", allContent=" + allContent + ", researchOne=" + researchOne + ", createTime="
				+ createTime + "]";
	}

   
}
