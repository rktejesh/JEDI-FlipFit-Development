/**
 * 
 */
package com.flipkart.dao.daoImpl;

import com.flipkart.bean.Gym;
import com.flipkart.bean.GymOwner;
import com.flipkart.bean.User;
import com.flipkart.dao.GymOwnerDAO;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
public class GymOwnerDAOImpl implements GymOwnerDAO {
    ArrayList<GymOwnerDAO> gymOwner = new ArrayList<GymOwnerDAO>();
    private static GymOwnerDAOImpl gymOwnerDaoObj = null;

    private GymOwnerDAOImpl() {
    }

    public static synchronized GymOwnerDAOImpl getInstance() {
        if (gymOwnerDaoObj == null)
            gymOwnerDaoObj = new GymOwnerDAOImpl();

        return gymOwnerDaoObj;
    }
    @Override
    public void addGym(Gym gmy) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Gym> getAllGyms(int userId) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void addTimeSlot(Gym gym) {
        //logic to add time slot
        return;
    }



    @Override
    public GymOwner viewProfile(User user) {
        //Get gym owner profile from username and password

        GymOwner gymOwnerProfile = new GymOwner();
        return gymOwnerProfile;
    }

    @Override
    public GymOwner updateProfile(GymOwner gymOwner) {
        //get details and update accordingly

        return gymOwner;
    }
}
