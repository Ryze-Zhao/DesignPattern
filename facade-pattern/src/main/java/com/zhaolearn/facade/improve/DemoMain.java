package com.zhaolearn.facade.improve;

/**
 *�齨һ����ͥӰԺ��
 * DVD��������ͶӰ�ǡ��Զ���Ļ�����������������׻���,Ҫ�����ʹ�ü�ͥӰԺ�� ���ܣ������Ϊ��ֱ����ң������ͳ����豸���ء������׻�����������Ļ����ͶӰ�ǡ������졢��DVD��ѡdvd��ȥ�ñ��׻��������ƹ⡢���š���Ӱ�����󣬹رո����豸
 *
 * @author: HeHaoZhao
 * @date: 2020/1/31 19:32
 */
public class DemoMain{
	public static void main(String[] args) {
		//����ֱ�ӵ��ø���DVDPlayer��Popcorn��Projector��Screen��Stereo��TheaterLight�ȱȽ��鷳�������Ҫʹ��HomeTheaterFacade�����
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		System.out.println("---------׼����ӳ--------");
		homeTheaterFacade.ready();
		System.out.println("---------��ʼ��ӳ--------");
		homeTheaterFacade.play();
		System.out.println("---------ֹͣ��ӳ--------");
		homeTheaterFacade.end();
	}
}
