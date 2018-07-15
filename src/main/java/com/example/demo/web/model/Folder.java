package com.example.demo.web.model;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;



@Entity
@Table(name = "Folders")
@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
   //     allowGetters = true)
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String content;

   // @Column(nullable = false, updatable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    @CreatedDate
//    private Date createdAt;
//
//    @Column(nullable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    @LastModifiedDate
//    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

	public static void addAttribute(String string, Folder save) {
		// TODO Auto-generated method stub
		
	}

//    public Date getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public Date getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(Date updatedAt) {
//        this.updatedAt = updatedAt;
//    }

}
//import org.hibernate.validator.constraints.NotEmpty;
//
//@Entity
//@Table(name = "Folders")
//public class Folder {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id")
//	private int id;
//
//	@Column(name = "strFolderName")
//	@NotEmpty(message = "Please provide a folder name")
//	private String strFolderName;
//	
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "dateCreated")
//	private Date dateCreated;
//	
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//	
//	public String getstrFolderName() {
//		return strFolderName;
//	}
//
//	public void setstrFolderName(String strFolderName) {
//		this.strFolderName = strFolderName;
//	}
//	
//	public Date getdateCreated() {
//		return dateCreated;
//	}
//
//	public void setdateCreated(Date dateCreated) {
//		this.dateCreated	 = dateCreated;
//	}
//	
//}
