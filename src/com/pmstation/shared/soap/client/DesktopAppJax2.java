
package com.pmstation.shared.soap.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.1-02/02/2007 03:56 AM(vivekp)-FCS
 * Generated source version: 2.1
 * 
 */
@WebService(name = "DesktopAppJax2", targetNamespace = "http://api.soap.shared.pmstation.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DesktopAppJax2 {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    public long getFreeSpace(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.AccountItem
     */
    @WebMethod
    @WebResult(partName = "return")
    public AccountItem getRoot(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String login(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean hasRightUpload();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.AccountItemArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public AccountItemArray getItems(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    public void uploadCancelFile(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.AccountItemArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public AccountItemArray getFiles(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        LongArray arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    public long getSpaceLimit(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.DirHistoryDTOArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public DirHistoryDTOArray getHistory(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @return
     *     returns com.pmstation.shared.soap.client.StringArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public StringArray getToolList();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getToolUrl(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.StringArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public StringArray getFileDescription(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getDirDescription(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @param arg6
     * @param arg7
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String setFileDescription(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3,
        @WebParam(name = "arg4", partName = "arg4")
        String arg4,
        @WebParam(name = "arg5", partName = "arg5")
        String arg5,
        @WebParam(name = "arg6", partName = "arg6")
        boolean arg6,
        @WebParam(name = "arg7", partName = "arg7")
        boolean arg7);

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String setDirDescription(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3,
        @WebParam(name = "arg4", partName = "arg4")
        boolean arg4,
        @WebParam(name = "arg5", partName = "arg5")
        boolean arg5);

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @param arg6
     * @param arg7
     * @param arg8
     * @param arg9
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String reportAbuse(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        boolean arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3,
        @WebParam(name = "arg4", partName = "arg4")
        String arg4,
        @WebParam(name = "arg5", partName = "arg5")
        String arg5,
        @WebParam(name = "arg6", partName = "arg6")
        String arg6,
        @WebParam(name = "arg7", partName = "arg7")
        String arg7,
        @WebParam(name = "arg8", partName = "arg8")
        String arg8,
        @WebParam(name = "arg9", partName = "arg9")
        String arg9);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.StringArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public StringArray checkSettings(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        UserSettings arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.StringArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public StringArray applySettings(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        UserSettings arg2);

    /**
     * 
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    public int checkSharedDirAccess(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3,
        @WebParam(name = "arg4", partName = "arg4")
        String arg4);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String checkSubdomain(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    public long createNewFolder(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String createUploadSessionKey(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean creatNewFolder(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String decodeId(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    public long decodeLink(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    public void deleteFile(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    public void deleteFileFinal(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    public void deleteFolder(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    public void deleteFolderFinal(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    public void downloadFinished(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.AccountItemArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public AccountItemArray getAllFolders(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.AccountItemArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public AccountItemArray getAllItems(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    public long getCurrentUploaderVersion();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getDirectLink(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.AccountItem
     */
    @WebMethod
    @WebResult(partName = "return")
    public AccountItem getDirInfo(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getFileDownloadLink(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.AccountItem
     */
    @WebMethod
    @WebResult(partName = "return")
    public AccountItem getFileInfo(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.SharedFolderPropertiesArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public SharedFolderPropertiesArray getFolderSharingProperties(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.DirHistoryDTOArrayArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public DirHistoryDTOArrayArray getHistoriesFromId(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        LongArray arg2,
        @WebParam(name = "arg3", partName = "arg3")
        LongArray arg3);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.DirHistoryDTOArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public DirHistoryDTOArray getHistoryFromId(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        long arg3);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.AccountItem
     */
    @WebMethod
    @WebResult(partName = "return")
    public AccountItem getItemInfo(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        boolean arg3);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    public long getItemsCount(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.AccountItemArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public AccountItemArray getItemsPartial(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        int arg3,
        @WebParam(name = "arg4", partName = "arg4")
        int arg4);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    public long getMaxFileSize(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    public long getNewFileDataCenter(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    public long getNotOwnedSizeLimit();

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.DirHistoryDTOArrayArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public DirHistoryDTOArrayArray getNotRecursiveHistories(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        LongArray arg2,
        @WebParam(name = "arg3", partName = "arg3")
        LongArray arg3);

    /**
     * 
     * @return
     *     returns com.pmstation.shared.soap.client.StringArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public StringArray getOperationDescriptions();

    /**
     * 
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    public long getOwnedSizeLimit();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.AccountItemArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public AccountItemArray getRecycleBinItems(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.AccountItemArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public AccountItemArray getSharedDirItems(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3,
        @WebParam(name = "arg4", partName = "arg4")
        String arg4);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getUploadFormUrl(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean isAccountActive(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean isAccountBanned(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean isAccountPremium(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean isExistsLoginPassword(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    public void markSynchronized(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String pasteFilesDirs(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        boolean arg3,
        @WebParam(name = "arg4", partName = "arg4")
        LongArray arg4,
        @WebParam(name = "arg5", partName = "arg5")
        LongArray arg5);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    public long renameFile(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    public long renameFolder(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    public void restoreFile(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    public void restoreFiles(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        LongArray arg2);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String setFolderSharingProperties(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        SharedFolderProperties arg3);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String signup(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    public void syncFinished(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean uploaderLoggedIn(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String uploadFinishFile(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    public boolean uploadStartedFileExists(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    public long uploadStartFile(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3,
        @WebParam(name = "arg4", partName = "arg4")
        long arg4);

    /**
     * 
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    public long uploadStartFileUpdate(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3,
        @WebParam(name = "arg4", partName = "arg4")
        long arg4);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String signupUsername(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.UserSettingsArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public UserSettingsArray getAllSettings(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.UserSettings
     */
    @WebMethod
    @WebResult(partName = "return")
    public UserSettings getSettings(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        int arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.SettingsGroupArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public SettingsGroupArray getSettingGroups(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String addToMyAccount(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.AccountItemArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public AccountItemArray getFavorites(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    public long addToFavorites(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(partName = "return")
    public long removeFromFavorites(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(partName = "return")
    public int emptyRecycleBin(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.Mp3Info
     */
    @WebMethod
    @WebResult(partName = "return")
    public Mp3Info getMp3FileInfo(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.Mp3InfoArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public Mp3InfoArray getMp3FileInfos(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.ExifInfoArray
     */
    @WebMethod
    @WebResult(partName = "return")
    public ExifInfoArray getExifFileInfos(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.pmstation.shared.soap.client.ExifInfo
     */
    @WebMethod
    @WebResult(partName = "return")
    public ExifInfo getExifFileInfo(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getPreviewLink(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        long arg2);

}
