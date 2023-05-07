import java.io.IOException;
import java.io.StringReader;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import com.opencsv.CSVReader;
public class CountRecsMapper  extends Mapper<LongWritable, Text, Text, IntWritable> {
	@Override
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
		CSVReader reader = new CSVReader(new StringReader(value.toString()));
		String[] cols = reader.readNext();
		context.write(new Text("Number of records: "), new IntWritable(1));
	}
}
