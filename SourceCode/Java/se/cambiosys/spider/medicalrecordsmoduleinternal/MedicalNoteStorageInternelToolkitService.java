package se.cambiosys.spider.medicalrecordsmoduleinternal;

import java.rmi.RemoteException;
import java.util.List;

import se.cambiosys.spider.StructureService.SpiderException;
import se.cambiosys.spider.medicalrecordsmodule.TrainingMedicalNoteData;

public interface MedicalNoteStorageInternelToolkitService
{

  /**
   * Save new TrainingMedicalNoteData using given TrainingMedicalNoteData.
   *
   * @param data - Data that needs to ve persist into the database.
   * @return
   * @throws SpiderException
   * @throws RemoteException
   */
  long createFromData(TrainingMedicalNoteData data) throws SpiderException, RemoteException;


  /**
   * Update HomeCareData by given data.
   *
   * @param data - Data that needs to ve persist into the database.
   * @return
   * @throws SpiderException
   * @throws RemoteException
   */
  long setData(TrainingMedicalNoteData data) throws SpiderException, RemoteException;

  /**
   * @param primaryKey
   * @return TrainingMedicalNoteData of given primaryKey
   * @throws SpiderException
   * @throws RemoteException
   */
  TrainingMedicalNoteData getData(long primaryKey) throws SpiderException , RemoteException;

  /**
   * @param data - data that needs to be updated in database
   * @return
   * @throws SpiderException
   */
  //long updateData(TrainingMedicalNoteData trainingMedicalNoteData , long key)throws SpiderException;

  long updateData(TrainingMedicalNoteData data , long key) throws SpiderException , RemoteException;

  /**
   * @param keys
   * @return List of TrainingMedicalNoteData for given primaryKeys
   * @throws SpiderException
   * @throws RemoteException
   */
  List<TrainingMedicalNoteData> getDataByKeys(long[] keys) throws SpiderException , RemoteException;

  /**
   * @param contactId
   * @return List of TrainingMedicalNoteData for given contactId
   * @throws SpiderException
   * @throws RemoteException
   */
  List<TrainingMedicalNoteData> getMedicalNoteDataByContactId(long contactId) throws SpiderException , RemoteException;

  /**
   * @param contactIds
   * @param unitIds
   * @param careProviders
   * @return
   * @throws SpiderException
   * @throws RemoteException
   */
  List<TrainingMedicalNoteData> getUnsignedMedicalNotes(long[] contactIds, long[] unitIds , long[] careProviders)throws  SpiderException , RemoteException;

  /**
   * @param unitIds
   * @param careProviders
   * @return
   * @throws SpiderException
   * @throws RemoteException
   */
  List<TrainingMedicalNoteData> getAllUnsignedMedicalNotes(long[] unitIds , long[] careProviders)throws SpiderException , RemoteException;

  /**
   * @param id
   * @return TrainingMedicalNoteData of given id
   * @throws SpiderException
   * @throws RemoteException
   */
  TrainingMedicalNoteData getDataById(long id) throws SpiderException , RemoteException;




}
