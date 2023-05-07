import java.io.IOException;
import java.io.StringReader;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import com.opencsv.CSVReader;
public class CleanMapper  extends Mapper<LongWritable, Text, Text, Text> {
	@Override
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
		CSVReader reader = new CSVReader(new StringReader(value.toString()));
		String[] cols = reader.readNext();
		String cmplnt_num = cols[0];
		String boro_nm = cols[2];
		String cmplnt_fr_dt = cols[3];
		String cmplnt_fr_tm = cols[4];
		String juris_code = cols[10];
		String ky_cd = cols[12];
		String law_cat_cd = cols[13];
		String ofns_desc = cols[15];
		String susp_age_group = cols[23];
		String susp_race = cols[24];
		String susp_sex = cols[25];
		String vic_age_group = cols[27];
		String vic_race = cols[28];
		String vic_sex = cols[29];
		context.write(new Text(cmplnt_num + ";" + boro_nm + ";" + cmplnt_fr_dt + ";" + cmplnt_fr_tm + ";" + juris_code + ";" + ky_cd + ";" + law_cat_cd + ";" + ofns_desc + ";" + susp_age_group + ";" + susp_race + ";" + susp_sex + ";" + vic_age_group + ";" + vic_race + ";" + vic_sex), new Text());
	}
}
