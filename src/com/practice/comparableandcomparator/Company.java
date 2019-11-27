package com.practice.comparableandcomparator;

import java.util.Comparator;

import lombok.Data;
@Data
public class Company implements Comparable<Company> {

	private int companyId;
	private String companyName;
	private String address;
	//private boolean active;

	public Company(int companyId, String companyName, String address) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.address = address;
		//this.active = active;
	}

	public int getCompanyId() {
		return companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getAddress() {
		return address;
	}

//	public boolean isActive() {
//		return active;
//	}

	public static Comparator<Company> getIdComparator() {
		return idComparator;
	}

	@Override
	public String toString() {
		return "companyId=" + companyId + ", companyName=" + companyName + ", address=" + address + "";
	}

	@Override
	public int compareTo(Company o) {
		return (this.companyId - o.companyId);
	}

	public static Comparator<Company> idComparator = new Comparator<Company>() {

		@Override
		public int compare(Company o1, Company o2) {

			return o1.getCompanyId() - o2.getCompanyId();
		}

	};

	public static Comparator<Company> nameComparator = new Comparator<Company>() {

		@Override
		public int compare(Company o1, Company o2) {
			return o1.getCompanyName().compareTo(o2.getCompanyName());
		}
	};

	public static Comparator<Company> addressComparator = new Comparator<Company>() {

		@Override
		public int compare(Company o1, Company o2) {
			return o1.getAddress().compareTo(o2.getAddress());
		}

	};

	public static Comparator<Company> searchByIdandName = new Comparator<Company>() {

		@Override
		public int compare(Company o1, Company o2) {
			int flag = o1.getCompanyId() - o2.getCompanyId();
			if (flag == 0)
				flag = o1.getCompanyName().compareTo(o2.getCompanyName());
			return flag;
		}
	};

}
