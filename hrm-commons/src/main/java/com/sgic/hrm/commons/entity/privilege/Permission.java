//package com.sgic.hrm.commons.entity.privilege;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//@Table(name = "permission", schema = "employee")
//public class Permission {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//
//	@ManyToOne
//	private AuthorizeType authorizeType;
//
//	@JsonIgnore
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "module_id", nullable = false)
//	private Module module;
//
//	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "permission")
//	@JsonIgnore
//	private List<Privilege> privileges;
//
//	public Integer getId() {
//		return id;
//	}
//
//	public AuthorizeType getAuthorizeType() {
//		return authorizeType;
//	}
//
//	public Module getModule() {
//		return module;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public void setAuthorizeType(AuthorizeType authorizeType) {
//		this.authorizeType = authorizeType;
//	}
//
//	public void setModule(Module module) {
//		this.module = module;
//	}
//
//	public List<Privilege> getPrivileges() {
//		return privileges;
//	}
//
//	public void setPrivileges(List<Privilege> privileges) {
//		this.privileges = privileges;
//	}
//
//}
