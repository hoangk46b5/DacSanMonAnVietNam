package obj;

import java.util.List;

public class ChuDe {
private String idChude;
private List<TuVung>listTuVung;
int image;

public int getImage() {
	return image;
}
public void setImage(int image) {
	this.image = image;
}
public String getIdChude() {
	return idChude;
}
public void setIdChude(String idChude) {
	this.idChude = idChude;
}
public List<TuVung> getListTuVung() {
	return listTuVung;
}
public void setListTuVung(List<TuVung> listTuVung) {
	this.listTuVung = listTuVung;
}

public ChuDe(){}

public ChuDe(String idChude, List<TuVung> listTuVung, int image) {
	super();
	this.idChude = idChude;
	this.listTuVung = listTuVung;
	this.image = image;
}
public ChuDe(String idChude, List<TuVung> listTuVung) {
	this.idChude = idChude;
	this.listTuVung = listTuVung;
}
@Override
public String toString() {
	return  idChude ;
}

}
