package com.example.persist.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.common.ConsoleTool;
import com.example.domain.DownloadTask;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = App.class)
public class DownloadTaskRMapperTest {
	
	@Autowired
	private DownloadTaskRMapper mapper;
	
//	@Test
	public void testSelectAll() {
		List<DownloadTask> c = mapper.selectAll();
		ConsoleTool.printCollection(c);
	}

}
