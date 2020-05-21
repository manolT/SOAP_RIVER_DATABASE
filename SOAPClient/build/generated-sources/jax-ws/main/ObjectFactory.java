
package main;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the main package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckIfRiverExistsResponse_QNAME = new QName("http://main/", "checkIfRiverExistsResponse");
    private final static QName _AddRiverResponse_QNAME = new QName("http://main/", "addRiverResponse");
    private final static QName _UpdateLength_QNAME = new QName("http://main/", "updateLength");
    private final static QName _GetRivers_QNAME = new QName("http://main/", "getRivers");
    private final static QName _DeleteRiverResponse_QNAME = new QName("http://main/", "deleteRiverResponse");
    private final static QName _DeleteRiver_QNAME = new QName("http://main/", "deleteRiver");
    private final static QName _GetAllRiversResponse_QNAME = new QName("http://main/", "getAllRiversResponse");
    private final static QName _GetRiversResponse_QNAME = new QName("http://main/", "getRiversResponse");
    private final static QName _MakeTeibutaryResponse_QNAME = new QName("http://main/", "makeTeibutaryResponse");
    private final static QName _CheckIfRiverExists_QNAME = new QName("http://main/", "checkIfRiverExists");
    private final static QName _UpdateLengthResponse_QNAME = new QName("http://main/", "updateLengthResponse");
    private final static QName _AddRiver_QNAME = new QName("http://main/", "addRiver");
    private final static QName _MakeTeibutary_QNAME = new QName("http://main/", "makeTeibutary");
    private final static QName _GetAllRivers_QNAME = new QName("http://main/", "getAllRivers");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: main
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteRiverResponse }
     * 
     */
    public DeleteRiverResponse createDeleteRiverResponse() {
        return new DeleteRiverResponse();
    }

    /**
     * Create an instance of {@link UpdateLength }
     * 
     */
    public UpdateLength createUpdateLength() {
        return new UpdateLength();
    }

    /**
     * Create an instance of {@link GetRivers }
     * 
     */
    public GetRivers createGetRivers() {
        return new GetRivers();
    }

    /**
     * Create an instance of {@link DeleteRiver }
     * 
     */
    public DeleteRiver createDeleteRiver() {
        return new DeleteRiver();
    }

    /**
     * Create an instance of {@link GetAllRiversResponse }
     * 
     */
    public GetAllRiversResponse createGetAllRiversResponse() {
        return new GetAllRiversResponse();
    }

    /**
     * Create an instance of {@link GetRiversResponse }
     * 
     */
    public GetRiversResponse createGetRiversResponse() {
        return new GetRiversResponse();
    }

    /**
     * Create an instance of {@link CheckIfRiverExistsResponse }
     * 
     */
    public CheckIfRiverExistsResponse createCheckIfRiverExistsResponse() {
        return new CheckIfRiverExistsResponse();
    }

    /**
     * Create an instance of {@link AddRiverResponse }
     * 
     */
    public AddRiverResponse createAddRiverResponse() {
        return new AddRiverResponse();
    }

    /**
     * Create an instance of {@link AddRiver }
     * 
     */
    public AddRiver createAddRiver() {
        return new AddRiver();
    }

    /**
     * Create an instance of {@link MakeTeibutary }
     * 
     */
    public MakeTeibutary createMakeTeibutary() {
        return new MakeTeibutary();
    }

    /**
     * Create an instance of {@link GetAllRivers }
     * 
     */
    public GetAllRivers createGetAllRivers() {
        return new GetAllRivers();
    }

    /**
     * Create an instance of {@link CheckIfRiverExists }
     * 
     */
    public CheckIfRiverExists createCheckIfRiverExists() {
        return new CheckIfRiverExists();
    }

    /**
     * Create an instance of {@link UpdateLengthResponse }
     * 
     */
    public UpdateLengthResponse createUpdateLengthResponse() {
        return new UpdateLengthResponse();
    }

    /**
     * Create an instance of {@link MakeTeibutaryResponse }
     * 
     */
    public MakeTeibutaryResponse createMakeTeibutaryResponse() {
        return new MakeTeibutaryResponse();
    }

    /**
     * Create an instance of {@link River }
     * 
     */
    public River createRiver() {
        return new River();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckIfRiverExistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://main/", name = "checkIfRiverExistsResponse")
    public JAXBElement<CheckIfRiverExistsResponse> createCheckIfRiverExistsResponse(CheckIfRiverExistsResponse value) {
        return new JAXBElement<CheckIfRiverExistsResponse>(_CheckIfRiverExistsResponse_QNAME, CheckIfRiverExistsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRiverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://main/", name = "addRiverResponse")
    public JAXBElement<AddRiverResponse> createAddRiverResponse(AddRiverResponse value) {
        return new JAXBElement<AddRiverResponse>(_AddRiverResponse_QNAME, AddRiverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLength }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://main/", name = "updateLength")
    public JAXBElement<UpdateLength> createUpdateLength(UpdateLength value) {
        return new JAXBElement<UpdateLength>(_UpdateLength_QNAME, UpdateLength.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRivers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://main/", name = "getRivers")
    public JAXBElement<GetRivers> createGetRivers(GetRivers value) {
        return new JAXBElement<GetRivers>(_GetRivers_QNAME, GetRivers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRiverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://main/", name = "deleteRiverResponse")
    public JAXBElement<DeleteRiverResponse> createDeleteRiverResponse(DeleteRiverResponse value) {
        return new JAXBElement<DeleteRiverResponse>(_DeleteRiverResponse_QNAME, DeleteRiverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRiver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://main/", name = "deleteRiver")
    public JAXBElement<DeleteRiver> createDeleteRiver(DeleteRiver value) {
        return new JAXBElement<DeleteRiver>(_DeleteRiver_QNAME, DeleteRiver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRiversResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://main/", name = "getAllRiversResponse")
    public JAXBElement<GetAllRiversResponse> createGetAllRiversResponse(GetAllRiversResponse value) {
        return new JAXBElement<GetAllRiversResponse>(_GetAllRiversResponse_QNAME, GetAllRiversResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRiversResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://main/", name = "getRiversResponse")
    public JAXBElement<GetRiversResponse> createGetRiversResponse(GetRiversResponse value) {
        return new JAXBElement<GetRiversResponse>(_GetRiversResponse_QNAME, GetRiversResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeTeibutaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://main/", name = "makeTeibutaryResponse")
    public JAXBElement<MakeTeibutaryResponse> createMakeTeibutaryResponse(MakeTeibutaryResponse value) {
        return new JAXBElement<MakeTeibutaryResponse>(_MakeTeibutaryResponse_QNAME, MakeTeibutaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckIfRiverExists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://main/", name = "checkIfRiverExists")
    public JAXBElement<CheckIfRiverExists> createCheckIfRiverExists(CheckIfRiverExists value) {
        return new JAXBElement<CheckIfRiverExists>(_CheckIfRiverExists_QNAME, CheckIfRiverExists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLengthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://main/", name = "updateLengthResponse")
    public JAXBElement<UpdateLengthResponse> createUpdateLengthResponse(UpdateLengthResponse value) {
        return new JAXBElement<UpdateLengthResponse>(_UpdateLengthResponse_QNAME, UpdateLengthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRiver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://main/", name = "addRiver")
    public JAXBElement<AddRiver> createAddRiver(AddRiver value) {
        return new JAXBElement<AddRiver>(_AddRiver_QNAME, AddRiver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeTeibutary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://main/", name = "makeTeibutary")
    public JAXBElement<MakeTeibutary> createMakeTeibutary(MakeTeibutary value) {
        return new JAXBElement<MakeTeibutary>(_MakeTeibutary_QNAME, MakeTeibutary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRivers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://main/", name = "getAllRivers")
    public JAXBElement<GetAllRivers> createGetAllRivers(GetAllRivers value) {
        return new JAXBElement<GetAllRivers>(_GetAllRivers_QNAME, GetAllRivers.class, null, value);
    }

}
