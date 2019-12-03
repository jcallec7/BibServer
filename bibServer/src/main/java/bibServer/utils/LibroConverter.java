package bibServer.utils;

	import javax.el.ValueExpression;
	import javax.faces.component.UIComponent;
	import javax.faces.context.FacesContext;
	import javax.faces.convert.Converter;
	import javax.faces.convert.FacesConverter;

	import bibServer.modelo.Libro;
	import bibServer.vista.GestionPrestamosBean;

	@FacesConverter(value = "libroConverter")
	public class LibroConverter implements Converter {

	    @Override
	    public Object getAsObject(FacesContext ctx, UIComponent uiComponent, String beerId) {
	        ValueExpression vex =
	                ctx.getApplication().getExpressionFactory()
	                        .createValueExpression(ctx.getELContext(),
	                                "#{gestionPrestamosBean}", GestionPrestamosBean.class);
	        GestionPrestamosBean beers = (GestionPrestamosBean)vex.getValue(ctx.getELContext());
	        for(Libro a : beers.getLibros()) {
	        	if(a.getBib_lib_id()== beerId) {
	        		return a;
	        	}
	        }
	        return null;
	    }

	    @Override
	    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object beer) {
	        return "" + ((Libro)beer).getBib_lib_id();
	    }

	}
