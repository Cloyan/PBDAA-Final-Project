import java.io.IOException;
import java.io.StringReader;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import com.opencsv.CSVReader;
public class DelimiterMapper  extends Mapper<LongWritable, Text, Text, IntWritable> {
	@Override
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
		CSVReader reader = new CSVReader(new StringReader(value.toString()));
		String[] cols = reader.readNext();
		if (cols[0].contains(";") || cols[2].contains(";") || cols[3].contains(";") || cols[4].contains(";") || cols[10].contains(";") || cols[12].contains(";") || cols[13].contains(";") || cols[15].contains(";") || cols[23].contains(";") || cols[24].contains(";") || cols[25].contains(";") ||
		    cols[27].contains(";") || cols[28].contains(";") || cols[29].contains(";")) {
			context.write(new Text("Number of records: "), new IntWritable(1));
		}
	}
}
