package SignalProcessing;

import java.util.List;

public interface Signal {
    List<Short> getData();
    void append(Short d);
    Short getLatest();
    void appendDiagnosis(String diagnosis);
    List<String> getDiagnosis();
}
