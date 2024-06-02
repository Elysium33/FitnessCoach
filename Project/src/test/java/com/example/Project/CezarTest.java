package com.example.Project;


import com.example.Project.entity.Client;
import com.example.Project.observerService.AdminObserver;
import com.example.Project.observerService.ClientObserver;
import com.example.Project.repository.ClientRepository;
import com.example.Project.service.ClientService;
import com.example.Project.service.ClientServiceImplementation;
//import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;


public class CezarTest {

    @Mock
    private List<ClientObserver> clientObserversMock;
    @Mock
    private List<AdminObserver> adminObserversMock;
    @Mock
    private ClientRepository clientRepositoryMock;
    private ClientService clientService;


    @BeforeEach
   public void setUp(){
      MockitoAnnotations.initMocks(this);
      this.clientService = new ClientServiceImplementation(clientObserversMock, adminObserversMock, clientRepositoryMock);
    }

    @Test
    public void saveUserTest(){
        Client myClient = new Client("test", "test", "test", 5L);
        clientService.createClient(myClient);
        verify(clientRepositoryMock.save(myClient));
    }




    //private static Cezar cezar;

//    @BeforeAll
//    public static void setUp() throws Exception{
//        cezar = new Cezar("ABC");
//
//    }

//    @Test
//    public void testOne(){
//        assertEquals("EFG", cezar.computePassword("Medium"));
//    }
//
//    @Test
//    public void testTwo(){
//        assertEquals("BCD", cezar.computePassword("Easy"));
//    }
//
//    @Test
//    public void testThree(){
//        assertEquals("BCD", cezar.computePassword("Complex"));
//    }

}
