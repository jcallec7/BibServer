package bibServer.utils;

	import javax.el.ValueExpression;
	import javax.faces.component.UIComponent;
	import javax.faces.context.FacesContext;
	import javax.faces.convert.Converter;
	import javax.faces.convert.FacesConverter;

import bibServer.modelo.Autor;
import bibServer.vista.GestionLibrosBean;

	@FacesConverter(value = "autorConverter")
	public class AutorConverter implements Converter {

	    @Override
	    public Object getAsObject(FacesContext ctx, UIComponent uiComponent, String beerId) {
	        ValueExpression vex =
	                ctx.getApplication().getExpressionFactory()
	                        .createValueExpression(ctx.getELContext(),
	                                "#{gestionLibrosBean}", GestionLibrosBean.class);

	        GestionLibrosBean beers = (GestionLibrosBean)vex.getValue(ctx.getELContext());
	        for(Autor a : beers.getAutores()) {
	        	if(a.getId()== Integer.valueOf(beerId)) {
	        		return a;
	        	}
	        }
	        return null;
	    }

	    @Override
	    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object beer) {
	        return "" + ((Autor)beer).getId();
	    }

	}
