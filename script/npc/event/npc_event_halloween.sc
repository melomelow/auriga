//==============================================================================
// Ragnarok Online Halloween2006 Script
//==============================================================================

//==========================================
// �p���v�L���n�b�g�N�G�X�g
//------------------------------------------
prontera.gat,164,69,3	script	�f�G�ȃf�r	738,{
	mes "-�J�T�ȃW���b�N��";
	mes "�����ł��Ȃ����t��";
	mes "�b�������Ă��Ă���-";
	next;
	mes "[�f�G�ȃf�r]";
	mes "�������Ă邩�킩��Ȃ�����H";
	mes "�����ʖ󂵂Ă���B";
	mes "�܁A���̂��߂ɂ�����";
	mes "���Ă��Ă�����񂾂��ǂȁB";
	next;
	mes "-�J�T�ȃW���b�N��";
	mes "�����ł��Ȃ����t��";
	mes "�f�r���`�Ƙb���Ă���-";
	next;
	if(countitem(7609)) {
		mes "[�f�G�ȃf�r]";
		mes "�u�N�������Ă���̂�";
		mes "�l�̐S����Ȃ����ȁH";
		mes "�����Ԃ��Ă��ꂽ��";
		mes "������������邯�ǁc�c�v";
		mes "���Ă����������Ă邺�B";
		next;
		mes "[�f�G�ȃf�r]";
		mes "�ǂ�����H";
		mes "�����̎����������Ăق������H";
		next;
		if(select("������āH","�����A�m���Ă��܂�")==2) {
			if(countitem(535) < 1 || countitem(2226) < 1) {
				mes "[�f�G�ȃf�r]";
				mes "��H";
				mes "�p���v�L���n�b�g�����ɂ�";
				mes "�ޗ�������Ȃ��݂��������H";
				close;
			}
			mes "[�f�G�ȃf�r]";
			mes "������W���b�N�ɕԂ��Ă������A";
			mes "�J�{�`���ƕ��ʂ̃L���b�v��";
			mes "�p���v�L���n�b�g�ɂ��Ă���邺�B";
			next;
			if(select("�₾","�͂��A�ǂ���")==1) {
				mes "[�f�G�ȃf�r]";
				mes "�c�c��k����ȁH";
				mes "��ł�����W���b�N��";
				mes "�Ԃ��Ă��񂾂�ȁH";
				close;
			}
			delitem 7609,1;
			delitem 535,1;
			delitem 2226,1;
			getitem 5202,1;
			misceffect 200,"�J�T�ȃW���b�N";
			mes "-�W���b�N�̌���";
			mes "�n���E�B���W���b�N�̏؂ł���";
			mes "�I�[�����߂��Ă���-";
			next;
			misceffect 1,"�J�T�ȃW���b�N";
			mes "[�f�G�ȃf�r]";
			mes "��H�@�I�[�����s���肾�ȁc�c";
			mes "�܂��S������Ȃ��񂾂�B";
			next;
			mes "[�f�G�ȃf�r]";
			mes "�܁A�����͊��S�Ɏ��߂��邾��B";
			mes "�C���ɏW�߂�񂾂ȁB";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "������āH";
		next;
	}
	else {
		mes "[�f�G�ȃf�r]";
		mes "�u�́c�c�l�͂ˁc�c";
		mes "�n���E�B���W���b�N�������́c�c";
		mes "�c�c�ł��A���́c�c�v";
		next;
		mes "[�f�G�ȃf�r]";
		mes "�c�c���̌����͌����ȁc�c";
		mes "���������A�����m���Ă鎖��";
		mes "�S���b���Ă��I";
		next;
	}
	mes "[�f�G�ȃf�r]";
	mes "���X�A�����͂����";
	mes "���}�ȃW���b�N����Ȃ��āA";
	mes "�n���E�B���W���b�N�Ȃ񂾁B";
	next;
	mes "[�f�G�ȃf�r]";
	mes "�ł��A�����̐S��";
	mes "���܂ꂽ�����ŁA";
	mes "����ȗJ�T�ȃW���b�N��";
	mes "�Ȃ��Ă��܂����񂾁B";
	next;
	mes "[�f�G�ȃf�r]";
	mes "������A�킴�킴����ȏ��܂�";
	mes "�����̐S��T���ɗ����񂾁B";
	next;
	mes "[�f�G�ȃf�r]";
	mes "���񂾔Ɛl�����������Ă�A";
	mes "�������n���E�B���̃}�X�R�b�g����";
	mes "�����G�炵�Ă���^4A4AFF�y�������[�h^000000�B";
	mes "�����������낤�ȁB";
	next;
	mes "[�f�G�ȃf�r]";
	mes "�Ƃɂ����A���̃W���b�N�̐S��";
	mes "�T���Ă���Ă���Ȃ����H";
	mes "��Ȃ炱���������Ƃ��邩�炳�B";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "������Ăǂ�Ȃ́H";
	mes "�b�𕷂��Ă��猈�߂��B";
	next;
	mes "[�f�G�ȃf�r]";
	mes "^4A4AFF�W���b�N�̐S�A�J�{�`���A";
	mes "�L���b�v��1����^000000�����ė���΁A";
	mes "^4A4AFF�p���v�L���n�b�g 1��^000000";
	mes "�ƌ������Ă������Ă��B";
	next;
	mes "[�f�G�ȃf�r]";
	mes "�W���b�N�̐S�Ȃ�āA";
	mes "�����Ă����̖��ɂ������Ȃ�����H";
	mes "��������Ȃ����B";
	mes "�l�Ԃ̒��܂ŗ���������Ă���";
	mes "�����������Ă���Ă����B";
	close;
}
prontera.gat,162,69,5	script	�J�T�ȃW���b�N	1130,{}

//==========================================
// �J�{�`���p�C�N�G�X�g
//------------------------------------------
geffen.gat,145,132,3	script	�z�C����	729,{
	if(HALLOWEEN_EVE == 0) {
		mes "[�z�C����]";
		mes "�J�{�`�������_���܂����";
		mes "���蕨���Ǝv��Ȃ�!?";
		mes "���̖L���ȃJ�����[�Ɖh�{��";
		mes "�������ɕs�����Ă���̗͂�";
		mes "����Ă����́I";
		next;
		mes "[�z�C����]";
		mes "���̎��A�z�C�����́I";
		mes "����ȑf���炵���J�{�`����";
		mes "�����Ƃ��������H�ׂ邽�߂�";
		mes "�F�X�Ɠw�͂��Ă����́I";
		mes "�����āA������m�����́I";
		next;
		mes "[�z�C����]";
		mes "���ꂳ���c�c";
		mes "���ꂳ������΁I";
		mes "���̃J�{�`���p�C������������āI";
		next;
		if(select("������ĉ��H","��������")==2) {
			mes "[�z�C����]";
			mes "����I�@��������́H";
			mes "���̃J�{�`���p�C�́A";
			mes "���̂����������������̂�!!";
			close;
		}
		mes "[�z�C����]";
		mes "�J�{�`���ƌ����΁c�c";
		mes "���A�W���b�N��ˁH";
		mes "���̓W���b�N�����J�{�`����";
		mes "�����`���Ǝv���Ă�́I";
		next;
		mes "[�z�C����]";
		mes "���̃W���b�N�Ȃ񂾂��ǁA";
		mes "��C���A�����ɈႤ�`��";
		mes "���Ă��鎖�ɋC�������́B";
		mes "�����āA���ɂ̃W���b�N��";
		mes "�S�g���F�̌��ɕ�܂�Ă���̂�I";
		next;
		mes "[�z�C����]";
		mes "���ꂪ�A�n���E�B���W���b�N�I";
		mes "���̃n���E�B���W���b�N�́A";
		mes "�Z�k���ꂽ�J�{�`�������̌����̂ł���";
		mes "^4A4AFF�W���b�N�̐S^000000�������Ă���̂�I";
		mes "���ꂳ������΁A";
		mes "���̓����J�{�`���p�C�̊����I";
		next;
		mes "[�z�C����]";
		mes "�łˁA�悩�����炻���";
		mes "����ė��Ă���Ȃ����ȁH";
		mes "��������A�����ɔ�������";
		mes "�J�{�`���p�C������Ă������B";
		mes "���̃J�{�`���p�C��H�ׂ��";
		mes "���܂�̔��������Ɋ��������Ⴄ��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c";
		mes "�N�A�O���Ɛ��i���S�R�Ⴄ�ˁc�c";
		mes "��l�������Ɍ�����̂�";
		mes "�������ϋɓI�c�c";
		mes "�c�c�܁A�������B����ŁA";
		mes "���̃J�{�`���p�C�̍ޗ��́H";
		next;
		mes "[�z�C����]";
		mes "�ǂ�����ł��I";
		mes "���̓����J�{�`���p�C�ɂ�";
		mes "^4A4AFF�W���b�N�̐S 1�A";
		mes "�J�{�`�� 2�A�� 2��^000000�B";
		mes "���̎O��ނ��K�v�Ȃ́I";
		next;
		mes "[�z�C����]";
		mes "���̍ޗ��͎����p�ӂ��邩��A";
		mes "�W���b�N�̐S�A�J�{�`���A����";
		mes "�����ė��ĂˁI";
		set HALLOWEEN_EVE,1;
		close;
	}
	mes "[�z�C����]";
	mes "�J�{�`���p�C�̍ޗ���";
	mes "��ɓ������H";
	next;
	switch(select("�ޗ���S�������Ă���","���͂ǂ��ɂ���̂��ȁH","�����A����")) {
	case 1:
		if(countitem(7609) < 1 || countitem(535) < 2 || countitem(574) < 2) {
			mes "[�z�C����]";
			mes "�J�{�`���p�C�����ɂ͑���Ȃ���B";
			mes "^4A4AFF�W���b�N�̐S 1�I";
			mes "�J�{�`�� 2�I";
			mes "�� 2�I^000000";
			mes "����炪�����ƍ��Ȃ���B";
			close;
		}
		misceffect 0,"";
		mes "[�z�C����]";
		mes "������I";
		mes "���ꂶ��A���������I";
		next;
		misceffect 148;
		mes "[�z�C����]";
		mes "�z�B�[�b�I";
		mes "�z�C�B�B�B�b�I";
		next;
		mes "[�z�C����]";
		mes "�����I";
		mes "�͂��A����͂��Ȃ��̕��B";
		mes "�����Ɩ�����Ă�ˁI";
		delitem 7609,1;
		delitem 535,2;
		delitem 574,2;
		getitem 12192,1;
		close;
	case 2:
		if(HALLOWEEN_EVE != 1) {
			mes "[�z�C����]";
			mes "���Ȃ�A^4A4AFF�j�u���w�C���̔鋫�̑�^000000��";
			mes "�j���g���������Ă���";
			mes "�`�F���L�[���Ă�������Ă����B";
			close;
		}
		mes "[�z�C����]";
		mes "���H�@�������c�c";
		mes "���Ȃ����ς������ȁB";
		mes "�j���g���������Ă���m���Ă�́B";
		mes "�����ɗ��߂΂����Ɨ������炦���B";
		next;
		mes "[�z�C����]";
		mes "^4A4AFF�ŏ���1�񂾂��̓T�[�r�X^000000��";
		mes "�����̏��ɑ����Ă�����B";
		mes "���A�j�u���w�C���̔鋫�̑�������";
		mes "�����Ə������Ȃ��Ɗ�Ȃ����B";
		next;
		mes "[�z�C����]";
		mes "���ꂶ��A�������s���H";
		next;
		if(select("�s��","�s���Ȃ�")==2) {
			mes "[�z�C����]";
			mes "�����s���H";
			mes "�������͊댯������ˁB";
			mes "�����Ə����ł�����";
			mes "���ł������Ă�����B";
			close;
		}
		mes "[�z�C����]";
		mes "���ꂶ��A�������肢�ˁB";
		set HALLOWEEN_EVE,2;
		close2;
		warp "nif_fild01.gat",162,113;
		end;
	case 3:
		mes "[�z�C����]";
		mes "������ƁI";
		mes "���ꂶ�።���I";
		mes "�J�{�`���p�C�̍ޗ���";
		mes "�����ƏW�߂Ă��āI";
		next;
		mes "[�z�C����]";
		mes "�����H�@������x������B";
		mes "^4A4AFF�W���b�N�̐S 1�I";
		mes "�J�{�`�� 2�I";
		mes "�� 2�I^000000";
		mes "���ꂪ�����ƍ��Ȃ��񂾂���I";
		close;
	}
}
nif_fild01.gat,165,115,3	script	�`�F���L�[	794,{
	switch(HALLOWEEN_EVE) {
	default:
		mes "[�`�F���L�[]";
		mes "�j���g���͂ǂ��������񂾁c�c";
		mes "��H�@�N�́c�c";
		mes "���o�����������c�c";
		next;
		if(HALLOWEEN_EVE != 2) {
			mes "[�`�F���L�[]";
			mes "�����͑������A���ʂ̐l�Ԃ�";
			mes "������������S����Ȃ��B";
			mes "�P�K������O�ɋA�������������B";
			close;
		}
		mes "[�`�F���L�[]";
		mes "��H�@�����~�����̂��H";
		mes "�ŋ߁A�p�C���������������Ă�";
		mes "�q���������c�c�N�����H";
		next;
		if(select("�͂��A���𔄂��Ă�������","���ɗp�͂Ȃ�")==2) {
			mes "[�`�F���L�[]";
			mes "�Ȃ�A�N�Ɉ�������悤�B";
			mes "�����͊댯�ȏ����B";
			mes "�p�������Ȃ�";
			mes "�����ɗ������������������B";
			close;
		}
		mes "[�`�F���L�[]";
		mes "�������c�c";
		mes "�ł��A������ĂĂ���j���g����";
		mes "���C�����������Ă��܂��āA";
		mes "���܂蔄��Ȃ��񂾁c�c";
		mes "�������ȁc�c";
		mes "����1���� 1000Zeny�Ŕ����B";
		next;
		if(select("2��������","1��������","�������c�c")==3) {
			mes "[�`�F���L�[]";
			mes "��c�c����ς荂�����c�c";
			mes "�ł��A�j���g���������Ă��܂���";
			mes "�݌ɂ��قƂ�ǂȂ��񂾁c�c";
			close;
		}
		set '@num,1+(@menu == 1? 1: 0);
		if(Zeny < '@num*1000) {
			mes "[�`�F���L�[]";
			mes "����������Ȃ��񂶂�Ȃ����H";
			if(@menu == 1)
				mes "1���� 1000Zeny������A";
			mes '@num+ "�Ȃ�" +1000*'@num+ "Zeny�ɂȂ��B";
			close;
		}
		mes "[�`�F���L�[]";
		mes "�͂��A�ǂ����B";
		set HALLOWEEN_EVE,3;
		set Zeny,Zeny-'@num*1000;
		getitem 574,'@num;
		close;
	case 3:
		mes "[�`�F���L�[]";
		mes "�����܂��K�v�Ȃ̂��c�c";
		mes "���Ⴀ�A������Ǝ�`���Ă���B";
		mes "������ĂĂ���j���g����";
		mes "�����o�����񂾁c�c";
		next;
		mes "[�`�F���L�[]";
		mes "�S���T���Ă����Ƃ͌���Ȃ��B";
		mes "1�C�����ł��T���Ă��Ă���Ȃ����H";
		mes "�������痑��3�܂Ŕ����B";
		next;
		mes "[�`�F���L�[]";
		mes "���܂肱��Ȏ��͂������Ȃ����ǁA";
		mes "�j���g�������Ȃ��Ƃǂ����悤���Ȃ��񂾁B";
		mes "���݂��A�]�ޕ�����ɓ���񂾂���";
		mes "�����Ȏ������Ƃł��v���Ă���c�c";
		next;
		mes "[�`�F���L�[]";
		mes "�j���g���͂��̕ӂɉB��Ă����B";
		mes "�ʂɃj���g����A��Ă���K�v�͂Ȃ��B";
		mes "���@�������Ă��邩��A�������������";
		mes "����ɋA���Ă����B";
		mes "������^4A4AFF�u���H�v^000000�B";
		mes "�c�c�c�c";
		next;
		mes "[�`�F���L�[]";
		mes "�c�c�c�c�c�c";
		mes "�[���l���Ȃ��Ă����c�c";
		mes "�Ƃɂ����A��낵�����ނ�B";
		close;
	case 4:
		mes "[�`�F���L�[]";
		mes "�₟�A�҂��Ă���B";
		mes "�N�ɑ����Ă�������j���g����";
		mes "�����ɟB�ɓ���Ă�������B";
		mes "���܂������o�����킩��Ȃ�����c�c";
		next;
		mes "[�`�F���L�[]";
		mes "�񑩂ǂ��藑�𔄂��B";
		mes "1�A1000Zeny�B";
		mes "�ő�3�܂Ŕ����B";
		mes "�����ɂ���H";
		next;
		while(1) {
			input '@num;
			if('@num < 0 || '@num > 3) {
				mes "[�`�F���L�[]";
				mes "�����ƕ����Ă������ȁH";
				mes "�ő�3�܂ł���B";
				next;
				continue;
			}
			break;
		}
		if('@num == 0) {
			mes "[�`�F���L�[]";
			mes "����Ȃ��̂��ȁH";
			close;
		}
		if(Zeny < '@num*1000) {
			mes "[�`�F���L�[]";
			mes "Zeny������Ȃ��悤�����H";
			mes "��x�m�F���Ă݂���ǂ����ȁH";
			close;
		}
		mes "[�`�F���L�[]";
		mes "�͂��A�ǂ����B";
		mes "���������ƕK�v�Ȃ�A";
		mes "�����o�������̃j���g����";
		mes "�T���Ă��Ă���B";
		set HALLOWEEN_EVE,3;
		set Zeny,Zeny-'@num*1000;
		getitem 574,'@num;
		close;
	}
}
nif_fild01.gat,167,113,3	script	�`�F���L�[�̃j���g��	800,{
	mes "�����Ă���j���g�����B";
	close;
}

nif_fild01.gat,199,240,5	script	�`�F���L�[�̃j���g��#0	800,{
	if(HALLOWEEN_EVE < 3) {
		mes "�����Ă���j���g�����B";
		close;
	}
	mes "�`�F���L�[���T���Ă���";
	mes "�j���g���݂������B";
	mes "�`�F���L�[�������Ă��ꂽ";
	mes "�A�Җ��@�̎����������Ă݂悤�B";
	next;
	input '@word$;
	if('@word$ != "���H") {
		mes "[" +strcharinfo(0)+ "]";
		mes "�����N���Ȃ��B";
		mes "�������ԈႦ�����ȁH";
		close;
	}
	misceffect 34;
	emotion 23;
	setarray '@ref,0,1,2,3,4,5,6,7;
	deletearray '@ref[strnpcinfo(2)],1;
	hideonnpc;
	hideoffnpc "�`�F���L�[�̃j���g��#" +'@ref[rand(7)];
	mes "�A�Җ��@���������܂����B";
	if(HALLOWEEN_EVE == 3)
		set HALLOWEEN_EVE,4;
	close;
OnInit:
	hideonnpc;
	if(strnpcinfo(2) == "0")
		hideoffnpc "�`�F���L�[�̃j���g��#"+rand(8);
	end;
}
nif_fild01.gat,219,267,4	duplicate(�`�F���L�[�̃j���g��#0)	�`�F���L�[�̃j���g��#1	800
nif_fild01.gat,185,325,0	duplicate(�`�F���L�[�̃j���g��#0)	�`�F���L�[�̃j���g��#2	800
nif_fild01.gat,147,342,0	duplicate(�`�F���L�[�̃j���g��#0)	�`�F���L�[�̃j���g��#3	800
nif_fild01.gat,270,145,3	duplicate(�`�F���L�[�̃j���g��#0)	�`�F���L�[�̃j���g��#4	800
nif_fild01.gat,331,329,0	duplicate(�`�F���L�[�̃j���g��#0)	�`�F���L�[�̃j���g��#5	800
nif_fild01.gat,133,105,1	duplicate(�`�F���L�[�̃j���g��#0)	�`�F���L�[�̃j���g��#6	800
nif_fild01.gat,316,97,5		duplicate(�`�F���L�[�̃j���g��#0)	�`�F���L�[�̃j���g��#7	800

//==========================================
// ���������N�G�X�g
//------------------------------------------
nif_in.gat,18,34,5	script	��������	1505,2,2,{
	mes "[�f�r���`]";
	mes "�����A����������";
	mes "�����������Ƃ�����Ȃ�A";
	mes "���Ɍ����Ă݂ȁB";
	mes "�����͂܂��l�Ԃ̌��t��";
	mes "����Ă��Ȃ�����ȁB";
	close;
}
nif_in.gat,19,32,3	script	�f�r���`	738,{
	mes "-���������������ł��Ȃ����t��";
	mes "�b�������Ă��Ă���-";
	next;
	mes "[�f�r���`]";
	mes "�������Ă邩�킩��Ȃ�����H";
	mes "�����ʖ󂵂Ă���B";
	mes "�܁A���̂��߂ɂ�����";
	mes "���Ă��Ă�����񂾂��ǂȁB";
	next;
	mes "-���������������ł��Ȃ����t��";
	mes "�f�r���`�Ƙb���Ă���-";
	next;
	mes "[�f�r���`]";
	mes "�c�c�c�c���H";
	mes "����A���̂܂܌����́H";
	mes "����Ȃ����Ⴂ���Ȃ��H";
	next;
	mes "-�������������ȂÂ��Ă���-";
	next;
	mes "[�f�r���`]";
	mes "�c�c�c�c";
	mes "�킩������c�c";
	mes "�������I�@������b���̂�";
	mes "�S�����������̌��t���I";
	mes "���͂���Ȍ�������Ȃ�����ȁI";
	mes "���Ⴂ����Ȃ�I";
	next;
	mes "[�f�r���`]";
	mes "���ꂶ��c�c�S�z���B";
	next;
	mes "[�f�r���`]";
	mes "�u�f�r�c�c�J�{�`���p�C�c�c�ǂ��H";
	mes "�J�{�`���p�C�c�c�l�Ԃ����B";
	mes "�����̐l�ԁc�c�����ĂȂ��H�v";
	next;
	mes "[�f�r���`]";
	mes "�c�c�Ȃ񂩁A�J�{�`���p�C��";
	mes "��x�H�ׂĂ݂����񂾂��Ă��B";
	mes "�����J�{�`���p�C�������Ă�Ȃ�";
	mes "�����ɂ���Ă���Ȃ����H";
	mes "���������̋@���������Ȃ��";
	mes "�������������ƍ����ڂɂ����񂾁B";
	next;
	mes "[�f�r���`]";
	mes "�������^�_�Ƃ͌���Ȃ��B";
	mes "�����Ɨ�͂��邺�B";
	next;
	switch(select("�J�{�`���p�C��������","�����Ȃ�","�J�{�`���p�C���ĉ��H")) {
	case 1:
		if(countitem(12192) < 1) {
			mes "[�f�r���`]";
			mes "�u�J�{�`���p�C�c�c�ǂ��H";
			mes "�R�c�c�R�����́H�v";
			next;
			mes "[�f�r���`]";
			mes "�R�����Č����Ă邼�B";
			mes "���O�A��������ȁc�c";
			next;
			mes "[�f�r���`]";
			mes "�u�J�{�`���p�C�c�c���ꂽ�B";
			mes "�ł��c�c�Ȃ��c�c";
			mes "�f�r�c�c���O�c�c�����Ȃ��B�v";
			next;
			mes "[�f�r���`]";
			mes "���Č��c�c����H";
			mes "�R�����ĉ��̂���!?";
			mes "����A���͐H���ĂȂ����āI";
			mes "���̐l�Ԃ��ŏ�������c�c";
			mes "����I�@��߁c�c";
			mes "�A�[�b!!";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�����Ȃ�c�c";
			mes "�R�͂����Ȃ���ˁB";
			mes "�ӂӂӂӂӁB";
			close;
		}
		mes "[�f�r���`]";
		mes "�u���ꂪ�c�c�J�{�`���p�C�I";
		mes "���肪�Ƃ��I�v";
		next;
		mes "[�f�r���`]";
		mes "�ق�A�J�{�`���p�C�����ꂽ�񂾂���";
		mes "�����Ɨ�����Ȃ��ƂȁB";
		mes "��͂�����Č����Ă�����H";
		next;
		mes "[�f�r���`]";
		mes "�u����c�c";
		mes "�l�ԁc�c�D���B";
		mes "����c�c������B";
		mes "�܂��c�c���������c�c";
		mes "�J�{�`���p�C�c�c���傤�����B�v";
		delitem 12192,1;
		if(rand(3))
			getitem 7460,3;
		else
			getitem 12130,1;
		next;
		mes "[�f�r���`]";
		mes "���O�̎����D�������Ă��B";
		mes "�ǂ���������˂����B";
		mes "�܂��J�{�`���p�C��~�������Ă邩��A";
		mes "�]���Ă���悤�Ȃ�";
		mes "�����Ă��Ă����B";
		close;
	case 2:
		mes "[�f�r���`]";
		mes "�u�J�{�`���p�C�c�c�H�ׂ����B";
		mes "���ꂽ��c�c����c�c������B�v";
		next;
		mes "[�f�r���`]";
		mes "���ꂪ�����C�ɂȂ�Ȃ��̂��H";
		mes "����ɁA�J�{�`���p�C�����ꂽ��";
		mes "������������Ԃ��H";
		close;
	case 3:
		mes "[�f�r���`]";
		mes "���̃J�{�`���}�X�^�[���Ă��";
		mes "�J�{�`�����ޗ��ɍ�����p�C�炵���B";
		mes "�b�ɂ��ƁA���̖��͓V����i�B";
		mes "��x�H�ׂ�Ƃ��̖���";
		mes "�i�v�ɖY����Ȃ����炵���B";
		next;
		mes "[�f�r���`]";
		mes "���̃����������A���̃J�{�`���p�C��";
		mes "��x�H�ׂĂ݂������Ď���";
		mes "�l�Ԃ�����̂�҂��Ă���񂾁B";
		next;
		mes "[�f�r���`]";
		mes "�J�{�`���p�C���Ă��";
		mes "�T���Ă��Ă���Ȃ����H";
		mes "��������͂��邩�炳�B";
		close;
	}
}
morocc.gat,159,143,3	script	�p�[�~���A#Haloween	799,{
	mes "[�p�[�~���A]";
	mes "���̓��������l�̒����Ȃ镔���A";
	mes "�킵�̃p�[�~���A�B";
	mes "���������l����󂯂����ҏ��";
	mes "�����Ă��邩����H";
	mes "^4A4AFF�j�u���w�C�����s�`�P�b�g^000000�̎���B";
	next;
	if(select("�����Ă��܂�","������")==2) {
		mes "[�p�[�~���A]";
		mes "���炻���c�c";
		mes "�������ҏ󂪗~�����Ȃ�A";
		mes "���������l�ɃJ�{�`���p�C��";
		mes "�v���[���g���č����グ��Ƃ������B";
		close;
	}
	mes "[�p�[�~���A]";
	mes "������g���ăj�u���w�C���ɍs���H";
	mes "�n���E�B�����Ԍ����";
	mes "�����Ă�������B";
	next;
	if(select("�s��","�s���Ȃ�")==2) {
		mes "[�p�[�~���A]";
		mes "���炻���c�c";
		mes "�ł��A�j�u���`�P�b�g��";
		mes "�c���Ă����Ă�";
		mes "�g���Ȃ��Ȃ邾����B";
		close;
	}
	if(countitem(7460) < 1) {
		mes "[�p�[�~���A]";
		mes "�R���c�c";
		mes "�`�P�b�g�������ĂȂ�����Ȃ��I";
		mes "�R���̌��͋z���Ă��I";
		emotion 23,"";
		percentheal -20,0;
		close;
	}
	mes "[�p�[�~���A]";
	mes "�`�P�b�g���m�F������B";
	mes "�ł́A�s���Ă�����Ⴂ�B";
	delitem 7460,1;
	close2;
	warp "nif_in",18,20;
	end;
}
prontera.gat,155,285,3	duplicate(�p�[�~���A#Haloween)	�p�[�~���A	799
payon.gat,156,231,3	duplicate(�p�[�~���A#Haloween)	�p�[�~���A	799
geffen.gat,120,188,3	duplicate(�p�[�~���A#Haloween)	�p�[�~���A	799
alberta.gat,80,171,3	duplicate(�p�[�~���A#Haloween)	�p�[�~���A	799

//==========================================
// �j���g���̗H��N�G�X�g
//------------------------------------------
pay_dun03.gat,0,0,0	script	ChickenGhost#pay	-1,{
OnInit:
	initnpctimer;
	end;
OnTimer180000:
	misceffect 360,"�j���g��#pay2";
	misceffect 360,"�j���g��#pay5";
	misceffect 360,"�j���g��#pay7";
	misceffect 360,"�j���g��#pay9";
	misceffect 360,"�j���g��#pay12";
	misceffect 360,"�j���g��#pay15";
	misceffect 360,"�j���g��#pay18";
	misceffect 360,"�j���g��#pay21";
	misceffect 360,"�j���g��#pay24";
	misceffect 360,"�j���g��#pay27";
	misceffect 360,"�j���g��#pay32";
	misceffect 360,"�j���g��#pay34";
	misceffect 360,"�j���g��#pay36";
	misceffect 360,"�j���g��#pay39";
	if(rand(5) == 0) {
		for(set '@i,0; '@i <= 39; set '@i,'@i+1)
			hideoffnpc "�j���g��#pay"+'@i;
		end;
	}
	initnpctimer;
	end;
OnTimer360000:
	for(set '@i,0; '@i <= 39; set '@i,'@i+1)
		hideonnpc "�j���g��#pay"+'@i;
	initnpctimer;
	end;
}
pay_dun03.gat,151,131,4	script	�j���g��#pay0	800,{
	hideonnpc;
	mes "�j���g���ɐG��悤�Ƃ���ƁA";
	mes "�܂�Ŏ��̂��Ȃ��������̂悤��";
	mes "�����Ă��܂����B";
	if(rand(5))
		close;
	mes "�j���g�����������ɂ�";
	mes "�u���v��������Ă���";
	getitem 574,1;
	close;
OnInit:
	hideonnpc;
	end;
}
pay_dun03.gat,152,131,4	duplicate(�j���g��#pay0)	�j���g��#pay1	800
pay_dun03.gat,153,131,4	duplicate(�j���g��#pay0)	�j���g��#pay2	800
pay_dun03.gat,154,131,4	duplicate(�j���g��#pay0)	�j���g��#pay3	800
pay_dun03.gat,155,131,4	duplicate(�j���g��#pay0)	�j���g��#pay4	800
pay_dun03.gat,156,131,4	duplicate(�j���g��#pay0)	�j���g��#pay5	800
pay_dun03.gat,157,131,4	duplicate(�j���g��#pay0)	�j���g��#pay6	800
pay_dun03.gat,158,131,4	duplicate(�j���g��#pay0)	�j���g��#pay7	800
pay_dun03.gat,150,132,4	duplicate(�j���g��#pay0)	�j���g��#pay8	800
pay_dun03.gat,153,132,4	duplicate(�j���g��#pay0)	�j���g��#pay9	800
pay_dun03.gat,156,132,4	duplicate(�j���g��#pay0)	�j���g��#pay10	800
pay_dun03.gat,159,132,4	duplicate(�j���g��#pay0)	�j���g��#pay11	800
pay_dun03.gat,149,133,4	duplicate(�j���g��#pay0)	�j���g��#pay12	800
pay_dun03.gat,160,133,4	duplicate(�j���g��#pay0)	�j���g��#pay13	800
pay_dun03.gat,149,134,4	duplicate(�j���g��#pay0)	�j���g��#pay14	800
pay_dun03.gat,152,134,4	duplicate(�j���g��#pay0)	�j���g��#pay15	800
pay_dun03.gat,157,134,4	duplicate(�j���g��#pay0)	�j���g��#pay16	800
pay_dun03.gat,160,134,4	duplicate(�j���g��#pay0)	�j���g��#pay17	800
pay_dun03.gat,149,135,4	duplicate(�j���g��#pay0)	�j���g��#pay18	800
pay_dun03.gat,151,135,4	duplicate(�j���g��#pay0)	�j���g��#pay19	800
pay_dun03.gat,152,135,4	duplicate(�j���g��#pay0)	�j���g��#pay20	800
pay_dun03.gat,153,135,4	duplicate(�j���g��#pay0)	�j���g��#pay21	800
pay_dun03.gat,156,135,4	duplicate(�j���g��#pay0)	�j���g��#pay22	800
pay_dun03.gat,157,135,4	duplicate(�j���g��#pay0)	�j���g��#pay23	800
pay_dun03.gat,158,135,4	duplicate(�j���g��#pay0)	�j���g��#pay24	800
pay_dun03.gat,160,135,4	duplicate(�j���g��#pay0)	�j���g��#pay25	800
pay_dun03.gat,149,136,4	duplicate(�j���g��#pay0)	�j���g��#pay26	800
pay_dun03.gat,152,136,4	duplicate(�j���g��#pay0)	�j���g��#pay27	800
pay_dun03.gat,157,136,4	duplicate(�j���g��#pay0)	�j���g��#pay28	800
pay_dun03.gat,160,136,4	duplicate(�j���g��#pay0)	�j���g��#pay29	800
pay_dun03.gat,150,137,4	duplicate(�j���g��#pay0)	�j���g��#pay30	800
pay_dun03.gat,153,137,4	duplicate(�j���g��#pay0)	�j���g��#pay31	800
pay_dun03.gat,156,137,4	duplicate(�j���g��#pay0)	�j���g��#pay32	800
pay_dun03.gat,159,137,4	duplicate(�j���g��#pay0)	�j���g��#pay33	800
pay_dun03.gat,151,138,4	duplicate(�j���g��#pay0)	�j���g��#pay34	800
pay_dun03.gat,152,138,4	duplicate(�j���g��#pay0)	�j���g��#pay35	800
pay_dun03.gat,154,138,4	duplicate(�j���g��#pay0)	�j���g��#pay36	800
pay_dun03.gat,155,138,4	duplicate(�j���g��#pay0)	�j���g��#pay37	800
pay_dun03.gat,157,138,4	duplicate(�j���g��#pay0)	�j���g��#pay38	800
pay_dun03.gat,158,138,4	duplicate(�j���g��#pay0)	�j���g��#pay39	800
//------------------------------------------
prt_fild08.gat,0,0,0	script	ChickenGhost#prt	-1,{
OnInit:
	initnpctimer;
	end;
OnTimer180000:
	misceffect 360,"�j���g��#prt2";
	misceffect 360,"�j���g��#prt4";
	misceffect 360,"�j���g��#prt5";
	misceffect 360,"�j���g��#prt8";
	misceffect 360,"�j���g��#prt12";
	misceffect 360,"�j���g��#prt15";
	misceffect 360,"�j���g��#prt18";
	misceffect 360,"�j���g��#prt20";
	misceffect 360,"�j���g��#prt22";
	misceffect 360,"�j���g��#prt24";
	if(rand(5) == 0) {
		for(set '@i,0; '@i <= 26; set '@i,'@i+1)
			hideoffnpc "�j���g��#prt"+'@i;
		end;
	}
	initnpctimer;
	end;
OnTimer360000:
	for(set '@i,0; '@i <= 26; set '@i,'@i+1)
		hideonnpc "�j���g��#prt"+'@i;
	initnpctimer;
	end;
}
prt_fild08.gat,155,350,4	script	�j���g��#prt0	800,{
	hideonnpc;
	mes "�j���g���ɐG��悤�Ƃ���ƁA";
	mes "�܂�Ŏ��̂��Ȃ��������̂悤��";
	mes "�����Ă��܂����B";
	if(rand(5))
		close;
	mes "�j���g�����������ɂ�";
	mes "�u���v��������Ă���";
	getitem 574,1;
	close;
OnInit:
	hideonnpc;
	end;
}
prt_fild08.gat,155,352,4	duplicate(�j���g��#prt0)	�j���g��#prt1	800
prt_fild08.gat,155,354,4	duplicate(�j���g��#prt0)	�j���g��#prt2	800
prt_fild08.gat,155,356,4	duplicate(�j���g��#prt0)	�j���g��#prt3	800
prt_fild08.gat,155,358,4	duplicate(�j���g��#prt0)	�j���g��#prt4	800
prt_fild08.gat,154,351,4	duplicate(�j���g��#prt0)	�j���g��#prt5	800
prt_fild08.gat,154,353,4	duplicate(�j���g��#prt0)	�j���g��#prt6	800
prt_fild08.gat,154,355,4	duplicate(�j���g��#prt0)	�j���g��#prt7	800
prt_fild08.gat,154,357,4	duplicate(�j���g��#prt0)	�j���g��#prt8	800
prt_fild08.gat,153,351,4	duplicate(�j���g��#prt0)	�j���g��#prt9	800
prt_fild08.gat,153,357,4	duplicate(�j���g��#prt0)	�j���g��#prt10	800
prt_fild08.gat,152,351,4	duplicate(�j���g��#prt0)	�j���g��#prt11	800
prt_fild08.gat,152,357,4	duplicate(�j���g��#prt0)	�j���g��#prt12	800
prt_fild08.gat,151,351,4	duplicate(�j���g��#prt0)	�j���g��#prt13	800
prt_fild08.gat,151,353,4	duplicate(�j���g��#prt0)	�j���g��#prt14	800
prt_fild08.gat,151,355,4	duplicate(�j���g��#prt0)	�j���g��#prt15	800
prt_fild08.gat,151,357,4	duplicate(�j���g��#prt0)	�j���g��#prt16	800
prt_fild08.gat,150,351,4	duplicate(�j���g��#prt0)	�j���g��#prt17	800
prt_fild08.gat,150,357,4	duplicate(�j���g��#prt0)	�j���g��#prt18	800
prt_fild08.gat,149,351,4	duplicate(�j���g��#prt0)	�j���g��#prt19	800
prt_fild08.gat,149,354,4	duplicate(�j���g��#prt0)	�j���g��#prt20	800
prt_fild08.gat,149,357,4	duplicate(�j���g��#prt0)	�j���g��#prt21	800
prt_fild08.gat,148,352,4	duplicate(�j���g��#prt0)	�j���g��#prt22	800
prt_fild08.gat,148,356,4	duplicate(�j���g��#prt0)	�j���g��#prt23	800
prt_fild08.gat,147,353,4	duplicate(�j���g��#prt0)	�j���g��#prt24	800
prt_fild08.gat,147,354,4	duplicate(�j���g��#prt0)	�j���g��#prt25	800
prt_fild08.gat,147,355,4	duplicate(�j���g��#prt0)	�j���g��#prt26	800

//==========================================
// �y�������[�h
//------------------------------------------
abyss_01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
abyss_02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
abyss_03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
alde_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
alde_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
alde_dun03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
alde_dun04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ama_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ama_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ama_dun03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ama_fild01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
anthell01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
anthell02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ayo_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ayo_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ayo_fild01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ayo_fild02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
beach_dun.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
beach_dun2.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
beach_dun3.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
c_tower1.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
c_tower2.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
c_tower3.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
c_tower4.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
cmd_fild01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
cmd_fild02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
cmd_fild03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
cmd_fild04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
cmd_fild05.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
cmd_fild07.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
cmd_fild08.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
cmd_fild09.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ein_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ein_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ein_fild01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ein_fild02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ein_fild03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ein_fild04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ein_fild05.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ein_fild07.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ein_fild08.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ein_fild09.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
ein_fild10.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_dun00.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_dun03.gat,0,0,0,0	monster	�y�������[�h	1812,1,0,0,0
gef_fild00.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_fild01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_fild02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_fild03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_fild04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_fild05.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_fild06.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_fild07.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_fild08.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_fild09.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_fild10.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_fild11.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_fild12.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_fild13.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gef_fild14.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gefenia01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gefenia02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gefenia03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gefenia04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gl_cas01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gl_cas02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gl_church.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gl_chyard.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gl_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gl_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gl_in01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gl_knt01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gl_knt02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gl_prison.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gl_prison1.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gl_sew01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gl_sew02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gl_sew03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gl_sew04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gl_step.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
glast_01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gon_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gon_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gon_dun03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
gon_fild01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
hu_fild01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
hu_fild02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
hu_fild03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
hu_fild04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
hu_fild05.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
hu_fild06.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
hu_fild07.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
in_sphinx1.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
in_sphinx2.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
in_sphinx3.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
in_sphinx4.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
in_sphinx5.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
iz_dun00.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
iz_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
iz_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
iz_dun03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
iz_dun04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
jupe_core.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
juperos_01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
juperos_02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
kh_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
kh_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
lhz_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
lhz_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
lhz_dun03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
lhz_fild01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
lhz_fild02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
lhz_fild03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
lou_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
lou_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
lou_dun03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
lou_fild01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mag_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mag_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mjo_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mjo_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mjo_dun03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mjolnir_01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mjolnir_02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mjolnir_03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mjolnir_04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mjolnir_05.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mjolnir_06.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mjolnir_07.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mjolnir_08.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mjolnir_09.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mjolnir_10.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mjolnir_11.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
mjolnir_12.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild05.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild06.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild07.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild08.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild09.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild10.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild11.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild12.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild13.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild14.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild15.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild16.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild17.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_fild18.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_pryd01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_pryd02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_pryd03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_pryd04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_pryd05.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
moc_pryd06.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
nif_fild01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
nif_fild02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
niflheim.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
odin_tem01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
odin_tem02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
odin_tem03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
orcsdun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
orcsdun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
pay_dun00.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
pay_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
pay_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
pay_dun03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
pay_dun04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
pay_fild01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
pay_fild02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
pay_fild03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
pay_fild04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
pay_fild05.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
pay_fild06.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
pay_fild07.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
pay_fild08.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
pay_fild09.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
pay_fild10.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
pay_fild11.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_fild00.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_fild01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_fild02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_fild03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_fild04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_fild05.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_fild06.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_fild07.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_fild08.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_fild09.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_fild10.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_fild11.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_maze01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_maze02.gat,0,0,0,0	monster	�y�������[�h	1812,1,0,0,0
prt_maze03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_sewb1.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_sewb2.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_sewb3.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
prt_sewb4.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
tha_t01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
tha_t02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
tha_t03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
tha_t04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
tha_t05.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
tha_t06.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
tha_t07.gat,0,0,0,0	monster	�y�������[�h	1812,1,0,0,0
tha_t08.gat,0,0,0,0	monster	�y�������[�h	1812,1,0,0,0
tha_t09.gat,0,0,0,0	monster	�y�������[�h	1812,1,0,0,0
tha_t10.gat,0,0,0,0	monster	�y�������[�h	1812,1,0,0,0
tha_t11.gat,0,0,0,0	monster	�y�������[�h	1812,1,0,0,0
tha_t12.gat,0,0,0,0	monster	�y�������[�h	1812,1,0,0,0
tur_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
tur_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
tur_dun03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
tur_dun04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
um_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
um_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
um_fild01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
um_fild02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
um_fild03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
um_fild04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
xmas_dun01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
xmas_dun02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
xmas_fild01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
yuno_fild01.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
yuno_fild02.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
yuno_fild03.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
yuno_fild04.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
yuno_fild05.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
yuno_fild06.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
yuno_fild07.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
yuno_fild08.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
yuno_fild09.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
yuno_fild10.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
yuno_fild11.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0
yuno_fild12.gat,0,0,0,0	monster	�y�������[�h	1812,3,0,0,0