//package com.unkownkoder.repository;
//
//import com.unkownkoder.models.User;
//import org.springframework.data.ldap.repository.LdapRepository;
//
//import java.util.List;
//
//public interface UserLdapRepository extends LdapRepository<User> {
//    User findByUsername(String username);
//    User findByUsernameAndPassword(String username, String password);
//    List<User> findByUsernameLikeIgnoreCase(String username);
//}
