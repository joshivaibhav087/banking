package com.org.security;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.org.security.model.Resource;
import com.org.security.model.Role;
import com.org.security.model.RolePermission;
import com.org.security.repository.AccessRepository;
import com.org.security.repository.PermissionRepository;
import com.org.security.repository.RoleRepository;
import com.org.security.service.AccessService;
@RunWith(SpringRunner.class)

@SpringBootTest
class SecurityModuleOauth2ApplicationTests {

	@Autowired
	AccessService accessService;
	
	@MockBean
	private RoleRepository roleRepository;
	
	@MockBean
	private AccessRepository accessRepository;
	
	@MockBean
	private PermissionRepository permissionRepository;
	
	@Test
	public void findRoleByIdTest() {
		int id = 3;
		int resourceId=1;
		int roleId=3;
		boolean canAdd=true;
		boolean canEdit=true;
		boolean canView=true;
		boolean canDelete=false;
		when(permissionRepository.findByroleId(roleId))
		.thenReturn(Stream.of(new RolePermission(3,1,3,true,true,true,false)).collect(Collectors.toList()));
		 accessService.getPermissionsByRoleId(roleId).equals(roleId);
	}

	@Test
	public void addRoleTest() {
	Role role = new Role(1,"TestRole");

	when(roleRepository.save(role)).thenReturn(role);
	assertEquals(role,accessService.addRole(role));
	}
	@Test
	public void addResourceTest() {
	Resource resource = new Resource();

	when(accessRepository.save(resource)).thenReturn(resource);
	assertEquals(resource,accessService.addResource(resource));
}
}
