package com.sachiin.nlp;

import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.NShort.NShortSegment;

public class ICTCLASSeg {

	public static void main(String[] args) {

		// ʵ����NSHort�ִ����������õ�������֯����ʶ��ģ��

		Segment nShortSegment = new NShortSegment().enableCustomDictionary(false).enablePlaceRecognize(true)
				.enableOrganizationRecognize(true);

	}

}
