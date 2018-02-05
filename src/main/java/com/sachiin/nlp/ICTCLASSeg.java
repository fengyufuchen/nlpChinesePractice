package com.sachiin.nlp;

import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.NShort.NShortSegment;

public class ICTCLASSeg {

	public static void main(String[] args) {

		// 实例化NSHort分词器，并启用地名、组织名词识别模块

		Segment nShortSegment = new NShortSegment().enableCustomDictionary(false).enablePlaceRecognize(true)
				.enableOrganizationRecognize(true);

	}

}
