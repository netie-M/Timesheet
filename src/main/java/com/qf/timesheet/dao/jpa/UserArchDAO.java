package com.qf.timesheet.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.qf.timesheet.entity.UserArch;

@Repository(value = "userArchJpaDAO")
@RepositoryRestResource(path = "userArch")
public interface UserArchDAO extends
		PagingAndSortingRepository<UserArch, Long>,
		JpaSpecificationExecutor<UserArch> {

	UserArch findByUserId(@Param("userId") String userId);
	
	List<UserArch> findByUserStatus(@Param("userStatus") String userStatus);

}
