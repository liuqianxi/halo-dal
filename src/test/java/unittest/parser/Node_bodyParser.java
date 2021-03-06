package unittest.parser;

import org.springframework.stereotype.Component;

import halo.dal.analysis.PartitionParser;
import halo.dal.analysis.PartitionTableInfo;
import halo.dal.analysis.SQLInfo;
import halo.dal.sql.ConnectionStatus;

@Component("node_body")
public class Node_bodyParser implements PartitionParser {

	public PartitionTableInfo parse(String tableLogicName, SQLInfo sqlInfo,
	        ConnectionStatus connectionStatus) {
		System.out
		        .println("NodeBodyParser----------------------------------->");
		PartitionTableInfo partitionTableInfo = new PartitionTableInfo();
		partitionTableInfo.setDsName("ds00");
		partitionTableInfo.setRealTable("node_body_1");
		return partitionTableInfo;
	}
}
