package fr.afcepf.ai103.dashboard;
 
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
 
import org.primefaces.event.CloseEvent;
import org.primefaces.event.DashboardReorderEvent;
import org.primefaces.event.ToggleEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;
 
@ManagedBean
@ViewScoped
public class DashboardView implements Serializable {
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DashboardModel model;
     
    @PostConstruct
    public void init() {
        model = new DefaultDashboardModel();
        DashboardColumn column1 = new DefaultDashboardColumn();
        DashboardColumn column2 = new DefaultDashboardColumn();
        DashboardColumn column3 = new DefaultDashboardColumn();
        DashboardColumn column4 = new DefaultDashboardColumn();
        DashboardColumn column5 = new DefaultDashboardColumn();
        DashboardColumn column6 = new DefaultDashboardColumn();
        DashboardColumn column7 = new DefaultDashboardColumn();
        DashboardColumn column8 = new DefaultDashboardColumn();
        DashboardColumn column9 = new DefaultDashboardColumn();
        DashboardColumn column10 = new DefaultDashboardColumn();
        DashboardColumn column11 = new DefaultDashboardColumn();
        DashboardColumn column12 = new DefaultDashboardColumn();
        
        column1.addWidget("disponible");
        column2.addWidget("consommer");
        column3.addWidget("donner");
        column4.addWidget("jeter");
        column5.addWidget("pdtdlc");
        column6.addWidget("annoncesAttentes");
        column7.addWidget("annoncesPubliees");
        column8.addWidget("annoncesValidees");
        column9.addWidget("annoncesFinalisees");
        column10.addWidget("reservationsAttentes");
        column11.addWidget("reservationsValidees");
        column12.addWidget("reservationsFinalisees");
        

        
        model.addColumn(column1);
        model.addColumn(column2);
        model.addColumn(column3);
        model.addColumn(column4);
        model.addColumn(column5);
        model.addColumn(column6);
        model.addColumn(column7);
        model.addColumn(column8);
        model.addColumn(column9);
        model.addColumn(column10);
        model.addColumn(column11);
        model.addColumn(column12);
    }
     
    public void handleReorder(DashboardReorderEvent event) {
        FacesMessage message = new FacesMessage();
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        message.setSummary("Reordered: " + event.getWidgetId());
        message.setDetail("Item index: " + event.getItemIndex() + ", Column index: " + event.getColumnIndex() + ", Sender index: " + event.getSenderColumnIndex());
         
        addMessage(message);
    }
     
    public void handleClose(CloseEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Panel Closed", "Closed panel id:'" + event.getComponent().getId() + "'");
         
        addMessage(message);
    }
     
    public void handleToggle(ToggleEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, event.getComponent().getId() + " toggled", "Status:" + event.getVisibility().name());
         
        addMessage(message);
    }
     
    private void addMessage(FacesMessage message) {
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
     
    public DashboardModel getModel() {
        return model;
    }
}
