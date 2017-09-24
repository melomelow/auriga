//= Auriga Script ==============================================================
// Ragnarok Online Artifacts of Gods Script by refis
//= Registry ===================================================================
// $GodSleipnir     -> 1���N�G�ʉߐl��
// $GodMagingiorde  -> 2���N�G�ʉߐl��
// $GodBrysinggamen -> 3���N�G�ʉߐl��
// $GodMjolnir      -> 4���N�G�ʉߐl��
//==============================================================================

//============================================================
// warp
//------------------------------------------------------------
yuno.gat,218,180,0		warp	quegod1001	1,1,que_god01.gat,99,84
que_god01.gat,99,81,0	warp	quegod1002	1,1,yuno.gat,218,177
que_god01.gat,63,88,0	warp	quegod1003	1,1,que_god01.gat,87,92
que_god01.gat,62,116,0	warp	quegod1004	1,1,que_god01.gat,46,94
que_god01.gat,12,116,0	warp	quegod1005	1,1,que_god01.gat,16,94
que_god01.gat,12,55,0	warp	quegod1006	1,1,que_god01.gat,17,83
que_god01.gat,50,55,0	warp	quegod1007	1,1,que_god01.gat,47,83

//============================================================
// �_��1�� �X���C�v�j�[���̕���N�G�X�g
//- Registry -------------------------------------------------
// GOD_1QUE -> 0�`51
//------------------------------------------------------------
yuno.gat,164,200,4	script	�Z��	101,{
	if($GodSleipnir >= 100 || BaseLevel < 70) {
		mes "[�m�C]";
		mes "�h��ƈ���Ɍ����Ă����ނ���܂��B";
		mes "��͊X�̏��l����w���ł��镨�A";
		mes "������̓����X�^�[��|���ē����镨�ł��B";
		next;
		mes "[�m�C]";
		mes "�����ɐ��\�̍��͊�{�I��";
		mes "����܂���B�ł��X���b�g�̐���";
		mes "��������܂��B";
		next;
		mes "[�m�C]";
		mes "�X���b�g�ł����H";
		mes "�X���b�g�́u�J�[�h�v��}���ꏊ��";
		mes "���Ƃł��B���Ȃ݂ɃJ�[�h��}����";
		mes "�h��͓���Ȍ��ʂ������܂��B";
		next;
		mes "[�m�C]";
		mes "�������A�X���b�g�����ʏ��葽��";
		mes "�h��ƃJ�[�h�́A������������X�^�[";
		mes "���炵�����肷�邱�Ƃ��ł��܂���B";
		mes "������A���̓��g�ݍ��킹�Ă�";
		mes "�g�p�ƂȂ�ƁA������������ł��ˁB";
		close;
	}
	mes "[�m�C]";
	mes "���������A�O����C�ɂȂ��Ă���ꏊ��";
	mes "����܂��B�����͌������̂悤�ł����A";
	mes "�����������Ă��邩�͔���܂���B";
	next;
	mes "[�m�C]";
	mes "�ŋ߁A������ʂ肪�������̂ł���";
	mes "�����h�^�o�^�Ƒ������������ł��B";
	mes "�{���ɕs�v�c�ȏ��ł��B";
	mes "�������Ă���̂ł��傤�ˁH";
	if(GOD_1QUE == 0)
		set GOD_1QUE,1;
	close;
}

que_god01.gat,98,98,4	script	�Ǘ��l	69,{
	if(checkitemblank() == 0) {
		mes "- �����A�C�e���̎�ސ��� -";
		mes "- �������߁A�A�C�e�����󂯂Ƃ� -";
		mes "- ���Ƃ��ł��܂���B -";
		mes "- �����A�C�e�������炵�Ă��� -";
		mes "- �ēx�b�������Ă��������B -";
		close;
	}
	if(MaxWeight - Weight < 5000) {
		mes "- �����d�ʂ��������߁A�A�C�e���� -";
		mes "- �󂯂Ƃ邱�Ƃ��ł��܂���B -";
		mes "- �����A�C�e�������炵�Ă��� -";
		mes "- �ēx�b�������Ă��������B -";
		close;
	}
	cutin "god_kukur01",2;
	if($GodSleipnir >= 100) {		// �������
		if(GOD_1QUE == 0) {
			cutin "god_kukur03",2;
			mes "[�N�N��]";
			mes "���`�A�ŋ߁A���ł���Ȃ�";
			mes "�Z�����̂�����c�c";
			mes "�f�[�g����ɂ����Ȃ���B";
			mes "�͂��`�c�c";
			next;
			mes "[�N�N��]";
			mes "�Ō�Ƀf�[�g�����̂͂��������H";
			mes "���[��c�c";
			mes "�͂��c�c��������Ȃ���I";
			mes "���`�A�Z�����Z�����`�I";
			emotion 19;
		}
		else if(GOD_1QUE < 51) {
			cutin "god_kukur03",2;
			mes "[�N�N��]";
			mes "����A����ɂ��́B";
			mes "��`���Ă���������";
			mes "���肪�Ƃ��������܂��B";
			mes "���̂���`���̕����撣���Ă�������";
			mes "�̂ŁA���܂��Ă����d�����啪";
			mes "�Еt���܂����B";
			next;
			mes "[�N�N��]";
			mes "���������܂Ō��������X��";
			mes "�i��ł��܂��B����������낵��";
			mes "���肢���܂��B";
		}
		else {
			cutin "god_kukur02",2;
			mes "[�N�N��]";
			mes "��`���Ă�����������������";
			mes "��{�����͖����ɏI�����܂����B";
			mes "���͎��̌����̏������Ȃ̂�";
			mes "����ȂɖZ�����͂���܂���B";
			mes "���������܂Ńf�[�g���c�c";
			mes "�ققق��c�c";
		}
		close2;
		cutin "god_kukur01",255;
		end;
	}
	// ��t��
	if(GOD_1QUE == 0 || BaseLevel < 70) {
		cutin "god_kukur03",2;
		mes "[�N�N��]";
		mes "���`�A�ŋ߁A���ł���Ȃ�";
		mes "�Z�����̂�����c�c";
		mes "�f�[�g����ɂ����Ȃ���B";
		mes "�͂��`�c�c";
		next;
		mes "[�N�N��]";
		mes "�Ō�Ƀf�[�g�����̂͂��������H";
		mes "���[��c�c";
		mes "�͂��c�c��������Ȃ���I";
		mes "���`�A�Z�����Z�����`�I";
		emotion 19;
		close2;
		cutin "god_kukur01",255;
		end;
	}
	switch(GOD_1QUE) {
	case 1:
		mes "[�N�N��]";
		mes "���������́A�͂邩�̂̐_�X";
		mes "�ɂ��Č������Ă��܂��B";
		mes "����������̓I�Ɍ����܂���";
		mes "�_�̗́A����ɂ��Ă̌����ł��B";
		next;
		mes "[�N�N��]";
		mes "�Ƃ��낪�ŋ߁A��ʌ�������";
		mes "�قƂ�ǂ��A�l�I�����";
		mes "���΂�ސE���Ă��܂��āc�c";
		mes "�}�ɐl��s���ɂȂ��Ă��܂����̂ł��B";
		next;
		mes "[�N�N��]";
		mes "�����͍��A��ԖZ����������";
		mes "�����������Ă��܂��B";
		mes "�ł��A���̂܂܂ł͑啔���̌�����";
		mes "���~�ɂ�����𓾂܂���c�c";
		next;
		mes "[�N�N��]";
		mes "���������Ԃ�����܂�����";
		mes "���������̎d������`����";
		mes "���������܂��񂩁H";
		mes "������񂨗�͂͂��݂܂��B";
		mes "���ЁA��낵�����肢���܂��B";
		next;
		if(select("������Ɨp��������܂��̂Łc�c","�����ł���A��`���܂�") == 1) {
			mes "[�N�N��]";
			mes "���c�c�����ł����c�c";
			mes "�p��������Ȃ�d���Ȃ��ł��ˁc�c";
			mes "�������m�荇���ł��肷���̕���";
			mes "��������������A���ǂ��ɏЉ��";
			mes "���������܂���H";
			next;
			mes "[�N�N��]";
			mes "�l�肪����Ȃ��̂͂ǂ��ɂ�";
			mes "�Ȃ�Ȃ��āc�c���Ђ��肢���܂��I";
			close2;
			cutin "god_kukur01",255;
			end;
		}
		cutin "god_kukur02",2;
		mes "[�N�N��]";
		mes "�킟�`�I�@�{���ł����H";
		mes "������܂��`�B";
		mes "����ő啪�y�ɂȂ�܂��B";
		mes "����ł͂�낵�����肢���܂��B";
		next;
		mes "[�N�N��]";
		mes "�������͂��̒��ɂ��܂��B";
		mes "���ڍs���āA����`�������Ă��������B";
		next;
		mes "[�N�N��]";
		mes "���ꂩ��c�c";
		mes "���ꂪ�������Վ��E���؂ł��B";
		mes "�撣���Ă��������ˁB";
		next;
		mes "- ^ff0000�������Վ��E����^000000 -";
		mes "- �����炢�܂����B -";
		set GOD_1QUE,2;
		close2;
		cutin "god_kukur01",255;
		end;
	case 50:
		cutin "god_kukur02",2;
		mes "[�N�N��]";
		mes "�킟�`�A�{���ɏ�����܂����`�B";
		mes "�ꎞ�͂ǂ��Ȃ邱�Ƃ��Ǝv���܂�����";
		mes "���������܂ŉ��Ƃ��Ȃ肻���ł��B";
		next;
		mes "[�N�N��]";
		mes "�����A���C�Â��ɂȂ����ł��傤��";
		mes "���ǂ��̌����Ώۂ́u�X���C�v�j�[���v";
		mes "�ł��B���̗l�ȁu�_��A�C�e���v��";
		mes "�ʂ����Đl�Ԃ̎�ō��o�����Ƃ�";
		mes "�ł���̂��H�@���ꂪ��������";
		mes "�ړI�ł��B";
		next;
		mes "[�N�N��]";
		mes "�������c�c���i�K�ł�";
		mes "�u�_��A�C�e���v�̐�����";
		mes "���Ȃ荢��Ƃ̌��_�ł��B";
		mes "�͂��`�c�c";
		next;
		mes "[�N�N��]";
		mes "����ł��A���������u�X���C�v�j�[���v";
		mes "�̗l�ȁu�_��A�C�e���v�̐������@��";
		mes "�����������悤�Ǝv���܂��B";
		mes "�\�����[���ł͂���܂��񂵂ˁB";
		next;
		mes "[�N�N��]";
		mes "��`���Ă�����������������";
		mes "��{�����͖����ɏI�����܂����B";
		mes "���͎��̌����̏������Ȃ̂�";
		mes "����ȂɖZ�����͂���܂���B";
		next;
		mes "[�N�N��]";
		mes "���A��������Ȃ���΂Ȃ�܂���ˁB";
		mes "���X���҂����������c�c";
		next;
		mes "[�N�N��]";
		mes "������ɂȂ�܂��B";
		mes "�債�����̂��Ⴀ��܂��񂪁A";
		mes "����Ƃ��Ď󂯎���Ă��������B";
		mes "����ł͂悢�����s���B";
		if($GodSleipnir < 100) {		// ��t��
			set $GodSleipnir,$GodSleipnir+1;
			if($GodSleipnir == 50) {
				announce "�����嗤��[�X���C�v�j�[��]�̕��󂪎p�������܂����B����",0;
			}
			else if($GodSleipnir == 100) {
				if($GodSleipnir == 100 && $GodMagingiorde == 100 && $GodBrysinggamen == 100 && $GodMjolnir == 100)
					announce "����[�X���C�v�j�[��]�̕��󂪉��������Ƃɂ��S�Ă̕��󂪉����A�_��̍쐬���ł���悤�ɂȂ�܂����B����",0;
				else
					announce "����[�X���C�v�j�[��]�̕��󂪉����܂����B����",0;
			}
		}
		set GOD_1QUE,51;
		set '@val1,rand(1,900);
		set '@val2,rand(1,1000);
		if('@val1 < 101) {
			if('@val2 < 210)
				getitem 2102,1;	// s�K�[�h
			else if('@val2 < 420)
				getitem 2104,1;	// s�o�b�N���[
			else if('@val2 < 630)
				getitem 2106,1;	// s�V�[���h
			else if('@val2 < 840)
				getitem 2108,1;	// s�~���[�V�[���h
			else
				getitem 2109,1;	// �������C�Y�u�b�N
		}
		else if('@val1 < 201) {
			if('@val2 < 48)
				getitem 2207,1;	// �����p��
			else if('@val2 < 96)
				getitem 2210,1;	// �w�A�o���h
			else if('@val2 < 150)
				getitem 2213,1;	// �L���̃w�A�o���h
			else if('@val2 < 190)
				getitem 2215,1;	// �Ԃ̃w�A�o���h
			else if('@val2 < 238)
				getitem 2217,1;	// s�r���^
			else if('@val2 < 290)
				getitem 2223,1;	// s�ۂ��ڂ���
			else if('@val2 < 340)
				getitem 2227,1;	// s�L���b�v
			else if('@val2 < 348)
				getitem 2229,1;	// s�w����
			else if('@val2 < 400)
				getitem 2231,1;	// s�W���G���w����
			else if('@val2 < 448)
				getitem 2233,1;	// s�T�[�N���b�g
			else if('@val2 < 496)
				getitem 2236,1;	// �T���^�̂ڂ���
			else if('@val2 < 544)
				getitem 2244,1;	// �傫�ȃ��{��
			else if('@val2 < 592)
				getitem 2245,1;	// �X�C�[�g�W�F���g��
			else if('@val2 < 640)
				getitem 2247,1;	// �I�[���h�X�^�[���}���X
			else if('@val2 < 688)
				getitem 2248,1;	// �E�F�X�^���O���C�X
			else if('@val2 < 736)
				getitem 2250,1;	// ���{���̃w�A�o���h
			else if('@val2 < 784)
				getitem 2251,1;	// ���E�҂̖X�q
			else if('@val2 < 832)
				getitem 2252,1;	// �E�B�U�[�h�n�b�g
			else if('@val2 < 880)
				getitem 2253,1;	// �����p�Ђ܂��
			else if('@val2 < 940)
				getitem 2257,1;	// �^�������c�m
			else
				getitem 2259,1;	// �v���y��
		}
		else if('@val1 < 301) {
			if('@val2 < 160)
				getitem 2267,1;	// �^�o�R
			else if('@val2 < 320)
				getitem 2262,1;	// �s�G���̕@
			else if('@val2 < 480)
				getitem 2263,1;	// �`���̊��
			else if('@val2 < 540)
				getitem 2265,1;	// �f���p�̃}�X�N
			else if('@val2 < 700)
				getitem 2266,1;	// �A�C�A���P�C��
			else if('@val2 < 800)
				getitem 2260,1;	// �~�j�O���X
			else if('@val2 < 900)
				getitem 2269,1;	// �Ԃт�
			else
				getitem 2270,1;	// ���̗t
		}
		else if('@val1 < 401) {
			if('@val2 < 70)
				getitem 2298,1;	// �΂��\�p
			else if('@val2 < 140)
				getitem 2275,1;	// �o���_�i
			else if('@val2 < 210)
				getitem 2276,1;	// �ɂޖ�
			else if('@val2 < 280)
				getitem 2277,1;	// �Ō�X
			else if('@val2 < 350)
				getitem 2279,1;	// ���ΐ�
			else if('@val2 < 420)
				getitem 2282,1;	// ���̃����O
			else if('@val2 < 490)
				getitem 2299,1;	// �I�[�N���̃w����
			else if('@val2 < 560)
				getitem 2287,1;	// �C���̓���
			else if('@val2 < 630)
				getitem 2289,1;	// ����
			else if('@val2 < 700)
				getitem 2290,1;	// �����p�̖X�q
			else if('@val2 < 770)
				getitem 2291,1;	// ���̉���
			else if('@val2 < 840)
				getitem 2294,1;	// �X�^�[�_�X�g
			else if('@val2 < 900)
				getitem 2295,1;	// �ډB��
			else if('@val2 < 950)
				getitem 2271,1;	// ���ዾ
			else
				getitem 2285,1;	// ���ˎ�̂��
		}
		else if('@val1 < 501) {
			if('@val2 < 80)
				getitem 2306,1;	// s�A�h�x���`���[�X�[�c
			else if('@val2 < 160)
				getitem 2308,1;	// s�����g��
			else if('@val2 < 240)
				getitem 2310,1;	// s�����O�R�[�g
			else if('@val2 < 320)
				getitem 2311,1;	// �~���N�̃R�[�g
			else if('@val2 < 400)
				getitem 2313,1;	// s�A�[�}�[
			else if('@val2 < 480)
				getitem 2315,1;	// s���C��
			else if('@val2 < 560)
				getitem 2329,1;	// s�E�h�D�����C��
			else if('@val2 < 630)
				getitem 2320,1;	// �t�H�[�}���X�[�c
			else if('@val2 < 700)
				getitem 2322,1;	// s�V���N���[�u
			else if('@val2 < 760)
				getitem 2324,1;	// s�X�P�[�s���[��
			else if('@val2 < 810)
				getitem 2326,1;	// s�Z�C���g���[�u
			else if('@val2 < 850)
				getitem 2317,1;	// s�v���[�g
			else if('@val2 < 900)
				getitem 2331,1;	// s�^�C�c
			else if('@val2 < 950)
				getitem 2333,1;	// s�V���o�[���[�u
			else
				getitem 2336,1;	// s�V�[�t�N���[�X
		}
		else if('@val1 < 601) {
			if('@val2 < 200)
				getitem 2402,1;	// s�T���_��
			else if('@val2 < 400)
				getitem 2404,1;	// s�V���[�Y
			else if('@val2 < 600)
				getitem 2406,1;	// s�u�[�c
			else if('@val2 < 800)
				getitem 2407,1;	// �K���X�̌C
			else
				getitem 2409,1;	// �n�C�q�[��
		}
		else if('@val1 < 701) {
			if('@val2 < 300)
				getitem 2502,1;	// s�t�[�h
			else if('@val2 < 550)
				getitem 2504,1;	// s�}�t���[
			else if('@val2 < 750)
				getitem 2506,1;	// s�}���g
			else
				getitem 2508,1;	// �ڂ�}���g
		}
		else if('@val1 < 801) {
			if('@val2 < 110)
				getitem 2601,1;	// �����O
			else if('@val2 < 220)
				getitem 2602,1;	// �C�������O
			else if('@val2 < 330)
				getitem 2603,1;	// �l�b�N���X
			else if('@val2 < 440)
				getitem 2604,1;	// �O���[�u
			else if('@val2 < 550)
				getitem 2605,1;	// �u���[�`
			else if('@val2 < 660)
				getitem 2607,1;	// �N���b�v
			else if('@val2 < 770)
				getitem 2608,1;	// ���U���[
			else if('@val2 < 880)
				getitem 2617,1;	// �_���̎��
			else
				getitem 2618,1;	// �}�[�^�[�̎��
		}
		else {
			if('@val2 < 150)
				getitem 2288,1;	// �X�N���b�`�}�X�N
			else if('@val2 < 260)
				getitem 2297,1;	// �S�u�������̉���
			else if('@val2 < 370)
				getitem 5087,1;	// �S�u�����l�j�̉���
			else if('@val2 < 480)
				getitem 5088,1;	// �S�u�����O�j�̉���
			else if('@val2 < 590)
				getitem 5089,1;	// �S�u�����ܒj�̉���
			else if('@val2 < 700)
				getitem 5090,1;	// �S�u�������[�_�[�̉���
			else if('@val2 < 810)
				getitem 5046,1;	// �{���S���X
			else if('@val2 < 920)
				getitem 2264,1;	// ���i�b�N�X
			else
				getitem 2225,1;	// s�S�[�O��
		}
		next;
		mes "[�N�N��]";
		mes "���c�c";
		mes "�Վ��E���؂͉�������Ē����܂��ˁB";
		mes "����ł́B";
		close2;
		cutin "god_kukur01",255;
		end;
	default:
		if(GOD_1QUE < 10) {
			cutin "god_kukur03",2;
			mes "[�N�N��]";
			mes "���������^�c����̂͂ƂĂ���ς�";
			mes "���Ƃł��B���̌������������̌�������";
			mes "�����������߂ɖW�Q���Ă������";
			mes "�F�X����܂�����ˁc�c���̂�����";
			mes "���̓f�[�g����ł��܂���B";
			mes "�͂��`�c�c";
			next;
			cutin "god_kukur02",2;
			mes "[�N�N��]";
			mes "�͂��c�c���A����b���āc�c";
			mes "���A���̂͒P�Ȃ�Ƃ茾�Ȃ̂�";
			mes "�Y��Ă��������ˁB";
			mes "�ققق��c�c";
		}
		else if(GOD_1QUE < 50) {
			mes "[�N�N��]";
			mes "����`�����肪�Ƃ��������܂��B";
			mes "����������낵�����肢���܂��B";
			mes "�����������͊F�Z�����̂�";
			mes "�����A���������������Ă��܂�����";
			mes "����܂���B�ł��A���͂����l�΂���";
			mes "�Ȃ̂ŁA���܂�C�ɂ��Ȃ��ł��������B";
		}
		else {
			cutin "god_kukur02",2;
			mes "[�N�N��]";
			mes "��`���Ă�����������������";
			mes "��{�����͖����ɏI�����܂����B";
			mes "���͎��̌����̏������Ȃ̂�";
			mes "����ȂɖZ�����͂���܂���B";
			mes "���������܂Ńf�[�g���c�c";
			mes "�ققق��c�c";
		}
		close2;
		cutin "god_kukur01",255;
		end;
	}
}

que_god01.gat,84,95,0	script	�X�B�b�`#1-1	111,{
	if(GOD_1QUE <= 1 || GOD_1QUE >= 51) {
		mes "- �h�A�Ɍ����������Ă���B -";
		mes "- ���͂�����ƁA�h�A�̉E���� -";
		mes "- �����̑��u������B���̑��u�� -";
		mes "- ������G�ꂳ����΁A�h�A�� -";
		mes "- �J�����낤�B -";
		close;
	}
	set '@n,substr(strnpcinfo(2),0,1);
	mes "- �h�A�Ɍ����������Ă���B -";
	mes "- ���͂�����ƁA�h�A�̉E���� -";
	mes "- �����̑��u������B���̑��u�� -";
	mes "- �Վ��E���؂�G�ꂳ�����B";
	mes "- �c�c�h�A���������B -";
	next;
	switch('@n) {
	case 1:
		warp "que_god01.gat",60,88;
		end;
	case 2:
		warp "que_god01.gat",62,119;
		end;
	case 3:
		warp "que_god01.gat",12,119;
		end;
	case 4:
		warp "que_god01.gat",12,52;
		end;
	case 5:
		warp "que_god01.gat",50,52;
		end;
	}
}
que_god01.gat,84,92,0	duplicate(�X�B�b�`#1-1)	�X�B�b�`#1-2	45,1,1
que_god01.gat,49,97,0	duplicate(�X�B�b�`#1-1)	�X�B�b�`#2-1	111
que_god01.gat,46,97,0	duplicate(�X�B�b�`#1-1)	�X�B�b�`#2-2	45,1,1
que_god01.gat,19,97,0	duplicate(�X�B�b�`#1-1)	�X�B�b�`#3-1	111
que_god01.gat,16,97,0	duplicate(�X�B�b�`#1-1)	�X�B�b�`#3-2	45,1,1
que_god01.gat,14,80,0	duplicate(�X�B�b�`#1-1)	�X�B�b�`#4-1	111
que_god01.gat,17,80,0	duplicate(�X�B�b�`#1-1)	�X�B�b�`#4-2	45,1,1
que_god01.gat,44,80,0	duplicate(�X�B�b�`#1-1)	�X�B�b�`#5-1	111
que_god01.gat,47,80,0	duplicate(�X�B�b�`#1-1)	�X�B�b�`#5-2	45,1,1

// ���g�̌����W�Q�N�G�X�g
que_god01.gat,66,125,6	script	������	89,{
	if($GodSleipnir >= 100) {		// �������
		mes "[�n�����h�b�g]";
		mes "����c�c";
		mes "�����͂���������c�c";
		mes "�ӂ��[�c�c��͂��l���Ƒ�ς��B";
		mes "��`���Ă����l�������";
		mes "�����񂾂��c�c";
		next;
		mes "[�n�����h�b�g]";
		mes "�d�����e�͂��̎��X�ŕω�����B";
		mes "�����炻�̎����ƂɕK�v�Ȑl�ނ�";
		mes "�ω�����B";
		next;
		mes "[�n�����h�b�g]";
		mes "���������悤�B";
		mes "�u�ޗ����W�v�����鎞��";
		mes "�̗͔h�̎�`�����K�v���B";
		mes "�������u�f�[�^���́v�����鎞��";
		mes "���]�h�̎�`�����K�v�ɂȂ�B";
		next;
		mes "[�n�����h�b�g]";
		mes "�܂�A�S�Ă̎��ɖ��\�Ȑl�ނ�������";
		mes "�d���̓����ɉ������l�ނ𓾂邱�Ƃ�";
		mes "�厖���Ă��Ƃ��B";
		close;
	}
	// ��t��
	if(GOD_1QUE == 2)
		set GOD_1QUE,11;
	if(GOD_1QUE == 11 || GOD_1QUE == 22 || GOD_1QUE == 33 || GOD_1QUE == 44) {
		switch(GOD_1QUE_SUB) {
		case 0:
			mes "[�n�����h�b�g]";
			mes "����A�N�B";
			mes "�N�N������ɗ��܂ꂽ�l���H";
			mes "�ق��A�d������`���Ă����ƁB";
			mes "�ӂށc�c";
			next;
			mes "[�n�����h�b�g]";
			mes "���̂Ƃ���A�����Ɋւ��Ă͐��m����";
			mes "�Ȃ��z�͂���Ȃ��B�����A���C��";
			mes "�������̎x���ȂǁA�ׁX�Ƃ����G�p��";
			mes "���Ȃ��z�͂���B";
			next;
			mes "[�n�����h�b�g]";
			mes "�����d���͂��������ȁc�c";
			mes "�m���������͂������c�c";
			mes "���[��c�c�����I";
			next;
			mes "[�n�����h�b�g]";
			mes "�������c�c";
			mes "^ff0000���g^000000�ɉ���Ă��Ă���Ȃ����H";
			mes "�ނ��ǂ����Ă��邩�A������Ɨl�q��";
			mes "���Ă��ė~�����B";
			next;
			mes "[�n�����h�b�g]";
			mes "�ނƉ��̌�������͂��������߂��񂾁B";
			mes "������ނɗ]�T����������A���̌�����";
			mes "��`���Ă��炦�邩������Ȃ��B";
			mes "�m���W���m�[�ɂ���͂��c�c";
			mes "�s���΂킩��Ǝv����B";
			set GOD_1QUE_SUB,1;
			close;
		case 1:
			if(YUNO_2QUE == 0) {	// ���g�̌����W�Q�N�G�X�g
				mes "[�n�����h�b�g]";
				mes "�܂��ނɉ�Ȃ��悤���ˁc�c";
				mes "�܂��A�ނ͏��X�C������A����";
				mes "�Z��������ˁB�ł����Ƃ͋C��������";
				mes "����������߂�����A�悭�b��";
				mes "���Ă����񂾁B����ł����Ȃ�";
				mes "�e�����񂾂�B";
				next;
				mes "[�n�����h�b�g]";
				mes "���΂炭����Ă��Ȃ����A";
				mes "�ǂ����Ă���񂾂낤�ȁB";
				mes "�����̏󋵂�ގ��g�̗l�q�Ȃ�";
				mes "�ߋ���������ƒm�肽���񂾁B";
				mes "����ł͗��ށB";
				close;
			}
			else if(YUNO_2QUE < 9) {
				mes "[�n�����h�b�g]";
				mes "����c�c";
				mes "�����Ȃ̂��c�c";
				mes "������Ɠ������C�ɂȂ�ȁB";
				mes "�����A����������ƔނƘb���Ă���";
				mes "����Ȃ����H";
				close;
			}
			else {
				mes "[�n�����h�b�g]";
				mes "����H";
				mes "�c�c�c�c";
				mes "����Ȃ��ƂɂȂ�Ƃ́c�c";
				mes "�������c�c";
				mes "������Ǝv�������Ȃ������ȁB";
				emotion 20;
				next;
				mes "[�n�����h�b�g]";
				mes "�d���Ȃ���ȁc�c";
				mes "�Ƃɂ������肪�Ƃ��B";
				mes "�����̊ԁA�҂��Ƃɂ����B";
				mes "�ނ��F�X���邾�낤���B";
				emotion 9;
				set GOD_1QUE_SUB,2;
				close;
			}
		case 2:
			if(rand(10) != 7) {
				mes "[�n�����h�b�g]";
				mes "�����A�����҂��Ă���B";
				mes "������Ǝ肪�����Ȃ��񂾁B";
				mes "����c�c";
				mes "�����͂����Łc�c";
				mes "�u�c�u�c�c�c";
				close;
			}
			mes "[�n�����h�b�g]";
			mes "���c�c�������c�c";
			mes "�������ȁc�c";
			mes "�킴�킴��`���Ă��ꂽ��";
			mes "���̌����ɂ��ď����b���Ă�邩�B";
			next;
			mes "[�n�����h�b�g]";
			mes "���̌�������́A";
			mes "�u^ff0000�X���C�v�j�[��^000000�v�̕��i�̈��";
			mes "�u^ff0000���m�̎���^000000�v�͗l���B";
			mes "�����ڂ͕��ʂ̎��ԂƎ��Ă���B����";
			mes "�悭���Ă݂�ƁA�d�g�݂����G������";
			mes "���̍\���́c�c�����킩���B";
			next;
			mes "[�n�����h�b�g]";
			mes "�u���m�̎��ԁv�͗l��";
			mes "���̖��̂��Ƃ��m�R�M���^�̗ւ��B";
			mes "���̖͗l���̂��s�v�c�Ȃ񂾂�";
			mes "��ԕs�v�c�Ȃ̂͂��̍ގ����B";
			next;
			mes "[�n�����h�b�g]";
			mes "�����ڂ��炷��ƍ|�S�̂悤����";
			mes "�����獂�M�������Ă��A�S�R�ό`";
			mes "���Ȃ��B�ނ��t�ɗ�₵�Ă����B";
			next;
			mes "[�n�����h�b�g]";
			mes "�܂��ǂ�ȏՌ��ɂ��ς���񂾁B";
			mes "�����狭���Ռ���^���Ă�";
			mes "�S�R�j�������l�q���Ȃ��B";
			mes "�����ȏ�������������Ȃ��B";
			next;
			mes "[�n�����h�b�g]";
			mes "�Ƃ��낪���̕��̂Ǝ�����";
			mes "�����邱�Ƃ�����B������";
			mes "����͈�肵�Ȃ��񂾁B";
			next;
			mes "[�n�����h�b�g]";
			mes "��x���������̂ł��A�ēx������";
			mes "�m�F���悤�Ƃ���ƁA�����Ȃ�";
			mes "���Ƃ�����B����c�c����";
			mes "���������邩������Ȃ����ȁB";
			next;
			mes "[�n�����h�b�g]";
			mes "�����c�c";
			mes "���܂���ɗ����Ȃ��b�����Ă��܂���";
			mes "���ȁB����A�C���g��Ȃ��Ă����B";
			mes "�Ƃɂ�����`���Ă���Ă��肪�Ƃ��B";
			mes "���Ⴀ���̌������̎�`����";
			mes "���Ă���Ă���B";
			next;
			mes "[�n�����h�b�g]";
			mes "�݂�Ȃ��Ȃ�Z������������ȁB";
			mes "����c�c";
			set GOD_1QUE_SUB,0;
			if(GOD_1QUE == 11)
				set GOD_1QUE,12;
			if(GOD_1QUE == 22)
				set GOD_1QUE,23;
			if(GOD_1QUE == 33)
				set GOD_1QUE,34;
			if(GOD_1QUE == 44)
				set GOD_1QUE,50;
			close;
		}
	}
	mes "[�n�����h�b�g]";
	mes "����c�c";
	mes "�����͂���������c�c";
	mes "�ӂ��[�c�c��͂��l���Ƒ�ς��B";
	mes "��`���Ă����l�������";
	mes "�����񂾂��c�c";
	next;
	mes "[�n�����h�b�g]";
	mes "�d�����e�͂��̎��X�ŕω�����B";
	mes "�����炻�̎����ƂɕK�v�Ȑl�ނ�";
	mes "�ω�����B";
	next;
	mes "[�n�����h�b�g]";
	mes "���������悤�B";
	mes "�u�ޗ����W�v�����鎞��";
	mes "�̗͔h�̎�`�����K�v���B";
	mes "�������u�f�[�^���́v�����鎞��";
	mes "���]�h�̎�`�����K�v�ɂȂ�B";
	next;
	mes "[�n�����h�b�g]";
	mes "�܂�A�S�Ă̎��ɖ��\�Ȑl�ނ�������";
	mes "�d���̓����ɉ������l�ނ𓾂邱�Ƃ�";
	mes "�厖���Ă��Ƃ��B";
	close;
}

// �ΔŃN�G�X�g
que_god01.gat,14,47,3	script	������	69,{
	if($GodSleipnir >= 100) {		// �������
		mes "[�p�x��]";
		mes "�Ӂ[�ށc�c";
		mes "���Ƃ͉ʂ��Ăǂ�Ȍ`�ԂŒ�`";
		mes "�ł���̂��H�@���̂Ƃ��낱�̖��";
		mes "�͂��܂�d�v�ł͂Ȃ��B�ނ��데��";
		mes "���ݎ��̂̏ؖ��̕����d�v�Ȗ��";
		mes "�ł���B";
		close;
	}
	// ��t��
	if(GOD_1QUE == 2)
		set GOD_1QUE,41;
	if(GOD_1QUE == 41 || GOD_1QUE == 12 || GOD_1QUE == 23 || GOD_1QUE == 34) {
		switch(GOD_1QUE_SUB) {
		case 0:
			mes "[�p�x��]";
			mes "�S�z���S�z���c�c";
			mes "�n�b�N�V�����c�c";
			mes "��H";
			mes "�N�́c�c�H";
			mes "�c�c�c�c";
			next;
			mes "[�p�x��]";
			mes "�����A�������B";
			mes "���x����ƌ����Ă��c�c�S�z��";
			mes "�ӂނӂށc�c���܂�ȁB";
			mes "���A���ׂ��Ђ��Ăāc�c";
			mes "�S�z���S�z���c�c";
			next;
			mes "[�p�x��]";
			mes "�Ӂ[�ށc�c";
			mes "��`���ɂ��Ă��ꂽ�̂͂������c�c";
			mes "�͂āA���𗊂߂΂����̂��c�c";
			next;
			mes "[�p�x��]";
			mes "�Ӂ[�ށc�c�w�b�N�c�c";
			mes "������������A�n�b�N�V����";
			mes "���Ă��Ȃ����c�c�S�z��";
			mes "���̏�ɂ��邩��c�c�n�b�N�V�����I";
			set GOD_1QUE_SUB,1;
			close;
		case 1:
			mes "[�p�x��]";
			mes "���̏�̕������ĕ�";
			mes "�w�b�N�V�����c�c���Ă����";
			mes "�n�b�N�V�����c�c����������B";
			mes "�S�z���S�z���c�c";
			close;
		case 2:
			mes "[�p�x��]";
			mes "�S�z���S�z���c�c";
			mes "���Ă����̂��ˁH";
			mes "�ӂނӂށc�c���̗l�q����";
			mes "���Ȃ̂�����Ȃ������悤���ˁB";
			next;
			mes "[�p�x��]";
			mes "�n�b�N�V�����c�c";
			mes "���̐Δc�c����΁c�c";
			mes "�n�b�N�V�����c�c�̂悤�ȕ���";
			mes "������Ă��鎚�́c�c�S�z��";
			mes "�c�c���͎g���Ă��Ȃ��B";
			mes "�����Ñ�A�S�z���c�c�������ȁB";
			next;
			mes "[�p�x��]";
			mes "���̌Ñ㕶���ɂ͉������炭�肪";
			mes "����͂����B�n�b�N�V�����c�c";
			mes "����͂����Ɓc�c";
			next;
			mes "[�p�x��]";
			mes "�����ڂ���A�n�b�N�V�����c�c";
			mes "�z������Ɂc�c�����A�Δ��̂�";
			mes "�n�b�N�V�����n�b�N�V�����c�c";
			mes "�����̑��u�ɂȂ��Ă���͂����B";
			mes "�Y���Y���c�c";
			next;
			mes "[�p�x��]";
			mes "�n�b�N�V�����c�c�ӂނӂށc�c";
			mes "�悭���Ă݂�Ɣ��Â��ӏ�������";
			mes "���낤�B�����͒P�Ȃ�F�̈Ⴂ�ł͂Ȃ�";
			mes "�S�z���S�z���A�ʂ̎��̏�ɂ��̎���";
			mes "�d�Ȃ��Ă���\��������c�c";
			mes "�n�b�N�V����!!";
			next;
			mes "[�p�x��]";
			mes "���̑��u���c�c�S�z���S�z���c�c";
			mes "�����ł���Δ���Ǝv���񂾂��A";
			mes "���ꂪ���̎��̏�Ԃł�";
			mes "�ł��Ȃ��Ăˁc�c";
			next;
			mes "[�p�x��]";
			mes "�ӂނӂށc�c��������`���Ă�����";
			mes "���肪�����B�S�z���S�z���I";
			mes "�n�b�N�V���[��!!�@����ł͂�����x";
			mes "���Ă��ė~�����B���ށB";
			mes "�c�c�w�b�N�V���[��!!";
			set GOD_1QUE_SUB,3;
			close;
		case 3:
			mes "[�p�x��]";
			mes "�w�A�w�A�w�b�N�V���[��!!";
			mes "�����ށc�c";
			mes "�c�c�����A����������c�c�n�A�n";
			mes "�n�b�N�V���[��!!";
			close;
		case 4:
			mes "[�p�x��]";
			mes "�Y���Y���c�c";
			mes "�c�c����H";
			mes "�n�A�n�b�N�V���[��!!";
			mes "�������ˁc�c";
			mes "�ӂނӂށc�c";
			next;
			mes "[�p�x��]";
			mes "��͂肻��ȕ����c�c�w�b�N�V����!!";
			mes "���������̂��c�c�P���Ђǂ���";
			mes "�������茩��Ȃ���������c�c";
			mes "�S�z���S�z���c�c�C�Â��Ȃ������ȁB";
			next;
			mes "[�p�x��]";
			mes "�n�b�N�V�����c�c�q�b�N�c�c";
			mes "���Ȃ菕����ꂽ��B";
			mes "�n�A�n�A�n�b�N�V�����c�c";
			mes "�ӂނӂށc�c���肪�Ƃ��B";
			mes "�S�z���S�z���B";
			set GOD_1QUE_SUB,0;
			if(GOD_1QUE == 41)
				set GOD_1QUE,42;
			if(GOD_1QUE == 12)
				set GOD_1QUE,13;
			if(GOD_1QUE == 23)
				set GOD_1QUE,24;
			if(GOD_1QUE == 34)
				set GOD_1QUE,50;
			close;
		}
	}
	mes "[�p�x��]";
	mes "�Ӂ[�ށc�c";
	mes "���Ƃ͉ʂ��Ăǂ�Ȍ`�ԂŒ�`";
	mes "�ł���̂��H�@���̂Ƃ��낱�̖��";
	mes "�͂��܂�d�v�ł͂Ȃ��B�ނ��데��";
	mes "���ݎ��̂̏ؖ��̕����d�v�Ȗ��";
	mes "�ł���B";
	close;
}

que_god01.gat,20,49,4	script	�Δ�	111,{
	if($GodSleipnir >= 100) {		// �������
		mes "- �ςȕ����������ꂽ�Δ�����B -";
		mes "- �ǂ����Ƃ������A���̕����� -";
		mes "- ����Ȃ������B -";
		close;
	}
	// ��t��
	if(GOD_1QUE == 41 || GOD_1QUE == 12 || GOD_1QUE == 23 || GOD_1QUE == 34) {
		if(GOD_1QUE_SUB == 1 || GOD_1QUE_SUB == 2) {
			mes "�c�c�`���n���A^ff00ff���b�N�E�B^000000�A�m��";
			mes "�U�b�N�I���A�]�n���]���X�c�c�I���]";
			mes "�n���A�U�����E�B�O�B�c�c�]�m���S�[��";
			mes "�T�E�A�E�u�m���A�h���I�c�c�U����";
			mes "^ff00ff�n���T��^000000�M�����E�B�A���S�����S�m��";
			next;
			mes "�U�b�N�I���]�]�c�c�U�b�N�I���]�n���m";
			mes "���U�b�N�I���A�]�n���U�A�U�b�N�c�c";
			mes "^ff00ff�z���U��^000000�A�n���c�c�����m���c�c";
			set GOD_1QUE_SUB,2;
			next;
			mes "- �Δɂ͒m��Ȃ������� -";
			mes "- ���܂�Ă���B�Ñ㕶���� -";
			mes "- �悤���B�������������Ă��� -";
			mes "- �ǂ߂Ȃ��ӏ��������B��� -";
			mes "- �G��Ă݂�Ɖ����������B -";
			mes "- �P�Ȃ�΂ł͂Ȃ��悤���B -";
			close;
		}
		else if(GOD_1QUE_SUB == 3) {
			mes "�c�c�`���n���A^ff00ff���b�N�E�B^000000�A�m��";
			mes "�U�b�N�I���A�]�n���]���X�c�c�I���]";
			mes "�n���A�U�����E�B�O�B�c�c�]�m���S�[��";
			mes "�T�E�A�E�u�m���A�h���I�c�c�U����";
			mes "^ff00ff�n���T��^000000�M�����E�B�A���S�����S�m��";
			next;
			mes "�U�b�N�I���]�]�c�c�U�b�N�I���]�n���m";
			mes "���U�b�N�I���A�]�n���U�A�U�b�N�c�c";
			mes "^ff00ff�z���U��^000000�A�n���c�c�����m���c�c";
			next;
			mes "- �悭����ƁA�����Ղ����� -";
			mes "- ����������B�������̂Ɏd�g�݂� -";
			mes "- ����悤���B -";
			set '@num,0;
			setarray '@answer$,"���b�N�E�B","�n���T��","�z���U��";
			while(1) {
				next;
				mes "�c�c�`���n���A^ff00ff���b�N�E�B^000000�A�m��";
				mes "�U�b�N�I���A�]�n���]���X�c�c�I���]";
				mes "�n���A�U�����E�B�O�B�c�c�]�m���S�[��";
				mes "�T�E�A�E�u�m���A�h���I�c�c�U����";
				mes "^ff00ff�n���T��^000000�M�����E�B�A���S�����S�m��";
				next;
				mes "�U�b�N�I���]�]�c�c�U�b�N�I���]�n���m";
				mes "���U�b�N�I���A�]�n���U�A�U�b�N�c�c";
				mes "^ff00ff�z���U��^000000�A�n���c�c�����m���c�c";
				next;
				if('@num < 3) {
					input '@str$;
					if('@answer$['@num] != '@str$) {
						mes "- ^ff0000" +'@str$+ "^000000�Ƃ��������� -";
						mes "- �G��Ă݂��������ω����Ȃ��B -";
						mes "- ���̕��@���l���悤�B -";
						close;
					}
					mes "- �s�L�b!! -";
					mes "- ^ff0000" +'@str$+ "^000000�Ƃ��������� -";
					mes "- �����Ă݂�ƁA�Δ���ς� -";
					mes "- ���������B���������ɕω��� -";
					mes "- �Ȃ��������B���̕����ɐG��� -";
					mes "- �݂悤�B -";
					set '@num,'@num+1;
					continue;
				}
				mes "- �M�M�M�B�B�[�b -";
				mes "- �O�̕��������ɉ������B -";
				mes "- ����ƕςȉ��Ƌ��ɐΔ� -";
				mes "- �k�����n�߂��B�c�c����܂� -";
				mes "- �\������Ă��������������A -";
				mes "- ����ɕʂ̕��������ꂽ�B -";
				next;
				mes "�U�b�N�I���]�n�����b�N�E�B�m���U�b�N";
				mes "�I���]�n���]���X�U�b�N�I���]�n��";
				mes "�C���O�t���I���U�b�N�I���]�n���U����";
				mes "�E�B�O�B�\���I���b�m���]�m���S�|��";
				mes "�T�E�u�m���S�h���I�U�����n���T��";
				next;
				mes "�M�����E�B���S�����S�m���U�b�N�I���]";
				mes "�n���T�������U�b�N�I���]�n���m";
				mes "���U�b�N�I���]�n���U�����U�b�N�I���]";
				mes "�C���O�t���z���U���n���T���X�����m��";
				mes "�~���O�n���}�O�B";
				next;
				mes "- �c�c�c�c -";
				mes "- ��͂�ǂ�ȈӖ��Ȃ̂� -";
				mes "- ����Ȃ��c�c�c�c -";
				set GOD_1QUE_SUB,4;
				next;
				mes "- ���΂炭����ƁA�����Ă��� -";
				mes "- �������������B���u���쓮������ -";
				mes "- ��莞�Ԃ��o�߂���Ə����� -";
				mes "- �悤���B -";
				close;
			}
		}
		else {
			mes "�c�c�`���n�����b�N�E�B�m��";
			mes "�U�b�N�I���]�n���]���X�c�c�I���]";
			mes "�n���U�����E�B�O�B�c�c�]�m���S�[��";
			mes "�T�E�E�u�m���h���I�c�c�U����";
			mes "�n���T���M�����E�B���S�����S�m��";
			next;
			mes "�U�b�N�I���]�]�c�c�U�b�N�I���]�n���m";
			mes "���U�b�N�I���A�]�n���U�A�U�b�N�c�c";
			mes "�z���U���n���c�c�����m���c�c";
			next;
			mes "- �Δ̂������������Ă��� -";
			mes "- �ǂ߂Ȃ��ӏ��������B��� -";
			mes "- �G��Ă݂�Ɖ����������B -";
			mes "- �P�Ȃ�΂ł͂Ȃ��悤���B -";
			mes "- �c�c�C�ɂ��Ȃ��ł������B -";
			close;
		}
	}
	mes "�c�c�`���n�����b�N�E�B�m��";
	mes "�U�b�N�I���]�n���]���X�c�c�I���]";
	mes "�n���U�����E�B�O�B�c�c�]�m���S�[��";
	mes "�T�E�E�u�m���h���I�c�c�U����";
	mes "�n���T���M�����E�B���S�����S�m��";
	next;
	mes "�U�b�N�I���]�]�c�c�U�b�N�I���]�n���m";
	mes "���U�b�N�I���A�]�n���U�A�U�b�N�c�c";
	mes "�z���U���n���c�c�����m���c�c";
	next;
	mes "- �Δ̂������������Ă��� -";
	mes "- �ǂ߂Ȃ��ӏ��������B��� -";
	mes "- �G��Ă݂�Ɖ����������B -";
	mes "- �P�Ȃ�΂ł͂Ȃ��悤���B -";
	close;
}

// ���ރA�C�e�����W�N�G�X�g
que_god01.gat,55,47,3	script	������	803,{
	if($GodSleipnir >= 100) {		// �������
		mes "[�N���g]";
		mes "�����ɂ����ĕK�v�Ȃ̂�";
		mes "���{�Ɛl�肾���ł͂Ȃ��A";
		mes "�������̂��̂ɑ΂���ӗ~�ƔM�ӁI";
		next;
		mes "[�N���g]";
		mes "�ꕔ�̎��{�Ƃ����͋��Ɛl���������";
		mes "�������i�ނƎv���Ă邯�ǁc�c������";
		mes "���{���L���ŗD�ꂽ�l�ނ������Ă��A";
		mes "���̐l�ɓ��@���ӗ~��^�����Ȃ����";
		mes "���̌����͎��s�����B";
		close;
	}
	// ��t��
	if(GOD_1QUE == 2)
		set GOD_1QUE,31;
	if(GOD_1QUE == 31 || GOD_1QUE == 42 || GOD_1QUE == 13 || GOD_1QUE == 24) {
		switch(GOD_1QUE_SUB) {
		case 0:
			mes "[�N���g]";
			mes "�ւ��`";
			mes "���x�����Ă����Վ��̐l����";
			mes "���񂽂����H�@�b�͕����Ă��B";
			mes "�Ӂ`��B";
			next;
			mes "[�N���g]";
			mes "�z���g�͂���������Ɛ��m��������l";
			mes "���~�����������ǁc�c�󋵓I�ɖ������B";
			mes "�܁A���m�����Ȃ��Ă��A���Ȃ��";
			mes "�������݂���l�����܂ɂ��邵�B";
			mes "���񂽂Ɋ��҂��Ă��B";
			next;
			mes "[�N���g]";
			mes "���͂������̌������A���傤�ǒǂ�����";
			mes "�i�K�łˁB����Ȃɑ����̐l���";
			mes "����Ȃ����ǁA��������l���Ƃ��傢��";
			mes "�ׂ��d���ĂˁB����ŊO���̐l��";
			mes "�C���悤�Ǝv�����񂾂��ǁc�c";
			next;
			mes "[�N���g]";
			mes "�Ӂ`��c�c���񂽁A�啪���������ˁB";
			mes "�悵�A���񂽂ɔC���Ă݂邩�B";
			mes "���͍��A�u���̍��v�𕡐����邽�߂�";
			mes "�ޗ����W�߂Ă���񂾁B";
			next;
			mes "[�N���g]";
			mes "��H�@�����g���̂����āH";
			mes "�܂��A�����͉��ł������Ă݂����";
			mes "���Ƃ��B";
			next;
			mes "[�N���g]";
			mes "�����ł��񂽂ɂ́A���Ɋւ��镨��";
			mes "�W�߂Ă��Ă��炢�����B";
			mes "�Ⴆ�Η؂�K���Ƃ����B";
			mes "�������ˁA���\�ʂ���΂�����B";
			next;
			mes "[�N���g]";
			mes "���Ⴀ�A��낵���I";
			mes "���񂽂Ȃ炱�ꂭ�炢���C����ˁB";
			mes "�Ƃ������ƂŁA�撣���Ă����B";
			set GOD_1QUE_SUB,1;
			close;
		case 1:
			mes "[�N���g]";
			mes "�����A�W�߂Ă����ȁ`";
			mes "�悵�A�����Ă݁B";
			mes "�Ӂ`��c�c";
			next;
			mes "[�N���g]";
			mes "����c�c";
			mes "����Ɓc�c";
			mes "����Ɓc�c";
			mes "����Ɓc�c";
			mes "�ӂށc�c";
			if(countitem(918) > 8)		// �ׂƂׂƐ�����
				set '@count,'@count+1;
			if(countitem(950) > 8)		// �l���̐S��
				set '@count,'@count+1;
			if(countitem(951) > 8)		// �w�т�
				set '@count,'@count+1;
			if(countitem(956) > 8)		// �g�Q�����Ă���G��
				set '@count,'@count+1;
			if(countitem(959) > 8)		// ����������
				set '@count,'@count+1;
			if(countitem(960) > 8)		// ���Ƀj�b�p
				set '@count,'@count+1;
			if(countitem(961) > 8)		// �L
				set '@count,'@count+1;
			if(countitem(962) > 8)		// �G��
				set '@count,'@count+1;
			if(countitem(963) > 8)		// �s����
				set '@count,'@count+1;
			if(countitem(964) > 8)		// ���ɂ̂�����
				set '@count,'@count+1;
			if(countitem(965) > 8)		// �L�k
				set '@count,'@count+1;
			if(countitem(966) > 8)		// �L�̂ނ���
				set '@count,'@count+1;
			if(countitem(7013) > 8)		// �T���S
				set '@count,'@count+1;
			if(countitem(1054) > 8)		// �Ñ㋛�̐O
				set '@count,'@count+1;
			if(countitem(1053) > 8)		// �Ñ㋛�̎�
				set '@count,'@count+1;
			if(countitem(1052) > 8)		// �P�זE
				set '@count,'@count+1;
			if(countitem(1051) > 8)		// ����
				set '@count,'@count+1;
			if(countitem(1050) > 8)		// ����
				set '@count,'@count+1;
			if(countitem(1024) > 8)		// �n�`
				set '@count,'@count+1;
			if(countitem(1023) > 8)		// ���̐K��
				set '@count,'@count+1;
			next;
			if('@count < 15) {
				mes "[�N���g]";
				mes "���`��c�c";
				mes "����`���Ƒ���Ȃ��ˁB";
				mes "���������W�߂Ă��Ă��傤�����B";
				close;
			}
			mes "[�N���g]";
			mes "�����`";
			mes "�悭�W�߂Ă����ȁ`�B";
			mes "�����`�I";
			mes "���ꂾ������΁A�\����";
			mes "�����ł����B";
			next;
			mes "[�N���g]";
			mes "����`�A����ȂɏW�߂Ă��Ă����Ƃ�";
			mes "�v��Ȃ�������`�B";
			mes "�{���ɂ悭���ꂾ���W�߂���ȁB";
			mes "�͂͂͂͂��B";
			mes "���ꂶ��A�L���Ɏg�킹�Ă��炤�ˁB";
			if(countitem(918) > 8)
				delitem 918,9;
			if(countitem(950) > 8)
				delitem 950,9;
			if(countitem(951) > 8)
				delitem 951,9;
			if(countitem(956) > 8)
				delitem 956,9;
			if(countitem(959) > 8)
				delitem 959,9;
			if(countitem(960) > 8)
				delitem 960,9;
			if(countitem(961) > 8)
				delitem 961,9;
			if(countitem(962) > 8)
				delitem 962,9;
			if(countitem(963) > 8)
				delitem 963,9;
			if(countitem(964) > 8)
				delitem 964,9;
			if(countitem(965) > 8)
				delitem 965,9;
			if(countitem(966) > 8)
				delitem 966,9;
			if(countitem(1023) > 8)
				delitem 1023,9;
			if(countitem(1024) > 8)
				delitem 1024,9;
			if(countitem(1050) > 8)
				delitem 1050,9;
			if(countitem(1051) > 8)
				delitem 1051,9;
			if(countitem(1052) > 8)
				delitem 1052,9;
			if(countitem(1053) > 8)
				delitem 1053,9;
			if(countitem(1054) > 8)
				delitem 1054,9;
			if(countitem(7013) > 8)
				delitem 7013,9;
			set GOD_1QUE_SUB,0;
			if(GOD_1QUE == 31)
				set GOD_1QUE,32;
			if(GOD_1QUE == 42)
				set GOD_1QUE,43;
			if(GOD_1QUE == 13)
				set GOD_1QUE,14;
			if(GOD_1QUE == 24)
				set GOD_1QUE,50;
			close;
		}
	}
	mes "[�N���g]";
	mes "�����ɂ����ĕK�v�Ȃ̂�";
	mes "���{�Ɛl�肾���ł͂Ȃ��A";
	mes "�������̂��̂ɑ΂���ӗ~�ƔM�ӁI";
	next;
	mes "[�N���g]";
	mes "�ꕔ�̎��{�Ƃ����͋��Ɛl���������";
	mes "�������i�ނƎv���Ă邯�ǁc�c������";
	mes "���{���L���ŗD�ꂽ�l�ނ������Ă��A";
	mes "���̐l�ɓ��@���ӗ~��^�����Ȃ����";
	mes "���̌����͎��s�����B";
	close;
}

// �_�b�N�G�X�g
que_god01.gat,11,136,6	script	������	742,{
	if($GodSleipnir >= 100) {		// �������
		mes "[�A�f�B��]";
		mes "�ӂނӂށc�c";
		mes "�`����_�b�ɂ́A���X�����������";
		mes "�b�������ɑ��݂���ꍇ������܂��B";
		next;
		mes "[�A�f�B��]";
		mes "������������̘b�������錴����";
		mes "���̘b�̋N���𒲂ׂ�ƁA�ĊO";
		mes "�ȒP�Ɍ����������̂ł��B";
		close;
	}
	// ��t��
	if(GOD_1QUE == 2)
		set GOD_1QUE,21;
	if(GOD_1QUE == 21 || GOD_1QUE == 32 || GOD_1QUE == 43 || GOD_1QUE == 14) {
		switch(GOD_1QUE_SUB) {
		case 0:
			mes "[�A�f�B��]";
			mes "�ق��ق��c�c";
			mes "���`��H";
			mes "�ӂނӂށc�c";
			next;
			mes "[�A�f�B��]";
			mes "�c�c�قق��`�B";
			mes "�Վ��œ����ė������ł��傤�H";
			mes "���傤�ǂ������ɗ��܂����B";
			mes "���A���Ȃ�Z������ł���B";
			next;
			mes "[�A�f�B��]";
			mes "�ӂނӂށc�c";
			mes "�܂����̌����������Ă����܂��傤�B";
			mes "���̌����́u�X���C�v�j�[���v�̍ޗ���";
			mes "�����u�V�g�̉H�сv�ł��B";
			next;
			mes "[�A�f�B��]";
			mes "���ɒ��ڂ��Ă��邱�Ƃ́c�c";
			mes "�u�V�g�̉H�сv������";
			mes "�u�X���C�v�j�[���v�̍ޗ��ƂȂ�̂��A";
			mes "���̑f�ނ͉��Ȃ̂��A�Ƃ������Ƃł��B";
			next;
			mes "[�A�f�B��]";
			mes "�ŋ߁A����ɂ܂��`����m��l��";
			mes "�u�t�F�C�����v�ɂ��邱�Ƃ�";
			mes "����܂����B";
			next;
			mes "[�A�f�B��]";
			mes "����ǂ��A���͂��̏�𗣂���Ȃ�";
			mes "��Ԃł��B�{���́A���ژb�𕷂���";
			mes "�s���Ȃ���΂Ȃ�Ȃ��̂ł����c�c";
			next;
			mes "[�A�f�B��]";
			mes "�ł��A�����𗯎�ɂ��Ă܂�";
			mes "�t�F�C�����֍s���̂͂�������";
			mes "�������ł��B";
			next;
			mes "[�A�f�B��]";
			mes "���������Ă���Y�݂͑�̂����";
			mes "�����ł��B�����ł��Ȃ��ɂ��肢��";
			mes "����܂��B���̑���Ƀt�F�C������";
			mes "�s���āA���̐l�̘b�𕷂��Ă���";
			mes "���炦�܂��񂩁H";
			next;
			mes "[�A�f�B��]";
			mes "����Ȃɓ�����Ƃł͂Ȃ���";
			mes "�v���܂��B�ł��A����������e��";
			mes "���m�ɉ����Ă�����ƕ񍐂���";
			mes "���������B";
			next;
			mes "[�A�f�B��]";
			mes "����ł͂��肢���܂��B";
			mes "�����Ăł���΁A�ł�����葁��";
			mes "�����Ă��������B����ł́B";
			set GOD_1QUE_SUB,1;
			close;
		case 1:
			mes "[�A�f�B��]";
			mes "�܂��s���ĂȂ��悤�ł��ˁB";
			mes "���͑��ɂ�邱�Ƃ�����̂ŁA";
			mes "�c�O�Ȃ���s�����Ƃ͂ł��܂���B";
			mes "������A���̑���ɂł��邾��";
			mes "�����񍐂����肢���܂��B";
			mes "����ł́B";
			close;
		case 2:
			mes "[�A�f�B��]";
			mes "�b�͂�����ƕ����Ă��܂����ˁH";
			mes "�c�c�{���A���̗l�Șb�͏����Ȃ�";
			mes "���`���œ`����ׂ��ł����c�c";
			mes "�ł��A�ނ�ɂ͌������œ`��";
			mes "�Ȃ���΂Ȃ�Ȃ����R������";
			mes "�̂ł��傤�B";
			next;
			mes "[�A�f�B��]";
			mes "����ł͘b�𕷂��܂��傤�B";
			mes "���҂��Ă܂���B";
			mes "�c�c�c�c";
			next;
			mes "[�A�f�B��]";
			mes "�c�c";
			next;
			mes "[�A�f�B��]";
			mes "�c�c";
			mes "�c�c�c�c";
			next;
			mes "[�A�f�B��]";
			mes "�c�c";
			mes "�c�c�c�c";
			mes "�c�c�c�c�c�c";
			next;
			mes "[�A�f�B��]";
			mes "�c�c";
			mes "�c�c�c�c";
			mes "�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			next;
			mes "[�A�f�B��]";
			mes "�c�c";
			mes "�c�c�c�c";
			mes "�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c�c�c";
			next;
			mes "[�A�f�B��]";
			mes "�c�c";
			mes "�c�c�c�c";
			mes "�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c�c�c�c�c�c�c";
			next;
			mes "[�A�f�B��]";
			mes "�c�c";
			mes "�c�c�c�c";
			mes "�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c�c�c�c�c";
			next;
			mes "[�A�f�B��]";
			mes "���`��c�c�c�c�H";
			mes "�ӂނӂށc�c";
			mes "��̂킩��܂����B";
			mes "�ł��c�c";
			next;
			mes "[�A�f�B��]";
			mes "���X�A�����Ă��镔��������悤�ł��B";
			mes "�\���󂠂�܂��񂪁A������x�s����";
			mes "�����Ă��Ă��炦�܂��񂩁H";
			mes "���������A���m�ɒm�肽���ł��B";
			set GOD_1QUE_SUB,3;
			close;
		case 3:
			mes "[�A�f�B��]";
			mes "�܂��s���Ă��Ȃ��悤�ł��ˁB";
			mes "�����c��̕����̘b�𕷂�������";
			mes "�v���܂��B���肢���܂��B";
			close;
		case 4:
			mes "[�A�f�B��]";
			mes "����ł͘b�𕷂��܂��傤�B";
			mes "���҂��Ă܂���B";
			mes "�c�c�c�c";
			next;
			mes "[�A�f�B��]";
			mes "�c�c";
			next;
			mes "[�A�f�B��]";
			mes "�c�c";
			mes "�c�c�c�c";
			next;
			mes "[�A�f�B��]";
			mes "�c�c";
			mes "�c�c�c�c";
			mes "�c�c�c�c�c�c";
			next;
			mes "[�A�f�B��]";
			mes "�c�c";
			mes "�c�c�c�c";
			mes "�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			next;
			mes "[�A�f�B��]";
			mes "�c�c";
			mes "�c�c�c�c";
			mes "�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c�c�c";
			next;
			mes "[�A�f�B��]";
			mes "�c�c";
			mes "�c�c�c�c";
			mes "�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c�c�c�c�c�c�c";
			next;
			mes "[�A�f�B��]";
			mes "�c�c";
			mes "�c�c�c�c";
			mes "�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c�c�c�c�c";
			next;
			mes "[�A�f�B��]";
			mes "�ق��ق��c�c�Ȃ�قǁB";
			mes "����Ɖ���܂����B";
			mes "�m���Ă�����ƈꕔ�H���Ⴂ��";
			mes "����܂����c�c�܂��A�����";
			mes "���`��������d���Ȃ��ł��傤�B";
			next;
			mes "[�A�f�B��]";
			mes "�ꉞ�A�^��_���������������܂����B";
			mes "�܂����̕��A�V���ȋ^���";
			mes "�����܂������ˁB�ӂނӂށc�c";
			mes "��͂�e�ՂȂ��Ƃł͂Ȃ������ł��ˁB";
			mes "���c�c���肪�Ƃ��������܂����B";
			set GOD_1QUE_SUB,0;
			if(GOD_1QUE == 21)
				set GOD_1QUE,22;
			if(GOD_1QUE == 32)
				set GOD_1QUE,33;
			if(GOD_1QUE == 43)
				set GOD_1QUE,44;
			if(GOD_1QUE == 14)
				set GOD_1QUE,50;
			close;
		}
	}
	mes "[�A�f�B��]";
	mes "�ӂނӂށc�c";
	mes "�`����_�b�ɂ́A���X�����������";
	mes "�b�������ɑ��݂���ꍇ������܂��B";
	next;
	mes "[�A�f�B��]";
	mes "������������̘b�������錴����";
	mes "���̘b�̋N���𒲂ׂ�ƁA�ĊO";
	mes "�ȒP�Ɍ����������̂ł��B";
	close;
}

payon.gat,79,171,4	script	�C���m	95,{
	if($GodSleipnir < 100) {		// ��t��
		if(GOD_1QUE == 21 || GOD_1QUE == 32 || GOD_1QUE == 43 || GOD_1QUE == 14) {
			switch(GOD_1QUE_SUB) {
			case 1:
			case 3:
				mes "[���J]";
				mes "�̘b��_�b�ɂ́A���̎�����";
				mes "�𗧂��Ƃ�����܂��B";
				mes "�����琢�̒����ς���Ĕ��W���Ă�";
				mes "�l�̉c�ݎ��̂́A���܂�ω�����";
				mes "���܂��񂩂�ˁB";
				next;
				if(select("���[��c�c","�����ł���") == 2) {
					mes "[���J]";
					mes "�܂��A�Y�݂ȂǕǂɂԂ���������";
					mes "��x�����̉ߋ���U��Ԃ��Ă��������B";
					mes "�_�b��`���Ɠ������A�����̉ߋ���";
					mes "���݂̎����ɖ𗧂͂��ł��B";
					mes "�܂��ɗ��j�͌J��Ԃ��c�c�ł�����ˁB";
					close;
				}
				mes "[���J]";
				mes "����H�@�������Y�݂̂悤�ł��ˁB";
				mes "���ł����ɗ��Ă�̂ł�����";
				mes "���ł���`�����܂��傤�B";
				next;
				mes "[���J]";
				mes "��`����\�͂�����̂�";
				mes "���̔\�͂��g��Ȃ��̂́A";
				mes "�\�͂������̂Ɠ������ł�����ˁB";
				next;
				if(select("���ɉ������Ă���̂ŁA���v�ł�","���́c�c") == 1) {
					mes "[���J]";
					mes "���A���̊��Ⴂ�ł������B";
					mes "�ł��������K�v�ł�����A";
					mes "���ł������Ȃ����z���������B";
					mes "�����ɗ��Ă邩�킩��܂��񂪁A";
					mes "�ł������̂���`���͂�������";
					mes "�v���܂��B";
					next;
					mes "[���J]";
					mes "�l�������C���̈�ł����ˁB";
					mes "�����L���S��ۂĂ�悤�肢�܂��c�c";
					close;
				}
				mes "[���J]";
				mes "���[��c�c�H";
				mes "�����ł��ˁc�c";
				mes "��������`���ł��邩������܂���ˁB";
				mes "���X���҂����������c�c";
				mes "�X���C�v�j�[���A�X���C�v�j�[���c�c";
				next;
				mes "[���J]";
				mes "������ƋL����T���Ă݂܂��c�c";
				mes "���[��c�c";
				mes "�c�c�c�c�c�c";
				mes "�c�c�c�c�c�c�c�c";
				next;
				mes "[���J]";
				mes "�����c�c";
				mes "�v���o���܂����c�c";
				mes "�����A�u�X���C�v�j�[���v";
				mes "��_�I�[�f�B���̈��n�ł��ˁB";
				next;
				mes "[���J]";
				mes "�_�X�̐��E�ɂ͎O�C��";
				mes "�L���Ȕn�����܂��B";
				mes "^ff0000�X���C�v�j�[���c�c����悤�ɑ������";
				mes "�X���@�f�B���t�@���c�c�s�^�Ȃ闷�l";
				mes "�O���t�@�N�V�c�c���̂��Ă���^000000";
				next;
				mes "[���J]";
				mes "�u�O���t�@�N�V�v�͋��l��";
				mes "�t�����O�j�[���̔n�ł��B";
				mes "����u�X���@�f�B���t�@���v��";
				mes "���g�D���w�C���̔n�ł��ˁB";
				mes "�����āu�X���C�v�j�[���v��";
				mes "�X���@�f�B���t�@���̎q���ł��B";
				next;
				mes "[���J]";
				mes "�ł́u�X���C�v�j�[���v�̒a����";
				mes "���Ă��b���܂��傤�B";
				mes "����́c�c�_�X�̐��E�̂��b�ł��B";
				next;
				mes "[���J]";
				mes "�_�X����炷�A�X�K���h�ɂ�";
				mes "����ȏ�ǂ�����܂����B";
				mes "���������̏�ǂ́A��̐킢�ɂ��";
				mes "���Ă��܂����B����ǂ��_�X�́A";
				mes "���̋���ȏ�ǂ𒼂��C�ɂ�";
				mes "�Ȃ�܂���ł����B";
				next;
				mes "[���J]";
				mes "����Ȃ�����A�n�ɏ����";
				mes "��l�̒j������܂����B";
				next;
				mes "[���J]";
				mes "���̒j�͕��ꂽ��ǂ̏�������Ă���";
				mes "�w�C���_���ɘb�������܂����B";
				mes "��ǂɊւ��Ęb���������Ƃ����邩��";
				mes "�I�[�f�B���ɉ�����c�c�ƁB";
				next;
				mes "[���J]";
				mes "�����łȂ��Ă���ǂ��C�ɂȂ�������";
				mes "�w�C���_���́A�����ɃI�[�f�B���̏���";
				mes "�ނ�A��Ă����܂����B�c�c���̎�";
				mes "�I�[�f�B���͑��̐_�X�ƈꏏ��";
				mes "���@���n���ɂ��܂����B";
				next;
				mes "[���J]";
				mes "�I�[�f�B����Ɍ����Ă��̏�Ⴂ�Ȓj��";
				mes "�u18�����̊��Ԃ����炦����A";
				mes "�A�X�K���h�̏�ǂ����S�ɒ�����B�v";
				mes "�ƌ����܂����B��ǂ̏C������������";
				mes "������߂Ă����_�X�́A�ƂĂ�";
				mes "�����܂����B";
				next;
				mes "[���J]";
				mes "�I�[�f�B���͂��̒j���^�킵��";
				mes "�v���܂������A�ЂƂ܂�������";
				mes "�����Ă݂܂����B����Ƃ��̒j��";
				mes "�u��V�Ƃ��ď��_�t���C���Ƒ��z��";
				mes "����~�����B�v�ƌ����܂����B";
				next;
				mes "[���J]";
				mes "�c�c�c�c";
				mes "�ދ��ł��傤���H";
				mes "�����͎��̋@��ɂ��܂��H";
				next;
				if(select("�͂��A�ł͂܂�","�������A�����Ă�������") == 1) {
					mes "[���J]";
					mes "������܂����B";
					mes "���܂肨�C�ɏ����Ȃ������悤�ł��ˁB";
					mes "���͂����Ɩʔ��������Ă�������悤";
					mes "�w�͂��܂��B�ł́A�܂��c�c";
					close;
				}
				mes "[���J]";
				mes "������܂����B";
				mes "�ł́A�b�𑱂��܂��傤�B";
				next;
				mes "[���J]";
				mes "�_�X�͓��R�{��܂����B";
				mes "���z�ƌ��͂������ł����A������";
				mes "�_�X�̕�ƌ����鏗�_�t���C����";
				mes "�v�����Ă����̂ł�����ˁB";
				next;
				mes "[���J]";
				mes "�_�X�͓{��̂��܂�A�J��������";
				mes "�ӂ�����Ȃ���Ԃł����B������";
				mes "�I�[�f�B���ɋ߂Â��҂����܂����B";
				mes "����̓��L�ł����B";
				next;
				mes "[���J]";
				mes "���L�̓I�[�f�B����";
				mes "�u���̒j�𗘗p����Ώ�ǂ𒼂���B";
				mes "�����t���C����n�����Ƃɂ�";
				mes "�Ȃ�Ȃ��B�v�ƌ����܂����B";
				mes "���L�̘b�𕷂����I�[�f�B����";
				mes "�����ƍl�����݂܂����B";
				next;
				mes "[���J]";
				mes "���ǃ��L�̍l�������v����";
				mes "�v�����̂��A�I�[�f�B���͂��̒j��";
				mes "�u18�����ł͂Ȃ��A6�����ȓ���";
				mes "��ǂ��C�����邱�Ƃ��ł�����";
				mes "�����𕷂������B�v�ƌ����܂����B";
				next;
				mes "[���J]";
				mes "�c�c�c�c";
				mes "�ދ��ł��傤���H";
				mes "�����͎��̋@��ɂ��܂��H";
				next;
				switch(select("�����̊ԁA�b�𐮗��������ł�","�͂��A�ł͂܂�","�������A�����Ă�������")) {
				case 1:
					mes "[���J]";
					mes "���c�c";
					mes "�b���������������ł��ˁB";
					mes "������܂����B";
					mes "���������Ԃ������グ�܂��B";
					next;
					mes "�c�c�c�c�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c";
					mes "�c�c�c�c";
					mes "�c�c";
					next;
					mes "�c�c�c�c�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c";
					mes "�c�c�c�c";
					mes "�c�c";
					next;
					mes "�c�c�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c";
					mes "�c�c�c�c";
					mes "�c�c";
					next;
					mes "�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c";
					mes "�c�c�c�c";
					mes "�c�c";
					next;
					mes "�c�c�c�c";
					mes "�c�c";
					next;
					mes "�c�c";
					next;
					mes "[���J]";
					mes "�c�c�b�𑱂��Ă���낵���ł��傤���H";
					next;
					menu "���v�ł��A���肢���܂�",-;
					mes "[���J]";
					mes "����ł͘b�𑱂��܂��傤�B";
					break;
				case 2:
					mes "[���J]";
					mes "������܂����B";
					mes "���܂肨�C�ɏ����Ȃ������悤�ł��ˁB";
					mes "���͂����Ɩʔ��������Ă�������悤";
					mes "�w�͂��܂��B�ł́A�܂��c�c";
					close;
				case 3:
					mes "[���J]";
					mes "������܂����B";
					mes "�ł́A�b�𑱂��܂��傤�B";
					break;
				}
				next;
				mes "[���J]";
				mes "����Ƃ��̒j��";
				mes "�u�����̔n����ƂɎg�킹�Ă���B�v";
				mes "�ƌ����܂����B�_�X�́A���̈ʂȂ�";
				mes "�Ë����悤�A�Ƃ������Ƃł��̏�����";
				mes "�󂯓���܂����B";
				next;
				mes "[���J]";
				mes "�Ƃ��낪���̒j�́A�����܂���������";
				mes "��ǂ𒼂��n�߂܂����B���̒j��";
				mes "�l�ԗ��ꂵ���\�͂ɉ����A���̔n��";
				mes "�����Ԃ肪���ɂ����������̂ł��B";
				mes "�c�c��������̂͂��A���̔n��";
				mes "���̃X���@�f�B���t�@���ł�������ˁB";
				next;
				mes "[���J]";
				mes "���Ԃ��o�ɂ�āA�_�X�͕s����";
				mes "�Ȃ��Ă��܂����B6�������o�߂���O��";
				mes "��ǂ���������������������ł��B";
				mes "�_�X�̓��L�ɋl�߂��܂����B";
				next;
				mes "[���J]";
				mes "���������L�͂���Ȑ_�X�ɑ΂�";
				mes "�u�S�z����ȁB�����ɍ􂪂���B�v";
				mes "�ƌ����Ԃ��Ă��܂����B�_�X�́A";
				mes "���L�𗊂肽���͂Ȃ���";
				mes "�����l��������悤�Ȃ̂ŁA";
				mes "���L�̌��t��M���邱�Ƃɂ��܂����B";
				next;
				mes "[���J]";
				mes "���̌�A�����N�������̂��}��";
				mes "��ǂ̕�����Ƃ��i�܂Ȃ��Ȃ�܂����B";
				next;
				mes "[���J]";
				mes "�c�c�c�c";
				mes "�ދ��ł��傤���H";
				mes "�����͎��̋@��ɂ��܂��H";
				next;
				if(select("�͂��A�ł͂܂�","�������A�����Ă�������") == 1) {
					mes "[���J]";
					mes "������܂����B";
					mes "���܂肨�C�ɏ����Ȃ������悤�ł��ˁB";
					mes "���͂����Ɩʔ��������Ă�������悤";
					mes "�w�͂��܂��B�ł́A�܂��c�c";
					close;
				}
				mes "[���J]";
				mes "������܂����B";
				mes "�ł́A�b�𑱂��܂��傤�B";
				next;
				mes "[���J]";
				mes "�����́A�X���@�f�B���t�@����";
				mes "������𗣂�A�S���d�������Ȃ��Ȃ���";
				mes "����ł����B����6�������o�߂������A";
				mes "�傾���C����Ƃ��I����Ă��܂���";
				mes "�ł����B";
				next;
				mes "[���J]";
				mes "�_�X�͂��̒j��";
				mes "�u���ԓ��ɏ�ǂ����������邱�Ƃ�";
				mes "�ł��Ȃ���������A�����𕷂��K�v��";
				mes "�Ȃ��B�v�ƌ����n���܂����B";
				next;
				mes "[���J]";
				mes "����Ƃ��̒j��";
				mes "�u���_�t���C���Ƒ��z�ƌ���";
				mes "�����ɓn�������Ȃ�������āA�_�X��";
				mes "�C����Ƃ�W�Q��������Ȃ����B�v";
				mes "�Ɠ{��A���̐��̂������܂����B";
				next;
				mes "[���J]";
				mes "�Ȃ�Ɣނ́u���̋��l�v�ƌĂ΂��";
				mes "���g�D���w�C���̋��l�������̂ł��B";
				mes "���̋��l�͓{�苶���A�_�X��";
				mes "�P�������낤�Ƃ��܂����B";
				next;
				mes "[���J]";
				mes "�c�c�c�c";
				mes "�ދ��ł��傤���H";
				mes "�����͎��̋@��ɂ��܂��H";
				next;
				if(select("�͂��A�ł͂܂�","�������A�����Ă�������") == 1) {
					mes "[���J]";
					mes "������܂����B";
					mes "���܂肨�C�ɏ����Ȃ������悤�ł��ˁB";
					mes "���͂����Ɩʔ��������Ă�������悤";
					mes "�w�͂��܂��B�ł́A�܂��c�c";
					close;
				}
				mes "[���J]";
				mes "������܂����B";
				mes "�ł́A�b�𑱂��܂��傤�B";
				next;
				mes "[���J]";
				mes "�܂��Ƀ��g�D�����[�Y�c�c���l��";
				mes "�{��ł��ˁB�������_�X�́A����";
				mes "���l�̓{������܂苰��܂���ł����B";
				mes "���̂Ȃ�A���l��l�ƌĂ΂��";
				mes "�u�g�[���v����������ł��B";
				next;
				mes "[���J]";
				mes "�g�[���͖\��Ă��鋐�l�̓���";
				mes "�u�~�����j�[���v��";
				mes "�ӂ��A�|���Ă��܂��܂����B";
				next;
				mes "[���J]";
				mes "�c�c�c�c";
				mes "�ދ��ł��傤���H";
				mes "�����͎��̋@��ɂ��܂��H";
				next;
				switch(select("�����̊ԁA�b�𐮗��������ł�","�͂��A�ł͂܂�","�������A�����Ă�������")) {
				case 1:
					mes "[���J]";
					mes "���c�c";
					mes "�b���������������ł��ˁB";
					mes "������܂����B";
					mes "���������Ԃ������グ�܂��B";
					next;
					mes "�c�c�c�c�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c";
					mes "�c�c�c�c";
					mes "�c�c";
					next;
					mes "�c�c�c�c�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c";
					mes "�c�c�c�c";
					mes "�c�c";
					next;
					mes "�c�c�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c";
					mes "�c�c�c�c";
					mes "�c�c";
					next;
					mes "�c�c�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c";
					mes "�c�c�c�c";
					mes "�c�c";
					next;
					mes "�c�c�c�c";
					mes "�c�c";
					next;
					mes "�c�c";
					next;
					mes "[���J]";
					mes "���낻��b�𑱂��Ă�";
					mes "��낵���ł��傤���H";
					next;
					if(select("�܂��̋@��Ɂc�c","���v�ł��A���肢���܂�") == 1) {
						mes "[���J]";
						mes "�b��������������悤�ł��ˁB";
						mes "�����͎��̋@��ɂ��܂��傤�B";
						mes "�ł́A�܂��c�c";
						close;
					}
					mes "[���J]";
					mes "����ł͘b�𑱂��܂��傤�B";
					break;
				case 2:
					mes "[���J]";
					mes "������܂����B";
					mes "���܂肨�C�ɏ����Ȃ������悤�ł��ˁB";
					mes "���͂����Ɩʔ��������Ă�������悤";
					mes "�w�͂��܂��B�ł́A�܂��c�c";
					close;
				case 3:
					mes "[���J]";
					mes "������܂����B";
					mes "�ł́A�b�𑱂��܂��傤�B";
					break;
				}
				next;
				mes "[���J]";
				mes "������A�ƂĂ���ꂽ�����p��";
				mes "���L���A����8�{���s�v�c�Ȏe�n��";
				mes "�A��Ă��܂����B���L�͂��̎e�n";
				mes "�u�X���C�v�j�[���v���I�[�f�B����";
				mes "�Љ�A�����o���܂����B";
				next;
				mes "[���J]";
				mes "�I�[�f�B���͂��肪�����󂯂Ƃ�A";
				mes "���L���󂯓���܂����B�ł��A����";
				mes "�_�X�͑����C�܂��������̂ł��B";
				mes "����͉��̂��ƌ����܂��Ɓc�c";
				next;
				mes "[���J]";
				mes "���L���n�Ɏp��ς�";
				mes "�X���@�f�B���t�@����U�f��������";
				mes "���܂ꂽ�q���A���ꂪ����";
				mes "�X���C�v�j�[������������ł��B";
				mes "�ȏオ�X���C�v�j�[���̒a����";
				mes "�܂�邨�b�ł��B";
				next;
				mes "[���J]";
				mes "����́A�C���m�̊ԂŌÂ����������";
				mes "�`�����Ă����b�ł��B���̂���";
				mes "���̘b�Ƃ͕����I�ɑ����̂��ꂪ";
				mes "�����Ă��邩������܂���B";
				mes "����ǂ��A�S�̓I�ȗ���Ȃǂ�";
				mes "���܂�ς���Ă��Ȃ��Ǝv���܂��B";
				next;
				mes "[���J]";
				mes "���͂܂��A�C�s���̐g�Ȃ̂�";
				mes "���܂��`����ꂽ������܂���B";
				mes "�ł��A���̍őP��s��������";
				mes "���������܂����B�����𒸂�����";
				mes "�������v���܂��B";
				next;
				mes "[���J]";
				mes "�����܂����������Ȃ�܂�����";
				mes "���ł����K�˂��������B";
				mes "���ł��������܂��B";
				mes "����ł́c�c";
				if(GOD_1QUE_SUB == 1)
					set GOD_1QUE_SUB,2;
				else if(GOD_1QUE_SUB == 3)
					set GOD_1QUE_SUB,4;
				close;
			default:
				mes "[���J]";
				mes "�厖�Șb�͑S�Ă��܂����B";
				mes "�債�����̂ł͂Ȃ���������";
				mes "����܂��񂪁A�����ł�";
				mes "�����ɗ��ĂĂ�����K���ł��B";
				close;
			}
		}
	}
	mes "[���J]";
	mes "�C���Ƃ́A�K���������_�Ɠ��̂�";
	mes "��ɕ��ނ����Ƃ͌���܂���B";
	next;
	mes "[���J]";
	mes "�ЂƂɉ���Ƃ��܂ߐl�Ƃ��Đ�����";
	mes "�s�����Ǝ��́A���̂��ׂĂ��C����";
	mes "�Ȃ�܂��B������񂻂̐��ʂ�";
	mes "�l�ɂ���ĈقȂ�ł��傤�B";
	close;
}

//============================================================
// �_��2�� ���M���M�����h�̕���N�G�X�g
//- Registry -------------------------------------------------
// GOD_2QUE -> 0�`28
// GOD_2QUE_SUB1 �` GOD_2QUE_SUB6 -> �e�����i�s
//------------------------------------------------------------
prt_castle.gat,44,151,0	script	���x�C���u	56,{
	if(checkitemblank() == 0) {
		mes "- �����A�C�e���̎�ސ��� -";
		mes "- �������߁A�A�C�e�����󂯂Ƃ� -";
		mes "- ���Ƃ��ł��܂���B -";
		mes "- �����A�C�e�������炵�Ă��� -";
		mes "- �ēx�b�������Ă��������B -";
		close;
	}
	if(MaxWeight - Weight < 5000) {
		mes "- �����d�ʂ��������߁A�A�C�e���� -";
		mes "- �󂯂Ƃ邱�Ƃ��ł��܂���B -";
		mes "- �����A�C�e�������炵�Ă��� -";
		mes "- �ēx�b�������Ă��������B -";
		close;
	}
	cutin "god_rebeireb",2;
	if(countitem(7080) > 3 && countitem(7081) > 4 && countitem(7082) > 3 && countitem(7084) > 2 && countitem(7085) > 2) {
		mes "[���x�C���u]";
		mes "�����I�@����́I";
		mes "�N!!�@�O���C�v�j�[�����쐬����";
		mes "�ޗ��������Ă���ł͂Ȃ����I";
		mes "�O���C�v�j�[������邩�H";
		next;
		if(select("��肽��","������") == 2) {
			close;
		}
		mes "[���x�C���u]";
		mes "�_�����邱�Ƃ��ł���̂�";
		mes "�h���[�t�������āA";
		mes "�_�Ɛ_�̋߂��ɂ���";
		mes "�䓙���炢���낤�B";
		next;
		delitem 7080,4;
		delitem 7081,5;
		delitem 7082,4;
		delitem 7084,3;
		delitem 7085,3;
		getitem 7058,1;
		mes "[���x�C���u]";
		mes "�����A�󂯎�邪�ǂ��B";
		next;
		mes "[���x�C���u]";
		mes "���̐��ɂ͑��݂��Ȃ���";
		mes "�����Ă���c�c";
		mes "���̗L���ȘT�u�t�F�������v";
		mes "�ɂ���؂邱�Ƃ�";
		mes "�ł��Ȃ������Ƃ����`����";
		mes "�O���C�v�j�[���������Ƃ́c�c";
		close2;
		cutin "god_rebeireb",255;
		end;
	}
	if($GodSleipnir < 50) {
		mes "[���x�C���u]";
		mes "�䓙�̓N���Z�C�_�[���B";
		mes "�I�[�f�B���̈ӎu�ɏ]��";
		mes "����ɔ�����҂ł���B";
		mes "��N�O�ɂ����������悤�Ɂc�c";
		mes "����x�����𓢔����邻�̓���";
		mes "�K���ł��낤�c�c";
		next;
		mes "[���x�C���u]";
		mes "�N�A����ɔ�����䓙�ɂ���";
		mes "�����������Ƃ�����΁A";
		mes "���ɕ����Ă݂��܂��B";
		next;
		mes "[���x�C���u]";
		mes "���̃��x�C���u�͔N�����";
		mes "�\�͂͐��������A��������";
		mes "�܂��Ƃ�����Ԃɍs���Ă䂭";
		mes "���Ƃɂ��ċ����悤�B";
		next;
		switch(select("�z�[���[�N���X�Ƃ́H","�O�����h�N���X�Ƃ́H","�f�B�{�[�V�����Ƃ́H","�O���C�v�j�[���Ƃ́H")) {
		case 1:
			mes "[���x�C���u]";
			mes "�z�[���[�N���X�Ƃ́A";
			mes "����̐_�ɑ΂���M�S��";
			mes "����������̂ł���A";
			mes "���ꂪ���Ȃ鑮��������";
			mes "�U���ƂȂ��Ă���̂��B";
			next;
			mes "[���x�C���u]";
			mes "���Ȃ镨�����Ƃ���ғ���A";
			mes "�_�ɔw�����݂ł���c�c�s����";
			mes "�̂悤�Ȏ҂����̍U�����󂯂��";
			mes "�����Ɏ��E�������_�ɂ��ق���";
			mes "�҂݂̂ƂȂ�B";
			next;
			mes "[���x�C���u]";
			mes "��l�̃N���Z�C�_�[�B��";
			mes "�񍐂ɂ��΁A�ʏ�U����";
			mes "�T��4.5�{���̌��ʂ������";
			mes "�����Ă���B";
			close2;
			cutin "god_rebeireb",255;
			end;
		case 2:
			mes "[���x�C���u]";
			mes "�O�����h�N���X���I";
			mes "����͐_�̓{��I";
			mes "�����Đ_�̐R���I";
			mes "�_�ɔw���҂��ق����̂�";
			mes "���R�̂��Ƃł���B";
			next;
			mes "[���x�C���u]";
			mes "�䓙�͐_�̈ӎu�����̐g��";
			mes "�ڂ��A�ق��͂������Ă���B";
			mes "�_�ɔw���҂��₻���ƐS��";
			mes "�O����΁A���͂Ȃ����͂�";
			mes "��������邱�Ƃ��ł���̂��B";
			next;
			mes "[���x�C���u]";
			mes "�N���Z�C�_�[�̐g�𒆐S�Ɍ��ꂽ";
			mes "����ȏ\���̌��́A�G�ꂽ������";
			mes "�҂ɐ_���������炷�B";
			next;
			mes "[���x�C���u]";
			mes "���������ӂ��Ȃ���΂Ȃ�Ȃ�";
			mes "���Ƃ�����B";
			mes "���̗͖͂{�����ɋ��͂�";
			mes "���̂ł���A�䓙�̎カ�g�ł�";
			mes "���䂵����Ȃ����ł���B";
			next;
			mes "[���x�C���u]";
			mes "����̂ɁA�O�����h�N���X��";
			mes "�����������҂̓��̂ɂ�";
			mes "�_���[�W����B";
			mes "����ł��A�䓙�̐_�ɑ΂���";
			mes "�M�ɂ��Ɍ��܂ŗ}����";
			mes "���Ƃ��ł���̂��c�c";
			next;
			mes "[���x�C���u]";
			mes "����ɂ��Ă��c�c�_�̌�͂�O�ɂ���";
			mes "�䓙�̓��̂͂Ȃ�Ǝカ���Ƃ��c�c";
			close2;
			cutin "god_rebeireb",255;
			end;
		case 3:
			mes "[���x�C���u]";
			mes "�䂪�g�������A�M���т��A";
			mes "�����ꗈ���鐹��֔����邱�Ɓc�c";
			mes "�����͉䓙�N���Z�C�_�[��";
			mes "�Ƃ��Ďg���ł���B";
			next;
			mes "[���x�C���u]";
			mes "���q�ׂ��䂪�g��������Ƃ������Ƃ́A";
			mes "�l�X�̂��߂ɕ�d����Ƃ���";
			mes "���Ƃł���A�_�̈ӎu�ɍł��߂�";
			mes "�s���ł���ƌ����悤�B";
			next;
			mes "[���x�C���u]";
			mes "�N���Z�C�_�[�ɂ́A�䂪�g��";
			mes "��������肽���Ǝv���҂ɕ����A";
			mes "���̎҂��󂯂��ɂ��Ȃ�";
			mes "���̂Ɉڂ��\�͂�����B";
			next;
			mes "[���x�C���u]";
			mes "���ꂱ�����܂��Ƀf�B�{�[�V����";
			mes "�Ȃ̂ł���B";
			mes "�����Đ_�̈ӎu�ɉ�����҂�";
			mes "���ׂ��p�I";
			next;
			mes "[���x�C���u]";
			mes "�������A���ꂽ�ʒu�ɂ���҂�";
			mes "��邱�Ƃ͂ł��Ȃ��B";
			mes "�Ȃ��Ȃ�A��肽���҂̍��̎p��";
			mes "�S�ɕ����ׁA���Ƃ����ӎu��";
			mes "���������Ȃ���΂Ȃ�Ȃ����炾�B";
			next;
			mes "[���x�C���u]";
			mes "�Ȃ���낤�Ƃ���҂�";
			mes "���Â����A���̂ʂ�����A";
			mes "���̎҂��󂯂��ɂ���";
			mes "�����Ƃ�䂪�g�ɏd�˂�B";
			mes "���ꂪ�f�B�{�[�V�����ł���B";
			next;
			mes "[���x�C���u]";
			mes "�Ȃ������A�܂��Ȃ�������S�Ă�";
			mes "�҂���邱�Ƃ��ł���͂���������";
			mes "���ƂɊ��ӂ��Ȃ���΂Ȃ�Ȃ��B";
			close2;
			cutin "god_rebeireb",255;
			end;
		case 4:
			mes "[���x�C���u]";
			mes "�u�O���C�v�j�[���v�Ƃ́A";
			mes "�����������Ă���";
			mes "�u���M���M�����h�v����邽�߂�";
			mes "�K�v�ȍޗ��ł���c�c";
			next;
			mes "[���x�C���u]";
			mes "�_��ł��郁�M���M�����h��";
			mes "���Ɋ������߂ɕK�v�ȕ��i�Ȃ̂��B";
			next;
			mes "[���x�C���u]";
			mes "�������N���c�c";
			next;
			mes "[���x�C���u]";
			mes "^0000FF�L�̑��� 4�� ";
			mes "���l�̂Ђ� 5�A";
			mes "�΂̍� 4�A";
			mes "���̑� 3�A";
			mes "�F�̋� 3��^000000";
			next;
			mes "[���x�C���u]";
			mes "�����邱�Ƃ��ł����Ȃ�΁A";
			mes "�����ɍ�邱�Ƃ��ł���ł��낤�c�c";
			close2;
			cutin "god_rebeireb",255;
			end;
		}
	}
	else if($GodSleipnir >= 50 && $GodMagingiorde < 100) {		//��t��
		if(BaseLevel < 60) {
			mes "[���x�C���u]";
			mes "�N�͂܂����Ƙb���鐅����";
			mes "�������Ă͂��Ȃ��ȁB";
			mes "������`�������Ă���҂��Ƃ�";
			mes "�����Ă��A������x�̒m����";
			mes "�o�����Ȃ���΋��ʂ̘b��";
			mes "�Ȃǐ����ʂł��낤�H";
			close2;
			cutin "god_rebeireb",255;
			end;
		}
		switch(GOD_2QUE) {
		case 0:
			mes "[���x�C���u]";
			mes "�c�c";
			next;
			mes "[���x�C���u]";
			mes "����ɂ��Ă�����b�����Ƃ�";
			mes "�����ł��ʎғ���";
			mes "���̐��Ȃ�n�ɉ��p�ŎQ�����H";
			next;
			mes "[���x�C���u]";
			mes "���m�Ȏғ��́A���킪����";
			mes "�K��Ă����������Ȃ��̂���";
			mes "�������Ƃ𗝉����Ă��Ȃ��B";
			next;
			mes "[���x�C���u]";
			mes "��͂��ʐl�ɂ��ǂ��ǂ�";
			mes "�b�����̂̂悤�ɐM�S";
			mes "����҂ɋ���������ق���";
			mes "�ǂ��ȁc�c";
			next;
			mes "[���x�C���u]";
			mes "�F�����ǂ����Ă��邾�낤�c�c";
			next;
			mes "[���x�C���u]";
			mes "�c�c";
			next;
			mes "[���x�C���u]";
			mes "�N�A�`���҂�A������";
			mes "���̂��팾�𕷂��Ȃ���";
			mes "�ӂ�ӂ炵�Ă���Ƃ������Ƃ�";
			mes "���̗��݂𕷂��Ă���鎞�Ԃ�";
			mes "����Ƃ������Ƃ��H";
			next;
			mes "[���x�C���u]";
			//mes "���̗��݂𕷂����x�ɐM�S��";
			mes "���̗��݂𕷂��x�ɐM�S��";
			mes "���܂�A�N���Z�C�_�[�ɑ΂���";
			mes "���������܂�邩�������c�c";
			mes "���āA�ǂ����H";
			next;
			if(select("�ǂ�ȗ��݂ł����H","�������񂴂�ł��c�c") == 2) {
				mes "[���x�C���u]";
				mes "�₵�����Ƃ������c�c";
				next;
				mes "[���x�C���u]";
				mes "�N�͖`���ҁc�c�����Ď��R�̐g�B";
				next;
				mes "[���x�C���u]";
				mes "�N�͍s���������ɂ��̓�{�̑���";
				mes "�����Ă������Ƃ��ł��邪�c�c";
				mes "���͂����ɋ��邱�Ƃ���߂��Ă���B";
				mes "�{���ɍs�����Ƃ����Ȃ��";
				mes "�g�Ȃ̂��c�c";
				next;
				mes "[���x�C���u]";
				mes "�{���Ɍ��Ȃ̂ł���Ύd���Ȃ����A";
				mes "�����łȂ��̂Ȃ炠�܂蔖��Ȃ��Ƃ�";
				mes "�������̂ł͂Ȃ����B";
				close2;
				cutin "god_rebeireb",255;
				end;
			}
			mes "[���x�C���u]";
			mes "���ł��Ȃ��A�e�n�ɕ����Ă���";
			mes "�N���Z�C�_�[�̑�3�����A";
			mes "��1�����A��3������������";
			mes "���ė~�����B";
			mes "���肵�ď����ƈ��ۂ�";
			mes "���ׂĂ��炤�����ł����c�c";
			next;
			mes "[���x�C���u]";
			mes "�ǂ����H";
			next;
			if(select("�킩��܂����A���܂��傤","�ƂĂ��ł��܂���c�c") == 2) {
				mes "[���x�C���u]";
				mes "�₵�����Ƃ������c�c";
				next;
				mes "[���x�C���u]";
				mes "�N�͖`���ҁc�c�����Ď��R�̐g�B";
				next;
				mes "[���x�C���u]";
				mes "�N�͍s���������ɂ��̓�{�̑���";
				mes "�����Ă������Ƃ��ł��邪�c�c";
				mes "���͂����ɋ��邱�Ƃ���߂��Ă���B";
				mes "�{���ɍs�����Ƃ����Ȃ��";
				mes "�g�Ȃ̂��c�c";
				next;
				mes "[���x�C���u]";
				mes "�{���Ɍ��Ȃ̂ł���Ύd���Ȃ����A";
				mes "�����łȂ��̂Ȃ炠�܂蔖��Ȃ��Ƃ�";
				mes "�������̂ł͂Ȃ����B";
				close2;
				cutin "god_rebeireb",255;
				end;
			}
			mes "[���x�C���u]";
			mes "�����A�悵�I";
			mes "���������߂�Ηǂ�����";
			mes "����ȏ�͍l���Ȃ��Ă����c�c";
			next;
			mes "[���x�C���u]";
			mes "�����c�c���Ȃ̂́c�c";
			mes "�F���ǂ��ɍs�����̂���";
			mes "�S�R�킩���Ă��Ȃ��̂�";
			mes "���Ȃ̂��c�c";
			next;
			mes "[���x�C���u]";
			mes "�}���ق̂ǂ����ɂ��鏑�ނ�";
			mes "�������āA�]���Ɠ]�o�̎���";
			mes "������΂킩��̂��낤���c�c";
			mes "���̎����̓N���Z�C�_�[���ł�";
			mes "�{����������̂�����";
			mes "�肪����ɂ͂Ȃ�񂾂낤�ȁc�c";
			next;
			mes "[���x�C���u]";
			mes "����ł́A���񂾂��B";
			next;
			mes "[���x�C���u]";
			mes "���A���ӔC�ɂ悭����ȗ��ݎ���";
			mes "����������ȂƎv��Ȃ��������H";
			mes "����Ƃ��c�c�܂����܂ꂲ�Ƃ���";
			mes "���S���񂴂肵�Ă��Ȃ��������H";
			next;
			mes "[���x�C���u]";
			mes "���������o���đ��̏ꏊ��";
			mes "�s�������̂͂�܂�܂Ȃ̂��c�c";
			mes "�����ł悭�q�ˎ��΂��肳���̂�";
			mes "�h�����̂��c�c";
			next;
			mes "[���x�C���u]";
			mes "���������悤�Ȃ��Ƃ�����";
			mes "�����_���ς��Ȃ�Ƃ͂��̂��Ƃ��B";
			mes "�������A�����󂯂��C���ł��邩��";
			mes "���낻���ɂ��ł��Ȃ��B";
			next;
			mes "[���x�C���u]";
			mes "�N�͍s���������ɂ��̓�{�̑���";
			mes "�����Ă������Ƃ��ł��邪�c�c";
			mes "���͂����ɋ��邱�Ƃ���߂��Ă���B";
			mes "�{���ɍs�����Ƃ����Ȃ��";
			mes "�g�Ȃ̂��c�c";
			next;
			mes "[���x�C���u]";
			mes "�����A���������đ��������̏�����";
			mes "�������Ă���B";
			mes "�C�ɂȂ��Ă��������Ȃ��̂��c�c";
			set GOD_2QUE,1;
			close2;
			cutin "god_rebeireb",255;
			end;
		case 1:
		case 2:
		case 3:
			mes "[���x�C���u]";
			mes "�����䓙�̕������͂ǂ�����";
			mes "���邾�낤���c�c";
			mes "��������Ȃ��Ȃ��Ă������";
			mes "�ǂꂾ���o���낤���c�c";
			next;
			mes "[���x�C���u]";
			mes "����H�@�����ŉ������Ă���H";
			next;
			if(rand(1,10) > 6 && GOD_2QUE == 2) {
				set '@str$,"�Ȃ�����Ȃ��ƂɁH";
			}
			switch(select("���́c�c�ǂ��֍s���΁c�c�H","�����Ƃ��Ƃ��Ă����Ƃ���ł�",'@str$)) {
			case 1:
				mes "[���x�C���u]";
				mes "�������ȁc�c";
				mes "�ǂ�����T���Ηǂ���";
				mes "���������񂾂낤�ȁc�c";
				mes "��ԋ߂Â��\���̂��鏊�Ƃ�����";
				mes "��͂��ɘb�����悤��";
				next;
				mes "[���x�C���u]";
				mes "�}���قɂ��鏑�ނ̒���";
				mes "^0000FF��3�����]��/�]�o����^000000";
				mes "����̂���ԑ������낤�ȁB";
				close2;
				cutin "god_rebeireb",255;
				end;
			case 2:
				mes "[���x�C���u]";
				mes "���A�������B";
				mes "��낵�����̂ށB";
				mes "^0000FF�Ō�̔C��^000000�Ȍ�A���U����";
				mes "����F���ǂ��֍s�����̂�";
				mes "�S��������ʁB���񗊂񂾂��I";
				set GOD_2QUE,2;
				close2;
				cutin "god_rebeireb",255;
				end;
			case 3:
				mes "[���x�C���u]";
				mes "����́c�c�䓙�N���Z�C�_�[��";
				mes "��1������3���������U���ꂽ���R�c�c";
				mes "��͂肠�̎��̂��Ƃ��v���o��";
				mes "�˂΂Ȃ�ʂ̂��c�c";
				next;
				mes "[���x�C���u]";
				mes "�܂��c�c";
				mes "�䓙�̓N���Z�C�_�[�ƌ����Ă�";
				mes "��{�I�ɂ͌R�l�B";
				mes "�㊯�̖��ɂ͐�Ώ]��Ȃ����";
				mes "�Ȃ�Ȃ�����Ȃ̂��B";
				next;
				mes "[���x�C���u]";
				mes "�c�c";
				mes "���̎��A���̎���{����";
				mes "�������Ă������ǂ����c�c";
				next;
				mes "[���x�C���u]";
				mes "�c�c";
				next;
				mes "";
				mes "- ���΂炭���āA";
				mes "�ނ͓{�C���܂񂾐���";
				mes "���ɘb�����B -";
				next;
				mes "[���x�C���u]";
				mes "�������̘b�͂�߂ɂ��悤�B";
				mes "�䓙�����U�������R��m�����Ƃ����";
				mes "���Ƃ��Ȃ��B";
				next;
				mes "[���x�C���u]";
				mes "�����A�}���قɍs����";
				mes "^0000FF��3�����]��/�]�o����^000000��{���o��";
				mes "�������̍s��������ł���I";
				set GOD_2QUE,3;
				close2;
				cutin "god_rebeireb",255;
				end;
			}
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			mes "[���x�C���u]";
			mes "����H";
			mes "���ފǗ��l�ɉ������";
			mes "�������{�������Ă���Ȃ��ƁH";
			mes "�ӂށc�c����ł��Ȃ�";
			mes "�M�S�ɗ��ݐ��ӂ��������";
			mes "�����Ă����̂ł͂Ȃ����H";
			next;
			mes "[���x�C���u]";
			mes "���������ł͂��邪";
			mes "�l�̏Z�ސ��E���B";
			next;
			mes "[���x�C���u]";
			mes "�Ƃɂ����䂪��������";
			mes "�ǂ����Ă��邩�����ł�";
			mes "�m�肽���̂��c�c";
			close2;
			cutin "god_rebeireb",255;
			end;
		case 18:
		case 19:
			if((GOD_2QUE_SUB1 > 0) || (GOD_2QUE_SUB2 > 0) || (GOD_2QUE_SUB3 > 0) || (GOD_2QUE_SUB4 > 0) || (GOD_2QUE_SUB5 > 0) || (GOD_2QUE_SUB6 > 0)) {
				mes "[���x�C���u]";
				mes "�����I";
				mes "����Ă����̂��H";
				mes "���C�����ł��������H";
				next;
				mes "- ���ɂ��Ђǂ��Ƃ������ƁA";
				mes "�L���r���ɂ������Ă���";
				mes "���Ƃ��������Ό��C������";
				mes "�Ɠ`�����B -";
				close2;
				cutin "god_rebeireb",255;
				end;
			}
			mes "- ���Ȃ��͏��ނ𒲂ׂ�";
			mes "���ʂ�b�����B -";
			next;
			mes "- �F���ǂ��ŉ������Ă��邩";
			mes "�ɂ��āB -";
			next;
			mes "[���x�C���u]";
			mes "�ق��I�@���ނɋL�^���������̂��I";
			mes "�����c�c���ނ��Â����̂ł�������";
			mes "���ǂ����Ă��邩�͂킩���ȁc�c";
			next;
			mes "[���x�C���u]";
			mes "��͂�N�������������ɉ����";
			mes "����������ł���邱�Ƃ���Ԃ��B";
			mes "�N��^0000FF�ڂŒ���^000000���Ă��B";
			next;
			mes "[���x�C���u]";
			mes "���񗊂񂾂��c�c";
			next;
			mes "[���x�C���u]";
			mes "�Â����ނ̏��ł�";
			mes "���܂����M���邱�Ƃ��ł��ʁc�c";
			mes "�N�����o���Ă���΂���قǂȁc�c";
			close2;
			cutin "god_rebeireb",255;
			end;
		case 20:
		case 21:
		case 22:
			mes "[���x�C���u]";
			mes "�����A�߂��ė��Ă��ꂽ���c�c";
			mes "�F�ɉ���̂��ȁH�@�ӂށc�c";
			mes "����H�@����������������";
			mes "������Ă���ȁc�c";
			next;
			switch(select("����܂łɊ������^�O�ɂ��Ęb��","�܂����̎��ł͂Ȃ�")) {
			case 1:
				mes "- ���Ȃ��͂���܂ł̂���";
				mes "�ɂ��Đ������Ęb������";
				mes "�v������ -";
				next;
				mes "- �������ɒN��l�Ƃ���";
				mes "�܂Ƃ��ȏ�Ԃ̎҂�";
				mes "���Ȃ��������Ɓ\ -";
				next;
				mes "- ���ʂ��ċL���r����";
				mes "�������Ă������Ɓ\ -";
				next;
				mes "- ���C�����~�X�g�̔����\ -";
				next;
				mes "- �����ĊF�̌�����o��";
				mes "�C�O�j�[���Ƃ͒N�Ȃ̂��\ -";
				next;
				mes "- �����S�Ă����̒���";
				mes "�����܂��A����������Ȃ��܂�";
				mes "�����������̂��Ƃ�b���Ă����B -";
				next;
				mes "[���x�C���u]";
				mes "�ӂށc�c";
				mes "�͂��͂��́c�c�������낢�b�������B";
				next;
				mes "[���x�C���u]";
				mes "�Ӂc�c�����ɂނȂ�";
				mes "���ɂ��b�𕷂����Ă���ʂ��H";
				mes "����ȏ�b�����Ƃ��������";
				mes "�I���ɂ��悤�B";
				next;
				mes "[���x�C���u]";
				mes "�������̏�����m�点�Ă��ꂽ";
				mes "���Ƃ͂��肪�����v���B";
				mes "���āA���͍����̖��Ō������Ȃ����";
				mes "�Ȃ�Ȃ����Ƃ����邩��";
				mes "����Ŏ��炷��B";
				mes "�ӂӁc�c�_�̂����삠��񂱂Ƃ��B";
				set GOD_2QUE,21;
				close2;
				cutin "god_rebeireb",255;
				end;
			case 2:
				mes "- ���Ȃ��͋^���̊፷����";
				mes "����Ȃ��悤�� -";
				next;
				mes "- ����܂łɉ����";
				mes "�N���Z�C�_�[��3����";
				mes "��1���� ��3�����B��";
				mes "�����ɂ��Ęb�����B -";
				next;
				mes "- �������A���ނɏ�����";
				mes "�Ă������Ƃɂق�̏�����";
				mes "������D�荬���� -";
				next;
				mes "- �B���ׂ����Ƃ�";
				mes "�B�����܂ܘb�������B -";
				next;
				mes "[���x�C���u]";
				mes "�ӂށc�c";
				mes "�������A�F���܂�����Ă���̂��ȁH";
				mes "�ӂӁc�c";
				next;
				mes "- �ނ̎�������ڂ���������";
				mes "�ω������C�������B";
				mes "�x������Ă���̂��낤���H -";
				next;
				mes "[���x�C���u]";
				mes "�������̏�����`���Ă��ꂽ���Ƃ�";
				mes "���肪�����v���B";
				mes "���āA���͍����̖��Ō������Ȃ����";
				mes "�Ȃ�Ȃ����Ƃ����邩��";
				mes "����Ŏ��炷��B";
				mes "�ӂӁc�c�_�̂����삠��񂱂Ƃ��B";
				next;
				mes "- �ނ̊܂ݏ΂��ɂ�";
				mes "�s�����Ȉ�ۂ��󂯂�B -";
				close;
				set GOD_2QUE,22;
				close2;
				cutin "god_rebeireb",255;
				end;
			}
		case 23:
		case 24:
			mes "- ���Ȃ���";
			mes "�C�O�j�[���Ɋւ��邱�Ƃ�";
			mes "�o���Ȃ���A���̓r����";
			mes "�������_��b�����B -";
			next;
			mes "- �ނ́c�c�\�z�͈̔�";
			mes "�������̂����܂蓮�h����";
			mes "�C�z�������Ȃ��B -";
			next;
			mes "[���x�C���u]";
			mes "���ɂȂ��Ă���Ȑ̘b��";
			mes "�o�Ă���Ƃ͂ȁc�c";
			mes "���ׂĒm���Ă��܂����̂��ȁH";
			mes "�����A�����؋��͂Ȃ��B";
			mes "�������������������c�c";
			next;
			mes "[���x�C���u]";
			mes "������W�^�o�^�����Ƃ����";
			mes "���ǁA���̒��͎��̂悤��";
			mes "�G���[�g���x�z������̂Ȃ̂���B";
			mes "�����������c�c";
			next;
			mes "[���x�C���u]";
			mes "�������H�@���̎����I";
			mes "����Ȃ炱������ΊȒP���B";
			next;
			mes "[���x�C���u]";
			mes "���̌��ɂ���R�����́A";
			mes "�N���Z�C�_�[�����̔ƍߓ���";
			mes "�������ČR�@�ٔ����s����";
			mes "���������҂��B";
			next;
			mes "[���x�C���u]";
			mes "�N�̂悤�Ȑl��100�l���炢";
			mes "�W�܂�Α����ٔ����J��";
			mes "���Ƃ͂ł��邾�낤�B";
			mes "�Ă��΂ɐ����낤���ˁc�c";
			mes "�͂͂͂͂́I";
			close2;
			cutin "god_rebeireb",255;
			end;
		case 25:
		case 26:
			mes "[���x�C���u]";
			mes "�ӂ�c�c�{���ɂ���Ƃ͂ȁB";
			mes "��Ō�����邱�ƂɂȂ邼�c�c";
			mes "���ǁA���̐��E�͎��̂悤��";
			mes "�G���[�g�A�_�ɋ߂��l�Ԃ��x�z";
			mes "������̂Ȃ̂���B";
			close2;
			cutin "god_rebeireb",255;
			end;
		default:
			mes "[���x�C���u]";
			mes "������W�^�o�^�����Ƃ����";
			mes "���ǁA���̒��͎��̂悤��";
			mes "�G���[�g���x�z������̂Ȃ̂���B";
			close2;
			cutin "god_rebeireb",255;
			end;
		}
	}
	mes "[���x�C���u]";
	mes "�䓙�̓N���Z�C�_�[�B";
	mes "�I�[�f�B���̈ӎu�ɉ���";
	mes "����ɔ�����ғ����B";
	mes "��N�O�̂悤�Ɂc�c";
	mes "����x�����𓢔��������";
	mes "�K��邾�낤�B";
	close2;
	cutin "god_rebeireb",255;
	end;
}

prt_castle.gat,48,164,0	script	�N���Z�C�_�[#mepan	734,{
	if($GodSleipnir >= 50 && $GodMagingiorde < 100) {
		if(GOD_2QUE >= 23 && GOD_2QUE <= 24) {
			mes "[�}�b�N�X=�t�H��=�V�h�[]";
			mes "�悭�����I";
			mes "�����͐���ɔ�����������ꏊ�ł���B";
			mes "�䓙�Ɏ^������҂͂��ł����}���B";
			mes "�����Ď��́A�R�@�ٔ��̔�����";
			mes "�S�����Ă���";
			mes "�}�b�N�X=�t�H��=�V�h�[�Ƃ����B";
			next;
			mes "[�}�b�N�X=�t�H��=�V�h�[]";
			mes "�N�A���ɉ����p���ˁH";
			next;
			mes "- ���Ȃ��͉������킸";
			mes "���ނ��������t�@�C����";
			mes "�˂��o�����B -";
			next;
			mes "- ���̃t�@�C���ɂ́A";
			mes "���x�C���u���ق��Q�菑�ƂƂ��ɁA";
			mes "�C�O�j�[���ƂƂ��ɓ����o�������_��";
			mes "���H���R�Ə����A�˂�ꂽ";
			mes "���ނ������Ă���B -";
			next;
			mes "[�}�b�N�X=�t�H��=�V�h�[]";
			mes "�N�̎v���A�����Ǝ󂯎�����B";
			mes "���̂悤�Ȏv�����W�܂�A";
			mes "����ς��Ă������̂ƐM���Ă���B";
			mes "���̏��ނ́A�䓙�𐳂������ւ�";
			mes "����������ׂƂȂ�ł��낤�B";
			if($GodMagingiorde < 100) {		// ��t��
				set $GodMagingiorde,$GodMagingiorde+1;
				if($GodMagingiorde == 50) {
					announce "�����嗤��[���M���M�����h]�̕��󂪎p�������܂����B����",0;
				}
				else if($GodMagingiorde == 100) {
					if($GodSleipnir == 100 && $GodMagingiorde == 100 && $GodBrysinggamen == 100 && $GodMjolnir == 100)
						announce "����[���M���M�����h]�̕��󂪉��������Ƃɂ��S�Ă̕��󂪉����A�_��̍쐬���ł���悤�ɂȂ�܂����B����",0;
					else
						announce "����[���M���M�����h]�̕��󂪉����܂����B����",0;
				}
			}
			if(GOD_2QUE == 23)
				set GOD_2QUE,25;
			else if(GOD_2QUE == 24)
				set GOD_2QUE,26;
			close;
		}
		else if(GOD_2QUE >= 27) {
			mes "[�}�b�N�X=�t�H��=�V�h�[]";
			mes "�߂����m�点��`���Ȃ����";
			mes "�Ȃ�Ȃ��͎̂c�O���ȁB";
			mes "�N����o������������������";
			mes "���͂킩���Ƃ����������o�Ă���B";
			next;
			mes "[�}�b�N�X=�t�H��=�V�h�[]";
			mes "�ǂ��Ȃ邩�͎��ɂ��킩��񂪁A";
			mes "������߂��Ɋ撣�肽�܂��B";
			close;
		}
		else {
			mes "[�}�b�N�X=�t�H��=�V�h�[]";
			mes "�悭�����I";
			mes "�����͐���ɔ�����ꏊ�A";
			mes "�}�X�^�[�N���Z�C�_�[�̕������B";
			mes "����ɔ�����Ƃ�����ƂɎ^��";
			mes "����҂͂��ł����}���邼�I";
			close;
		}
	}
	mes "[�}�b�N�X=�t�H��=�V�h�[]";
	mes "�悭�����I";
	mes "�����͐���ɔ�����ꏊ�A";
	mes "�}�X�^�[�N���Z�C�_�[�̕������B";
	mes "����ɔ�����Ƃ�����ƂɎ^��";
	mes "����҂͂��ł����}���邼�I";
	close;
}

prt_in.gat,172,109,0	script	���ރt�@�C��#prtbook	111,{
	if(GOD_2QUE == 12) {
		mes "^0000FF- �N���Z�C�_�[��3�����]��^000000";
		mes "^0000FF/�]�o���� -^000000";
		mes "�����Ɍ�����!!!";
		close;
	}
	else if(GOD_2QUE >= 7 && GOD_2QUE <= 11) {
		mes "�ڂ̑O�ɏ��ރt�@�C����";
		mes "��������܂��Ă���B";
		mes "�������Ƒ{�����n�߂��B";
		if(rand(1,10) > 6 && GOD_2QUE >= 7)
			set GOD_2QUE,GOD_2QUE+1;
		close;
	}
	mes "[���ފǗ��l �[�K��]";
	mes "���̏��ނɐG��Ă͂Ȃ�܂���I";
	next;
	mes "- ���Ȃ���";
	mes "���ƂȂ������������B -";
	close;
}

prt_in.gat,170,109,0	duplicate(���ރt�@�C��#prtbook)	���ރt�@�C��	111
prt_in.gat,168,109,0	duplicate(���ރt�@�C��#prtbook)	���ރt�@�C��	111
prt_in.gat,169,109,0	duplicate(���ރt�@�C��#prtbook)	���ރt�@�C��	111
prt_in.gat,166,109,0	duplicate(���ރt�@�C��#prtbook)	���ރt�@�C��	111

prt_in.gat,172,106,0	script	���ފǗ��l	833,{
	if($GodSleipnir >= 50 && $GodMagingiorde < 100) {
		if(GOD_2QUE >= 3 && GOD_2QUE <= 6) {
			mes "[���ފǗ��l �[�K��]";
			mes "���A������̏��ރt�@�C���̂���";
			mes "���͐G��Ȃ��ł��������ˁB";
			mes "�v�����e���̌R���֘A�̏��ނ�";
			mes "������������Ă��܂�����B";
			next;
			mes "[���ފǗ��l �[�K��]";
			mes "�S�ĉ{���͋֎~����Ă��܂��B";
			mes "�����ł��ˁH";
			mes "�������ނ𐮗����ăv�����e���R";
			mes "�܂Œ�o���Ȃ���΁c�c";
			next;
			mes "[���ފǗ��l �[�K��]";
			mes "�����I�@���̏��ނ͂ǂ��֍s�����H";
			mes "�Â��ĒT���ɂ����c�c�������I";
			mes "�ڂ������Ȃ��Ă������Ȃ��c�c";
			next;
			mes "[���ފǗ��l �[�K��]";
			mes "���Ȃ��͉��ł����H";
			mes "���������炻���ɗ����āc�c";
			mes "�����T�����Ȃ�A�������ɍs����";
			mes "�T���Ă��������I";
			mes "���������炷���A���Ă��������ˁI";
			while(1) {
				next;
				switch(select("�ڂ̋���悭�Ȃ��̂ł����H","���鏑�ނ�{���Ă����ł�","���ނ�T���̂���`���܂��傤","���̏��ނ������̂ł����H")) {
				case 1:
					mes "[���ފǗ��l �[�K��]";
					mes "����ȈÂ����ŏ��ނ΂���";
					mes "�T���Ă�����A���̍��}����";
					mes "���͂��ቺ���Ă��܂��āc�c";
					mes "^0000FF�܂Ƃ��Ȗ������������^000000�ǂ������";
					mes "�d��������Ƃ����̂��c�c";
					mes "^0000FF�߂��̕�����^000000�悭�����Ȃ��c�c";
					if(GOD_2QUE == 5 && (countitem(611) > 0 || countitem(1041) > 0)) {
						next;
						mes "[���ފǗ��l �[�K��]";
						mes "��H�@���Ȃ��A�ǂ�����";
						mes "�������ł��ˁI";
						mes "����c�c�g�킹�Ă��������Ă�";
						mes "��낵���ł����H";
						mes "�T����������̂ɂ��傤�ǂ����I";
						next;
						if(select("���߂ł�","�ǂ����g���Ă�������") == 1) {
							mes "[���ފǗ��l �[�K��]";
							mes "�����ł����c�c";
							mes "�ł͊撣���ĒT���܂��傤�c�c";
							close;
						}
						mes "[���ފǗ��l �[�K��]";
						mes "�����A�{���ł����I";
						mes "��قǂ̏��ނ�T������`����";
						mes "���Ă�������Ƃ����b�͖{��������";
						mes "��ł��ˁI";
						if(countitem(1041))
							delitem 1041,countitem(1041);
						if(countitem(611))
							delitem 611,1;
						set GOD_2QUE,6;
						next;
						mes "[���ފǗ��l �[�K��]";
						mes "���肪�Ƃ��������܂��A";
						mes "���肪�Ƃ��������܂��`";
						mes "�������l�ł��������y��";
						mes "�T�����Ƃ��ł������ł��B";
						mes "�����A�ǂ����Ȃ�ꏏ��";
						mes "���ޒT�������܂��傤�B";
					}
					else if(GOD_2QUE > 5) {
						mes "[���ފǗ��l �[�K��]";
						mes "�ł��A�������l�ł��������y��";
						mes "�T�����Ƃ��ł������ł��B";
					}
					continue;
				case 2:
					if(GOD_2QUE != 6) {
						mes "[���ފǗ��l �[�K��]";
						mes "���炟�����I";
						mes "���������ӂ����ł��傤�I";
						next;
						mes "[���ފǗ��l �[�K��]";
						mes "�����ɂ��鏑�ނ͉{����";
						mes "�֎~����Ă����!";
						mes "�܂�����������Ȃ��l�ł���";
						mes "���Ȃ��́I";
						mes "���x��������킩���ł����I";
						close;
					}
					mes "[���ފǗ��l �[�K��]";
					mes "�܂�������܂���ˁc�c";
					mes "�������̏��I�ɂ��鏑�ނ̎R";
					mes "���悭�T���Ă݂Ă��������B";
					mes "�����������̏��ނ���������ł��B";
					set GOD_2QUE,7;
					close;
				case 3:
					if(GOD_2QUE == 4) {
						mes "[���ފǗ��l �[�K��]";
						mes "�Ӂ[�ށc�c";
						mes "�ǂ�ȏ��ނȂ̂���m���Ă���Ȃ�";
						mes "�d�v�����������Ă���ł��傤�H";
						mes "��ʂ̕��ɂ͉{�����邱�Ƃ�";
						mes "�ł��Ȃ����Ƃ�m���Ă���";
						mes "�����̂ł����H";
						next;
						mes "[���ފǗ��l �[�K��]";
						mes "���̏��ނ����������Ȃ�������";
						mes "�ۊǂ���Ă��āA�d�v�ȕ��Ȃ̂���";
						mes "�킩��܂��񂪁A�Ƃɂ����{����";
						mes "�֎~����Ă���Ƃ������ƂȂ�ł��B";
						mes "�������A�N���Z�C�_�[�ł�";
						mes "����͕ς��Ȃ��Ɓc�c";
						next;
						mes "[���ފǗ��l �[�K��]";
						mes "�����ƕ����Ă݂������ł�";
						mes "�������ďd�v�Ȃ��̂ł�";
						mes "�Ȃ������Ȃ�ł����ǂ˂��c�c";
						mes "�͂��c�c�������Ɏ��̎d����";
						mes "����Ȃɑ�ςȂ��̂ł�����܂���";
						mes "����͍��Ɨ\�Z�̖��ʌ����ł��傤�c�c";
						set GOD_2QUE,5;
						continue;
					}
					else if(GOD_2QUE > 4) {
						mes "[���ފǗ��l �[�K��]";
						mes "�ڂ����Ĕ��āc�c";
						mes "����H";
						mes "����������`���Ă�����ł����H";
						continue;
					}
					else {
						mes "[���ފǗ��l �[�K��]";
						mes "����H�@���Ȃ��͎����T���Ă���";
						mes "���ނ��ǂ�Ȃ��̂Ȃ̂��킩����";
						mes "���ĒT���Ƃ�����ł����H";
						mes "���ނ̓��e���m�炸�ɒT���ƁH";
						mes "����ł͘b�ɂȂ�܂���I";
						mes "�������ɍs���Ă��Ă��������I";
						close;
					}
				case 4:
					mes "[���ފǗ��l �[�K��]";
					mes "�������Ɓc�c";
					mes "����͋����邱�Ƃ͂ł��Ȃ�";
					mes "���܂�ɂȂ��Ă��܂��c�c";
					next;
					mes "["+strcharinfo(0)+"]";
					mes "���̏��ނƂ͂���������";
					input '@answer$;
					set '@what1$,"��3����";
					set '@what2$,"����";
					set '@what3$,"�]��";
					set '@what4$,"�]�o";
					set '@temp_a,strstr('@answer$,'@what1$);
					set '@temp_b,strstr('@answer$,'@what2$);
					set '@temp_c,strstr('@answer$,'@what3$);
					set '@temp_d,strstr('@answer$,'@what4$);
					mes "["+strcharinfo(0)+"]";
					mes "^0000FF" +'@answer$+ "^000000";
					mes "�֘A�̏��ނł͂���܂��񂩁H";
					next;
					if('@temp_a == 1 && '@temp_b == 1 && '@temp_c == 1 && '@temp_d == 1) {
						mes "[���ފǗ��l �[�K��]";
						mes "���A���̒ʂ�ł��c�c";
						mes "�Ȃ����Ȃ��������m����";
						mes "�����ł���!?";
						set GOD_2QUE,4;
						continue;
					}
					mes "[���ފǗ��l �[�K��]";
					mes "�������A�Ⴂ�܂���H";
					continue;
				}
			}	// end while
		}
		else if(GOD_2QUE == 2) {
			mes "[���ފǗ��l �[�K��]";
			mes "���A������̏��ރt�@�C���̂���";
			mes "���͐G��Ȃ��ł��������ˁB";
			mes "�v�����e���̌R���֘A�̏��ނ�";
			mes "������������Ă��܂�����B";
			next;
			mes "[���ފǗ��l �[�K��]";
			mes "�S�ĉ{���͋֎~����Ă��܂��B";
			mes "�����ł��ˁH";
			mes "�������ނ𐮗����ăv�����e���R";
			mes "�܂Œ�o���Ȃ���΁c�c";
			next;
			mes "[���ފǗ��l �[�K��]";
			mes "�����I�@���̏��ނ͂ǂ��֍s�����H";
			mes "�Â��ĒT���ɂ����c�c�������I";
			mes "�ڂ������Ȃ��Ă������Ȃ��c�c";
			next;
			mes "[���ފǗ��l �[�K��]";
			mes "���Ȃ��͉��ł����H";
			mes "���������炻���ɗ����āc�c";
			mes "�����T�����Ȃ�A�������ɍs����";
			mes "�T���Ă��������I";
			mes "���������炷���A���Ă��������ˁI";
			next;
			switch(select("���������ނ������ł�","�ڂ̋���悭�Ȃ��̂ł����H","���ނ�T���̂���`���܂��傤","���̏��ނ������̂ł����H")) {
			case 1:
				mes "[���ފǗ��l �[�K��]";
				mes "�������������ł��傤�I";
				mes "�L�C�C�C�C�C!!";
				mes "�����ɂ��鏑�ނ�";
				mes "�{�����֎~����Ă���ƁI";
				mes "�܂����������킩��Ȃ��l�ł��ˁI";
				mes "���񌾂��΂킩���Ă�����ł����H";
				close;
			case 2:
				mes "[���ފǗ��l �[�K��]";
				mes "����ȈÂ����ŏ��ނ΂���";
				mes "�T���Ă�����A���̍��}����";
				mes "���͂��ቺ���Ă��܂��āc�c";
				mes "�܂Ƃ��Ȗ�����������Ăǂ������";
				mes "�d��������Ƃ����̂��c�c";
				mes "�߂��̕�����悭�����Ȃ��c�c";
				close;
			case 3:
				mes "[���ފǗ��l �[�K��]";
				mes "����H�@���Ȃ��͎����T���Ă���";
				mes "���ނ��ǂ�Ȃ��̂Ȃ̂��킩����";
				mes "���ĒT���Ƃ�����ł����H";
				mes "���ނ̓��e���m�炸�ɒT���ƁH";
				mes "����ł͘b�ɂȂ�܂���I";
				mes "�������ɍs���Ă��Ă��������I";
				close;
			case 4:
				mes "[���ފǗ��l �[�K��]";
				mes "�������Ɓc�c";
				mes "����͋����邱�Ƃ͂ł��Ȃ�";
				mes "���܂�ɂȂ��Ă��܂��c�c";
				next;
				mes "["+strcharinfo(0)+"]";
				mes "���̏��ނƂ͂���������";
				input '@str$;
				mes "["+strcharinfo(0)+"]";
				mes "^0000FF" + '@str$ + "^000000";
				mes "�֘A�̏��ނł͂���܂��񂩁H";
				next;
				mes "[���ފǗ��l �[�K��]";
				mes "�������H";
				close;
			}
		}
		else if(GOD_2QUE >= 7 && GOD_2QUE <= 11) {
			mes "[���ފǗ��l �[�K��]";
			mes "���[��c�c���ނ͌�����";
			mes "�܂������H";
			mes "�������������ƒT���Ă���̂ł���";
			mes "�Ȃ��Ȃ�������܂���˂��c�c";
			if(rand(1,10) > 4) {
				mes "���͉E����T���̂ŁA���Ȃ���";
				mes "���������������T���Ă݂Ă��������B";
				close;
			}
			else {
				mes "�������T���Ă���E�����ꏏ��";
				mes "�T�����A�^�񒆂�T���Ă݂܂��񂩁H";
				close;
			}
		}
		else if(GOD_2QUE == 12) {
			mes "[���ފǗ��l �[�K��]";
			mes "�����I";
			mes "���������I�@���������I";
			next;
			mes "����J���܁B";
			mes "���ł����Ȃ��̂悤�ȗǂ�";
			mes ((Sex)? "�N": "���삳��")+ "������Ƃ͂ˁc�c";
			mes "��������ł����Ă�������";
			mes "�Ƃ���Ȃ̂ł����A���͂����";
			mes "�����Ă����񍐂��ɂ����˂΁c�c";
			next;
			menu "�������ނ������Ă���܂��񂩁H",-;
			mes "[���ފǗ��l �[�K��]";
			mes "���[��c�c���������΁A";
			mes "���Ȃ��͂����������ނ���������";
			mes "�����Ă��܂����ˁc�c";
			mes "���܂�d�v�����ȏ��ނɂ������Ȃ����A";
			mes "�ǂ���������܂���ˁB";
			next;
			mes "[���ފǗ��l �[�K��]";
			mes "����A���ꂾ����`���Ă��ꂽ";
			mes "�̂�����A�{�����邭�炢�������B";
			mes "�ł��A���{�͎������ꂩ�玝����";
			mes "�����˂΂Ȃ�Ȃ��̂ŁA";
			mes "�ʖ{������Ă��������܂��傤�B";
			next;
			mes "[���ފǗ��l �[�K��]";
			mes "���ꂩ��ʖ{����邽�߂̍ޗ���";
			mes "�����܂��B";
			mes "�ʖ{�ɂ́A�������@�����{��";
			mes "�����悤�ɂ����Ă����܂���B";
			next;
			mes "[���ފǗ��l �[�K��]";
			mes "�ŁA�ʖ{�����̂ɕK�v�Ȃ̂́c�c";
			next;
			mes "[���ފǗ��l �[�K��]";
			mes "�Ȃ߂炩�Ȏ� 2��";
			mes "���� 1��";
			mes "�n�` 3��";
			mes "���̉H�� 3�{";
			mes "�Ō�ɁA�������@�������邽�߂�";
			mes "�u���[�W�F���X�g�[�� 20�B";
			next;
			mes "[���ފǗ��l �[�K��]";
			mes "���ꂾ���W�߂Ă��ꂽ��A";
			mes "���Ŏʖ{������Ă��������܂���B";
			mes "������������A����Ȃɏd�v��";
			mes "���ނł��Ȃ������Ȃ̂ŁA";
			mes "���ꂭ�炢�ő��v�ł��傤�B";
			next;
			mes "[���ފǗ��l �[�K��]";
			mes "�������A���ނ͂����ɕۊǂ��邱�Ƃ�";
			mes "�Ȃ�̂ŁA�������ꍇ�͂����܂�";
			mes "���ɗ��Ă��������ˁB";
			next;
			mes "[���ފǗ��l �[�K��]";
			mes "����ł́A�ł������}���ł��������B";
			set GOD_2QUE,13;
			close;
		}
		else if(GOD_2QUE == 13) {
			if(countitem(7111) < 2 || countitem(7151) < 1 || countitem(1024) < 3 || countitem(916) < 3 || countitem(717) < 20) {
				mes "[���ފǗ��l �[�K��]";
				mes "�ޗ���Y�ꂽ�̂ł��傤���H";
				mes "�Ȃ߂炩�Ȏ� 2��";
				mes "���� 1���A�n�` 3��";
				mes "���̉H�� 3�{";
				mes "�u���[�W�F���X�g�[�� 20�B";
				mes "�������W�߂Ă��Ă��������B";
				close;
			}
			mes "[���ފǗ��l �[�K��]";
			mes "�����A����Ȃɂ��̏��ނ�";
			mes "�������̂ł��ˁc�c";
			mes "��̂ǂ�ȓ��e�Ȃ񂾂��c�c";
			next;
			mes "[���ފǗ��l �[�K��]";
			mes "���A�ꉞ�W�߂ė����ޗ���";
			mes "�a����܂��傤�B";
			mes "�S���ǂݏI��������";
			mes "�ʂ��Ă��������܂���B";
			delitem 7111,2;
			delitem 7151,1;
			delitem 1024,3;
			delitem 916,3;
			delitem 717,20;
			set GOD_2QUE,14;
			next;
			mes "[���ފǗ��l �[�K��]";
			mes "�m���ɂ��������܂����B";
			mes "���΂����҂����c�c";
			close;
		}
		else if(GOD_2QUE >= 14 && GOD_2QUE <= 15) {
			mes "[���ފǗ��l �[�K��]";
			mes "������Ƒ҂��Ă���������";
			mes "�������͂��ł��B";
			mes "�����ڂ�ʂ��Ă���ʂ���";
			mes "���܂�����c�c";
			if(rand(1,10) > 6)
				set GOD_2QUE,GOD_2QUE+1;
			close;
		}
		else if(GOD_2QUE == 16) {
			mes "[���ފǗ��l �[�K��]";
			mes "�ʖ{���ł��܂����B";
			mes "���g�͓������̂ɂȂ��Ă��܂��B";
			mes "�������A���ނ͂����ɕۊǂ��܂�";
			mes "����A�������Ȃ����ꍇ�͂�����";
			mes "�܂ŗ��Ă��������ˁB";
			next;
			mes "[���ފǗ��l �[�K��]";
			mes "�������@�����{�̂悤�ɂ�����";
			mes "�����܂�������A���ނ�T����";
			mes "�������炢�ł����Ă��������B";
			set GOD_2QUE,17;
			close;
		}
		else if(GOD_2QUE >= 17) {
			mes "[���ފǗ��l �[�K��]";
			mes "�����A���x�͉������ɁH";
			next;
			while(1) {
				switch(select("���ނ̓��e����������","��������߂�","�b������")) {
				case 1:
					mes "- ���ތ������@���s -";
					mes "- �������������e�ɂ��Ă� -";
					mes "- �L�[���[�h����͂��Ă��������B -";
					next;
					input '@answer$;
					set '@what1$,"�N���Z�C�_�[";
					set '@what2$,"��3����";
					set '@what3$,"��1����";
					set '@what4$,"��3����";
					set '@what5$,"�Ō�̔C��";
					set '@what6$,"���x�C���u";
					set '@what7$,"�C�O�j�[��";
					set '@what8$,"�W�����E�t�@�[�h�b�N";
					set '@what9$,"�N�A�[�N�E�h�m��";
					set '@what10$,"�W���b�N�E�I�[";
					set '@what11$,"�G�}�E�V�A�[�X";
					set '@what12$,"���C�����~�X�g";
					set '@what13$,"�i�C���{�[��";
					set '@temp_a,strstr('@answer$,'@what1$);
					set '@temp_b,strstr('@answer$,'@what2$);
					set '@temp_c,strstr('@answer$,'@what3$);
					set '@temp_d,strstr('@answer$,'@what4$);
					set '@temp_e,strstr('@answer$,'@what5$);
					set '@temp_f,strstr('@answer$,'@what6$);
					set '@temp_g,strstr('@answer$,'@what7$);
					set '@temp_h,strstr('@answer$,'@what8$);
					set '@temp_i,strstr('@answer$,'@what9$);
					set '@temp_j,strstr('@answer$,'@what10$);
					set '@temp_k,strstr('@answer$,'@what11$);
					set '@temp_l,strstr('@answer$,'@what12$);
					set '@temp_m,strstr('@answer$,'@what13$);
					if('@temp_a == 1) {
						mes "- �������[�h :";
						mes '@answer$+ "�Ō��� -";
						mes "�N���Z�C�_�[ :";
						mes "����ɔ�����ғ��ŁA";
						next;
						mes "�\�[�h�}���̒��ł��鐅���ȏ��";
						mes "���͂������A�M�S����҂�";
						mes "������I�����ꂽ�ҁB";
						next;
						mes "���݂̑������͌R���@��";
						mes "�ł��邽�ߋL���Ȃ��B";
						next;
						mes "�{�͂ł̓N���Z�C�_�[";
						mes "��3�����̓]��/�]�o�݂̂�";
						mes "�������Ƃ���B";
						close2;
						if('@temp_b == 1) {
							mes "- �������[�h :";
							mes '@answer$+ "�Ō��� -";
							mes "��3���� :";
							mes "�N���Z�C�_�[��3�����B";
							next;
							mes "��������N���Z�C�_�[��";
							mes "���ł��ł��D�ꂽ���s��";
							mes "�\������Ă���B";
							next;
							mes "�]��/�]�o�Ɋւ���񍐂�";
							mes "�n�݈ȗ��񍐂͂Ȃ��B";
							next;
							mes "�N���Z�C�_�[��3����";
							mes "��1�����E��3�����̏ꍇ��";
							mes "��O�ł���A���݊Y������";
							mes "�������B�͓]�o���Ă���";
							mes "�Ƃ̂��ƂŁA��ʐ�����";
							mes "�߂����҂�����B";
							next;
							mes "���ڍׂȓ��e�́A";
							mes "�N���Z�C�_�[��3����";
							mes "��1�����̕��Ŏ�舵���B";
							close2;
							if('@temp_c == 1) {
								mes "- �������[�h :";
								mes '@answer$+ "�Ō��� -";
								mes "��1���� :";
								mes "�N���Z�C�_�[��3�����E��1�����B";
								next;
								mes "�e������4�̏�������";
								mes "���藧���Ă���A���̒���";
								mes "1�Ԗڂ̏������1������";
								mes "�ď̂��Ă���B";
								next;
								mes "�{�����ɂ͑�1�����E��3�����ȊO��";
								mes "�L�^�͂Ȃ��B";
								close2;
								if('@temp_d == 1) {
									mes "- �������[�h :";
									mes '@answer$+ "�Ō��� -";
									mes "��3���� :";
									mes "�N���Z�C�_�[��3�����B";
									next;
									mes "^0000FF�Ō�̔C��^000000�ɂ�������";
									mes "�N���Z�C�_�[��3�����E��1����";
									mes "�E��3�������̖����L���B";
									next;
									mes "^0000FF : ���x�C���u";
									mes " : �W���b�N�E�I�[";
									mes " : �W�����E�t�@�[�h�b�N";
									mes " : �N�A�[�N�E�h�m��";
									mes " : �G�}�E�V�A�[�X";
									mes " : ���C�����~�X�g";
									mes " : �i�C���{�[��^000000";
									if(GOD_2QUE == 17)
										set GOD_2QUE,18;
									close2;
									if('@temp_e == 1) {
										mes "- �������[�h :";
										mes '@answer$+ "�Ō��� -";
										mes "���̔C�����Ō�ɁA";
										mes "�ō����s�����ł���";
										mes "��3��������̂��邱�Ƃ�";
										mes "��w���ɂ�茈�肳�ꂽ�B";
										next;
										mes "�C���̓��e�́A�����Ɏc���ꂽ";
										mes "^0000FF�_��̎肪����^000000��";
										mes "���̖��Ŕ閧����";
										mes "�{������Ƃ������̂ł������B";
										next;
										mes "�Ƃ��낪�A��3�����̔C������";
										mes "���鎖�������������B";
										mes "�������̒��̈�l���A��������";
										mes "���ɑ΂���s�����q�ׁA";
										mes "^0000FF�������̖��߂𖳎����ēƒf�I�ȍs��^000000";
										mes "������B";
										next;
										mes "���ʓI�Ɍ��_�ɂȂ葈���������A";
										mes "�u�ƒf�I�ȍs�������������ҁv";
										mes "���������S�Ă̕������Ƃ�";
										mes "���c�̖�^0000FF���ߕs���]^000000�Ƃ���";
										mes "���_�ɗ����������B";
										next;
										mes "�Y����1���ɂ͐��ق��^�����A";
										mes "���𕉂��ē��@�����Ƃ�";
										mes "�񍐂�����B";
										next;
										mes "���̎����̌�A�_��̎肪����";
										mes "�ɑ΂���T���́u�����I�v�Ə̂����";
										mes "���x�̐��������߂����A����ɂ����";
										mes "��3�����̎w���\�͂��^����";
										mes "��3���������A��1��������";
										mes "�ӔC��ǋy�B";
										next;
										mes "��1�������͑�3��������";
										mes "�ʒk�̌�A�ӔC����邽�߂�";
										mes "��3�������U�����ӁB";
										mes "���̂܂ܑ�3�����͉��U�����B";
										next;
										mes "���U��A�������ȉ���������";
										mes "3�����ԌR�K����w�Z��";
										mes "������A���̏ꏊ�ɓ]�o������ꂽ�B";
										next;
										mes "���݁A��3�����̒T���C��";
										mes "�ɂ�錋�ʕ��́A������";
										mes "�������ł��郌�x�C���u��M����";
										mes "�����Ȍ���������Ă���Ƃ���";
										mes "�񍐂��t��������B";
										next;
										mes "���̌����́A���[���~�b�h�K�b�c������";
										mes "���ɂ��s���Ă���B�ȏ�B";
										close2;
										if(GOD_2QUE == 18)
											set GOD_2QUE,19;
									}
								}
								else {
									mes "- �������[�h : ";
									mes '@answer$+ "�Ō��� -";
									mes "- �������ʂ�������܂���B -";
									close2;
								}
							}
						}
						else if('@temp_c == 1) {
							mes "- �������[�h : ";
							mes '@answer$+ "�Ō��� -";
							mes "��1���� : ";
							mes "�N���Z�C�_�[��1�����B";
							mes "�e������4�̏�������";
							mes "���藧���Ă���A���̒���";
							mes "1�Ԗڂ̏������w���B";
							next;
							mes "�܂�A�N���Z�C�_�[��1����";
							mes "��1�����A��2������1����";
							mes "�̂悤�Ɍď̂���A��ʍ���";
							mes "�ɂ�����u�����v����������";
							mes "���Ƃ����߂�B";
							next;
							mes "�ڍׂȓ��e�́A���͂Ɋւ���";
							mes "��񗬏o�̌��O�����邽��";
							mes "�����ł͎�舵��Ȃ��B";
							close2;
						}
						else if('@temp_d == 1) {
							mes "- �������[�h : ";
							mes '@answer$+ "�Ō��� -";
							mes "��3���� : ";
							mes "�N���Z�C�_�[��3�����B";
							mes "�e������4�̕�����";
							mes "�g�D����Ă���A���̒���";
							mes "�O�Ԗڂ̏����������ď̂���B";
							next;
							mes "�܂�A�N���Z�C�_�[��1����";
							mes "�E��3�����E��3�����A";
							mes "�N���Z�C�_�[��2�����E��5����";
							mes "�E��3�����̂悤�Ɍď̂���A";
							mes "��ʍ��ڂɂ�����u�����v��";
							mes "�������邱�Ƃ����߂�B";
							next;
							mes "�܂��A1�����͒ʏ�8����";
							mes "�\������Ă��邱�Ƃ��ǋL����B";
							mes "����ȏ�̏ڍׂȓ��e�́A";
							mes "���͂Ɋւ����񗬏o�̌��O��";
							mes "���邽�ߕ����ł͎�舵��Ȃ��B";
							close2;
						}
						else if('@temp_e == 1) {
							mes "- �������[�h : ";
							mes '@answer$+ "�Ō��� -";
							mes "- �������[�h���s�����Ă��܂��B -";
							mes "- �ǂ̕����̍Ō�̔C����";
							mes "���Ă��A���m�ȏ���";
							mes "���͂��Ă��������B -";
							close2;
						}
						else {
							mes "- �������[�h : ";
							mes '@answer$+ "�Ō��� -";
							mes "- �������[�h : ";
							mes '@answer$+ "�Ō��� -";
							mes "- �������[�h : ";
							mes '@answer$+ "�Ō��� -";
							mes "- �������ʂ�������܂���B -";
							close2;
						}
					}
					else if('@temp_b == 1) {
						mes "- �������[�h :";
						mes '@answer$+ "�Ō��� -";
						mes "��3���� :";
						mes "�N���Z�C�_�[��3�����B";
						next;
						mes "��������N���Z�C�_�[��";
						mes "���ł��ł��D�ꂽ���s��";
						mes "�\������Ă���B";
						next;
						mes "�]��/�]�o�Ɋւ���񍐂�";
						mes "�n�݈ȗ��񍐂͂Ȃ��B";
						next;
						mes "�N���Z�C�_�[��3����";
						mes "��1�����E��3�����̏ꍇ��";
						mes "��O�ł���A���݊Y������";
						mes "�������B�͓]�o���Ă���";
						mes "�Ƃ̂��ƂŁA��ʐ�����";
						mes "�߂����҂�����B";
						next;
						mes "���ڍׂȓ��e�́A";
						mes "�N���Z�C�_�[��3����";
						mes "��1�����̕��Ŏ�舵���B";
						close2;
						if('@temp_c == 1) {
							mes "- �������[�h :";
							mes '@answer$+ "�Ō��� -";
							mes "��1���� :";
							mes "�N���Z�C�_�[��3�����E��1�����B";
							next;
							mes "�e������4�̏�������";
							mes "���藧���Ă���A���̒���";
							mes "1�Ԗڂ̏������1������";
							mes "�ď̂��Ă���B";
							next;
							mes "�{�����ɂ͑�1�����E��3�����ȊO��";
							mes "�L�^�͂Ȃ��B";
							close2;
							if('@temp_d == 1) {
								mes "- �������[�h :";
								mes '@answer$+ "�Ō��� -";
								mes "��3���� :";
								mes "�N���Z�C�_�[��3�����B";
								next;
								mes "^0000FF�Ō�̔C��^000000�ɂ�������";
								mes "�N���Z�C�_�[��3�����E��1����";
								mes "�E��3�������̖����L���B";
								next;
								mes "^0000FF : ���x�C���u";
								mes " : �W���b�N�E�I�[";
								mes " : �W�����E�t�@�[�h�b�N";
								mes " : �N�A�[�N�E�h�m��";
								mes " : �G�}�E�V�A�[�X";
								mes " : ���C�����~�X�g";
								mes " : �i�C���{�[��^000000";
								if(GOD_2QUE == 17)
									set GOD_2QUE,18;
								close2;
								if('@temp_e == 1) {
									mes "- �������[�h :";
									mes '@answer$+ "�Ō��� -";
									mes "���̔C�����Ō�ɁA";
									mes "�ō����s�����ł���";
									mes "��3��������̂��邱�Ƃ�";
									mes "��w���ɂ�茈�肳�ꂽ�B";
									next;
									mes "�C���̓��e�́A�����Ɏc���ꂽ";
									mes "^0000FF�_��̎肪����^000000��";
									mes "���̖��Ŕ閧����";
									mes "�{������Ƃ������̂ł������B";
									next;
									mes "�Ƃ��낪�A��3�����̔C������";
									mes "���鎖�������������B";
									mes "�������̒��̈�l���A��������";
									mes "���ɑ΂���s�����q�ׁA";
									mes "^0000FF�������̖��߂𖳎����ēƒf�I�ȍs��^000000";
									mes "������B";
									next;
									mes "���ʓI�Ɍ��_�ɂȂ葈���������A";
									mes "�u�ƒf�I�ȍs�������������ҁv";
									mes "���������S�Ă̕������Ƃ�";
									mes "���c�̖�^0000FF���ߕs���]^000000�Ƃ���";
									mes "���_�ɗ����������B";
									next;
									mes "�Y����1���ɂ͐��ق��^�����A";
									mes "���𕉂��ē��@�����Ƃ�";
									mes "�񍐂�����B";
									next;
									mes "���̎����̌�A�_��̎肪����";
									mes "�ɑ΂���T���́u�����I�v�Ə̂����";
									mes "���x�̐��������߂����A����ɂ����";
									mes "��3�����̎w���\�͂��^����";
									mes "��3���������A��1��������";
									mes "�ӔC��ǋy�B";
									next;
									mes "��1�������͑�3��������";
									mes "�ʒk�̌�A�ӔC����邽�߂�";
									mes "��3�������U�����ӁB";
									mes "���̂܂ܑ�3�����͉��U�����B";
									next;
									mes "���U��A�������ȉ���������";
									mes "3�����ԌR�K����w�Z��";
									mes "������A���̏ꏊ�ɓ]�o������ꂽ�B";
									next;
									mes "���݁A��3�����̒T���C��";
									mes "�ɂ�錋�ʕ��́A������";
									mes "�������ł��郌�x�C���u��M����";
									mes "�����Ȍ���������Ă���Ƃ���";
									mes "�񍐂��t��������B";
									next;
									mes "���̌����́A���[���~�b�h�K�b�c������";
									mes "���ɂ��s���Ă���B�ȏ�B";
									close2;
									if(GOD_2QUE == 18)
										set GOD_2QUE,19;
								}
							}
							else {
								mes "- �������[�h : ";
								mes '@answer$+ "�Ō��� -";
								mes "- �������ʂ�������܂���B -";
								close2;
							}
						}
					}
					else if('@temp_c == 1) {
						mes "- �������[�h : ";
						mes '@answer$+ "�Ō��� -";
						mes "��1���� : ";
						mes "- �������ʂ�������܂���B -";
						mes "-��ʍ��ڂ���ڍ׌�����";
						mes "��������ł��B -";
						close2;
					}
					else if('@temp_d == 1) {
						mes "- �������[�h : ";
						mes '@answer$+ "�Ō��� -";
						mes "��3���� : ";
						mes "- �������ʂ�������܂���B -";
						mes "-��ʍ��ڂ���ڍ׌�����";
						mes "��������ł��B -";
						close2;
					}
					else if('@temp_e == 1 && GOD_2QUE > 17) {
						mes "- �������[�h : ";
						mes '@answer$+ "�Ō��� -";
						mes "�Ō�̔C�� : ^0000FF�Ō�̔C��^000000";
						mes "- �������[�h���s�����Ă��܂� -";
						mes "- �ǂ̕����̍Ō�̔C����";
						mes "���Ă��A���m�ȏ���";
						mes "���͂��Ă��������B -";
						next;
						close2;
					}
					else if('@temp_f == 1) {
						mes "- �������[�h : ";
						mes '@answer$+ "�Ō��� -";
						mes "���N���Z�C�_�[��3����";
						mes "�E��1�����E��3�����������B";
						mes "���݃N���Z�C�_�[�V������";
						mes "�w�Z�ŋ����Ƃ��Ċ������B";
						next;
						mes "�����Ƃ��Ă̊����Ƌ��ɁA";
						mes "�����ɂ�錤���������s���Ă���B";
						mes "�Ζ��n�̓v���[���e������B";
						close2;
					}
					else if('@temp_g == 1) {
						mes "- �������[�h : ";
						mes '@answer$+ "�Ō��� -";
						mes "- �������ʂ�������܂���B -";
						mes "- �������ʂ�������܂���B -";
						mes "- �������ʂ�������܂���B -";
						mes "- �������ʂ�������܂���B -";
						mes "^FF0000�����֎~���[�h�ł�^000000";
						close2;
					}
					else if('@temp_h == 1) {
						mes "- �������[�h :";
						mes '@answer$+ "�Ō��� -";
						mes "���N���Z�C�_�[��3����";
						mes "�E��1�����E��3�����������B";
						mes "��3�������U��A���݃Q�t�F��";
						mes "�n��ŋΖ����B";
						next;
						mes "�S���̔C���͕���⋋�i�̊m�ہB";
						mes "�u���b�N�X�~�X�M���h���ŋΖ����B";
						close2;
					}
					else if('@temp_i == 1) {
						mes "- �������[�h :";
						mes '@answer$+ "�Ō��� -";
						mes "���N���Z�C�_�[��3����";
						mes "�E��1�����E��3�����������B";
						mes "��3�������U��A�������ށB";
						next;
						mes "���ތ�A�̋��̃����N�ɋA��B";
						mes "���قŎG�����s�����v�𗧂Ă�";
						mes "����Ƃ����񍐂������Ă���B";
						close2;
					}
					else if('@temp_j == 1) {
						mes "- �������[�h :";
						mes '@answer$+ "�Ō��� -";
						mes "���N���Z�C�_�[��3����";
						mes "�E��1�����E��3�����������B";
						mes "��3�������U��A����";
						mes "�A���x���^�ŋΖ����B";
						next;
						mes "�S���̔C���̓A���x���^";
						mes "�n��̕啺���B";
						mes "�A���x���^�`�t�߂ŋΖ����B";
						close2;
					}
					else if('@temp_k == 1) {
						mes "- �������[�h :";
						mes '@answer$+ "�Ō��� -";
						mes "���N���Z�C�_�[��3����";
						mes "�E��1�����E��3�����������B";
						mes "��3�������U��A�������ށB";
						next;
						mes "���ތ�A�������ނ���";
						mes "�A���f�o�����ɍs���B";
						mes "�J�v���T�[�r�X�ɗ�������";
						mes "��o�����Ƃ̕񍐂������Ă���B";
						close2;
					}
					else if('@temp_l == 1) {
						mes "- �������[�h :";
						mes '@answer$+ "�Ō��� -";
						mes "���N���Z�C�_�[��3����";
						mes "�E��1�����E��3�����������B";
						mes "��3�������U��A�R���h�ɕ��C�B";
						next;
						mes "���݂̔C���͕s���B";
						mes "�R���h�̃J�W�m���ŋΖ����B";
						close2;
					}
					else if('@temp_m == 1) {
						mes "- �������[�h :";
						mes '@answer$+ "�Ō��� -";
						mes "���N���Z�C�_�[��3����";
						mes "�E��1�����E��3�����������B";
						mes "��3�������U��A�W�����C�ɕ��C�B";
						next;
						mes "�S���̔C���̓W�����C����";
						mes "�����ێ��B";
						mes "�W�����C�̃o�[�ŋΖ����B";
						close2;
					}
					else {
						mes "- �������[�h : ";
						mes '@answer$+ "�Ō��� -";
						mes "- �������[�h : ";
						mes '@answer$+ "�Ō��� -";
						mes "- �������[�h : ";
						mes '@answer$+ "�Ō��� -";
						mes "- �������ʂ�������܂���B -";
						close2;
					}
					continue;
				case 2:
					mes "- ���ތ������@��";
					mes "���f���Ă��܂��B -";
					next;
					mes "- ���ތ������@����";
					mes "����������܂���B -";
					mes "- ���̂܂܏I�����܂����H -";
					next;
					mes "- ���̂܂܏I�������ꍇ -";
					mes "- �ۑ����Ă��Ȃ�������";
					mes "������댯��������܂��B -";
					next;
					mes "- �c�c -";
					next;
					mes "- �c�c�c�c -";
					next;
					mes "- �c�c�I�����܂��B -";
					close;
				case 3:
					mes "[���ފǗ��l �[�K��]";
					mes "����Ȏd�������Ɨ\�Z��";
					mes "���ʎg�����ƌ����O�Ɂc�c";
					mes "���̂悤�Ȑl�ނ�����ȂƂ����";
					mes "�������߂��Ă��邱�Ǝ��̂�";
					mes "���ʎg���ł���B�܂������B";
					close;
				}
			}	// end while
		}
	}
	mes "[���ފǗ��l �[�K��]";
	mes "���A������̏��ރt�@�C����";
	mes "���͂����Ȃ��ł��������B";
	mes "�����������̂͂���܂����B";
	next;
	if(select("����ł����ރt�@�C��������","���ƂȂ����������Ƃ𕷂�") == 1) {
		mes "[���ފǗ��l �[�K��]";
		mes "�����Ȃƌ������ł���!!!";
		close2;
		warp "prontera.gat",120,264;
		end;
	}
	mes "[���ފǗ��l �[�K��]";
	mes "�͂��A���̏ꏊ��";
	mes "������T���Ă݂Ă��������B";
	mes "�ߍ��{��ǂސl���猸����";
	mes "����Ƃ����̂ɁA�}���ق܂�";
	mes "����Ƃ͂Ȃ��Ȃ��M�S�Ȑl���B";
	close;
}

geffen_in.gat,109,161,3	script	�N���Z�C�_�[	751,{
	if($GodSleipnir >= 50 && $GodMagingiorde < 100) {
		if(GOD_2QUE_SUB1 > 2 || GOD_2QUE >= 20) {
			mes "- �����ƂĂ��ɂ������B";
			mes "���������ނ���Ȃ���";
			mes "�������t���J��Ԃ��Ă���B -";
			next;
			mes "[�W�����E�t�@�[�h�b�N]";
			mes "3���ڂ̂��̓��ɉ��B��";
			mes "�������񂾁c�c";
			mes "�_��̎肪����ł���";
			mes "^0000FF�����̔j��^000000���B";
			next;
			mes "[�W�����E�t�@�[�h�b�N]";
			mes "���ꂩ��3�����c�c���̊Ԃ�";
			mes "�����������̂����ɂ��킩���c�c";
			mes "�v���o���Ȃ��c�c�c�c";
			mes "����A�v���o�������Ȃ��񂾁c�c";
			close;
		}
		else if(GOD_2QUE > 17 && GOD_2QUE_SUB1 < 2) {
			mes "[�W�����E�t�@�[�h�b�N]";
			mes "�ӂ��B����͂���ő�ς���B";
			mes "����ρA����ȎG�����O�݂�����";
			mes "���ԂƔC�������Ȃ��Ă��ق���";
			mes "�ǂ��������B";
			mes "�������̂ق����C���y����������Ȃ��B";
			next;
			mes "[�W�����E�t�@�[�h�b�N]";
			mes "���[��H";
			mes "�����p���H";
			next;
			switch(select("��3�����ɂ��ĕ���","�ߋ����f��","��3�����̍Ō�̔C���ɂ��ĕ���")) {
			case 1:
				if(GOD_2QUE == 18) {
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "��3�����H";
					mes "�����A�������������̘b���B";
					next;
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "�{���ɃC�C�z�΂��肾�����Ȃ��B";
					mes "���������΁A�������͍�";
					mes "�������Ă���񂾂낤�ȁB";
					next;
					mes "- ���Ȃ���";
					mes "���x�C���u�������鏊�� -";
					mes "- �V������w�Z�œ����Ă���";
					mes "�Ƃ���������b�����B -";
					mes "- �ނ͏����̊ԉ����ڂ����Ȃ���";
					mes "�ߋ��Ɏv�����߂��炵���B -";
					close;
				}
				else if(GOD_2QUE > 18) {
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "��3�����H";
					mes "�����A�������������̘b���B";
					next;
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "�{���ɃC�C�z�΂��肾�����Ȃ��B";
					mes "���������΁A�������͍�";
					mes "�������Ă���񂾂낤�ȁB";
					next;
					mes "���x�C���u�������鏊�� -";
					mes "- �V������w�Z�œ����Ă���";
					mes "�Ƃ���������b�����B -";
					mes "- �ނ͏����̊ԉ����ڂ����Ȃ���";
					mes "�ߋ��Ɏv�����߂��炵���B -";
					next;
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "���������΁A�Ō�̔C����";
					mes "�o��O�܂ł͕�������";
					mes "7�l�͖{���ɒ����ǂ������񂾁B";
					mes "�Ō��^0000FF������^000000�����߈ᔽ";
					mes "�������Ȃ���A���ł����܂�";
					mes "�����Ă����낤�ɂ�B";
					next;
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "�ł��A�����̖��O��";
					mes "�����������o���ĂȂ��񂾂�ȁB";
					mes "�������c�c���O���v���o���Ȃ�";
					mes "�񂾂�c�c";
					mes "���O�c�c�����c�c�́c�c";
					next;
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "���O���v���o���Ȃ��̂́c�c";
					mes "�ȁc�c��Łc�c";
					mes "�Ȃ܁c�c�����c�c";
					next;
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "�c�c�c�c���ɂ��c�c";
					next;
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "- ��R�Ƃ����\��Ő��ʂ�";
					mes "���߂��܂ܗ����Ă���B";
					mes "���t�������Ă݂����������Ȃ��B -";
					if(GOD_2QUE_SUB1 == 0)
						set GOD_2QUE_SUB1,1;
					close;
				}
			case 2:
				mes "[�W�����E�t�@�[�h�b�N]";
				mes "�ŋ߂ǂ������āH";
				mes "���̔C���̂��Ƃ��H";
				next;
				mes "[�W�����E�t�@�[�h�b�N]";
				mes "�Q�t�F���̃u���b�N�X�~�X";
				mes "�M���h�ō��ꂽ����̒�����";
				mes "�ǂ��o���̂��̂�I���";
				mes "�N���Z�C�_�[�̖{�̂ɑ���";
				mes "�C���𐋍s�����B";
				next;
				mes "[�W�����E�t�@�[�h�b�N]";
				mes "���܂ɑދ����Ɗ����邪";
				mes "��y�̂Ђ�����ǂ��̗{���ɂ�";
				mes "�������񂩂�ȁB";
				mes "�����v���ĂȂ�Ƃ�����Ă��B";
				next;
				mes "[�W�����E�t�@�[�h�b�N]";
				mes "��������ŋ߉��ɓ������Ƃ�";
				mes "��������������ȁc�c";
				next;
				mes "[�W�����E�t�@�[�h�b�N]";
				mes "�Ȃ񂩂����ƒN���Ɍ�����";
				mes "����悤�ȋC������񂾂�c�c";
				close;
			case 3:
				if(GOD_2QUE == 18) {
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "�Ō�̔C�����ƁH";
					next;
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "�������ȁc�c������Ƃł�";
					mes "�L���̎肪���肪�����";
					mes "�v���o�������Ȃ񂾂��c�c";
					mes "�悭�o���Ă��Ȃ��Ăˁc�c";
					next;
					mes "- �ނ͕�R�Ƃ������";
					mes "�����v���o���Ȃ���΂Ȃ�Ȃ�";
					mes "���Ƃ�K���Ɏv���o�����Ƃ���";
					mes "����悤�ȕ\������Ă���B -";
					close;
				}
				else if(GOD_2QUE > 18 && GOD_2QUE_SUB1 > 0) {
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "�Ō�̔C�����ƁH";
					next;
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "�������ȁc�c������Ƃł�";
					mes "�L���̎肪���肪�����";
					mes "�v���o�������Ȃ񂾂��c�c";
					mes "�悭�o���Ă��Ȃ��Ăˁc�c";
					next;
					mes "- �ނ͕�R�Ƃ������";
					mes "�����v���o���Ȃ���΂Ȃ�Ȃ�";
					mes "���Ƃ�K���Ɏv���o�����Ƃ���";
					mes "����悤�ȕ\������Ă���B -";
					next;
					mes "- ���Ȃ��͏��ނɏ������";
					mes "�������e��ނɓ`���n�߂��B -";
					next;
					mes "�c�c";
					next;
					mes "���̔C�����Ō�ɁA";
					mes "�ō����s�����ł���";
					mes "��3��������̂��邱�Ƃ�";
					mes "��w���ɂ�茈�肳�ꂽ�B";
					next;
					mes "�C���̓��e�́A�����Ɏc���ꂽ";
					mes "^0000FF�_��̎肪����^000000��";
					mes "���̖��Ŕ閧����";
					mes "�{������Ƃ������̂ł������B";
					next;
					mes "�Ƃ��낪�A��3�����̔C������";
					mes "���鎖�������������B";
					mes "�������̒��̈�l���A��������";
					mes "���ɑ΂���s�����q�ׁA";
					mes "^0000FF�������̖��߂𖳎����ēƒf�I�ȍs��^000000";
					mes "������B";
					next;
					mes "���ʓI�Ɍ��_�ɂȂ葈���������A";
					mes "�u�ƒf�I�ȍs�������������ҁv";
					mes "���������S�Ă̕������Ƃ�";
					mes "���c�̖�^0000FF���ߕs���]^000000�Ƃ���";
					mes "���_�ɗ����������B";
					next;
					mes "�Y����1���ɂ͐��ق��^�����A";
					mes "���𕉂��ē��@�����Ƃ�";
					mes "�񍐂�����B";
					next;
					mes "���̎����̌�A�_��̎肪����";
					mes "�ɑ΂���T���́u�����I�v�Ə̂����";
					mes "���x�̐��������߂����A����ɂ����";
					mes "��3�����̎w���\�͂��^����";
					mes "��3���������A��1��������";
					mes "�ӔC��ǋ��B";
					next;
					mes "��1�������͑�3��������";
					mes "�ʒk�̌�A�ӔC����邽�߂�";
					mes "��3�������U�����ӁB";
					mes "���̂܂ܑ�3�����͉��U�����B";
					next;
					mes "���U��A�������ȉ���������";
					mes "3�����ԌR�K����w�Z��";
					mes "������A���̏ꏊ�ɓ]�o������ꂽ�B";
					next;
					mes "���݁A��3�����̒T���C��";
					mes "�ɂ�錋�ʕ��́A������";
					mes "�������ł��郌�x�C���u��M����";
					mes "�����Ȍ���������Ă���Ƃ���";
					mes "�񍐂��t��������B";
					next;
					mes "���̌����́A���[���~�b�h�K�b�c������";
					mes "���ɂ��s���Ă���B�ȏ�B";
					next;
					mes "�c�c�c�c�c�c�c�c";
					next;
					mes "�c�c�c�c";
					next;
					mes "�c�c";
					next;
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "�v���o�������c�c";
					mes "���̓��A�{�����J�n���Ă���";
					mes "3���ڂɉ������͌������񂾁c�c";
					mes "�_��̎肪����ł���";
					mes "^0000FF�����̔j��^000000��!!!";
					next;
					mes "�����āc�c";
					mes "�����āc�c�c�c";
					mes "�c�c�c�c�c�c�c�c�c�c";
					next;
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "���܂�c�c���̌�̋L����";
					mes "�����ۂ蔲�����܂����悤���B";
					mes "���B�������������̂���";
					mes "�v���o����c�c";
					next;
					mes "- �ނ͐h�����Ȋ�����Ă���B -";
					if(GOD_2QUE_SUB1 == 1)
						set GOD_2QUE_SUB1,2;
					close;
				}
				else {
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "�Ō�̔C�����ƁH";
					next;
					mes "[�W�����E�t�@�[�h�b�N]";
					mes "�������Ȃ��c�c";
					mes "�����v���o���肪����ł������";
					mes "�v���o���邩������Ȃ����c�c";
					mes "�悭�o���Ă��Ȃ����Ăˁc�c";
					next;
					mes "- �ނ͋���Ȋ፷����";
					mes "�v���o���Ȃ����Ƃ�";
					mes "�Ȃ�Ƃ��v���o�����Ƃ��Ă���B -";
					close;
				}
			}
		}
		else if((GOD_2QUE_SUB1 > 1) && (GOD_2QUE_SUB1 < 3)) {
			mes "�c�c�c�c�c�c";
			next;
			mes "�c�c�c�c";
			next;
			mes "�c�c";
			next;
			mes "[�W�����E�t�@�[�h�b�N]";
			mes "�v���o�����c�c";
			mes "���̓��A�{���ɏo�Ă���3���ڂ�";
			mes "���B�͌������񂾁B";
			mes "�_��̎肪����ł���";
			mes "^0000FF�����̔j��^000000��!!!";
			next;
			mes "[�W�����E�t�@�[�h�b�N]";
			mes "�����āc�c";
			mes "�����āc�c�c�c";
			mes "�����āc�c�c�c�c�c";
			next;
			mes "[�W�����E�t�@�[�h�b�N]";
			mes "���܂�c�c��������������";
			mes "�L���������ȁc�c";
			mes "���B������������������������";
			mes "�͂�����Ɗo���ĂȂ��c�c";
			mes "^0000FF���ꂩ��3����^000000�ォ��̋L�������c�c";
			next;
			mes "- �ނ͐h�����Ȋ�����Ă���B -";
			set GOD_2QUE_SUB1,3;
			close;
		}
		else {
			mes "[�W�����E�t�@�[�h�b�N]";
			mes "����H�@���ɉ��̗p���H";
			close;
		}
	}
	mes "[�W�����E�t�@�[�h�b�N]";
	mes "�悤�I";
	mes "�N�͕����⋋�̑�؂���";
	mes "�m���Ă��邩�H";
	next;
	if(select("������","�������I") == 2) {
		mes "[�W�����E�t�@�[�h�b�N]";
		mes "���A�����c�c";
		next;
		mes "[�W�����E�t�@�[�h�b�N]";
		mes "����A���������Œm����������";
		mes "�����Ă�邩�B";
		next;
		mes "[�W�����E�t�@�[�h�b�N]";
		mes "�u���b�N�X�~�X�̐����X�L����";
		mes "DEX��LUK�������قǐ�������";
		mes "�m���������Ȃ�c�c";
		mes "�A���P�~�X�g�̃t�@�[�}�V�[��";
		mes "DEX��LUK�AINT�������ق�";
		mes "��������m���������Ȃ邻�����B";
		next;
		mes "[�W�����E�t�@�[�h�b�N]";
		mes "���̓N���Z�C�_�[�����A";
		mes "�u���b�N�X�~�X�M���h��";
		mes "�ނ�̂��Ƃ������ƒm�낤��";
		mes "����΂��Ă���Ƃ��낾�B";
		close;
	}
	mes "[�W�����E�t�@�[�h�b�N]";
	mes "�����⋋���Ă̂͂��ȁA";
	mes "�F��ȕ������Օi��";
	mes "�R����e�����ɐv����";
	mes "�����Đ��m�ɓ͂��邱�Ƃ��B";
	next;
	mes "[�W�����E�t�@�[�h�b�N]";
	mes "�Ⴆ�΂��B�N�����ԒB�Ɨ���";
	mes "���鎞�ɁA�񕜂�S��������";
	mes "���Ȃ���Ԃŏo�������Ƃ���B";
	mes "����ŏ��𕉂����ꍇ�͖��";
	mes "�g���Ď��Â��邾�낤�H";
	next;
	mes "[�W�����E�t�@�[�h�b�N]";
	mes "�����A��x�Ɏ��Ă镨�Ȃ��";
	mes "���x�����邩��A�N�����X��";
	mes "�߂��ĕ�����⋋����K�v��";
	mes "���邾�낤�B";
	mes "�܂��A�S���Ŗ߂��Ă��������B";
	next;
	mes "[�W�����E�t�@�[�h�b�N]";
	mes "����Ȏ��Ɉ�Ԗ��ɗ��E�Ƃ�";
	mes "���l�n���B";
	mes "�J�[�g���Ă����֗��ȕ����g����";
	mes "�K�v�ȕ������ʂɖړI�n�܂�";
	mes "�͂�����\�͂�";
	next;
	mes "[�W�����E�t�@�[�h�b�N]";
	mes "�܂��ɏ��l�n�E�Ƃ���������";
	mes "�����ƌ����Ă��ߌ�����Ȃ��B";
	mes "�����N���Z�C�_�[�Ȃ̂ɂ�";
	mes "������炸�����ɋ�����";
	mes "��ł�����B";
	next;
	mes "[�W�����E�t�@�[�h�b�N]";
	mes "�N���Z�C�_�[�B������镨���A";
	mes "�����Z�Ȃǂ��A�����K�v��";
	mes "���Ă���Ƃ���֑������m��";
	mes "�͂��邽�߂ɉ�������񂾁B";
	mes "�ӂ��Ӂ`��B";
	next;
	mes "[�W�����E�t�@�[�h�b�N]";
	mes "�ǂ����A�N�ɂ��L�p�Ȓm�����������H";
	mes "���̓����ɉ񕜃X�L����";
	mes "�g���������Ȃ�������A";
	mes "���l�n�̐E�Ƃ�T���Ă݂�̂�";
	mes "�������B";
	next;
	mes "[�W�����E�t�@�[�h�b�N]";
	mes "�ނ�́A�]���ɕ���������";
	mes "�����Ă��邱�Ƃ����邩��ȁB";
	mes "�����A������񒚔J�ɐq�˂�";
	mes "���Ƃ�Y�ꂿ��Ȃ�񂼁B";
	next;
	mes "[�W�����E�t�@�[�h�b�N]";
	mes "���႟�܂��ȁB";
	mes "�I�[�f�B���̉��삠��񂱂Ƃ��B";
	close;
}

morocc_in.gat,146,179,0	script	�]�ƈ�	66,{
	if($GodSleipnir >= 50 && $GodMagingiorde < 100) {
		if(GOD_2QUE_SUB2 > 0 || GOD_2QUE >= 20) {
			mes "[���ُ]�ƈ�]";
			mes "���q�l�A���p�ł��傤���H";
			next;
			mes "[���ُ]�ƈ�]";
			mes "������͗��قł��B";
			mes "���ق̓����ł́APVP�h�A�}����ʂ���";
			mes "PVP�ɎQ�����邱�Ƃ��\�ł��B";
			next;
			mes "[���ُ]�ƈ�]";
			mes "��v�s�s�ɂ́A���ق�����";
			mes "PVP��������܂��B�����̋�����";
			mes "�m���߂�������A�����]���Ƃ���";
			mes "�y���݂������͎Q�����Ă݂���";
			mes "�������ł��傤���B";
			next;
			mes "- �����Ȃ������悤�Ȋ��";
			mes "�΂��Ă���B -";
			close;
		}
		else if(GOD_2QUE >= 18 && GOD_2QUE_SUB2 == 0) {
			mes "[���ُ]�ƈ�]";
			mes "���q�l�A���p�ł��傤���H";
			mes "- �ƕ����ޏ��̖ڂ�";
			mes "�^���̊፷���ɂ��ӂ�Ă���B -";
			next;
			mes "[���ُ]�ƈ�]";
			mes "�ǂ̂悤�Ȃ��p�ł��傤���H";
			next;
			input '@str$;
			if('@str$ == "�N�A�[�N�E�h�m��" || '@str$ == "�N�A�[�N" || '@str$ == "�h�m��") {
				mes "["+strcharinfo(0)+"]";
				mes " " +'@str$;
				mes "���������ł����H";
				if(GOD_2QUE == 18) {
					mes "[���ُ]�ƈ�]";
					mes "�ǂȂ��ł��傤���H";
					mes "���̊Ԃ܂œ����Ă����l��";
					mes "���Ƃł��傤���H";
					close;
				}
				else if(GOD_2QUE > 18) {
					next;
					mes "- ���Ȃ������������ƁA";
					mes "�ޏ��͎�����`���`����";
					mes "�m�F���Ȃ���߂��Ɋ���Ă��āA";
					mes "�Ⴂ���Řb���n�߂��B -";
					next;
					mes "[���ُ]�ƈ�]";
					mes "���O�͒N���B";
					mes "- ���ɂ͂Ђ���Ƃ���";
					mes "���G������B -";
					next;
					mes "[���낵�����ُ]�ƈ�]";
					mes "������Ȃ����Ƃ������";
					mes "�����̐S���������̖ڂ�";
					mes "�����ނ��ƂɂȂ邼�B";
					next;
					mes "[���낵�����ُ]�ƈ��l]";
					mes "���O�������̉\�𕷂���";
					mes "����ė����N�`���H";
					mes "����Ƃ��A�P�Ȃ�D��S��";
					mes "�����̂��H";
					mes "�ǂ�ȗ��R�ŗ����H";
					next;
					switch(select("���x�C���u���F�̏������C�ɂ��āc�c","�ނ��B��Ă��闝�R��m�肽����","�P���ȍD��S")) {
					case 1:
						if(rand(1,10) > 3) {
							mes "[���낵�����ُ]�ƈ��l]";
							mes "�͂��c�c";
							mes "���̘b�͂����O����قǕ������B";
							mes "���̖ꂳ��A�\������Ă���";
							mes "�悤�����c�c";
							mes "�l�����������Ă����܂ł��ǂ�";
							mes "���������͔̂F�߂邪�c�c";
							next;
							mes "[���낵�����ُ]�ƈ��l]";
							mes "�����ȁA���͂�����ۂ�����������";
							mes "������Ȃ��I";
							next;
							mes "- �ޏ��̓i�C�t�̗͂��ɂ߂�Ɠ�����";
							mes "���̌z�����̏�������������B-";
							close2;
							percentheal -100,0;
							end;
						}
						else {
							mes "[���낵�����ُ]�ƈ��l]";
							mes "�͂��c�c";
							mes "���̘b�͂����O����قǕ������B";
							mes "���̖ꂳ��A�\������Ă���";
							mes "�悤�����c�c";
							mes "�l�����������Ă����܂ł��ǂ�";
							mes "���������͔̂F�߂邪�c�c";
							next;
							mes "[���낵�����ُ]�ƈ��l]";
							mes "�����A�q���g���炢�͂���Ă������B";
							mes "�����A��x��������Ȃ�����ȁB";
							next;
							mes "- �ޏ��͒Ⴂ���ŁA���̎���";
							mes "�����₢���B-";
							mes "^0000FF�A���K���͐��B�p�i�����̂��Ă��Ȃ�^000000";
							set GOD_2QUE_SUB2,1;
							close;
						}
					case 2:
						if(rand(1,10) > 4) {
							mes "[���낵�����ُ]�ƈ��l]";
							mes "�c�c�����܂ŖK�˂Ă������Ă��Ƃ́A";
							mes "�������B��Ă��闝�R���킩����";
							mes "����񂾂낤�B";
							mes "�ł��ˁA��������ĖK�˂Ă������";
							mes "���f���I";
							next;
							mes "- �ޏ��̓i�C�t�̗͂��ɂ߂�Ɠ�����";
							mes "���̌z�����̏�������������B -";
							close2;
							percentheal -100,0;
							end;
						}
						else {
							mes "[���낵�����ُ]�ƈ��l]";
							mes "�c�c�����܂ŖK�˂Ă������Ă��Ƃ́A";
							mes "�������B��Ă��闝�R���킩����";
							mes "����񂾂낤�B";
							next;
							mes "[���낵�����ُ]�ƈ��l]";
							mes "�c�c�q���g���炢�͂���Ă������B";
							mes "�c�c�����l�Ԃ���Ȃ����������ȁB";
							next;
							mes "- �ޏ��͒Ⴂ���ŁA���̎���";
							mes "�����₢���B-";
							mes "^0000FF�A���K���͐��B�p�i�����̂��Ă��Ȃ�^000000";
							set GOD_2QUE_SUB2,1;
							close;
						}
					case 3:
						if(rand(1,10) > 3) {
							mes "[���낵�����ُ]�ƈ��l]";
							mes "�ӂ�A�P�Ȃ�D��S�ŌՂ̌��ɓ���";
							mes "�˂����ނȂ�ĂˁB";
							mes "�̂������Ă邩�A�ƂĂ��Ȃ��n�����B";
							next;
							mes "[���낵�����ُ]�ƈ��l]";
							mes "���̈�Ԍ����Ȑl�Ԃ���!!!!";
							next;
							mes "- �ޏ��̓i�C�t�̗͂��ɂ߂�Ɠ�����";
							mes "���̌z�����̏�������������B -";
							close2;
							percentheal -100,0;
							end;
						}
						else {
							mes "[���낵�����ُ]�ƈ��l]";
							mes "�ӂ�A�P�Ȃ�D��S�ŌՂ̌��ɓ���";
							mes "�˂����ނȂ�ĂˁB";
							mes "�̂������Ă邩�A�ƂĂ��Ȃ��n�����B";
							next;
							mes "[���낵�����ُ]�ƈ��l]";
							mes "�܂��A���������z�����܂ɂ͂������B";
							mes "1�񂵂�����Ȃ�����ȁB";
							next;
							mes "- �ޏ��͒Ⴂ���ŁA���̎���";
							mes "�����₢���B-";
							mes "^0000FF�A���K���͐��B�p�i�����̂��Ă��Ȃ�^000000";
							set GOD_2QUE_SUB2,1;
							close;
						}
					}
				}
			}
			else {
				mes "[���ُ]�ƈ�]";
				mes "�c�c�c�c�H";
				mes "���̂��b�ł��傤���H";
				close;
			}
		}
		else {
			mes "[���ُ]�ƈ�]";
			mes "���q�l�A���p�ł��傤���H";
			next;
			mes "[���ُ]�ƈ�]";
			mes "������͗��قł��B";
			mes "���ق̓����ł́APVP�h�A�}����ʂ���";
			mes "PVP�ɎQ�����邱�Ƃ��\�ł��B";
			next;
			mes "[���ُ]�ƈ�]";
			mes "��v�s�s�ɂ́A���ق�����";
			mes "PVP��������܂��B�����̋�����";
			mes "�m���߂�������A�����]���Ƃ���";
			mes "�y���݂������͎Q�����Ă݂���";
			mes "�������ł��傤���B";
			close;
		}
	}
	mes "[���ُ]�ƈ�]";
	mes "���q�l�A���p�ł��傤���H";
	next;
	mes "[���ُ]�ƈ�]";
	mes "������͗��قł��B";
	mes "���ق̓����ł́APVP�h�A�}����ʂ���";
	mes "PVP�ɎQ�����邱�Ƃ��\�ł��B";
	next;
	mes "[���ُ]�ƈ�]";
	mes "��v�s�s�ɂ́A���ق�����";
	mes "PVP��������܂��B�����̋�����";
	mes "�m���߂�������A�����]���Ƃ���";
	mes "�y���݂������͎Q�����Ă݂���";
	mes "�������ł��傤���B";
	next;
	mes "[���ُ]�ƈ�]";
	mes "���A�����Ă���͔閧�Ȃ̂ł����c�c";
	mes "�����̎�l���A�Ȃɂ��V�������Ƃ�";
	mes "�������菀�����炵���ł��B";
	next;
	mes "[���ُ]�ƈ�]";
	mes "�u������K��邨�q�l���₳�Ȃ�";
	mes "�v���W�F�N�g�v�Ƃ����Ƃ��c�c";
	next;
	mes "[���ُ]�ƈ�]";
	mes "�����ł����A����͔閧�ł���B";
	mes "��΂ł���[�B";
	close;
}

in_rogue.gat,243,61,0	script	�������j	748,{
	if($GodSleipnir >= 50 && $GodMagingiorde < 100) {
		if(GOD_2QUE == 18) {
			mes "[�N�A�[�N�E�h�m��]";
			mes "�ȁA���Ȃ񂾂��O�I";
			mes "�ǂ�����Ă����ɓ����ė���?!";
			mes "���A���A�������ɍs���I�s��������!!";
			mes "���A�������A������������������!!!!";
			close;
		}
		else if(GOD_2QUE_SUB2 == 4 || GOD_2QUE >= 20) {
			mes "[�N�A�[�N�E�h�m��]";
			mes "�����Ăˁc�c���̖�A";
			mes "^0000FF���̐l�ƕ�����^000000���P���J�����́B";
			mes "�l�͐Q���̔Ԃ���������A������";
			mes "�����Ă��́B";
			next;
			mes "[�N�A�[�N�E�h�m��]";
			mes "����Łc�c�v���o���Ȃ��́c�c";
			next;
			mes "[�N�A�[�N�E�h�m��]";
			mes "�����c�c�˂��A�����x��ł����H";
			close;
		}
		else if(GOD_2QUE > 18) {
			if(GOD_2QUE_SUB2 > 0 && GOD_2QUE_SUB2 < 4) {
				mes "[�N�A�[�N�E�h�m��]";
				mes "�ȁA���Ȃ񂾂��O�I";
				mes "�ǂ�����Ă����ɓ����ė���?!";
				mes "���A���A�������ɍs���I�s��������!!";
				mes "���A�������A������������������!!!!";
				next;
				mes "- ���Ȃ��͔ނ�Â߂悤�ƁA���ނ�";
				mes "�ǂݎn�߂��B-";
				next;
				if((countitem(740) > 0) || (countitem(741) > 0) || (countitem(742) > 0) || (countitem(743) > 0) || (countitem(750) > 0) || (countitem(751) > 0) || (countitem(752) > 0) || (countitem(753) > 0) || (countitem(754) > 0) || (countitem(7206) > 0) || (countitem(7212) > 0)) {
					mes "- ���Ȃ��͐l�`�����o����";
					mes "�l�`�������Ă݂��B -";
					next;
					mes "- �ނ͎q���̂悤�Ɏw�����킦�Ȃ���";
					mes "�R�N�R�N�Ǝ���ӂ�A���Ȃ��̌��t��";
					mes "�����Ă����B -";
				}
				else {
					mes "�C�� : ��3����^0000FF�Ō�̔C��^000000";
					mes "���̔C�����Ō�ɁA";
					mes "�ō����s�����ł���";
					mes "��3��������̂��邱�Ƃ�";
					mes "��w���ɂ�茈�肳�ꂽ�B";
					next;
					mes "�C���̓��e�́A�����Ɏc���ꂽ";
					mes "^0000FF�_��̎肪����^000000��";
					mes "���̖��Ŕ閧����";
					mes "�{������Ƃ������̂ł������B";
					next;
					mes "�Ƃ��낪�A��3�����̔C������";
					mes "���鎖�������������B";
					mes "�������̒��̈�l���A��������";
					mes "���ɑ΂���s�����q�ׁA";
					mes "^0000FF�������̖��߂𖳎����ēƒf�I�ȍs��^000000";
					mes "������B";
					next;
					mes "���ʓI�Ɍ��_�ɂȂ葈���������A";
					mes "�u�ƒf�I�ȍs�������������ҁv";
					mes "���������S�Ă̕������Ƃ�";
					mes "���c�̖�^0000FF���ߕs���]^000000�Ƃ���";
					mes "���_�ɗ����������B";
					next;
					mes "�Y����1���ɂ͐��ق��^�����A";
					mes "���𕉂��ē��@�����Ƃ�";
					mes "�񍐂�����B";
					next;
					mes "���̎����̌�A�_��̎肪����";
					mes "�ɑ΂���T���́u�����I�v�Ə̂����";
					mes "���x�̐��������߂����A����ɂ����";
					mes "��3�����̎w���\�͂��^����";
					mes "��3���������A��1��������";
					mes "�ӔC��ǋ��B";
					next;
					mes "��1�������͑�3��������";
					mes "�ʒk�̌�A�ӔC����邽�߂�";
					mes "��3�������U�����ӁB";
					mes "���̂܂ܑ�3�����͉��U�����B";
					next;
					mes "���U��A�������ȉ���������";
					mes "3�����ԌR�K����w�Z��";
					mes "������A���̏ꏊ�ɓ]�o������ꂽ�B";
					next;
					mes "���݁A��3�����̒T���C��";
					mes "�ɂ�錋�ʕ��́A������";
					mes "�������ł��郌�x�C���u��M����";
					mes "�����Ȍ���������Ă���Ƃ���";
					mes "�񍐂��t��������B";
					next;
					mes "���̌����́A���[���~�b�h�K�b�c������";
					mes "���ɂ��s���Ă���B�ȏ�B";
					next;
					mes "- �ނ͏��ނ̘b�𕷂����r�[�A";
					mes "�������悤�ɓ��������ނ���A";
					mes "�����ɂ��Ƌ��ё������B -";
					next;
					mes "- �ނ��Ȃ�Ƃ����Ē��߂Ȃ���";
					mes "�����Ȃ��悤���B -";
					next;
					mes "- �q���̂悤�ɂӂ�܂��Ă���̂�";
					mes "�q������т����Ȏ��ł�";
					mes "���Ă݂邩�B -";
					close;
				}
				next;
				mes "- �����ԗ����������悤���B";
				mes "���������₵�Ă݂邩�B -";
				next;
				switch(select("���ق̂��o�����m���Ă�H","�ŋ߂ǂ��H","��3�����̍Ō�̔C���ɂ��ċ�����")) {
				case 1:
					mes "[�N�A�[�N�E�h�m��]";
					mes "�����c�c����A�l�̂��o�����Ȃ́B";
					mes "���[�O�M���h�Ŋ��􂵂Ăāc�c";
					mes "�l����3�����ɂȂ������c�c";
					next;
					mes "[�N�A�[�N�E�h�m��]";
					mes "�c�c�c�c�c�c�c�c�c�c";
					next;
					mes "[�N�A�[�N�E�h�m��]";
					mes "�l�́A�c���Ƃ�����o�����Ȃ�������";
					mes "�Ƃ��牟���t�����Ă����񂾁B";
					mes "����������ɁA�N���Z�C�_�[�ɂȂ�āA";
					mes "���������������āc�c����ŁA";
					mes "��3�������ĂƂ���ɓ������́B";
					next;
					mes "[�N�A�[�N�E�h�m��]";
					mes "�ł��A�l������Ƃ��o����񂪓{��́B";
					mes "�l�ɂ͂��o����񂵂����Ȃ��̂ɁA";
					mes "���o����񂪓{��́B";
					next;
					mes "[�N�A�[�N�E�h�m��]";
					mes "�����āA���قœ����悤�ɂȂ����́B";
					mes "�����ł��Ȃ��o�J�����ē{��Ȃ�����A";
					mes "�������Ă��ꂽ�́B";
					next;
					mes "[�N�A�[�N�E�h�m��]";
					mes "���ꂩ��ˁA�l��K�˂Ă���l��";
					mes "�������́B�݂�Ȃ��Ėl�Ɏ��₷���";
					mes "���ǁA�l�A�����Ƃ��Ă��ɂ��́B";
					next;
					mes "[�N�A�[�N�E�h�m��]";
					mes "�l�A���̐l�B���Ȃ�̘b�������Ă��邩";
					mes "�킩��Ȃ��̂ɁA�����������邮��";
					mes "���ċꂵ���Ȃ����Ⴄ�́B";
					next;
					mes "[�N�A�[�N�E�h�m��]";
					mes "������A���o����񂪖l��������";
					mes "�B���Ă��ꂽ�́B�ł��ˁA�ދ��Ȃ񂾁B";
					mes "���ɂ���l�����A�������Ă���Ȃ����B";
					next;
					mes "[�N�A�[�N�E�h�m��]";
					mes "���o�����́A�����ɗ��Ėl�Ƙb���Ă�";
					mes "�{��񂾁B�l���������Ă邩�A";
					mes "�킩��Ȃ����Č����Ȃ���{��񂾁B";
					next;
					mes "[�N�A�[�N�E�h�m��]";
					mes "�l�A�����ƃL�I�N�\�E�V�c�Ȃ񂾂�ˁB";
					mes "�ł��A�����������B�l�����Ȃ�����B";
					next;
					mes "[�N�A�[�N�E�h�m��]";
					mes "���o����񂪗��Ă����΁A";
					mes "����ł����񂾁B";
					next;
					mes "[�N�A�[�N�E�h�m��]";
					mes "�l�̂��o�����̔߂��������";
					mes "���b�ł����B";
					if(GOD_2QUE_SUB2 == 2) {
						next;
						mes "[�N�A�[�N�E�h�m��]";
						mes "���ƂˁA���ƂˁB";
						mes "���o����񂪌�������_������";
						mes "���������Ƃ�����́c�c";
						next;
						mes "- �ނ͎��̎��ɒႢ���ł����₢�� -";
						next;
						mes "[�N�A�[�N�E�h�m��]";
						mes "���o����񂪂ˁc�c���[�O�M���h��";
						mes "�l�ɂ��������炾�߂��āB";
						mes "���̂ˁA�����Ă����l���݂�����";
						mes "�����Ă������āB";
						next;
						mes "[�N�A�[�N�E�h�m��]";
						mes "����܂ŁA���������S������B���";
						mes "�Ȃ������Č������́B���ł�";
						mes "��������悤�ɂ��Ȃ�������";
						mes "�������́B";
						set GOD_2QUE_SUB2,3;
					}
					close;
				case 2:
					mes "[�N�A�[�N�E�h�m��]";
					mes "�ŋ߁H";
					mes "���̂ˁA�l�������ς����邩��|���́B";
					next;
					mes "[�N�A�[�N�E�h�m��]";
					mes "���[�O�M���h������Ă���Ă�񂾂���";
					mes "�}�ɂǂ�������o�Ă����肵�ăr�b�N��";
					mes "����́B���o�����̘b���ƂˁA";
					mes "������Ėl�̏�i�̂����Ȃ񂾂��āB";
					next;
					mes "[�N�A�[�N�E�h�m��]";
					mes "�l�A�悭�킩��Ȃ��񂾂��ǁc�c";
					mes "���̏�i�ɖl�����������Ȃ�������";
					mes "���b���ɂ������񂾂��āB";
					next;
					mes "[�N�A�[�N�E�h�m��]";
					mes "�ł��A����Ă���Ȃ���������A";
					mes "���o����񂪃��[�O�M���h�ƈꏏ��";
					mes "�\���L�߂���Č����Ă��c�c";
					mes "���̏�i�̂���`��������ƁA";
					mes "�������Ƃ��N����񂾂�`���āc�c";
					next;
					mes "[�N�A�[�N�E�h�m��]";
					mes "����ȂƂ����ȁ`�B";
					if(GOD_2QUE_SUB2 == 1)
						set GOD_2QUE_SUB2,2;
					close;
				case 3:
					mes "[�N�A�[�N�E�h�m��]";
					mes "�킩��Ȃ��c�c�v���o���Ȃ��́c�c";
					if(GOD_2QUE_SUB2 == 3) {
						next;
						mes "[�N�A�[�N�E�h�m��]";
						mes "���A�ЂƂ����v���o�����B";
						mes "^0000FF���M���M�����h^000000�������́B";
						mes "�Ȃ񂩂̃J�P���݂����ɂ��傱����";
						mes "���������ǁA�l�ɂ͂��ꂪ";
						mes "���M���M�����h���Ă킩�����́B";
						next;
						if(rand(1,10) > 4) {
							set '@str$,"^FFFFFF���M���M�����h!!!!^000000";
						}
						switch(select("^FF0000���M���M�����h!!!!^000000",'@str$,"^FFFFFF�Â��ɕ���^000000")) {
						default:
							mes "[�N�A�[�N�E�h�m��]";
							mes "�q�C�C�C�C!!";
							mes "�����A������[!!!!!!";
							set GOD_2QUE_SUB2,0;
							close;
						case 3:
							mes "[�N�A�[�N�E�h�m��]";
							mes "�����Ăˁc�c���̖�A";
							mes "^0000FF���̐l�ƕ�����^000000���P���J�����́B";
							mes "�l�͐Q���̔Ԃ���������A������";
							mes "�����Ă��́B";
							next;
							mes "[�N�A�[�N�E�h�m��]";
							mes "����Łc�c�v���o���Ȃ��́c�c";
							set GOD_2QUE_SUB2,4;
							close;
						}
					}
					close;
				}
			}
		}
	}
	mes "[�N�A�[�N�E�h�m��]";
	mes "�ȁA���Ȃ񂾂��O�I";
	mes "�ǂ�����Ă����ɓ����ė���?!";
	mes "���A���A�������ɍs���I�s��������!!";
	mes "���A�������A������������������!!!!";
	close;
}

alberta.gat,196,146,0	script	�N���Z�C�_�[	751,{
	if($GodSleipnir >= 50 && $GodMagingiorde < 100) {
		if(GOD_2QUE == 18) {
			mes "[�W���b�N�E�I�[]";
			mes "�ӂ��������c�c�A���x���^�͍������ǂ�";
			mes "�V�C���ȁ`�B�d���������ǁA���Q������";
			mes "�Ȃ����Ⴄ��B�܂��ǂ����Ńm���r����";
			mes "�U���ł����Ă��悤���ȁ`�B";
			next;
			mes "[�W���b�N�E�I�[]";
			mes "����A�N�́H";
			next;
			switch(select("���x�C���u�ɂ��ĕ���","�ߋ��𕷂�","��3�����̍Ō�̔C���ɂ��ĕ���")) {
			case 1:
				mes "[�W���b�N�E�I�[]";
				mes "�����I�@�����������l�H";
				mes "���`�A�������ˁ`�B";
				mes "�������U������͉���ĂȂ���B";
				close;
			case 2:
				mes "[�W���b�N�E�I�[]";
				mes "��H�ŋ߂͕啺���Ă��B";
				mes "�R�͂����l�ޕs�������B";
				mes "�N���ǂ��H";
				close;
			case 3:
				mes "[�W���b�N�E�I�[]";
				mes "���`��c�c";
				mes "�ǂ��o���ĂȂ���`�B";
				close;
			}
		}
		else if(GOD_2QUE_SUB3 == 2 || GOD_2QUE >= 20) {
			mes "[�W���b�N�E�I�[]";
			mes "�ނ̐M�S�͐l��{���������񂾁B";
			mes "�ǂ��A^0000ff�����M�S���[���҂Ȃ�";
			mes "���̐��ɂ��Ȃ�^000000�݂����Ȃ��Ƃ�������";
			mes "���ɂȂ��Ă���B";
			next;
			mes "[�W���b�N�E�I�[]";
			mes "���������΁c�c";
			mes "�w�u�ƒf�I�ȍs�������������ҁv";
			mes "���������S�Ă̕������Ƃ�";
			mes "���c�̖�^0000FF���ߕs���]^000000�Ƃ���";
			mes "���_�ɗ����������x���Ă̂�";
			mes "�m���ɊԈႢ���B";
			next;
			mes "[�W���b�N�E�I�[]";
			mes "���A������ƃS�����B";
			mes "�΃n�[�u�A�΃n�[�u�c�c";
			mes "����H�@�ɂݎ~�߂Ȃ񂾁B";
			next;
			mes "- �ނ͗΃n�[�u�����o���ƁA";
			mes "�ނ���ނ���ƐH�ׂ��B -";
			mes "- ���ꂪ�ނ̒��ɍ܂炵���B -";
			close;
		}
		else if(GOD_2QUE > 18) {
			if(GOD_2QUE_SUB3 == 0 || GOD_2QUE_SUB3 == 1) {
				mes "[�W���b�N�E�I�[]";
				mes "�ӂ��������c�c�A���x���^�͍������ǂ�";
				mes "�V�C���ȁ`�B�d���������ǁA���Q������";
				mes "�Ȃ����Ⴄ��B�܂��ǂ����Ńm���r����";
				mes "�U���ł����Ă��悤���ȁ`�B";
				next;
				mes "[�W���b�N�E�I�[]";
				mes "����A�N�́H";
				next;
				switch(select("���x�C���u�ɂ��ĕ���","�ߋ��𕷂�","��3�����̍Ō�̔C���ɂ��ĕ���")) {
				case 1:
					if(GOD_2QUE_SUB3 == 1) {
						mes "[�W���b�N�E�I�[]";
						mes "�����B�����������H";
						mes "�ނ̐M�S�͐l��{���������񂾁B";
						mes "�ǂ��A^0000ff�����M�S���[���҂Ȃ�";
						mes "���̐��ɂ��Ȃ�^000000�݂����Ȃ��Ƃ�������";
						mes "���ɂȂ��Ă���B";
						next;
						mes "[�W���b�N�E�I�[]";
						mes "���������́A�M�S�͒N�ɂ�";
						mes "�����Ȃ����Ďv���Ă��B";
						mes "����������d�������Ă���ƁA�����";
						mes "���M�ł��Ȃ��Ƃ���Ă����Ȃ�������";
						mes "���낤�ˁB";
						next;
						mes "[�W���b�N�E�I�[]";
						mes "���������΁c�c";
						mes "�w�u�ƒf�I�ȍs�������������ҁv";
						mes "���������S�Ă̕������Ƃ�";
						mes "���c�̖�^0000FF���ߕs���]^000000�Ƃ���";
						mes "���_�ɗ����������x���Ă̂�";
						mes "�m���ɊԈႢ���B";
						next;
						mes "[�W���b�N�E�I�[]";
						mes "3���ڂɉ䓙�̑����E�����i����";
						mes "�����āc�c�c�c";
						mes "�N�ƌ����������񂾂������ȁH";
						next;
						mes "[�W���b�N�E�I�[]";
						mes "����ŁA���������̌���";
						mes "^0000FF���̏���������̓ƒf�Ō��߂�^000000�񂾁I";
						next;
						mes "[�W���b�N�E�I�[]";
						mes "���������Ă��z�c�c�炪�c�c";
						mes "�c�c����ς�v���o���Ȃ���B";
						next;
						mes "[�W���b�N�E�I�[]";
						mes "�R���ɒ�����������A�����ǂ���";
						mes "����������̂��ȁB";
						mes "�Ƃɂ����A���̌����������z������";
						mes "^0000FF��Ζ��ߕ��]^000000�ɔw�������Ă��Ƃ��ˁB";
						next;
						mes "[�W���b�N�E�I�[]";
						mes "���̌�́A�S�R�v���o���Ȃ��񂾁B";
						mes "�����ˁB";
						next;
						mes "[�W���b�N�E�I�[]";
						mes "�΃n�[�u���܂��⋋���Ȃ���B";
						mes "���̓��ɁA�Ȃ�Ƃ��Ȃ�Ȃ����ȁc�c";
						set GOD_2QUE_SUB3,2;
						close;
					}
					else {
						mes "[�W���b�N�E�I�[]";
						mes "�����I�@�����������l�H";
						mes "���`�A�������ˁ`�B";
						mes "�������U������͉���ĂȂ���B";
						close;
					}
				case 2:
					mes "[�W���b�N�E�I�[]";
					mes "��H�ŋ߂͕啺���Ă��B";
					mes "�R�͂����l�ޕs�������B";
					mes "�N���ǂ��H";
					close;
				case 3:
					mes "[�W���b�N�E�I�[]";
					mes "����Ȃ��ƕ����āA�ǂ����悤����";
					mes "�����́H";
					next;
					mes "- ���Ȃ��͏��ނɏ�����Ă���";
					mes "���e���������B -";
					next;
					mes "�C�� : ��3����^0000FF�Ō�̔C��^000000";
					mes "���̔C�����Ō�ɁA";
					mes "�ō����s�����ł���";
					mes "��3��������̂��邱�Ƃ�";
					mes "��w���ɂ�茈�肳�ꂽ�B";
					next;
					mes "�C���̓��e�́A�����Ɏc���ꂽ";
					mes "^0000FF�_��̎肪����^000000��";
					mes "���̖��Ŕ閧����";
					mes "�{������Ƃ������̂ł������B";
					next;
					mes "�Ƃ��낪�A��3�����̔C������";
					mes "���鎖�������������B";
					mes "�������̒��̈�l���A��������";
					mes "���ɑ΂���s�����q�ׁA";
					mes "^0000FF�������̖��߂𖳎����ēƒf�I�ȍs��^000000";
					mes "������B";
					next;
					mes "���ʓI�Ɍ��_�ɂȂ葈���������A";
					mes "�u�ƒf�I�ȍs�������������ҁv";
					mes "���������S�Ă̕������Ƃ�";
					mes "���c�̖�^0000FF���ߕs���]^000000�Ƃ���";
					mes "���_�ɗ����������B";
					next;
					mes "�Y����1���ɂ͐��ق��^�����A";
					mes "���𕉂��ē��@�����Ƃ�";
					mes "�񍐂�����B";
					next;
					mes "���̎����̌�A�_��̎肪����";
					mes "�ɑ΂���T���́u�����I�v�Ə̂����";
					mes "���x�̐��������߂����A����ɂ����";
					mes "��3�����̎w���\�͂��^����";
					mes "��3���������A��1��������";
					mes "�ӔC��ǋ��B";
					next;
					mes "��1�������͑�3��������";
					mes "�ʒk�̌�A�ӔC����邽�߂�";
					mes "��3�������U�����ӁB";
					mes "���̂܂ܑ�3�����͉��U�����B";
					next;
					mes "���U��A�������ȉ���������";
					mes "3�����ԌR�K����w�Z��";
					mes "������A���̏ꏊ�ɓ]�o������ꂽ�B";
					next;
					mes "���݁A��3�����̒T���C��";
					mes "�ɂ�錋�ʕ��́A������";
					mes "�������ł��郌�x�C���u��M����";
					mes "�����Ȍ���������Ă���Ƃ���";
					mes "�񍐂��t��������B";
					next;
					mes "���̌����́A���[���~�b�h�K�b�c������";
					mes "���ɂ��s���Ă���B�ȏ�B";
					next;
					mes "- ^0000FF�W���b�N�́A�����C�ɐH��Ȃ�";
					mes "�����Ȋ�����Ă���B^000000 -";
					next;
					mes "[�W���b�N�E�I�[]";
					mes "���`��A�̂̂��Ƃ�����ׂ����v��";
					mes "�o���Ȃ��ȁB�ł��A���̕��̒���";
					mes "�u�ƒf�I�ȍs�������������ҁv��";
					mes "^0000FF���ߕs���]^000000�̕���������";
					mes "�����Ђ�������񂾁c�c";
					if(GOD_2QUE_SUB3 == 0)
						set GOD_2QUE_SUB3,1;
					close;
				}
			}
		}
		else {
			mes "[�W���b�N�E�I�[]";
			mes "�����̌N�I";
			mes "�N���Z�C�_�[�ɂȂ��Ă݂Ȃ����H";
			close;
		}
	}
	if(Job == Job_Swordman) {
		mes "[�W���b�N�E�I�[]";
		mes "�����̌N�I";
		mes "�N���Z�C�_�[�ɂȂ��Ă݂Ȃ����H";
		next;
		mes "[�W���b�N�E�I�[]";
		mes "���T����b�����ǁA��{�͌R�s�����B";
		mes "�M�S�ƌ��̘r������΁A��������";
		mes "���i�ł����B";
		next;
		mes "[�W���b�N�E�I�[]";
		mes "�ǂ��H����Ă݂Ȃ������H";
		mes "���ł��҂��Ă��[�I";
		close;
	}
	mes "[�W���b�N�E�I�[]";
	mes "�ӂ��������c�c�A���x���^�͍������ǂ�";
	mes "�V�C���ȁ`�B�d���������ǁA���Q������";
	mes "�Ȃ����Ⴄ��B�܂��ǂ����Ńm���r����";
	mes "�U���ł����Ă��悤���ȁ`�B";
	next;
	mes "[�W���b�N�E�I�[]";
	mes "���A�����̐l�I";
	mes "�ǂ��A�]�E���Ă݂Ȃ��H";
	next;
	mes "[�W���b�N�E�I�[]";
	mes "���`���`�A�s����������B";
	next;
	mes "[�W���b�N�E�I�[]";
	mes "����H";
	mes "�N�A�����Ƃ����������Ă邯�ǁc�c";
	mes "�Ђ���Ƃ��ċ�������H";
	next;
	mes "[�W���b�N�E�I�[]";
	mes "�ق�A�q�����Ă��A�l�`�Ƃ��D������";
	mes "�������낤�B���̒m�l������������";
	mes "���񂾁B�����Ă݂���H";
	close;
}

aldebaran.gat,66,213,0	script	���삳��	69,{
	if(checkitemblank() == 0) {
		mes "- �����A�C�e���̎�ސ��� -";
		mes "- �������߁A�A�C�e�����󂯂Ƃ� -";
		mes "- ���Ƃ��ł��܂���B -";
		mes "- �����A�C�e�������炵�Ă��� -";
		mes "- �ēx�b�������Ă��������B -";
		close;
	}
	if(MaxWeight - Weight < 5000) {
		mes "- �����d�ʂ��������߁A�A�C�e���� -";
		mes "- �󂯂Ƃ邱�Ƃ��ł��܂���B -";
		mes "- �����A�C�e�������炵�Ă��� -";
		mes "- �ēx�b�������Ă��������B -";
		close;
	}
	if($GodSleipnir >= 50 && $GodMagingiorde < 100) {
		if(GOD_2QUE == 18) {
			mes "[�G�}�E�V�A�[�X]";
			mes "�͂��c�c��������������Ă�̂Ɂc�c";
			mes "�����Ԏ������Ȃ��c�c";
			mes "�J�v���E���ɂȂ�̂́A";
			mes "���܂���������c�c";
			close;
		}
		else if((GOD_2QUE > 18) && (GOD_2QUE < 26)) {
			if(GOD_2QUE_SUB4 < 2) {
				mes "[�G�}�E�V�A�[�X]";
				mes "�͂��c�c��������������Ă�̂Ɂc�c";
				mes "�����Ԏ������Ȃ��c�c";
				mes "�J�v���E���ɂȂ�̂́A";
				mes "���܂���������c�c";
				next;
				mes "[�G�}�E�V�A�[�X]";
				mes "���̘b�A�����Ă��������܂����H";
				mes "���܂�ɂ��ꂵ�����̂ł�����c�c";
				next;
				mes "[�G�}�E�V�A�[�X]";
				mes "���̖��O�̓G�}�E�V�A�[�X�B";
				mes "�J�v���E���u�]�ł��B";
				mes "�̂́A�N���Z�C�_�[������";
				mes "����܂����c�c";
				next;
				mes "[�G�}�E�V�A�[�X]";
				mes "���ɓ���A���̓���ڎw���܂������c�c";
				mes "^0000FF�����L���r����^000000�ɂ��A�ߋ��ؖ��s�\��";
				mes "�Ƃ������R�ŁA����Ȗڂɂ����Ȃ�āc";
				next;
				mes "[�G�}�E�V�A�[�X]";
				mes "�J�v���Ђ��A���݂̋��命����";
				mes "�T�[�r�X�Ƃł͂Ȃ��Ƃ����̂�";
				mes "�킩���Ă��܂��B����ł��c�c";
				mes "�o�C�g�ł������瓭�����������c�c�B";
				next;
				mes "[�G�}�E�V�A�[�X]";
				mes "�����L���r���ǂ��A����Ȃɏd�a";
				mes "�Ȃ̂ł������āH";
				mes "������ł́A�ڋq���X�g��Y���";
				mes "�\��������ƌ����āA������";
				mes "�󂯕t���Ă���܂���B";
				next;
				mes "[�G�}�E�V�A�[�X]";
				mes "���́A����̋L�����v���o���Ȃ�������";
				mes "���͑S�Ă����Ɗo���Ă܂��B";
				mes "�v���o���Ȃ��L���ł����A�v���o������";
				mes "����ƁA�������ɂɔY�܂���܂��B";
				next;
				mes "[�G�}�E�V�A�[�X]";
				mes "�͂��c�c";
				next;
				switch(select("�Ȃɂ��������́H","�ǂ����ăJ�v���E���ɂȂ肽���́H","�����L���r���H")) {
				case 1:
					if(countitem(7015) < 1) {
						mes "[�G�}�E�V�A�[�X]";
						mes "���X�ߋ��Ȃ�āc�c";
						mes "�ł��c�c�S�̒���";
						mes "^0000FF�ǉ��̂�����^000000��";
						mes "�������Ȃ�A�Y��Ă��܂��Ă���";
						mes "�厖�Ȃ��Ƃ��v���o����̂���";
						mes "����܂���ˁc�c";
						close;
					}
					mes "- �ޏ��͗����t�̍�����y��";
					mes "�z������ł���A�b���n�߂��B -";
					next;
					mes "[�G�}�E�V�A�[�X]";
					mes "���͔�r�I�T���ȉƒ�ɐ��܂�܂����B";
					mes "�c�������猕�p�A��n�A���y�Ȃǂ�";
					mes "������󂯂Ă܂���܂����B";
					next;
					mes "[�G�}�E�V�A�[�X]";
					mes "�����āA15�΂ɂȂ����N�c�c";
					mes "���̗��e�́A�������������߂܂����B";
					next;
					mes "[�G�}�E�V�A�[�X]";
					mes "�������A���͒N�Ƃ��m��Ȃ������";
					mes "��������̂ɒ�R������܂����B";
					mes "����́A�ƂĂ��ǂ��ƒ�̏o�g�ŁA";
					mes "�w�������Y������������������ł��B";
					next;
					mes "[�G�}�E�V�A�[�X]";
					mes "�c�c���̍�����A���̓J�v���E����";
					mes "�����悤�ɂȂ�܂����B";
					mes "�O�����X����̂悤�ȑf�G��";
					mes "�J�v���E���ɂȂ��āA�嗤�����̂�";
					mes "����������ł��B";
					next;
					mes "[�G�}�E�V�A�[�X]";
					mes "�������A���e�͎��̖��𗝉�����";
					mes "����܂���ł����B�T�[�r�X�Ƃ�";
					mes "�����邽�߂Ɉ�ĂĂ����̂ł͂Ȃ���";
					mes "�����A�����𑁂߂܂����B";
					next;
					mes "[�G�}�E�V�A�[�X]";
					mes "���ǁA�����ɔ��΂���`�ŉƂ���";
					mes "�o���̂ł��B���̎��ɃN���Z�C�_�[��";
					mes "��W���������āA���債���̂ł��B";
					mes "���ʂ͍��i�ł����B";
					next;
					mes "[�G�}�E�V�A�[�X]";
					mes "�����A�����̃N���Z�C�_�[�͒�������";
					mes "�������ƂŁA�ƂĂ��d�󂳂�܂����B";
					mes "�����A���ɂ͉Ƃ��瓦����ꏊ��";
					mes "�K�v�ŁA���ɕ������ŌP�����܂����B";
					next;
					mes "[�G�}�E�V�A�[�X]";
					mes "�����c�c���߂Ĕz�u���ꂽ���ŗǂ�";
					mes "�l�B�Ɖ������A�����ŗǂ����т�";
					mes "���߂���B���̓��A�r��F�߂��A";
					mes "�d��ȔC�����S����悤�ɂȂ�܂����B";
					next;
					mes "[�G�}�E�V�A�[�X]";
					mes "���e���A���������̐�ʂ���������";
					mes "�悤�ɂȂ�ƁA���ł��������ł��B";
					mes "�����������Ȃ��ƉƂ��яo��������";
					mes "�撣���Ă���Ƃ킩���Ċ�����������";
					mes "�ł��傤�B";
					next;
					mes "[�G�}�E�V�A�[�X]";
					mes "�������c�c�c�c";
					mes "���̓��ȗ��A���ׂĂ����܂����B";
					mes "�߂��߂��鎖���������炵���A";
					mes "�����v���o���Ȃ��̂ł��B";
					set GOD_2QUE_SUB4,1;
					close;
				case 2:
					mes "[�G�}�E�V�A�[�X]";
					mes "�O�����X������A�������猩�Ă���";
					mes "�������̂ł��c�c";
					mes "�d�������Ȃ���A���M�ɖ�������ŁA";
					mes "�ƂĂ��P���Č�������ł��B";
					next;
					mes "[�G�}�E�V�A�[�X]";
					mes "�������Ƃ���ς��Ǝv���̂ɁA";
					mes "�����z�Ƃ������̎p���c�c";
					next;
					mes "[�G�}�E�V�A�[�X]";
					mes "�j���̕����Q�����Ă��A��F��ς���";
					mes "�ዾ�𐳂��A�悭����ꂳ�ꂽ����";
					mes "�|���꓁���f����悤�ɁA������";
					mes "���ׂ����Ƃ����Ƃ���p���c�c";
					next;
					mes "[�G�}�E�V�A�[�X]";
					mes "���Ԃɑ΂��āA1�l�ŗE���ɗ���";
					mes "�������Ă���悤�Ɍ�������ł��B";
					mes "���̐��̒��́A�O�����X����̂��߂�";
					mes "���݂��Ă���悤�Ɏv���n�߂���ł��B";
					next;
					mes "[�G�}�E�V�A�[�X]";
					mes "����ɁA�O�����X����͐��E�e����";
					mes "�o�������Ă��d�����Ă��邻���Łc�c";
					mes "�l�ɂ����ς��͂܂�āc�c";
					mes "���������Ȃ肽��������ł��B";
					next;
					mes "[�G�}�E�V�A�[�X]";
					mes "�Ƃɂ����c�c���̓J�v���E����";
					mes "�Ȃ肽����ł��A��΁I";
					mes "�����A�Ȃ肽�������ƌ��������Ȃ����";
					mes "�Ȃ�Ȃ���������܂��񂪁c�c";
					close;
				case 3:
					if(countitem(511) > 0 && GOD_2QUE_SUB3 > 1) {
						mes "- ���������ƁA�ޏ��͓��������";
						mes "�ꂵ�����ɂ��Ă���B -";
						next;
						mes "- ���̓W���b�N�E�I�[�̍s����";
						mes "�v�������΃n�[�u��n�����B-";
						next;
						mes "- �G�}�͗΃n�[�u�̍������������";
						mes "�������ɂ����܂����炵���B-";
						next;
						mes "[�G�}�E�V�A�[�X]";
						mes "����́c�c";
						mes "�킩��܂���c�c";
						mes "�ǂ��܂ł��������L���Łc�c";
						mes "�����v���o���Ȃ��̂��c�c";
						next;
						mes "[�G�}�E�V�A�[�X]";
						mes "�����v���o����̂́A";
						mes "���̑����̖��O�����c�c";
						next;
						mes "[�G�}�E�V�A�[�X]";
						mes "^0000FF�W���b�N�E�I�[�A�i�C���{�[���A^000000";
						mes "^0000FF�W�����E�t�@�[�h�b�N�A^000000";
						mes "^0000FF�N�A�[�N�E�h�m���A�C�O�j�[��^000000�c�c";
						set GOD_2QUE_SUB4,2;
						close;
					}
					else {
						mes "- ���������ƁA�ޏ��͓��������";
						mes "�ꂵ�����ɂ��Ă���B -";
						next;
						mes "[�G�}�E�V�A�[�X]";
						mes "����́c�c";
						mes "�킩��܂���c�c";
						mes "�ǂ��܂ł��������L���Łc�c";
						mes "�����v���o���Ȃ��̂��c�c";
						close;
					}
				}
			}
			else if(GOD_2QUE_SUB4 > 1) {
				mes "[�G�}�E�V�A�[�X]";
				mes "^0000FF�W���b�N�E�I�[�A�i�C���{�[���A^000000";
				mes "^0000FF�W�����E�t�@�[�h�b�N�A^000000";
				mes "^0000FF�N�A�[�N�E�h�m���A�C�O�j�[��^000000�c�c";
				mes "���ƂȂ��ẮA�����������O�΂���c�c";
				close;
			}
		}
		else if(GOD_2QUE == 25) {
			mes "[�G�}�E�V�A�[�X]";
			mes "^0000FF�W���b�N�E�I�[�A�i�C���{�[���A^000000";
			mes "^0000FF�W�����E�t�@�[�h�b�N�A^000000";
			mes "^0000FF�N�A�[�N�E�h�m���A�C�O�j�[��^000000�c�c";
			mes "���ƂȂ��ẮA�����������O�΂���c�c";
			close;
		}
		else if((GOD_2QUE == 26) || (GOD_2QUE == 27)) {
			mes "[�G�}�E�V�A�[�X]";
			mes "�C�O�j�[���c�c";
			mes "�ƂĂ��߂����c�c�c";
			mes "�����v���o���Ȃ��c�c�c�c";
			next;
			mes "- �ޏ��̖j�Ɉ�ؗ܂����ꂽ�B -";
			next;
			mes "[�G�}�E�V�A�[�X]";
			mes "���m�Ɏv���o���܂��񂪁c�c";
			mes "^0000FF���̉ߋ��́A�ƂĂ���؂ȋL��^000000��";
			mes "�ꕔ�Ɋւ�錾�t�̂悤�ł��ˁc�c";
			next;
			mes "[�G�}�E�V�A�[�X]";
			mes "�킴�킴�m�点�Ă���āA";
			mes "���肪�Ƃ��������܂��B";
			mes "����͂ق�̋C�����ł��c�c";
			mes "���󂯎�肭�������c�c";
			set GOD_2QUE,28;
			getitem 603,1;
			if(checkre()) {
				if(BaseLevel < 56)
					getexp 2700,0;
				else if((BaseLevel > 55) && (BaseLevel < 61))
					getexp 3000,0;
				else if((BaseLevel > 60) && (BaseLevel < 66))
					getexp 5605,0;
				else if((BaseLevel > 65) && (BaseLevel < 71))
					getexp 8223,0;
				else if((BaseLevel > 70) && (BaseLevel < 76))
					getexp 21227,0;
				else if((BaseLevel > 75) && (BaseLevel < 81))
					getexp 39073,0;
				else if((BaseLevel > 80) && (BaseLevel < 86))
					getexp 45102,0;
				else if((BaseLevel > 85) && (BaseLevel < 91))
					getexp 54615,0;
				else if(BaseLevel > 90)
					getexp 122035,0;
			}
			else {
				if(BaseLevel < 56)
					getexp 27000,0;
				else if((BaseLevel > 55) && (BaseLevel < 61))
					getexp 30000,0;
				else if((BaseLevel > 60) && (BaseLevel < 66))
					getexp 56052,0;
				else if((BaseLevel > 65) && (BaseLevel < 71))
					getexp 82233,0;
				else if((BaseLevel > 70) && (BaseLevel < 76))
					getexp 212271,0;
				else if((BaseLevel > 75) && (BaseLevel < 81))
					getexp 390738,0;
				else if((BaseLevel > 80) && (BaseLevel < 86))
					getexp 451020,0;
				else if((BaseLevel > 85) && (BaseLevel < 91))
					getexp 546156,0;
				else if(BaseLevel > 90)
					getexp 1220358,0;
			}
			close;
		}
		else if(GOD_2QUE == 28) {
			mes "[�G�}�E�V�A�[�X]";
			mes "�C�O�j�[���c�c";
			mes "�ƂĂ��߂����c�c�c";
			mes "�����v���o���Ȃ��c�c�c�c";
			next;
			mes "- �ޏ��̖j�Ɉ�ؗ܂����ꂽ�B -";
			close;
		}
		else {
			mes "[�G�}�E�V�A�[�X]";
			mes "�͂��c�c��������������Ă�̂Ɂc�c";
			mes "�����Ԏ������Ȃ��c�c";
			mes "�J�v���E���ɂȂ�̂́A";
			mes "���܂���������c�c";
			close;
		}
	}
	mes "[�G�}�E�V�A�[�X]";
	mes "�O�����X����͐��E�e����";
	mes "�o�������Ă��d�����Ă��邻���Łc�c";
	mes "�l�ɂ����ς��͂܂�āc�c";
	mes "���������Ȃ肽��������ł��B";
	next;
	mes "[�G�}�E�V�A�[�X]";
	mes "�͂��c�c��������������Ă�̂Ɂc�c";
	mes "�����Ԏ������Ȃ��c�c";
	mes "�J�v���E���ɂȂ�̂́A";
	mes "���܂���������c�c";
	close;
}

cmd_in02.gat,190,94,3	script	�N	828,{
	if($GodSleipnir >= 50 && $GodMagingiorde < 100) {
		if(GOD_2QUE == 18) {
			mes "[���C�����~�X�g]";
			mes "�Ȃ񂾁A�Ă߂��́H";
			mes "�p���Ȃ��̂ɘb��������񂶂�˂��I";
			mes "���x�͂ǂ��ɓq�������c�c";
			mes "���`�A�Y�ނȂ��A���炟�I";
			next;
			switch(select("���x�C���u���Ēm���Ă�H","��3�����ɂ��ĕ�������","�q�����D���Ȃ́H","��́H")) {
			case 1:
				mes "[���C�����~�X�g]";
				mes "�Ȃ񂾁A�Ă߂��I";
				mes "���̖�Y�̎�悩��?!";
				mes "�A���ē`���₪��I";
				mes "�����N���񂱂��񂶂�˂����ĂȁI";
				close;
			case 2:
				mes "[���C�����~�X�g]";
				mes "�����H�@��3�����H";
				mes "�����ł��ꏏ���������ԂȂ�";
				mes "�o���Ă邺�B";
				next;
				mes "[���C�����~�X�g]";
				mes "�W�����E�t�@�[�h�b�N�A";
				mes "�N�A�[�N�E�h�m���A�W���b�N�E�I�[�A";
				mes "�G�}�E�V�A�[�X�A���C�����~�X�g�ɁA";
				mes "�i�C���{�[���I";
				mes "������A���ǂ����Ă����ȁc�c";
				close;
			case 3:
				mes "[���C�����~�X�g]";
				mes "�����A�q���I";
				mes "�q�������䂪���I";
				mes "�ꈬ��̋����A�����ɏ�����^�����B";
				mes "�N�N�N�c�c�c�c";
				close;
			case 4:
				mes "[���C�����~�X�g]";
				mes "�����A����H";
				mes "�������ނ��Ƃ�!!";
				mes "�O�A�b�n�b�n�b�n�b�n�I";
				close;
			}
		}
		else if((GOD_2QUE > 18) && (GOD_2QUE < 21)) {
			if(GOD_2QUE_SUB6 == 0 && GOD_2QUE_SUB5 > 4 && GOD_2QUE_SUB4 > 1 && GOD_2QUE_SUB3 > 1 && GOD_2QUE_SUB2 > 3 && GOD_2QUE_SUB1 > 2) {
				mes "[���C�����~�X�g]";
				mes "�Ȃ񂾁A�Ă߂��́H";
				mes "�p���Ȃ��̂ɘb��������񂶂�˂��I";
				mes "���x�͂ǂ��ɓq�������c�c";
				mes "���`�A�Y�ނȂ��A���炟�I";
			}
			else if(GOD_2QUE_SUB6 > 0) {
				mes "[���C�����~�X�g]";
				mes "�Ȃ񂾁A�Ă߂��́H";
			}
			else {
				mes "[���C�����~�X�g]";
				mes "�Ȃ񂾁A�Ă߂��́H";
				mes "�p���Ȃ��̂ɘb��������񂶂�˂��I";
				mes "���x�͂ǂ��ɓq�������c�c";
				mes "���`�A�Y�ނȂ��A���炟�I";
				close;
			}
			next;
			if(GOD_2QUE_SUB6 < 16) {
				switch(select("���x�C���u���Ēm���Ă�H","��3�����ɂ��ĕ�������","�q�����D���Ȃ́H","��́H")) {
				case 1:
					if(GOD_2QUE_SUB6 == 0) {
						mes "[���C�����~�X�g]";
						mes "�Ȃ񂾁A�Ă߂��I";
						mes "���̖�Y�̎�悩��?!";
						mes "�A���ē`���₪��I";
						mes "�����N���񂱂��񂶂�˂����ĂȁI";
						set GOD_2QUE_SUB6,1;
						close;
					}
					else if((GOD_2QUE_SUB6 > 0) && (GOD_2QUE_SUB6 < 15)) {
						mes "[���C�����~�X�g]";
						mes "���邹���A���邹���A���邹��!!";
						mes "���������ɂ��₪��!!";
						mes "���͂���Ȗ�Y�ƁA�����ւ�肽��";
						mes "�˂���!!!!�@�Ƃ��ƂƋA��!!!!";
						close;
					}
					else if(GOD_2QUE_SUB6 > 14) {
						mes "[���C�����~�X�g]";
						mes "���̌ÒK�߁c�c";
						mes "�����p�V����Y�A^0000FF���̌�����p^000000�A";
						mes "�ǂꂾ���o�Ă�񂾁H";
						mes "�P�b�c�c";
						close;
					}
				case 2:
					if(GOD_2QUE_SUB6 < 15) {
						mes "[���C�����~�X�g]";
						mes "�����H�@��3�����H";
						mes "�����ł��ꏏ���������ԂȂ�";
						mes "�o���Ă邺�B";
						next;
						mes "[���C�����~�X�g]";
						mes "�W�����E�t�@�[�h�b�N�A";
						mes "�N�A�[�N�E�h�m���A�W���b�N�E�I�[�A";
						mes "�G�}�E�V�A�[�X�A���C�����~�X�g�ɁA";
						mes "�i�C���{�[���I";
						mes "������A���ǂ����Ă����ȁc�c";
						close;
					}
					else if(GOD_2QUE_SUB6 > 14) {
						mes "[���C�����~�X�g]";
						mes "�C�O�j�[���H";
						mes "�N���A�����H";
						mes "�N���Z�C�_�[�H";
						mes "�c�c�N�b�N�b�N�A��k����˂��B";
						close;
					}
				case 3:
					if(GOD_2QUE_SUB6 < 15) {
						mes "[���C�����~�X�g]";
						mes "�����A�q���I";
						mes "�q�������䂪���I";
						mes "�ꈬ��̋����A�����ɏ�����^�����B";
						mes "�N�N�N�c�c�c�c";
						close;
					}
					else if(GOD_2QUE_SUB6 > 14) {
						mes "[���C�����~�X�g]";
						mes "�N�b�N�b�N�b�N�c�c";
						mes "�l���ō��̓q���ɐ���������Y�́c�c";
						mes "�����Ȃ������c�c�N�b�N�b�N�c�c";
						next;
						mes "[���C�����~�X�g]";
						mes "�������܂܎��񂾂�c�c";
						mes "^0000FF�j�u���w�C��^000000��1�l����������˂����H";
						mes "����Ƃ����@���n�����ȁc�c";
						mes "�N�b�N�b�N�c�c";
						mes "^0000FF������^000000��������A���肦��b���c�c";
						mes "�N�b�N�b�N�b�N�c�c";
						set GOD_2QUE,20;
						set GOD_2QUE_SUB1,0;
						set GOD_2QUE_SUB2,0;
						set GOD_2QUE_SUB3,0;
						set GOD_2QUE_SUB4,0;
						set GOD_2QUE_SUB5,0;
						set GOD_2QUE_SUB6,0;
						close;
					}
				case 4:
					if(GOD_2QUE_SUB6 == 0) {
						mes "[���C�����~�X�g]";
						mes "�����A����H";
						mes "�������ނ��Ƃ�!!";
						mes "�O�A�b�n�b�n�b�n�b�n�I";
						close;
					}
					else if((GOD_2QUE_SUB6 > 0) && (GOD_2QUE_SUB6 < 15)) {
						if(countitem(970) < 1) {
							mes "[���C�����~�X�g]";
							mes "��H�@���̍D�݁H";
							mes "���߂�Ⴀ�Ȃ�ł�!!!!";
							close;
						}
						mes "[���C�����~�X�g]";
						mes "�����I�@�������Ă񂶂�˂����I";
						mes "�͂₭�I�@������񂱂�!!";
						next;
						mes "- �ނ͂����炪����������O��";
						mes "�A���R�[���������";
						mes "����ł��܂����B -";
						delitem 970,1;
						set GOD_2QUE_SUB6,GOD_2QUE_SUB6 + 2;
						close;
					}
					else if(GOD_2QUE_SUB6 > 14) {
						mes "[���C�����~�X�g]";
						mes "�q�b�N�c�c";
						mes "���`�A�����C�������`�A�q�b�N�I";
						mes "�����A���O����t�ǂ����H";
						close;
					}
				}
			}
		}
		else {
			mes "[���C�����~�X�g]";
			mes "�N�b�N�b�N�b�N�b�N�c�c";
			mes "���x�����c�c";
			close;
		}
	}
	mes "[���C�����~�X�g]";
	mes "�Ȃ񂾁A�Ă߂��́H";
	mes "�p���Ȃ��̂ɘb��������񂶂�˂��I";
	mes "���x�͂ǂ��ɓq�������c�c";
	mes "���`�A�Y�ނȂ��A���炟�I";
	close;
}

jawaii_in.gat,44,110,0	script	�����S��	734,{
	if($GodSleipnir >= 50 && $GodMagingiorde < 100) {
		if(GOD_2QUE > 18) {
			if(GOD_2QUE_SUB5 == 5 || GOD_2QUE >= 20) {
				mes "- �ނ͒ɁX�������炢���邢���";
				mes "�������t���J��Ԃ��Ă���B -";
				mes "- ���̐l����b�𕷂��̂�";
				mes "�����������c�c�B -";
				close;
			}
			else if(GOD_2QUE_SUB5 < 5) {
				mes "[�i�C���{�[��]";
				mes "�ō��̋x�{���I�@�W�����C�ւ悤�����I";
				mes "���́A�����̎����S���҂�";
				mes "�i�C���{�[���Ɛ\���܂��I";
				mes "�ŋ߁A���������������Ă���Ƃ�";
				mes "�񍐂�����܂����A�Ȃɂ�����܂�����";
				mes "���񎄂ɂ������I";
				set GOD_2QUE_SUB5,GOD_2QUE_SUB5 + 1;
				close;
			}
		}
	}
	mes "[�i�C���{�[��]";
	mes "�ō��̋x�{���I�@�W�����C�ւ悤�����I";
	mes "���́A�����̎����S���҂�";
	mes "�i�C���{�[���Ɛ\���܂��I";
	mes "�ŋ߁A���������������Ă���Ƃ�";
	mes "�񍐂�����܂����A�Ȃɂ�����܂�����";
	mes "���񎄂ɂ������I";
	close;
}

niflheim.gat,109,254,7	script	�C�O�j�[��	796,{
	if($GodSleipnir >= 50 && $GodMagingiorde < 100) {
		if((GOD_2QUE > 19) && (GOD_2QUE < 25)) {
			if(GOD_2QUE > 22) {
				mes "[�C�O�j�[��]";
				mes "�܂��������c�c";
				mes "����Ȋ������ցc�c";
			}
			else {
				mes "[�C�O�j�[��]";
				mes "�c�c�c�c�c�c�c�c";
				mes "�؂�ʂ��҂��K�v�Ȃ̂��낤�H";
				next;
				mes "- �S�Ă��C�O�j�[���ɘb�����B -";
				mes "- �^��_��m�肽�����Ƃ�";
				mes "�܂߂āB -";
			}
			next;
			if(select("�^�����m�肽��","�����m�肽��") == 2) {
				mes "[�C�O�j�[��]";
				mes "�c�c�ޏ��c�c�G�}�E�V�A�[�X�c�c";
				next;
				mes "- ���̂ł���ނ̓�̖ڂ���c�c";
				mes "��؂̗܂��c�c -";
				mes "- �������g�Ɩڂł��A";
				mes "�܂͑��݂���̂��c�c -";
				next;
				mes "[�C�O�j�[��]";
				mes "�����A�b���Ă��������c�c�H";
				mes "���O�ɘb�������ƂŁc�c";
				mes "���̉����������a�炮�����c�c";
				next;
				mes "[�C�O�j�[��]";
				mes "�c�c�c�c�c�c�c";
				mes "�c�c�ޏ��A�G�}�E�V�A�[�X��";
				mes "�Ăю����̖���ǂ��n�߂���";
				mes "�����Ă���Ă��肪�Ƃ��B";
				next;
				mes "[�C�O�j�[��]";
				mes "���́A�����Ԃ�ƑO����ޏ���";
				mes "�������猩����Ă����c�c";
				mes "�����A�ޏ������߂Č���������c�c";
				next;
				mes "[�C�O�j�[��]";
				mes "�E�C���o���āA������s�����c�c";
				mes "�Ƃ�ʂ��ăv���|�[�Y�������Ƃ������B";
				mes "���̉Ƃ͈ʂ����Y������������A";
				mes "����������i�ɂȂ��Ă��܂����c�c";
				next;
				mes "[�C�O�j�[��]";
				mes "�����A�v�Z�Ⴂ���������B";
				mes "�ޏ��͌�����������A�N���Z�C�_�[��";
				mes "�Ȃ��Ă��܂����c�c";
				mes "���͗������񂾁c�c";
				next;
				mes "[�C�O�j�[��]";
				mes "����ł��A���͍Ō�̗E�C��U��i��A";
				mes "�ޏ������̊��m��Ȃ��̂��t���";
				mes "�������N���Z�C�_�[�ɂȂ����c�c";
				next;
				mes "[�C�O�j�[��]";
				mes "�������A�ޏ��͂������̂��Ƃ�";
				mes "�o���Ă��Ȃ��c�c";
				mes "�ł��A�ޏ��̏������킩���Ċ������c�c";
				next;
				mes "[�C�O�j�[��]";
				mes "�c�c�c�c�c�c";
				next;
				mes "[�C�O�j�[��]";
				mes "�N���Z�C�_�[�{���Ɂc�c�S�Ă̓䂪";
				mes "�\���������A�������邩��";
				mes "����Ȃ��c�c";
				mes "���O�́A������邱�ƂȂ��悤�A";
				mes "�����Ŏ����̓���i�ނ������c�c";
				close;
			}
			mes "[�C�O�j�[��]";
			mes "�������c�c�c�c�c�c";
			mes "�݂�Ȃ��v���o���Ȃ����Ƃɂ���";
			mes "�����Ă��c�c�c�c";
			next;
			mes "[�C�O�j�[��]";
			mes "�N���m�肽���̂́A����8���낤�H";
			next;
			mes "[�C�O�j�[��]";
			mes "1. �{���ɏo�āA3���ڂɔ�������";
			mes "   ^0000FF�����̔j��^000000�ɂ���";
			mes "2. ^0000FF���M���M�����h�炵������";
			mes "   ^000000�ɂ���";
			mes "3. ���̔ӁA^0000FF�����Ƒ������l^000000�ɂ���";
			mes "4. ���������߂�^0000FF�����̓ƒf^000000�ɂ���";
			next;
			mes "[�C�O�j�[��]";
			mes "5.^0000FF �����M�S���[���҂Ȃ�";
			mes "�@�@���̐��ɂ��Ȃ�^000000�Ƃ������t�̈Ӗ�";
			mes "6. ���ނɂȂ������̖��O�A";
			mes "�@�@^0000FF�C�O�j�[��^000000�ɂ���";
			next;
			mes "[�C�O�j�[��]";
			mes "7. �݂�Ȃɋ��ʂ��Ă���";
			mes "�@�@^0000FF�����L���r���ǂƓ���^000000���ۂɂ���";
			mes "8. �ǂ����ċL�^�ɂ͔C�����ʂ�";
			mes "�@^0000FF�u�����I�v^000000�����Ə�����Ă��邩";
			next;
			mes "[�C�O�j�[��]";
			mes "�c�c�c�c�c�c";
			next;
			mes "[�C�O�j�[��]";
			mes "�ǂ����A�����������C�����邩�H";
			mes "���ޓ��e�Ɣ�ׂĂ݂�c�c";
			next;
			mes "- ������x���ނ̓��e��";
			mes "�v�������ׂ� -";
			next;
			mes "�C�� : ��3����^0000FF�Ō�̔C��^000000";
			mes "���̔C�����Ō�ɁA";
			mes "�ō����s�����ł���";
			mes "��3��������̂��邱�Ƃ�";
			mes "��w���ɂ�茈�肳�ꂽ�B";
			next;
			mes "�C���̓��e�́A�����Ɏc���ꂽ";
			mes "^0000FF�_��̎肪����^000000��";
			mes "���̖��Ŕ閧����";
			mes "�{������Ƃ������̂ł������B";
			next;
			mes "�Ƃ��낪�A��3�����̔C������";
			mes "���鎖�������������B";
			mes "�������̒��̈�l���A��������";
			mes "���ɑ΂���s�����q�ׁA";
			mes "^0000FF�������̖��߂𖳎����ēƒf�I�ȍs��^000000";
			mes "������B";
			next;
			mes "���ʓI�Ɍ��_�ɂȂ葈���������A";
			mes "�u�ƒf�I�ȍs�������������ҁv";
			mes "���������S�Ă̕������Ƃ�";
			mes "���c�̖�^0000FF���ߕs���]^000000�Ƃ���";
			mes "���_�ɗ����������B";
			next;
			mes "�Y����1���ɂ͐��ق��^�����A";
			mes "���𕉂��ē��@�����Ƃ�";
			mes "�񍐂�����B";
			next;
			mes "���̎����̌�A�_��̎肪����";
			mes "�ɑ΂���T���́u�����I�v�Ə̂����";
			mes "���x�̐��������߂����A����ɂ����";
			mes "��3�����̎w���\�͂��^����";
			mes "��3���������A��1��������";
			mes "�ӔC��ǋ��B";
			next;
			mes "��1�������͑�3��������";
			mes "�ʒk�̌�A�ӔC����邽�߂�";
			mes "��3�������U�����ӁB";
			mes "���̂܂ܑ�3�����͉��U�����B";
			next;
			mes "���U��A�������ȉ���������";
			mes "3�����ԌR�K����w�Z��";
			mes "������A���̏ꏊ�ɓ]�o������ꂽ�B";
			next;
			mes "���݁A��3�����̒T���C��";
			mes "�ɂ�錋�ʕ��́A������";
			mes "�������ł��郌�x�C���u��M����";
			mes "�����Ȍ���������Ă���Ƃ���";
			mes "�񍐂��t��������B";
			next;
			mes "���̌����́A���[���~�b�h�K�b�c������";
			mes "���ɂ��s���Ă���B�ȏ�B";
			next;
			mes "[�C�O�j�[��]";
			mes "���̏��ނɂ͐^���ƋU�肪";
			mes "�������Ă���B";
			mes "1�A2�A3�A4�A6�̋^��͕������،�";
			mes "���Ă��邩��A�^���Ƃ݂Ė��Ȃ��B";
			mes "������8�Ԃ́u�����I�v�Ƃ����̂�";
			mes "�R�ł͂Ȃ��B";
			next;
			mes "[�C�O�j�[��]";
			mes "1. 3���ڂɔ�������^0000FF�����̔j��^000000";
			mes "2. ^0000FF���M���M�����h�炵������^000000";
			mes "3. ^0000FF�����Ƒ������l^000000";
			mes "4. ���������߂�^0000FF�����̓ƒf^000000";
			mes "6. ���ނɂȂ������A^0000FF�C�O�j�[��^000000";
			next;
			mes "[�C�O�j�[��]";
			mes "8�Ԃ��^���Ƃ�������ŁA�Y��������";
			mes "���ނƏƂ炵���킹�Ă݂悤�B";
			next;
			mes "[�C�O�j�[��]";
			mes "�C���̓��e�́A�����Ɏc���ꂽ";
			mes "^0000FF�_��̎肪����^000000��";
			mes "���̖��Ŕ閧���ɑ{������Ƃ�������";
			mes "�ł������B�{���ɏo�Ă���3���ځA";
			mes "^0000FF���M���M�����h�̔j��^000000�𔭌��B";
			next;
			mes "[�C�O�j�[��]";
			mes "���������̖�A^0000FF�C�O�j�[����������^000000";
			mes "��퐋�s�ɑ΂���s����\���o�āA";
			mes "���������ƂȂ�B";
			mes "���ʁA^0000FF�����̓ƒf^000000�ɂ��A";
			mes "^0000FF����^000000��������B";
			next;
			mes "[�C�O�j�[��]";
			mes "�����ƕ񍐂��ꂽ���قɂ��A";
			mes "^0000FF�C�O�j�[���͕��������@^000000������";
			mes "����Ă���B";
			mes "^0000FF���M���M�����h�̔j��^000000�𔭌������ɂ�";
			mes "������炸�A�{���̌��ʂ�";
			mes "^0000FF�����I^000000�ƕ񍐁B";
			next;
			mes "[�C�O�j�[��]";
			mes "�Ȍ�A��3������^0000FF���ʂ������";
			mes "^0000FF�Ȃ���������^000000�ɉ��U�B";
			mes "���U��A�������ȉ��̑�����";
			mes "3�����ԌR�K����w�Z��";
			mes "������A���̏ꏊ�ɓ]�o������ꂽ�B";
			next;
			mes "[�C�O�j�[��]";
			mes "�ȍ~�A^0000FF�C�O�j�[���̋L�^�͖���^000000�����B";
			mes "���݁A��3�����̒T���C���ɂ��";
			mes "���ʕ��́A�����̕������ł���";
			mes "���x�C���u��M���ɁA�����Ȍ�����";
			mes "����Ă���B";
			next;
			mes "[�C�O�j�[��]";
			mes "���̌����́A���[���~�b�h�K�b�c������";
			mes "���ɂ��s���Ă���B�ȏ�B";
			next;
			mes "[�C�O�j�[��]";
			mes "�������ȕ������킩�������H";
			mes "���͂��A�ǂ����Ď��񂾂̂��c�c";
			next;
			mes "[�C�O�j�[��]";
			mes "���񂾂̂́A���@�̂��ߌ����";
			mes "�^�΂�Ă���Œ��������c�c";
			mes "���̎��_�Ŋ��ɁA���x�C���u�͓���";
			mes "�n�߂ċ����̂��낤�c�c";
			next;
			mes "[�C�O�j�[��]";
			mes "�����ɁA�����5��7�̋^���";
			mes "�t�������Ă݂悤�B";
			mes "���x�C���u�ɉ�����Ȃ�킩���";
			mes "�v�����A�ނ̐M�S�͕��݂���Ȃ��B";
			next;
			mes "[�C�O�j�[��]";
			mes "5.^0000FF �����M�S���[���҂Ȃ�";
			mes "�@�@���̐��ɂ��Ȃ�^000000�Ƃ������t�̈Ӗ�";
			mes "���M���M�����h�͐_�̂��́c�c";
			mes "���x�C���u�́A�����ȊO�̂��̂�";
			mes "�_�ɋߕt���̂����e���Ȃ������̂��B";
			next;
			mes "[�C�O�j�[��]";
			mes "���ꂪ�v�����e�������ł����Ă��B";
			next;
			mes "[�C�O�j�[��]";
			mes "�܂�c�c���M���M�����h��";
			mes "���L���邱�ƂŁA�_�ɋ߂Â����";
			mes "�v�����񂾂낤�B";
			next;
			mes "[�C�O�j�[��]";
			mes "���M���M�����h��؂�A�啔����������";
			mes "���ɓ���A�Ɉꕔ�𔭌�������";
			mes "�񍐂��悤�Ƃ��Ă����Ƃ�������R";
			mes "���Ă��܂��A�������悤�Ǝv�����c�c";
			next;
			mes "[�C�O�j�[��]";
			mes "7. �݂�Ȃɋ��ʂ��Ă���";
			mes "�@�@^0000FF�����L���r���ǂƓ���^000000���ۂɂ���";
			mes "�����I�ɁA3�����Ԃ̌R�K�����";
			mes "�������������Ɛ������邵���Ȃ��B";
			next;
			mes "[�C�O�j�[��]";
			mes "���ꂪ�����͎��ɂ��킩��Ȃ��c�c";
			mes "�S���̋L�������̂悤�ȏ�Ԃɂ���";
			mes "���܂��ƂȂ�Ɓc�c���Ȃ�";
			mes "��l���I�ȕ��@�ł͂Ȃ����낤���B";
			next;
			mes "[�C�O�j�[��]";
			mes "������x�������Ă݂邩�B";
			next;
			mes "[�C�O�j�[��]";
			mes "�C���̓��e�́A�����Ɏc���ꂽ";
			mes "^0000FF�_��̎肪����^000000��";
			mes "���̖��Ŕ閧���ɑ{������Ƃ�������";
			mes "�ł������B�{���ɏo�Ă���3���ځA";
			mes "^0000FF���M���M�����h�̔j��^000000�𔭌��B";
			next;
			mes "[�C�O�j�[��]";
			mes "���������̖�A^0000FF�C�O�j�[����������^000000";
			mes "��퐋�s�ɑ΂���s����\���o�āA";
			mes "���������ƂȂ�B";
			mes "���ʁA^0000FF�����̓ƒf^000000�ɂ��A";
			mes "^0000FF����^000000��������B";
			next;
			mes "[�C�O�j�[��]";
			mes "�����ƕ񍐂��ꂽ���قɂ��A";
			mes "^0000FF�C�O�j�[���͕��������@^000000������";
			mes "����Ă���B";
			mes "^0000FF���M���M�����h�̔j��^000000�𔭌������ɂ�";
			mes "������炸�A�{���̌��ʂ�";
			mes "^0000FF�����I^000000�ƕ񍐁B";
			next;
			mes "[�C�O�j�[��]";
			mes "�Ȍ�A��3������^0000FF���ʂ������";
			mes "^0000FF�Ȃ���������^000000�ɉ��U�B";
			mes "���U��A�������ȉ��̑�����";
			mes "3�����ԌR�K����w�Z��";
			mes "������A���̏ꏊ�ɓ]�o������ꂽ�B";
			next;
			mes "[�C�O�j�[��]";
			mes "�ȍ~�A^0000FF�C�O�j�[���̋L�^�͖���^000000�����B";
			mes "���݁A��3�����̒T���C���ɂ��";
			mes "���ʕ��́A�����̕������ł���";
			mes "���x�C���u��M���ɁA�����Ȍ�����";
			mes "����Ă���B";
			next;
			mes "[�C�O�j�[��]";
			mes "���̌����́A���[���~�b�h�K�b�c������";
			mes "���ɂ��s���Ă���B�ȏ�B";
			next;
			mes "[�C�O�j�[��]";
			mes "�����ɂ����H";
			mes "�������A�܂��s�R�_�͎c���Ă���B";
			next;
			mes "[�C�O�j�[��]";
			mes "9. �ǂ����ă��x�C���u��M����";
			mes "�@�@�����`�[�����������ꂽ�̂�";
			mes "10. �v�����e�����������̌�����";
			mes "�@�@�������̂�";
			next;
			mes "[�C�O�j�[��]";
			mes "�c�c�c�c�c�c";
			next;
			mes "[�C�O�j�[��]";
			mes "���̓�́A���O���l����c�c";
			mes "���́c�c������ꂽ�c�c�c�c";
			next;
			mes "[�C�O�j�[��]";
			mes "���͂����N�ɂ��o�����Ă��Ȃ����݁B";
			mes "�����������݂́c�c�₵���c�c";
			mes "�����ł���c�c";
			if(GOD_2QUE == 21)
				set GOD_2QUE,23;
			else if(GOD_2QUE == 22)
				set GOD_2QUE,24;
			close;
		}
		else if(GOD_2QUE == 25 || GOD_2QUE == 26) {
			mes "[�C�O�j�[��]";
			mes "���肪�Ƃ��c�c";
			mes "�c�c�c�c�����ȕω����N���낤��";
			mes "���Ă���B";
			mes "���̒���ς���A�����ȕ���̌��c�c";
			next;
			mes "[�C�O�j�[��]";
			mes "����́c�c�c�c";
			mes "���Ɏc���Ă���^0000FF�����Ȑ�����^000000��";
			mes "���O�Ɂc�c";
			next;
			mes "[�C�O�j�[��]";
			mes "���ɂ́A���ꂭ�炢����";
			mes "�o���Ȃ�����c�c";
			set GOD_2QUE,27;
			if(checkre()) {
				if(BaseLevel < 56)
					getexp 27000,0;
				else if((BaseLevel > 55) && (BaseLevel < 61))
					getexp 30000,0;
				else if((BaseLevel > 60) && (BaseLevel < 66))
					getexp 56052,0;
				else if((BaseLevel > 65) && (BaseLevel < 71))
					getexp 82233,0;
				else if((BaseLevel > 70) && (BaseLevel < 76))
					getexp 212271,0;
				else if((BaseLevel > 75) && (BaseLevel < 81))
					getexp 390738,0;
				else if((BaseLevel > 80) && (BaseLevel < 86))
					getexp 451020,0;
				else if((BaseLevel > 85) && (BaseLevel < 91))
					getexp 546156,0;
				else if(BaseLevel > 90)
					getexp 1220358,0;
			}
			else {
				if(BaseLevel < 56)
					getexp 2700,0;
				else if((BaseLevel > 55) && (BaseLevel < 61))
					getexp 3000,0;
				else if((BaseLevel > 60) && (BaseLevel < 66))
					getexp 5605,0;
				else if((BaseLevel > 65) && (BaseLevel < 71))
					getexp 8223,0;
				else if((BaseLevel > 70) && (BaseLevel < 76))
					getexp 21227,0;
				else if((BaseLevel > 75) && (BaseLevel < 81))
					getexp 39073,0;
				else if((BaseLevel > 80) && (BaseLevel < 86))
					getexp 45102,0;
				else if((BaseLevel > 85) && (BaseLevel < 91))
					getexp 54615,0;
				else if(BaseLevel > 90)
					getexp 122035,0;
			}
			close;
		}
		else if(GOD_2QUE >= 27) {
			mes "[�C�O�j�[��]";
			mes "�c�c�ޏ��c�c�G�}�E�V�A�[�X�c�c";
			next;
			mes "- ���̂ł���ނ̓�̖ڂ���c�c";
			mes "��؂̗܂��c�c -";
			mes "- �������g�Ɩڂł��A";
			mes "�܂͑��݂���̂��c�c -";
			close;
		}
	}
	mes "[�C�O�j�[��]";
	mes "�N�b�N�b�N�b�N�c�c���O�͎��҂��H";
	mes "���O���A�^���ɗ��؂�ꂽ�҂��H";
	mes "����Ƃ��c�c�����]�ނ��Ƃ�����̂��H";
	next;
	switch(select("�X�̒n����q�˂�","�~�j�}�b�v�̕\����S�ď���","�b����߂�")) {
	case 1:
		mes "[�C�O�j�[��]";
		mes "�N�b�N�b�N�b�N�c�c�����ȁB";
		mes "���������Ă����悤�c�c";
		next;
		switch(select("�����̏�","���","���퉮","����","������")) {
		case 1:
			mes "[�C�O�j�[��]";
			mes "�j�u���w�C���̖����c�c";
			mes "^FF3355�{^000000�ɖ����̏Z�ޏ邪����c�c";
			mes "�N�b�N�b�N�b�N�c�c���͉��Ƃ��Ȃ���";
			mes "���̓z���͔ޏ�������Ă���悤���c�c";
			viewpoint 0,253,191,2,0xFF3355;
			close;
		case 2:
			mes "[�C�O�j�[��]";
			mes "����H";
			mes "^CE6300�{^000000�ɂ���B";
			mes "�j�u���w�C���炵���X���B";
			mes "�s���Ă݂�Ƃ����B";
			viewpoint 0,217,196,3,0xCE6300;
			close;
		case 3:
			mes "[�C�O�j�[��]";
			mes "����X�̈ʒu��^55FF33�{^000000���B";
			mes "���ɍۗ������i�͒u���ĂȂ��c�c";
			viewpoint 0,216,171,4,0x55FF33;
			close;
		case 4:
			mes "[�C�O�j�[��]";
			mes "������^3355FF�{^000000�ɂ���B";
			mes "���������ł��A�����͎������c�c";
			viewpoint 0,189,207,5,0x3355FF;
			close;
		case 5:
			mes "[�C�O�j�[��]";
			mes "�~�j�}�b�v�̕\���������������";
			mes "�u�~�j�}�b�v�̕\����S�ď����v��";
			mes "�I������΂����c�c�N�b�N�b�N�b�N�c�c";
			close;
		}
	case 2:
		viewpoint 2,253,191,2,0x00FF00;
		viewpoint 2,217,196,3,0x00FF00;
		viewpoint 2,216,171,4,0x00FF00;
		viewpoint 2,189,207,5,0x00FF00;
		mes "[�C�O�j�[��]";
		mes "�~�j�}�b�v�̕\���������������";
		mes "�u�~�j�}�b�v�̕\����S�ď����v��";
		mes "�I������΂����c�c�N�b�N�b�N�b�N�c�c";
		close;
	case 3:
		mes "[�C�O�j�[��]";
		mes "�����Œ��ׂ܂��̂͌����H";
		mes "�N�b�N�b�N�b�N�c�c�������낤�c�c";
		mes "�N���A�����̐g���������̂ȁc�c";
		mes "�N�b�N�b�N�b�N�c�c�����͈Í���";
		mes "�x�z���Ă���ꏊ�����ȁc�c�N�b�N�c�c";
		close;
	}
}

//============================================================
// �_��3�� �u���[�V���K�����̕���N�G�X�g
//- Registry -------------------------------------------------
// GOD_3QUE -> 0�`50
//------------------------------------------------------------
prt_fild08.gat,175,374,3	script	��V���l	51,{
	cutin "god_nelluad01",2;
	if($GodMagingiorde >= 50 || $GodBrysinggamen < 100) {
		if(GOD_3QUE > 49) {
			mes "[�l�����I�b�h]";
			mes "���A������萋�����悤���ˁ`�B";
			mes "����A���ɂ��������Ƃ��������̂��ȁH";
			mes "����c�c�ŋ߁A�q���ɂȂ��Ă��邹����";
			mes "���܂ɕςȋC��������c�c";
			next;
			mes "[�l�����I�b�h]";
			mes "����c�c�����N�������Ȋ������ˁc�c";
			mes "�ł��S�z���邱�Ƃ͂Ȃ���B";
			mes "�������A�N�ɂ͓��ʂ�";
			mes "�����ŉ��t���Ă����悤�`�B";
			next;
			mes "[�l�����I�b�h]";
			mes "�������]�݂��ȁH";
			next;
			switch(select("�̂𒮂�����","�\�b�𒮂�����","����A�������Ƃ�")) {
			case 1:
				cutin "god_nelluad02",2;
				mes "[�l�����I�b�h]";
				mes "�ł́A���𒮂����悤���c�c";
				mes "�D���Ȃ��̂�I��ł���I";
				next;
				switch(select("�u���M�̎�","�i���̍���","�[�z�̃A�T�V���N���X","�j�[�x�����O�̎w��")) {
				case 1:
					mes "[�l�����I�b�h]";
					mes "�u���M�̎����B�悵�I";
					mes "���l�̐S�𒮂����Ă����悤�B";
					soundeffect "bragis_poem.wav",0,0;
					break;
				case 2:
					cutin "god_nelluad02",2;
					mes "[�l�����I�b�h]";
					mes "�i���̍��ׁc�c";
					mes "����͗Y��ȋȂ��B";
					mes "�Ƃ���ł��̑�ځA";
					mes "���׏�Ԃ��i���ɑ����̂��A";
					mes "����Ƃ��i���ƍ��ׂ��������̂Ȃ̂��A";
					mes "�ʂ����Ăǂ����̈Ӗ��Ȃ񂾂낤�ˁH";
					soundeffect "chaos_of_eternity.wav",0,0;
					break;
				case 3:
					cutin "god_nelluad02",2;
					mes "[�l�����I�b�h]";
					mes "�[�z�̃A�T�V���N���X�I";
					mes "���̉e�ɕ�܂ꂽ�A�T�V���N���X��";
					mes "�[����w�ɂ������ށc�c";
					mes "���D�Y���f���炵�����i���B";
					mes "�͂͂͂��I";
					soundeffect "assassin_of_sunset.wav",0,0;
					break;
				case 4:
					cutin "god_nelluad02",2;
					mes "[�l�����I�b�h]";
					mes "�j�[�x�����O�̎w�ցH";
					mes "�����A�̎����ʔ�����ˁB";
					mes "�������A��Ȓe���Ă݂悤�B";
					next;
					soundeffect "ring_of_nibelungen.wav",0,0;
					mes "[�l�����I�b�h]";
					mes "^4d4dff�傢�Ȃ�͂̒�ɋ���ȉ������肫�B";
					mes "����f�҂��A�B���ꂵ�閧��m��";
					mes "���̉�������w�ւ�b���グ�����A";
					mes "���̎҂͑S�\�ȗ͂𓾂�B";
					mes "����͐_�X�����x�z���ɂ���";
					mes "�S���E�̉��̎w�ւł������`�B^000000";
					next;
					mes "[�l�����I�b�h]";
					mes "^4d4dff���@���n����z�������l������";
					mes "�]�ނ��́A����͔��������_�t���C���B";
					mes "�Ƒ��ȃ��L�̎������ɂ��A";
					mes "���̏��_�͓˔@�p���������B";
					next;
					mes "[�l�����I�b�h]";
					mes "���_�̑���ƂȂ�����";
					mes "����̓A���x���q�̕󕨁B";
					mes "�_�X�����x�z����Ƃ���";
					mes "���̎w�ւł������`�B^000000";
					next;
					mes "[�l�����I�b�h]";
					mes "^4d4dff���@�̓��Ђ����A���x���q�B";
					mes "���ɂł��Ȃ��A�����Ɏ�ɓ���";
					mes "�����Ő��̒����v���̂܂܂ɂł���B";
					mes "����Ȋ�тɐZ���Ă���ނ�";
					mes "���L�͂����₢���B";
					next;
					mes "[�l�����I�b�h]";
					mes "�����ȃA���x���q��";
					mes "���̌��t�ɘf�킳��A���̐g��";
					mes "�Ȃ�ƂЂ��^�ւƕς��Ă��܂�";
					mes "�߂܂��Ă��܂����B^000000";
					next;
					mes "[�l�����I�b�h]";
					mes "^4d4dff�A���x���q�͎�����B";
					mes "����̎���������w�ցA���̎�l��";
					mes "�Ȃ�҂́A�Ђ��������A�₪�Ď���";
					mes "����悤�ɂƁB�w�ւ��󂯂Ƃ���";
					mes "���l�����A�ނ�݂͌��̕󕨂�";
					mes "�D�������B";
					next;
					mes "[�l�����I�b�h]";
					mes "���ǁA�􂢂��󂯂���́A";
					mes "�Z������E���Ă��܂����B^000000";
					break;
				}
				break;
			case 2:
				mes "[�l�����I�b�h]";
				mes "�\�b���āc�c";
				mes "�ǂ̘b��m�肽���́H";
				next;
				switch(select("����ς��s�v�����e���I","�`�X�̘b�𕷂�����","�����͑��ς炸�����̂��ȁH","�����t�߂��C�ɂȂ�")) {
				case 1:
					mes "[�l�����I�b�h]";
					mes "�v�����e���H";
					mes "������������Ȃ����B";
					mes "�`������Ȃ�A�l�ɕ����O��";
					mes "�ϋɓI�Ɏ��璧�킷��ׂ�����B";
					next;
					mes "[�l�����I�b�h]";
					mes "�܁A����͂Ƃ�����";
					mes "�ʔ����b�������B";
					mes "�N�͂܂��Ɛg���H";
					mes "���������Ȃ�A�v�����e���̎����";
					mes "�s���Ă݂�B";
					next;
					cutin "god_nelluad04",2;
					mes "[�l�����I�b�h]";
					mes "�悭�����ň���ł�j��";
					mes "����ꏊ�֑����Ă����炵���B";
					mes "����ꏊ�c�c����͂Ȃ�Ɓu�������v��";
					mes "�閧����B�Ɛg�ł͐�΂ɍs���Ȃ�";
					mes "�ƌ����Ă���u�������v�ɂ��B";
					mes "��������H";
					break;
				case 2:
					mes "[�l�����I�b�h]";
					mes "�`�X���Ă��Ƃ͂���ς�A���x���^���H";
					mes "�A���x���^�͊C�𒭂߂���̂�";
					mes "�����ˁB";
					mes "�C�Ƃ����Γ쐼��";
					mes "�R�R���r�[�`������ˁB";
					next;
					cutin "god_nelluad03",2;
					mes "[�l�����I�b�h]";
					mes "�R�R���r�[�`�͍��l���L��";
					mes "�C�Y�����L�x�Œ������ɂ�";
					mes "�����Ă������B�����A����ȏꏊ�ɂ�";
					mes "�댯������ł���B�����A�ςȓz��";
					mes "������񂾁B";
					next;
					cutin "god_nelluad04",2;
					mes "[�l�����I�b�h]";
					mes "�^���ԂȔ����t���Ă�";
					mes "�Ƃ��Ƃ��������͋C��Y�킹�Ă���z�B";
					mes "�����͉������N�`���N�`�����݂Ȃ���";
					mes "�����܁A�΂�f���̂Ă�B�l��";
					mes "�����ɏ�������S�ĒD��ꂽ��B";
					next;
					mes "[�l�����I�b�h]";
					mes "�܂��A���Ԃ͖l�̗l�Ȃ��ア���l��";
					mes "���������ɂ͉ߍ����B";
					mes "�c�c�ł��A����ɑ΂��A���x���^��";
					mes "�̂̂̂܂܂������B";
					next;
					mes "[�l�����I�b�h]";
					mes "���Ȃ�́A�C���z�[�N����\�ꂵ��";
					mes "�����Ղ͌��󂯂��Ȃ��B���v�D";
					mes "���͉̂��ɂ��邪�ˁB";
					next;
					cutin "god_nelluad01",2;
					mes "[�l�����I�b�h]";
					mes "�W�����_�����]���_�����A�����";
					mes "���O�̉�Ђ��A���҂��C�x���g��";
					mes "����Ă邻�����B�N���ދ����̂���";
					mes "�����X�^�[�ގ��ɍs���Ă͂ǂ����ȁH";
					break;
				case 3:
					mes "[�l�����I�b�h]";
					mes "����A���̂����`�������ˁB";
					mes "��͂荻��������ˁB";
					mes "�������A�ˑR�o�����鋐��~�~�Y!!";
					mes "���̉򂩂Ǝv���Ă�����A�w�ォ��";
					mes "�P��������T���h�}��!!";
					mes "�����͂ƂĂ��f���W�����X���I";
					next;
					mes "[�l�����I�b�h]";
					mes "����ł��c�c�������猩���낷";
					mes "�C�͎��ɂ��ꂢ�B";
					mes "���R�Ǝ���������ł����B";
					mes "���ꂩ��A�����ŖY��Ă�";
					mes "�����Ȃ��̂́A��͂肠����!!";
					next;
					cutin "god_nelluad02",2;
					mes "[�l�����I�b�h]";
					mes "�����̒��ɉB��Ă���Ƃ���";
					mes "�\�̃A�T�V���M���h!!";
					if(Job == Job_Assassin || Job == Job_Guillotine) {
						mes "�Ȃ񂾁`�B�N����";
						mes "�A�T�V���M���h�o�g�Ȃ񂾂ˁB";
						mes "���x�A�l��A��Ă��Ă���Ȃ������H";
					}
					else
						mes "�N�͍s�������Ƃ�����H";
					break;
				case 4:
					mes "[�l�����I�b�h]";
					mes "�����c�c�����𔲂���Ɨ׍�";
					mes "�V���o���c���h!!�@�����Ă��΂炭";
					mes "�i�ނƁA�₪�ăW���m�[�ɒH�蒅���B";
					mes "�W���m�[�̓V���o���c�o���h���a����";
					mes "��s�ł���Ɠ����ɁA";
					mes "���҂̓s�s�Ƃ������Ă���B";
					next;
					mes "[�l�����I�b�h]";
					mes "���̃W���m�[�ɂ́A�����Ȃ��";
					mes "���l��������悤���B���̐l����";
					mes "�}�b�h�T�C�G���e�B�X�g�ƌĂ΂�Ă���";
					mes "�Ȋw�҂炵���B����������������";
					mes "����Ȃ����A�함�j���͊�{�A";
					mes "�������������A���l�̐��i�������c�c";
					next;
					cutin "god_nelluad03",2;
					mes "[�l�����I�b�h]";
					mes "����ȏ�Ԃ�����A���R�l��";
					mes "�����Ă��Ă��B�����������ς܂���";
					mes "����̎�l���A�ʂ肪����`���҂�";
					mes "�ނ̌����W�Q���˗����Ă��邻�����B";
					next;
					mes "[�l�����I�b�h]";
					mes "�ł��A��Ȋw�҂̌�������������";
					mes "�ׂ��Ă��܂����Ă̂́A";
					mes "�s���߂��ł͂Ȃ����ȁH";
					next;
					cutin "god_nelluad01",2;
					mes "[�l�����I�b�h]";
					mes "���ꂩ��c�c�W���m�[��";
					mes "��ɕ�����ł�����Ă��Ƃ�";
					mes "�N���m���Ă����ˁB";
					mes "����͑��Â̋��l���~���̐S���̌��Ђ�";
					mes "���邨�����ƌ����Ă���B";
					next;
					mes "[�l�����I�b�h]";
					mes "�܂��A�Z�[�W�L���b�X���ɂ�";
					mes "���~���̏�������B�N��";
					mes "���@���L���[�ɉ���Ă݂����Ȃ�";
					mes "���́u���~���̏��v��K��";
					mes "�ǂ܂Ȃ���΂Ȃ�Ȃ���B";
					break;
				}
				break;
			case 3:
				mes "[�l�����I�b�h]";
				mes "�������B����A�܂����x�b�����B";
				mes "�N�Ƀu���M�̉��삪����悤�Ɂ`�B";
				break;
			}
		}
		else if(GOD_3QUE > 0 && GOD_3QUE < 50) {
			cutin "god_nelluad01",2;
			mes "[�l�����I�b�h]";
			mes "�G�����R�P�[���ɂ͉���Ă݂��H";
			mes "�l�̊��߂𖳑ʂɂ��Ȃ��ł����B";
			next;
			switch(select("����B���ǉ����b�𒮂�����","�̂𒮂�����")) {
			case 1:
				cutin "god_nelluad02",2;
				mes "[�l�����I�b�h]";
				mes "�������ˁc�c���̘b�����悤���H";
				mes "���[��A���ꂪ�������ȁB";
				mes "�l�����s���ɑ̌������`���k���B";
				next;
				mes "[�l�����I�b�h]";
				mes "����͂������s�v�c�Ȍo���������B";
				mes "�����N�Ƃ����쐼�̕��̍����̓s�s�B";
				mes "�l�͍����Ƃ������̂����߂Č����񂾁B";
				mes "���̃����N�ɍs���r���A����";
				mes "�E�񂾏ꏊ�ŋx�e���Ă�����c�c";
				next;
				mes "[�l�����I�b�h]";
				mes "�܂��ɂ��̕ӂŉ\���������Ă���";
				mes "�a�n���������Ƃ́c�c�B";
				mes "�a���Ȃ�ŕ|�������āH";
				mes "�c�c�������A�a�͕|���͂Ȃ���B";
				mes "�܂��A�Q��𐬂��ƕ|�����ǂˁB";
				next;
				cutin "god_nelluad03",2;
				mes "[�l�����I�b�h]";
				mes "�l�̖ڂ̑O�Ɍ��ꂽ�̂́A";
				mes "�܂�Łc�c�C�`�S�ƃ�������";
				mes "���̂����悤�ȁc�c�����";
				mes "�}�V���}���̂悤�ɂ�������";
				mes "�t���I�j�������񂾂�I";
				next;
				mes "[�l�����I�b�h]";
				mes "����͂܂����̌����ˁB";
				mes "�l�͂ӂ��Ƀt�@���X���䂪";
				mes "�������Ȃ��Ăˁc�c";
				mes "�J�v���T�[�r�X���g�킸��";
				mes "���l�̃��}���𖡂킢�Ȃ���";
				mes "�����̉��f�ɒ��킵���̂��B";
				next;
				mes "[�l�����I�b�h]";
				mes "���̓����N�̓�ŃZ���e������";
				mes "�l�ɉ���āA�T���_���}���v�ǂ�";
				mes "�b�𕷂����Ƃ��ł����񂾁B";
				mes "�����ċ���镨�ȂǂȂ��I�@�ƁA";
				mes "���̂܂ܐi��ł������񂾁B";
				mes "���O�𕷂��Ƃ��ꂢ�ȏ��Ɏv��������B";
				next;
				cutin "god_nelluad01",2;
				mes "[�l�����I�b�h]";
				mes "�ł��c�c�l�͂����Ɍ�������c�c";
				mes "�����͂������ɂ��ꂢ�ȏ��ł�";
				mes "�������c�c";
				mes "���u�Ɣp�Ђ������ɐD���������";
				mes "�s�ςȌi�F���������ˁB";
				mes "�ł��c�c";
				next;
				mes "[�l�����I�b�h]";
				mes "�����̓Z���e���̌����Ƃ���c�c";
				mes "�l���ߊ��Ȃ��Ȃ��Ă���";
				mes "�����X�^�[�̓V���ɂȂ��Ă��񂾁B";
				mes "�����c�c���v���o�������ł�";
				mes "�߂܂����������ȂقǑ�������B";
				mes "���֐��ւƁc�c";
				next;
				mes "[�l�����I�b�h]";
				mes "�T���_���}���v�ǂ̐��̕���";
				mes "����ȂɊ댯����Ȃ������B";
				mes "�l���Z��ł������Ȗ��Ƃ�";
				mes "���������ˁB";
				next;
				mes "[�l�����I�b�h]";
				mes "�����l�͖��킸���̉Ƃ̖��";
				mes "�h���h���@������B";
				mes "�l��������x�܂��Ă��炨����";
				mes "�v���ĂˁB";
				mes "����������A�����琺�������񂾁B";
				next;
				cutin "god_nelluad03",2;
				mes "[�l�����I�b�h]";
				mes "�u�N��!?�@�����ɉ��̗p���I�v";
				mes "����Ⴈ�ǂ낢����c�c";
				mes "�����t������Ȃ����";
				mes "�����Ȃ������Ȃ�āB";
				mes "����Ȃ̖l���m���Ă�킯";
				mes "�Ȃ�����Ȃ����c�c";
				next;
				mes "[�l�����I�b�h]";
				mes "�܂��ɋ㎀�Ɉꐶ�𓾂�";
				mes "�t�@���X����ɒ����Ă���";
				mes "�킩������c�c";
				next;
				mes "[�l�����I�b�h]";
				mes "���̕ӈ�т����[�O�M���h��";
				mes "�B��ꏊ���������ĂˁB";
				mes "�Ƃɂ������[�O���Ă̂͂������B";
				mes "�ނ�łȂ��ĒN�������";
				mes "�����X�^�[�V���ɏZ�ނƂ����񂾁c�c";
				next;
				cutin "god_nelluad01",2;
				mes "[�l�����I�b�h]";
				mes "�ӂ��c�c�������񂵂�ׂ�������";
				mes "������Ɣ�ꂿ������ȁc�c";
				mes "�܂��������`����������";
				mes "�b���Ă������B";
				break;
			case 2:
				cutin "god_nelluad02",2;
				mes "[�l�����I�b�h]";
				mes "�́H�@�����B";
				mes "�l�̉̂𕷂����Ă������B";
				next;
				mes "���_���������Ƃ�����";
				mes "�c�������̂͋���";
				mes "�K�����������Ƃ�����";
				mes "�c�������̂͗�";
				next;
				mes "�Ό��͌J��Ԃ�";
				mes "�A���f�o�����̐��Ԃ̂悤��";
				mes "�܂����Ȃ�����";
				mes "�����猳�C���o����";
				next;
				mes "�����Ă��邨�삳���";
				mes "�������Ƃ������N��";
				mes "�������ꂽ�L��";
				mes "���邮��Ɖ�鐅�Ԃ̂悤�Ɂc�c";
				next;
				cutin "god_nelluad04",2;
				mes "[�l�����I�b�h]";
				mes "����H";
				mes "�����������āH";
				mes "�͂́B";
				break;
			}
		}
		else {
			mes "[�l�����I�b�h]";
			mes "�₠�I";
			mes "����H�@���̊ԉ������ˁH";
			mes "�Ⴄ�H�@�ς��ȁc�c";
			mes "�b�𕷂��������Č����Ă����l��";
			mes "�N����Ȃ��������c�c";
			mes "�܁A�������������畷���Ă����Ȃ�B";
			next;
			mes "[�l�����I�b�h]";
			mes "�l�̘b�����߂ɂȂ邩�ǂ�����";
			mes "�N�����f����΂������c�c";
			mes "�N�̓����X�^�[�w����Ēm���Ă�H";
			mes "�W���m�[�ɂ���񂾂��ǂˁB";
			mes "���̃W���m�[�ŕ������b�Ȃ񂾂���";
			mes "�ǂ��H�@�����H";
			next;
			switch(select("�����āI","�����Ȃ���")) {
			case 1:
				mes "[�l�����I�b�h]";
				mes "���̃L���L���P�₢���ځA";
				mes "�C�ɓ�����!!�@�悵�I";
				mes "�����C�̂���l�ɂ͂��̖l��";
				mes "�^�S�����߂Ęb���Ă������B";
				mes "�N���`���Ƃ݂���������ˁB";
				next;
				if(BaseLevel < 70) {
					cutin "god_nelluad03",2;
					mes "[�l�����I�b�h]";
					mes "�����ƁA�ł��N�ɂ͂������";
					mes "�����b��������Ȃ��ȁB";
					mes "����������Ɩ`����ς�ł���";
					mes "�����������悳�������B";
					mes "�܂��ˁ`";
				}
				else {
					cutin "god_nelluad02",2;
					mes "[�l�����I�b�h]";
					mes "�ӂށ`";
					mes "�N�����\�F�X�Ȗ`����";
					mes "���Ă����݂������ˁB";
					mes "����A�N�ɂȂ�b���Ă��悳�������B";
					next;
					mes "[�l�����I�b�h]";
					mes "�W���m�[���s��������`���Ƃ�������";
					mes "�N������x�͎��ɂ��邾�낤";
					mes "�����X�^�[�w�����B";
					mes "�����̊w�҂̈�l�A�G�����R�����";
					mes "�d���̘b���B";
					next;
					cutin "god_nelluad01",2;
					mes "[�l�����I�b�h]";
					mes "������w���K�˂Ă����`���Ƃ�";
					mes "�G�����R����ɂ��������������";
					mes "�����ǁA���ꂪ�ƂĂ����ʂ̕�";
					mes "�ł͂Ȃ������炵���c�c";
					mes "����ŁA�G�����R����͂���ɂ���";
					mes "��`���Ă����l��T���Ă����񂾁B";
					next;
					mes "[�l�����I�b�h]";
					mes "���A���Ō������Ă������̂�";
					mes "���̖`���Ƃ������Ă������ɂ�";
					mes "���炩�̊֘A��������ƌ����Ă����B";
					mes "���������āA�������ł��Ă��Ȃ�";
					mes "�Ñ�̈�Y�̈ꕔ��������Ȃ��Ƃ��B";
					next;
					mes "[�l�����I�b�h]";
					mes "�ǂ��A��������H";
					mes "�ڂ����̓G�����R����̘b��";
					mes "�����Ă݂Ȃ��Ƃ킩��Ȃ����ǁA";
					mes "�ނ̎d������`���Ă݂�����";
					mes "�v������l�����E�󂭂炢��";
					mes "�����Ă������B";
					next;
					switch(select("��������`����I","���܂苻�����킩�Ȃ��ˁc�c")) {
					case 1:
						mes "[�l�����I�b�h]";
						mes "�ق��`�����ˁB";
						mes "�N�̖��O�́H�@����H";
						mes strcharinfo(0)+ "���B";
						mes "�悵�A�G�����R����ɘA�����悤�B";
						next;
						mes "[�l�����I�b�h]";
						mes "�w��̓W���m�[�̍L�ꂩ��";
						mes "���̕��ɂ��邩��ˁB";
						mes "���ꂶ��A����΂��āI";
						set GOD_3QUE,1;
						break;
					case 2:
						cutin "god_nelluad02",2;
						mes "[�l�����I�b�h]";
						mes "�����[�c�O�B";
						mes "�N���̐l�Ȃ��`���Ă���邩��";
						mes "�v�����񂾂��ˁ`�B";
						mes "���ꂶ��A�܂��ˁB";
						break;
					}
				}
				break;
			case 2:
				mes "[�l�����I�b�h]";
				mes "���ꂶ��A������Ɩ`���b�ł�";
				mes "���悤���H";
				next;
				switch(select("����A��������","��������̂𒮂�����")) {
				case 1:
					cutin "god_nelluad02",2;
					mes "[�l�����I�b�h]";
					mes "�������ˁc�c���̘b�����悤���H";
					mes "���[��A���ꂪ�������ȁB";
					mes "�l�����s���ɑ̌������`���k���B";
					next;
					mes "[�l�����I�b�h]";
					mes "����͂������s�v�c�Ȍo���������B";
					mes "�����N�Ƃ����쐼�̕��̍����̓s�s�B";
					mes "�l�͍����Ƃ������̂����߂Č����񂾁B";
					mes "���̃����N�ɍs���r���A����";
					mes "�E�񂾏ꏊ�ŋx�e���Ă�����c�c";
					next;
					mes "[�l�����I�b�h]";
					mes "�܂��ɂ��̕ӂŉ\���������Ă���";
					mes "�a�n���������Ƃ́c�c�B";
					mes "�a���Ȃ�ŕ|�������āH";
					mes "�c�c�������A�a�͕|���͂Ȃ���B";
					mes "�܂��A�Q��𐬂��ƕ|�����ǂˁB";
					next;
					cutin "god_nelluad03",2;
					mes "[�l�����I�b�h]";
					mes "�l�̖ڂ̑O�Ɍ��ꂽ�̂́A";
					mes "�܂�Łc�c�C�`�S�ƃ�������";
					mes "���̂����悤�ȁc�c�����";
					mes "�}�V���}���̂悤�ɂ�������";
					mes "�t���I�j�������񂾂�I";
					next;
					mes "[�l�����I�b�h]";
					mes "����͂܂����̌����ˁB";
					mes "�l�͂ӂ��Ƀt�@���X���䂪";
					mes "�������Ȃ��Ăˁc�c";
					mes "�J�v���T�[�r�X���g�킸��";
					mes "���l�̃��}���𖡂킢�Ȃ���";
					mes "�����̉��f�ɒ��킵���̂��B";
					next;
					mes "[�l�����I�b�h]";
					mes "���̓����N�̓�ŃZ���e������";
					mes "�l�ɉ���āA�T���_���}���v�ǂ�";
					mes "�b�𕷂����Ƃ��ł����񂾁B";
					mes "�����ċ���镨�ȂǂȂ��I�@�ƁA";
					mes "���̂܂ܐi��ł������񂾁B";
					mes "���O�𕷂��Ƃ��ꂢ�ȏ��Ɏv��������B";
					next;
					cutin "god_nelluad01",2;
					mes "[�l�����I�b�h]";
					mes "�ł��c�c�l�͂����Ɍ�������c�c";
					mes "�����͂������ɂ��ꂢ�ȏ��ł�";
					mes "�������c�c";
					mes "���u�Ɣp�Ђ������ɐD���������";
					mes "�s�ςȌi�F���������ˁB";
					mes "�ł��c�c";
					next;
					mes "[�l�����I�b�h]";
					mes "�����̓Z���e���̌����Ƃ���c�c";
					mes "�l���ߊ��Ȃ��Ȃ��Ă���";
					mes "�����X�^�[�̓V���ɂȂ��Ă��񂾁B";
					mes "�����c�c���v���o�������ł�";
					mes "�߂܂����������ȂقǑ�������B";
					mes "���֐��ւƁc�c";
					next;
					mes "[�l�����I�b�h]";
					mes "�T���_���}���v�ǂ̐��̕���";
					mes "����ȂɊ댯����Ȃ������B";
					mes "�l���Z��ł������Ȗ��Ƃ�";
					mes "���������ˁB";
					next;
					mes "[�l�����I�b�h]";
					mes "�����l�͖��킸���̉Ƃ̖��";
					mes "�h���h���@������B";
					mes "�l��������x�܂��Ă��炨����";
					mes "�v���ĂˁB";
					mes "����������A�����琺�������񂾁B";
					next;
					cutin "god_nelluad04",2;
					mes "[�l�����I�b�h]";
					mes "�u�N��!?�@�����ɉ��̗p���I�v";
					mes "����Ⴈ�ǂ낢����c�c";
					mes "�����t������Ȃ����";
					mes "�����Ȃ������Ȃ�āB";
					mes "����Ȃ̖l���m���Ă�킯";
					mes "�Ȃ�����Ȃ����c�c";
					next;
					mes "[�l�����I�b�h]";
					mes "�܂��ɋ㎀�Ɉꐶ�𓾂�";
					mes "�t�@���X����ɒ����Ă���";
					mes "�킩������c�c";
					next;
					mes "[�l�����I�b�h]";
					mes "���̕ӈ�т����[�O�M���h��";
					mes "�B��ꏊ���������ĂˁB";
					mes "�Ƃɂ������[�O���Ă̂͂������B";
					mes "�ނ�łȂ��ĒN�������";
					mes "�����X�^�[�V���ɏZ�ނƂ����񂾁c�c";
					next;
					cutin "god_nelluad01",2;
					mes "[�l�����I�b�h]";
					mes "�ӂ��c�c�������񂵂�ׂ�������";
					mes "������Ɣ�ꂿ������ȁc�c";
					mes "�܂��������`����������";
					mes "�b���Ă������B";
					break;
				case 2:
					cutin "god_nelluad02",2;
					mes "[�l�����I�b�h]";
					mes "�́H�@�����B";
					mes "�l�̉̂𕷂����Ă������B";
					next;
					mes "���_���������Ƃ�����";
					mes "�c�������̂͋���";
					mes "�K�����������Ƃ�����";
					mes "�c�������̂͗�";
					next;
					mes "�Ό��͌J��Ԃ�";
					mes "�A���f�o�����̐��Ԃ̂悤��";
					mes "�܂����Ȃ�����";
					mes "�����猳�C���o����";
					next;
					mes "�����Ă��邨�삳���";
					mes "�������Ƃ������N��";
					mes "�������ꂽ�L��";
					mes "���邮��Ɖ�鐅�Ԃ̂悤�Ɂc�c";
					next;
					cutin "god_nelluad04",2;
					mes "[�l�����I�b�h]";
					mes "����H";
					mes "�����������āH";
					mes "�͂́B";
					break;
				}
				break;
			}
		}
		close2;
		cutin "god_nelluad01",255;
		cutin "god_nelluad02",255;
		cutin "god_nelluad03",255;
		cutin "god_nelluad04",255;
		end;
	}
	mes "[�l�����I�b�h]";
	mes "�悤�I�@�����V�C���ˁB";
	mes "����H�@�������߂񂲂߂�B";
	if(Sex) {
		mes "����`�l�͐l�̊��";
		mes "�o����̂����łˁB";
	}
	else {
		mes "�N�݂����Ȃ��ꂢ�ȏ�����";
		mes "��x�������Y���͂���";
		mes "�Ȃ�����ˁB";
	}
	mes "�n�b�n�b�n�`�I";
	next;
	cutin "god_nelluad01",2;
	mes "[�l�����I�b�h]";
	mes "�l�ɉ����p�����H";
	mes "�Ȃ�ł������Ă�����B";
	mes "���ɗ����_�̂悤��";
	mes "��������̂��`";
	mes "���̐�������Ƌ���";
	mes "�̂��N�̗F�Ȃ̂��`";
	next;
	switch(select("���Ȃ��̐��̂��āH","�Ȃ񂩖ʔ����\�Ȃ��H","���A�̂���H")) {
	case 1:
		mes "[�l�����I�b�h]";
		mes "�l�͗������܂ܗ���䂭";
		mes "���̋�V���l�l�����I�b�h�B";
		mes "���͖{���̓G�����I�b�h���B";
		mes "�Ƃ���Łc�c�����������ȁB";
		mes "���̓������鑺�̗��قł̂�т�";
		mes "���Ă����񂾂��ǁc�c";
		next;
		cutin "god_nelluad03",2;
		mes "[�l�����I�b�h]";
		mes "�����Ȃ�`�����`��������������";
		mes "���̂���߂��Ɋ���Ă���";
		mes "�����Ȃ薼�O��ς�����Č����̂��B";
		mes "�����[�呛��������B";
		mes "�܂�Ŏ����̖��O�̂��Ƃ̂悤��";
		mes "��������Ă���񂾁c�c";
		next;
		cutin "god_nelluad04",2;
		mes "[�l�����I�b�h]";
		mes "���ǁc�c���̐ȂŖ��O��";
		mes "�ς��邱�ƂɂȂ����񂾂�B";
		mes "�l�����I�b�h���ĂˁB";
		mes "�c�c";
		next;
		mes "[�l�����I�b�h]";
		mes "���A�P�ɖl���キ��";
		mes "�̂��ʂ̏������������";
		mes "�v�����ł���I";
		mes "����͂ǂ��������܂��āI";
		mes "�l�͂����\�͂������Ȃ����B";
		mes "���a��������D������V���l�Ȃ̂��B";
		next;
		mes "- ����ȏ㕷���Ă�����";
		mes "������܂ł��������Ȃ�B";
		mes "�������悤 -";
		next;
		cutin "god_nelluad03",2;
		mes "[�l�����I�b�h]";
		mes "���[��H�@���炱��`";
		mes "��������Ȃ�ĂЂǂ��Ȃ��`";
		break;
	case 2:
		mes "[�l�����I�b�h]";
		mes "�\�b���āc�c";
		mes "�ǂ̘b��m�肽���́H";
		next;
		switch(select("����ς��s�v�����e���I","�`�X�̘b�𕷂�����","�����͑��ς炸�����̂��ȁH","�����t�߂��C�ɂȂ�")) {
		case 1:
			mes "[�l�����I�b�h]";
			mes "�v�����e���H";
			mes "������������Ȃ����B";
			mes "�`������Ȃ�A�l�ɕ����O��";
			mes "�ϋɓI�Ɏ��璧�킷��ׂ�����B";
			next;
			mes "[�l�����I�b�h]";
			mes "�܁A����͂Ƃ�����";
			mes "�ʔ����b�������B";
			mes "�N�͂܂��Ɛg���H";
			mes "���������Ȃ�A�v�����e���̎����";
			mes "�s���Ă݂�B";
			next;
			mes "[�l�����I�b�h]";
			mes "�悭�����ň���ł�j��";
			mes "����ꏊ�֑����Ă����炵���B";
			mes "����ꏊ�c�c����͂Ȃ�Ɓu�������v��";
			mes "�閧����B�Ɛg�ł͐�΂ɍs���Ȃ�";
			mes "�ƌ����Ă���u�������v�ɂ��B";
			mes "��������H";
			break;
		case 2:
			mes "[�l�����I�b�h]";
			mes "�`�X���Ă��Ƃ͂���ς�A���x���^���H";
			mes "�A���x���^�͊C�𒭂߂���̂�";
			mes "�����ˁB";
			mes "�C�Ƃ����Γ쐼��";
			mes "�R�R���r�[�`������ˁB";
			next;
			mes "[�l�����I�b�h]";
			mes "�R�R���r�[�`�͍��l���L��";
			mes "�C�Y�����L�x�Œ������ɂ�";
			mes "�����Ă������B�����A����ȏꏊ�ɂ�";
			mes "�댯������ł���B�����A�ςȓz��";
			mes "������񂾁B";
			next;
			cutin "god_nelluad04",2;
			mes "[�l�����I�b�h]";
			mes "�^���ԂȔ����t���Ă�";
			mes "�Ƃ��Ƃ��������͋C��Y�킹�Ă���z�B";
			mes "�����͉������N�`���N�`�����݂Ȃ���";
			mes "�����܁A�΂�f���̂Ă�B�l��";
			mes "�����ɏ�������S�ĒD��ꂽ��B";
			next;
			mes "[�l�����I�b�h]";
			mes "�܂��A���Ԃ͖l�̗l�Ȃ��ア���l��";
			mes "���������ɂ͉ߍ����B";
			mes "�c�c�ł��A����ɑ΂��A���x���^��";
			//mes "�̂̂̂܂܂������B";
			mes "�̂̂܂܂������B";
			next;
			mes "[�l�����I�b�h]";
			mes "���Ȃ�́A�C���z�[�N����\�ꂵ��";
			mes "�����Ղ͌��󂯂��Ȃ��B���v�D";
			mes "���͉̂��ɂ��邪�ˁB";
			next;
			cutin "god_nelluad01",2;
			mes "[�l�����I�b�h]";
			mes "�W�����_�����]���_�Ȃ̂��A�����";
			mes "���O�̉�Ђ��A���҂��C�x���g��";
			mes "����Ă邻�����B�N���ދ����̂���";
			mes "�����X�^�[�ގ��ɍs���Ă͂ǂ����ȁH";
			break;
		case 3:
			mes "[�l�����I�b�h]";
			mes "����A���̂����`�������ˁB";
			mes "��͂荻��������ˁB";
			mes "�������A�ˑR�o�����鋐��~�~�Y!!";
			mes "���̉򂩂Ǝv���Ă�����A�w�ォ��";
			mes "�P��������T���h�}��!!";
			mes "�����͂ƂĂ��f���W�����X���I";
			next;
			cutin "god_nelluad02",2;
			mes "[�l�����I�b�h]";
			mes "����ł��c�c�������猩���낷";
			mes "�C�͎��ɂ��ꂢ�B";
			mes "���R�Ǝ���������ł����B";
			mes "���ꂩ��A�����ŖY��Ă�";
			mes "�����Ȃ��̂́A��͂肠����!!";
			next;
			mes "[�l�����I�b�h]";
			mes "�����̒��ɉB��Ă���Ƃ���";
			mes "�\�̃A�T�V���M���h!!";
			if(Job == Job_Assassin || Job == Job_Guillotine) {
				mes "�Ȃ񂾁`�B�N����";
				mes "�A�T�V���M���h�o�g�Ȃ񂾂ˁB";
				mes "���x�A�l��A��Ă��Ă���Ȃ������H";
			}
			else
				mes "�N�͍s�������Ƃ�����H";
			break;
		case 4:
			mes "[�l�����I�b�h]";
			mes "�����c�c�����𔲂���Ɨ׍�";
			mes "�V���o���c���h!!�@�����Ă��΂炭";
			mes "�i�ނƁA�₪�ăW���m�[�ɒH�蒅���B";
			mes "�W���m�[�̓V���o���c�o���h���a����";
			mes "��s�ł���Ɠ����ɁA";
			mes "���҂̓s�s�Ƃ������Ă���B";
			next;
			mes "[�l�����I�b�h]";
			mes "���̃W���m�[�ɂ́A�����Ȃ��";
			mes "���l��������悤���B���̐l����";
			mes "�}�b�h�T�C�G���e�B�X�g�ƌĂ΂�Ă���";
			mes "�Ȋw�҂炵���B����������������";
			mes "����Ȃ����A�함�j���͊�{�A";
			mes "�������������A���l�̐��i�������c�c";
			next;
			cutin "god_nelluad03",2;
			mes "[�l�����I�b�h]";
			mes "����ȏ�Ԃ�����A���R�l��";
			mes "�����Ă��Ă��B�����������ς܂���";
			mes "����̎�l���A�ʂ肪����`���҂�";
			mes "�ނ̌����W�Q���˗����Ă��邻�����B";
			next;
			mes "[�l�����I�b�h]";
			mes "�ł��A��Ȋw�҂̌�������������";
			mes "�ׂ��Ă��܂����Ă̂́A";
			mes "�s���߂��ł͂Ȃ����ȁH";
			next;
			cutin "god_nelluad01",2;
			mes "[�l�����I�b�h]";
			mes "���ꂩ��c�c�W���m�[��";
			mes "��ɕ�����ł�����Ă��Ƃ�";
			mes "�N���m���Ă����ˁB";
			mes "����͑��Â̋��l���~���̐S���̌��Ђ�";
			mes "���邨�����ƌ����Ă���B";
			next;
			mes "[�l�����I�b�h]";
			mes "�܂��A�Z�[�W�L���b�X���ɂ�";
			mes "���~���̏�������B�N��";
			mes "���@���L���[�ɉ���Ă݂����Ȃ�";
			mes "���́u���~���̏��v��K��";
			mes "�ǂ܂Ȃ���΂Ȃ�Ȃ���B";
			break;
		}
		break;
	case 3:
		mes "[�l�����I�b�h]";
		mes "�ł́A���𒮂����悤���c�c";
		mes "�D���Ȃ��̂�I��ł���I";
		next;
		switch(select("�u���M�̎�","�i���̍���","�[�z�̃A�T�V���N���X")) {
		case 1:
			if(Zeny < 500) {
				mes "[�l�����I�b�h]";
				mes "����`�A���������Ȃ��悤���ˁB";
				mes "���܂Ȃ������t�Ȗ������B";
			}
			else {
				cutin "god_nelluad02",2;
				mes "[�l�����I�b�h]";
				mes "�患�A�N�͎��l�̐S���킩���Ă�ˁI";
				mes "�u���M�͖l��̐_���B";
				soundeffect "bragis_poem.wav",0;
				set Zeny,Zeny - 500;
			}
			break;
		case 2:
			if(Zeny < 500) {
				mes "[�l�����I�b�h]";
				mes "����`�A���������Ȃ��悤���ˁB";
				mes "���܂Ȃ������t�Ȗ������B";
			}
			else {
				cutin "god_nelluad02",2;
				mes "[�l�����I�b�h]";
				mes "�N�͗Y��ȋȂ����D�݂��I";
				mes "�ق�A�i���̍��ׂ��I";
				soundeffect "chaos_of_eternity.wav",0;
				set Zeny,Zeny - 500;
			}
			break;
		case 3:
			if(Zeny < 500) {
				mes "[�l�����I�b�h]";
				mes "����`�A���������Ȃ��悤���ˁB";
				mes "���܂Ȃ������t�Ȗ������B";
			}
			else {
				cutin "god_nelluad02",2;
				mes "[�l�����I�b�h]";
				mes "�����c�c�a���ˁc�c";
				mes "��͂�Ԃ��[�z�Ǝ������̂�";
				mes "�A�T�V�����˂��c�c";
				soundeffect "assassin_of_sunset.wav",0;
				set Zeny,Zeny - 500;
			}
			break;
		}
		break;
	}
	close2;
	cutin "god_nelluad01",255;
	cutin "god_nelluad02",255;
	cutin "god_nelluad03",255;
	cutin "god_nelluad04",255;
	end;
}

yuno_in04.gat,47,113,1	script	�������̊w��	749,{
	if(checkitemblank() == 0) {
		mes "- �����A�C�e���̎�ސ��� -";
		mes "- �������߁A�A�C�e�����󂯂Ƃ� -";
		mes "- ���Ƃ��ł��܂���B -";
		mes "- �����A�C�e�������炵�Ă��� -";
		mes "- �ēx�b�������Ă��������B -";
		close;
	}
	if(MaxWeight - Weight < 2000) {
		mes "- �����d�ʂ��������߁A�A�C�e���� -";
		mes "- �󂯂Ƃ邱�Ƃ��ł��܂���B -";
		mes "- �����A�C�e�������炵�Ă��� -";
		mes "- �ēx�b�������Ă��������B -";
		close;
	}
	if($GodBrysinggamen == 100) {
		mes "[�������̊w��]";
		mes "�ԃ|�[�V�����̐���ɂ�";
		mes "�ԃn�[�u�Ɛ��̔Z�x���߂�";
		mes "�ƂĂ��d�v���B";
		mes "���̔����Ȓ��߂ɂ����";
		mes "�ŏ�̉񕜗ʂ��o�����疞�����B";
		close;
	}
	if($GodMagingiorde >= 50) {
		if(GOD_3QUE == 50) {
			mes "[�G�����R�E�P�[��]";
			mes "����" +strcharinfo(0)+ "�N���ˁB";
			mes "�ŋߐV�����������n�߂ĂˁB";
			mes "�u���[�V���K���������͓I�����c�c";
			mes "�ӂӁc�c";
			mes "����肩�����Ă��錤����";
			mes "�ɔ邾���狳����킯�ɂ�����ȁB";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�܂��@���������ꏏ��";
			mes "�������悤���B";
			close;
		}
		else if(GOD_3QUE == 49) {
			mes "[�G�����R�E�P�[��]";
			mes "�悭�����ˁB";
			mes "�x�[�����O����������";
			mes "�Â��Ȕg�����c�c";
			mes "���_���������܂ɗ͂����߂���";
			mes "�����񂾂낤�ˁc�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�܂������c�c";
			mes "�_��̗͂��������i�����Ƃ́c�c";
			mes "�h�L�h�L�����B";
			mes "�ǂ����邩�ˁc�c";
			mes "���A�܂������É��ɕ񍐂��c�c";
			mes "�����A�����炵�Ă������c�c";
			next;
			menu "�܂���V����������!!",-;
			mes "[�G�����R�E�P�[��]";
			mes "���c�c�����������ˁB";
			mes "�N����J�������낤�B";
			mes "�悩�����玄�̏���ɂȂ�Ȃ����H";
			mes "�͂͂́c�c��k���B";
			mes "���ꂶ��A�񑩂����Ƃ���c�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "���̂̃R���N�V�����̒�����";
			mes "������悤�B";
			mes "�����o�邩�A����͂��y���݂��B";
			next;
			set '@card,rand(1,1210);
			if('@card > 0 && '@card < 11)	// �|�����J�[�h
				set '@gain,4001;
			else if('@card > 10 && '@card < 21)	// �t�@�u���J�[�h
				set '@gain,4002;
			else if('@card > 20 && '@card < 26)	// �v�p�J�[�h
				set '@gain,4003;
			else if('@card > 25 && '@card < 41)	// �h���b�v�X�J�[�h
				set '@gain,4004;
			else if('@card > 40 && '@card < 51)	// ���i�e�B�b�N�J�[�h
				set '@gain,4006;
			else if('@card > 50 && '@card < 56)	// �y�R�y�R�̗��J�[�h
				set '@gain,4007;
			else if('@card > 55 && '@card < 71)	// �s�b�L�J�[�h
				set '@gain,4008;
			else if('@card > 70 && '@card < 81)	// �`�����`�����J�[�h
				set '@gain,4009;
			else if('@card > 80 && '@card < 91)	// �E�B���[�J�[�h
				set '@gain,4010;
			else if('@card > 90 && '@card < 101)	// ��峂̗��J�[�h
				set '@gain,4012;
			else if('@card > 100 && '@card < 111)	// �A���h���̗��J�[�h
				set '@gain,4013;
			else if('@card > 110 && '@card < 121)	// ���b�_�t���b�O�J�[�h
				set '@gain,4014;
			else if('@card > 120 && '@card < 131)	// �R���h���J�[�h
				set '@gain,4015;
			else if('@card > 130 && '@card < 141)	// ��峃J�[�h
				set '@gain,4016;
			else if('@card > 140 && '@card < 151)	// �T�x�[�W�x�x�J�[�h
				set '@gain,4017;
			else if('@card > 150 && '@card < 171)	// �z�[�l�b�g�J�[�h
				set '@gain,4019;
			else if('@card > 170 && '@card < 181)	// �t�@�~���A�[�J�[�h
				set '@gain,4020;
			else if('@card > 180 && '@card < 191)	// ���b�J�[�J�[�h
				set '@gain,4021;
			else if('@card > 190 && '@card < 201)	// �X�|�A�J�[�h
				set '@gain,4022;
			else if('@card > 200 && '@card < 211)	// �q�f�U�[�g�E���t�J�[�h
				set '@gain,4023;
			else if('@card > 210 && '@card < 221)	// �v�����N�g���J�[�h
				set '@gain,4024;
			else if('@card > 220 && '@card < 231)	// �X�P���g���J�[�h
				set '@gain,4025;
			else if('@card > 230 && '@card < 241)	// ����峃J�[�h
				set '@gain,4026;
			else if('@card > 240 && '@card < 251)	// �N�N���J�[�h
				set '@gain,4027;
			else if('@card > 250 && '@card < 261)	// �^���E�J�[�h
				set '@gain,4028;
			else if('@card > 260 && '@card < 271)	// �E���t�J�[�h
				set '@gain,4029;
			else if('@card > 270 && '@card < 281)	// �}���h���S���J�[�h
				set '@gain,4030;
			else if('@card > 280 && '@card < 291)	// �y�R�y�R�J�[�h
				set '@gain,4031;
			else if('@card > 290 && '@card < 301)	// �A���o�[�i�C�g�J�[�h
				set '@gain,4032;
			else if('@card > 300 && '@card < 311)	// �|�|�����J�[�h
				set '@gain,4033;
			else if('@card > 310 && '@card < 321)	// ���[���e�[���J�[�h
				set '@gain,4034;
			else if('@card > 320 && '@card < 326)	// �q�h���J�[�h
				set '@gain,4035;
			else if('@card > 325 && '@card < 341)	// ���J�[�J�[�h
				set '@gain,4036;
			else if('@card > 340 && '@card < 351)	// �X�l�C�N�J�[�h
				set '@gain,4037;
			else if('@card > 350 && '@card < 361)	// �]���r�J�[�h
				set '@gain,4038;
			else if('@card > 360 && '@card < 371)	// �X�^�C�i�[�J�[�h
				set '@gain,4039;
			else if('@card > 370 && '@card < 376)	// �N���[�~�[�J�[�h
				set '@gain,4040;
			else if('@card > 375 && '@card < 391)	// �R�[�R�[�J�[�h
				set '@gain,4041;
			else if('@card > 390 && '@card < 401)	// �X�`�[���`�����`�����J�[�h
				set '@gain,4042;
			else if('@card > 400 && '@card < 411)	// �A���h���J�[�h
				set '@gain,4043;
			else if('@card > 410 && '@card < 421)	// �X���[�L�[�J�[�h
				set '@gain,4044;
			else if('@card > 420 && '@card < 431)	// �z�����J�[�h
				set '@gain,4045;
			else if('@card > 430 && '@card < 441)	// �}�[�e�B���J�[�h
				set '@gain,4046;
			else if('@card > 440 && '@card < 451)	// �|�C�Y���X�|�A�J�[�h
				set '@gain,4048;
			else if('@card > 450 && '@card < 461)	// �o�h���J�[�h
				set '@gain,4049;
			else if('@card > 460 && '@card < 466)	// �Y��峃J�[�h
				set '@gain,4050;
			else if('@card > 465 && '@card < 481)	// ���[���[�J�[�h
				set '@gain,4051;
			else if('@card > 480 && '@card < 491)	// �G���_�[�E�B���[�J�[�h
				set '@gain,4052;
			else if('@card > 490 && '@card < 496)	// �r�^�^�J�[�h
				set '@gain,4053;
			else if('@card > 495 && '@card < 511)	// �}���i�J�[�h
				set '@gain,4055;
			else if('@card > 510 && '@card < 521)	// �_�X�e�B�l�X�J�[�h
				set '@gain,4056;
			else if('@card > 520 && '@card < 536)	// ���^�����J�[�h
				set '@gain,4057;
			else if('@card > 535 && '@card < 541)	// �^���t���b�O�J�[�h
				set '@gain,4058;
			else if('@card > 540 && '@card < 551)	// �h���b�v�X�J�[�h
				set '@gain,4004;
			else if('@card > 550 && '@card < 561)	// �S�u�����J�[�h
				set '@gain,4060;
			else if('@card > 560 && '@card < 571)	// �J�i�g�E�X�J�[�h
				set '@gain,4061;
			else if('@card > 570 && '@card < 581)	// �A�i�R���_�N�J�[�h
				set '@gain,4062;
			else if('@card > 580 && '@card < 596)	// �L���������J�[�h
				set '@gain,4063;
			else if('@card > 595 && '@card < 601)	// �[�����J�[�h
				set '@gain,4064;
			else if('@card > 600 && '@card < 606)	// �J�z�J�[�h
				set '@gain,4065;
			else if('@card > 605 && '@card < 621)	// �I�[�N�E�H���A�[�J�[�h
				set '@gain,4066;
			else if('@card > 620 && '@card < 631)	// ���K���h���J�[�h
				set '@gain,4067;
			else if('@card > 630 && '@card < 641)	// �X�R�[�s�I���J�[�h
				set '@gain,4068;
			else if('@card > 640 && '@card < 651)	// �h���C�����A�[�J�[�h
				set '@gain,4069;
			else if('@card > 650 && '@card < 661)	// �I�[�N�]���r�J�[�h
				set '@gain,4071;
			else if('@card > 660 && '@card < 671)	// �S�[�����J�[�h
				set '@gain,4072;
			else if('@card > 670 && '@card < 681)	// �p�C���[�c�X�P���J�[�h
				set '@gain,4073;
			else if('@card > 680 && '@card < 691)	// �r�b�O�t�b�g�J�[�h
				set '@gain,4074;
			else if('@card > 690 && '@card < 701)	// �A���S�X�J�[�h
				set '@gain,4075;
			else if('@card > 700 && '@card < 716)	// ���@�ʃJ�[�h
				set '@gain,4076;
			else if('@card > 715 && '@card < 721)	// �t�F���J�[�h
				set '@gain,4077;
			else if('@card > 720 && '@card < 726)	// �}���e�B�X�J�[�h
				set '@gain,4079;
			else if('@card > 725 && '@card < 741)	// �t���[���J�[�h
				set '@gain,4080;
			else if('@card > 740 && '@card < 751)	// �z�[�h�J�[�h
				set '@gain,4081;
			else if('@card > 750 && '@card < 761)	// �f�U�[�g�E���t�J�[�h
				set '@gain,4082;
			else if('@card > 760 && '@card < 766)	// ���t���V�A�J�[�h
				set '@gain,4083;
			else if('@card > 765 && '@card < 781)	// �}�����X�t�B�A�[�J�[�h
				set '@gain,4084;
			else if('@card > 780 && '@card < 791)	// �I�[�N�X�P���g���J�[�h
				set '@gain,4085;
			else if('@card > 790 && '@card < 796)	// �\���W���[�X�P���g���J�[�h
				set '@gain,4086;
			else if('@card > 795 && '@card < 811)	// �K�C�A�X�J�[�h
				set '@gain,4087;
			else if('@card > 810 && '@card < 816)	// �t�����h���J�[�h
				set '@gain,4088;
			else if('@card > 815 && '@card < 831)	// �\�[�h�t�B�b�V���J�[�h
				set '@gain,4089;
			else if('@card > 830 && '@card < 841)	// ���i�b�N�J�[�h
				set '@gain,4090;
			else if('@card > 840 && '@card < 851)	// �R�{���h�J�[�h
				set '@gain,4091;
			else if('@card > 850 && '@card < 861)	// �X�P�����[�J�[�J�[�h
				set '@gain,4092;
			else if('@card > 860 && '@card < 871)	// �I�{���k�J�[�h
				set '@gain,4093;
			else if('@card > 870 && '@card < 881)	// �A�[�`���[�X�P���g���J�[�h
				set '@gain,4094;
			else if('@card > 880 && '@card < 891)	// �}���X�J�[�h
				set '@gain,4095;
			else if('@card > 890 && '@card < 901)	// �[�m�[�N�J�[�h
				set '@gain,4096;
			else if('@card > 900 && '@card < 906)	// �}�[�^�[�J�[�h
				set '@gain,4097;
			else if('@card > 905 && '@card < 921)	// �h�P�r�J�[�h
				set '@gain,4098;
			else if('@card > 920 && '@card < 931)	// �p�T�i�J�[�h
				set '@gain,4099;
			else if('@card > 930 && '@card < 941)	// �\�q�[�J�[�h
				set '@gain,4100;
			else if('@card > 940 && '@card < 951)	// �T���h�}���J�[�h
				set '@gain,4101;
			else if('@card > 950 && '@card < 956)	// �E�B�X�p�[�J�[�h
				set '@gain,4102;
			else if('@card > 965 && '@card < 971)	// �z�����J�[�h
				set '@gain,4103;
			else if('@card > 970 && '@card < 981)	// ���N�C�G���J�[�h
				set '@gain,4104;
			else if('@card > 980 && '@card < 986)	// �}���N�J�[�h
				set '@gain,4105;
			else if('@card > 985 && '@card < 991)	// �}�~�[�J�[�h
				set '@gain,4106;
			else if('@card > 990 && '@card < 996)	// �x���b�g�J�[�h
				set '@gain,4107;
			else if('@card > 995 && '@card < 1001)	// �~�X�g�J�[�h
				set '@gain,4108;
			else if('@card > 1000 && '@card < 1011)	// �W���b�N�J�[�h
				set '@gain,4109;
			else if('@card > 1010 && '@card < 1021)	// �O�[���J�[�h
				set '@gain,4110;
			else if('@card > 1020 && '@card < 1031)	// �X�g���E�t�J�[�h
				set '@gain,4111;
			else if('@card > 1030 && '@card < 1041)	// �}���h�D�[�N�J�[�h
				set '@gain,4112;
			else if('@card > 1040 && '@card < 1051)	// �}���I�l�b�g�J�[�h
				set '@gain,4113;
			else if('@card > 1050 && '@card < 1061)	// �A���M�I�y�J�[�h
				set '@gain,4114;
			else if('@card > 1060 && '@card < 1071)	// �n���^�[�t���C�J�[�h
				set '@gain,4115;
			else if('@card > 1070 && '@card < 1081)	// �C�V�X�J�[�h
				set '@gain,4116;
			else if('@card > 1080 && '@card < 1091)	// �T�C�h���C���_�[�J�[�h
				set '@gain,4117;
			else if('@card > 1090 && '@card < 1101)	// �O���E���h�v�e�B�b�g�J�[�h
				set '@gain,4118;
			else if('@card > 1100 && '@card < 1111)	// �o�[�X���[�J�[�h
				set '@gain,4119;
			else if('@card > 1110 && '@card < 1121)	// �X�J�C�v�e�B�b�g�J�[�h
				set '@gain,4120;
			else if('@card > 1120 && '@card < 1131)	// �f�r���`�J�[�h
				set '@gain,4122;
			else if('@card > 1130 && '@card < 1141)	// ���f���[�T�J�[�h
				set '@gain,4124;
			else if('@card > 1140 && '@card < 1151)	// �f�r�A�X�J�[�h
				set '@gain,4125;
			else if('@card > 1150 && '@card < 1161)	// �~�m�^�E���X�J�[�h
				set '@gain,4126;
			else if('@card > 1160 && '@card < 1171)	// �i�C�g���A�J�[�h
				set '@gain,4127;
			else if('@card > 1170 && '@card < 1176)	// �o�t�H���b�g�W���j�A�J�[�h
				set '@gain,4129;
			else if('@card > 1175 && '@card < 1181)	// ���C�h���b�N�J�[�h
				set '@gain,4133;
			else if('@card > 1180 && '@card < 1186)	// �J�[���b�c�o�[�O�J�[�h
				set '@gain,4136;
			else if('@card > 1185 && '@card < 1191)	// �W���[�J�[�J�[�h
				set '@gain,4139;
			else if('@card > 1190 && '@card < 1196)	// �[���̋R�m�J�[�h
				set '@gain,4140;
			else if('@card > 1195 && '@card < 1201)	// �C�r���h���C�h�J�[�h
				set '@gain,4141;
			else if('@card > 1200 && '@card < 1206)	// �T���^�|�����J�[�h
				set '@gain,4005;
			else
				set '@gain,4001;
			mes "[�G�����R�E�P�[��]";
			mes getitemname('@gain)+ "���ˁB";
			mes "����J�l�B";
			mes "���̌�������`���Ă����";
			mes "�{���ɏ���������B";
			set GOD_3QUE,50;
			if($GodBrysinggamen < 100) {		// ��t��
				set $GodBrysinggamen,$GodBrysinggamen+1;
				if($GodBrysinggamen == 50) {
					announce "�����嗤��[�u���[�V���K����]�̕��󂪎p�������܂����B����",0;
				}
				else if($GodBrysinggamen == 100) {
					if($GodSleipnir == 100 && $GodMagingiorde == 100 && $GodBrysinggamen == 100 && $GodMjolnir == 100)
						announce "����[�u���[�V���K����]�̕��󂪉��������Ƃɂ��S�Ă̕��󂪉����A�_��̍쐬���ł���悤�ɂȂ�܂����B����",0;
					else
						announce "����[�u���[�V���K����]�̕��󂪉����܂����B����",0;
				}
			}
			getitem '@gain,1;
			next;
			mes "[�G�����R�E�P�[��]";
			mes "���̑厖�ȃR���N�V������";
			mes "�������A��؂ɂ��Ă���B";
			mes "�ق�A�����Ă����Ȃ����B";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�܂��@���������A";
			mes "�N�ɗ��݂����ȁB";
			mes "����ł͌��C�łˁB";
			close;
		}
		else if(GOD_3QUE == 48) {
			mes "[�G�����R�E�P�[��]";
			mes "�������Ă���񂾁H";
			mes "�͂₭���Ȃ����c�c";
			mes "�u�c�u�c�c�c";
			emotion 2;
			close;
		}
		else if(GOD_3QUE == 47) {
			mes "[�G�����R�E�P�[��]";
			mes "�ӂށc�c�l�̕���";
			mes "�������̂��ȁc�c";
			mes "����Ŗ{���Ƀu���[�V���K������";
			mes "����̂�!?";
			mes "����łǂ�����č��̂��ˁH";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�N�����W������������";
			mes "���ɂ킩�������Ƃ͂܂��c�c";
			mes "�t���C���̗܂��ł܂������B";
			mes "�t���C���̕�΂Ɓc�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�A���t���b�O�������Ă�������";
			mes "�������ꂽ�c�c��̌����B";
			mes "�h���@������������{����";
			mes "�����Ă������A���Ȃ킿";
			mes "������C�B";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�x�[�����O�������Ă���";
			mes "���_�̗܂ō��ꂽ��c�c";
			mes "�������牽���o���̂���";
			mes "�悭�������ȁc�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�����āA����ɂ��Ȃ�h���";
			mes "�h��ȋ�̑����c�c";
			mes "�O���[�������߂Ă������̂��낤�B";
			mes "����炪�u���[�V���K������";
			mes "�\�����錳�ɂȂ��Ă���̂ł�";
			mes "�Ȃ����낤���c�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�N�͂ǂ��l����H";
			next;
			switch(select("�����Ɍ����ƁA������Ȃ��ł��c�c","����ł����Ƃł���Ǝv���܂�")) {
			case 1:
				mes "["+strcharinfo(0)+"]";
				mes "�ł��c�c";
				mes "�ނ�ɕ����Ă݂�΂킩��ł��傤�B";
				mes "�A���t���b�O�Ƃ��c�c";
				next;
				mes "[�G�����R�E�P�[��]";
				mes "����!!!!!!!";
				mes "�N�A�����ˁI";
				mes "�悵�A���ꂶ�႟�N�A�s���Ă��Ă���B";
				mes "�҂��Ă��!!!!";
				mes "���̌����̊�]��!!";
				next;
				emotion 9,"";
				mes "["+strcharinfo(0)+"]";
				mes "�c�c���A���������Ă��c�c";
				next;
				mes "[�G�����R�E�P�[��]";
				mes "�������Ă���񂾁I";
				mes "�����s���Ă����܂��I";
				set GOD_3QUE,48;
				close;
			case 2:
				mes "["+strcharinfo(0)+"]";
				mes "������x�\���͂��܂��B";
				mes "��͂�c�c�ށA�x�[�����O��";
				mes "�֌W���Ă���Ƃ����";
				mes "�J�M���B����Ă���̂ł́B";
				next;
				mes "[�G�����R�E�P�[��]";
				mes "�m���ɂ������B";
				mes "�悵�A���ꂶ�႟�N�A�s���Ă��Ă���B";
				mes "���́c�c�N���c�c�A���t���b�O�B";
				mes "�ނɉ���ė��Ă���B";
				next;
				mes "[�G�����R�E�P�[��]";
				mes "�悵�悵�A���ꂶ�႟���񂾂��I";
				set GOD_3QUE,48;
				close;
			}
		}
		else if(GOD_3QUE == 46) {
			mes "[�G�����R�E�P�[��]";
			mes "���悢��̂��Ȃ����Ă����ȁc�c";
			mes "����A�҂Ă�c�c";
			mes "���́A�O���[���Ƃ����h���[�t��";
			mes "�܂Ƃ��ɘb�����Ȃ����c�c";
			mes "�c�c�p�z�ɂ������X�^�[������ȁB";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "��ς����A�ނƉ���Ęb����";
			mes "�����ł����������o���񂾁B";
			mes "���񂾁B";
			close;
		}
		else if(GOD_3QUE == 45) {
			mes "[�G�����R�E�P�[��]";
			mes "���������c�c";
			mes "�̎���Y�ꂽ�̂��ˁH";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�x�[�����O�ɂ܂������Ă݂邵���Ȃ��B";
			mes "�����̗p�ӂ����ĂȁB";
			close;
		}
		else if(GOD_3QUE == 44) {
			mes "[�G�����R�E�P�[��]";
			mes "�ق��`�A��͉������̂��ˁH";
			mes "����H�@������������C���c�c";
			mes "����͏��_�̗܁c�c���H";
			mes "����Ŏl�Ԗڂ̃O���[����";
			mes "����m���Ă���񂾁c�c�H";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�Ƃɂ����p�z�ɓ���Ȃ����";
			mes "�Ȃ�Ȃ��悤���ȁc�c";
			mes "�N�ɂ���J��������c�c";
			mes "�����A���҂��Ă��邼�I";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�N�̂������ŁA���͖ʔ���";
			mes "�������������킩���Ă����B";
			mes "�ڂ������Ƃ͑S�Ă��I�������";
			mes "�b�����B";
			mes "����ł́A�p�z�Ɍ������Ă���B";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�����X�^�[�ɂ͋C������悤�ɁB";
			close;
		}
		else if(GOD_3QUE == 43) {
			mes "[�G�����R�E�P�[��]";
			mes "��͂�҂����������������悤���ȁB";
			mes "�h���@���������������̓��";
			mes "���炭�A�I���Ȃ��푈�̂��Ƃ�";
			mes "�w���Ă���񂾂낤�ȁB";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "��l�̉��������B";
			mes "�ނ炪����20���̋R�m������";
			mes "���̖���s�����Đ�����B";
			mes "�����Ԃ��Ă͎��ɁA�܂������";
			mes "���ʂƂ����i�����c�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�ނ炪�ЂƂ��ѐ푈���N������";
			mes "��n�ő����̐�m�����ʁB";
			mes "���@���L���[�͔ނ��A��Ă����c�c";
			mes "�����ă��@���n���͐�m�ł��ӂꂽ�B";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "����͂����̓`���ŁA�N�ł�";
			mes "�m���Ă��邱�Ƃ����c�c";
			mes "���ۂɂ��������Ƃ��Ƃ����̂�����";
			mes "�ʔ����c�c";
			mes "�Ƃ���Łc�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "���̓x�[�����O�Ƃ����h���[�t���H";
			mes "�v���[���e���̐���ɗ����";
			mes "��̎x�����~�����j�[���p�z�O";
			mes "�ɗ���Ă���炵���B";
			mes "�h���@�����̌������ꏊ�Ƃ����̂�";
			mes "�����ł͂Ȃ����H";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�{���ɐ�Ȃ̂��c�c�H";
			mes "�͂����肵�Ȃ��񂾂�ȁc�c";
			mes "���̓�����ׂĂ݂Ȃ��ƁB";
			mes "�悵�A�s���Ă��Ă���I";
			close;
		}
		else if(GOD_3QUE == 42) {
			mes "[�G�����R�E�P�[��]";
			mes "����͖{�����ˁH";
			mes "���������������Ă������̂��{����";
			mes "�t���C���̋P������肾�����Ƃ́c�c";
			mes "�u���[�V���K�����Ƃ͑��݂���";
			mes "���������񂾂ȁH";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�l�l�̃h���[�t���o�߂�΁c�c";
			mes "�u���[�V���K���������Ɏp��������";
			mes "�����̂�!!!!";
			mes "���́c�c�N�̂悤�Ȏ҂Ɏ�`����";
			mes "������Ė{���ɉ^�������c�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "���̐����I���܂ł�";
			mes "�_�̗͂�������Ƃ́c�c";
			mes "�����c�c";
			mes "�c�c�Ƃɂ����A�h���@�����������Ă���";
			mes "�ꏊ������c�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "���̐X�̈�{���ƌ��������c�c";
			mes "�����N����������C���@�c�c";
			mes "�c�c�̋߂��ł͂Ȃ����B";
			mes "�����c�c���̐����ɂ����Ȃ����c�c";
			mes "�s���Ă݂Ȃ���΂킩��܂��B";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�N�A������ƍs���Ă��Ă���Ȃ����B";
			mes "���͂��̂������̒��󂪉���";
			mes "�Ӗ����Ă���̂���m�肽���B";
			mes "�����N���邩�m�肽���Ȃ����H";
			mes "�ӂӂӁc�c�͂͂́I";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "���ꂶ�႟���񂾂��B";
			mes "�l�Ԃ̎�ɓ���̂��c�c";
			mes "���̋���ȗ͂��c�c";
			mes "�͂́c�c�����j�ł̓���";
			mes "�ǂ����܂Ȃ����낤���H";
			mes "�͂͂͂́c�c";
			close;
		}
		else if(GOD_3QUE == 41) {
			mes "[�G�����R�E�P�[��]";
			mes "�ȁA���A���Č������񂾁H";
			mes "�A���t���b�O�ɉ�����̂��I";
			mes "�N�͖{���ɑI�΂ꂽ�҂Ȃ񂾂ȁI";
			mes "�`���̃A���t���b�O�������������c�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�A���t���b�O�͏��_�t���C����";
			mes "�P������������ĕ�����";
			mes "�l�l�̃h���[�t�̒��̈�l���B";
			mes "�������h���@���������̒���l���B";
			mes "����Ȃ�c�c";
			mes "�u���[�V���K�����̍Č����c�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "���ƌN�́A�ǂ���炷��������";
			mes "�T���Ă����悤���ˁB";
			mes "�h���@�����c�c";
			mes "�ǂ��ɖ����Ă���̂��c�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "���������΁A�N�B";
			mes "���̃A���t���b�O��";
			mes "�ǂ����ăh���@�����̋��ꏊ��";
			mes "�����Ă��Ȃ������񂾁c�c";
			mes "�����c�c";
			close;
		}
		else if(GOD_3QUE == 40) {
			mes "[�G�����R�E�P�[��]";
			mes "���e�B�G�֍s���Ă݂�񂾁B";
			mes "�m���ɏ��_�̎肪���肪����͂����B";
			mes "�N�̓��@���L���[�ɂ͉���Ă��Ȃ���";
			mes "�T�����Ƃ͂ł��邾�낤�B";
			mes "�����āc�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "^4d4dff�����ƐL�т����̑��� ";
			mes "�킵�����̔���";
			mes "�P�����̓���";
			mes "���͐S�A���������^000000";
			mes "���ꂪ�肪����̉̂��B";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�Ӗ��͂悭������Ȃ����c�c";
			mes "�����m���Ă��邱�̉̂�";
			mes "���ۂ̂��̂���v���Ă���̂�����";
			mes "���ƂȂ��Ă͋^�₾���c�c";
			mes "�Ƃɂ����A���͑��̂��Ƃ𒲂ׂĂ݂�B";
			close;
		}
		else if(GOD_3QUE == 35) {
			mes "[�G�����R�E�P�[��]";
			mes "��J�����悤���ˁB";
			mes "�������ɂ��Ȃ����B";
			mes "�G�[���~�b�g�����ƁH";
			next;
			mes "- ���Ȃ��̓G�[���~�b�g�̘b�� -";
			mes "- ���̂܂ܓ`�����B -";
			mes "- �����ă��@���L���[���� -";
			mes "- �������b���B -";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�������ȁI";
			mes "����Ȃ��Ƃ��������̂��I";
			mes "��͂�c�c����͎��̐����ʂ�";
			mes "�_�̗͂������Ă����̂ł͂Ȃ����B";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "���{�ɒ����肢���o���đ�����";
			mes "��������������ɗ�������������Ȃ��B";
			mes "������Ƌ߂��ɗ��Ă����B";
			next;
			mes "- �G�����R�͏������낳�ꂽ";
			mes "���̒�����";
			mes "���ɖ{���ɂ��̂悤�Ȃ��̂�";
			mes "���݂���̂���";
			mes "�^���Ă��܂��قǂɔ�����";
			mes "��΂��o�����B";
			next;
			mes "- �܂�ŏ��_�̗܂̂悤��";
			mes "�P���Ă���B";
			mes "�G�����R�̌����ʂ�߂���";
			mes "��̌�����u���� ";
			mes "�݂��ɋ����������B -";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�ǂ����H�@�������낤�H";
			mes "�������@���L���[�̌������Ƃ���Ȃ�";
			mes "����͏��_�t���C���̗܂�";
			mes "�ł܂��Ăł�����΂��B";
			mes "�ӂӁc�c";
			mes "�_�̗́c�c���c�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "���̂��̎���ɂ����";
			mes "���ۂ������̂��c�c";
			mes "�c�c�Ƃɂ����A�N�̋�J�ɂ͊��ӂ���B";
			mes "���͌N�����@���L���[���畷����";
			mes "�Z�����ɂ��čl���Ă݂悤�c�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�m���ɁA�₽����̓�";
			mes "���_���n��������";
			mes "��{���Ǝl�l�̃h���[�t�c�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�h���[�t�Ƃ����̂́A";
			mes "�׍H�̋Z�p���������Ƃ���";
			mes "���̃h���[�t�Ƃ����푰�̂���";
			mes "���낤���c�c";
			mes "��Ɓc�c��{���͔͈͂��L������ȁB";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�悵�I�@�N�����ׂ����Ƃ�";
			mes "���܂����ȁI";
			next;
			switch(select("��!?�@�I��肶��Ȃ������̂ł����H","���x�͉��ł��傤�H")) {
			case 1:
				mes "[�G�����R�E�P�[��]";
				mes "�I���Ȃ킯�����邩!!";
				mes "�N�����ׂ��Ȃ̂́A���̌�����";
				mes "��`�����Ƃ��낤�H";
				mes "��x�n�߂����ƂȂ̂�����";
				mes "�Ō�܂Ŏ�`���Ȃ����I";
				next;
				mes "[�G�����R�E�P�[��]";
				mes "�����A�N�̍s���Ƃ���͌��܂����B";
				mes "���e�B�G���B";
				mes "�����ŉ����肪�����T���Ăق����B";
				mes "�`���ɂ��Ƃ������c�c";
				break;
			case 2:
				mes "[�G�����R�E�P�[��]";
				mes "�ق��`�A�����肪�悢�̂͂������Ƃ��B";
				mes "�������l�����I�b�h���Љ�Ă��ꂽ";
				mes "�`���Ƃ��B";
				mes "�Ƃɂ����A�N�����ׂ����Ƃ�";
				mes "���̌�������`�����Ƃ�����";
				mes "�Ō�܂ŗ��񂾂��B";
				next;
				mes "[�G�����R�E�P�[��]";
				mes "�����A�N�̍s���ꏊ�͌��܂��Ă��邼�B";
				mes "���e�B�G���I";
				mes "�����ŉ��炩�̎肪�����{���Ă���B";
				mes "�`���ɂ��΂������c�c";
				break;
			}
			next;
			mes "[�G�����R�E�P�[��]";
			mes "���_�͖l�̔L���ނ���";
			mes "��l����ŗ₽����̓���";
			mes "�����Ȃ���΂Ȃ�Ȃ������B";
			mes "�����h�������ɁA���_�̖ڂ���";
			mes "�܂��������B";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "���ہA���̃t���C���̕�΂�";
			mes "�Ă΂�邱�ꂪ�ŏ��ɔ���";
			mes "���ꂽ�̂̓��e�B�G������ˁB";
			mes "���̉����̘̂b�͂���Ȃɂ�";
			mes "��X�̋߂��Ɏc���Ă����񂾂ȁB";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�N�͂܂����e�B�G�ɍs���āA";
			mes "���@���L���[�̘b�ʂ�";
			mes "���_�̐Ղ�T���Ă���悤�ɁB";
			mes "���_����X�Ɏc�����╨��";
			mes "���Ȃ̂��B";
			mes "������m�F���Ă��ė~�����B�����ȁH";
			set GOD_3QUE,40;
			close;
		}
		else if(GOD_3QUE > 9 && GOD_3QUE < 35) {
			mes "[�G�����R�E�P�[��]";
			mes "����Ȃ��Ƃ��������̂��c�c";
			mes "�ӂށc�c�N�ɂ͈�����";
			mes "������x�s���Ă��ė~�����B";
			mes "��V�͂͂��ށB";
			mes "�������ȁc�c���̃R���N�V������";
			mes "���̈���N�ɂ������B";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "���܂��s���悤�ɋF���Ă��邼�B";
			mes "�N���C�����ĂȁB";
			close;
		}
		else if(GOD_3QUE > 3 && GOD_3QUE < 10) {
			mes "[�G�����R�E�P�[��]";
			mes "�G�[���~�b�g�ɉ�����̂��H";
			mes "!?�@�ނ�����ȏ������c�c";
			mes "�N����ς����A����������ށB";
			mes "�ނ̊肢�𕷂��āA�ǂ����ʂ�";
			mes "�o���Ă���邱�Ƃ��F��B";
			close;
		}
		else if(GOD_3QUE == 3) {
			mes "[�G�����R�E�P�[��]";
			mes "����H�@�G�[���~�b�g���ˁH";
			mes "����ɑ΂���肪����H";
			mes "���`��c�c���̋L���ł́c�c";
			mes "�����e�������͋C��";
			mes "�Ⴂ�N�������ȁc�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�������A���̕�̑O�ɋ���";
			mes "���삳��ɕ����Č��Ȃ����B";
			mes "���܂ꂽ���̂��牽��";
			mes "�킩�邩������Ȃ�����ˁB";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "���H";
			mes "�ǂ����Ē��ڒT���Ȃ����������āH";
			mes "�����c�c���������V�������c�c";
			mes "��������˗����ꂽ������������";
			mes "�Ȃ��O�����Ƃ��ł��Ȃ�����ȁB";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "������N�̂悤�ȗ������������";
			mes "�Ă񂾂Ƃ����킯���B";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "���A�ʂɐl��T�����炢��";
			mes "�������g���̂�����������";
			mes "�����킯����Ȃ����B";
			mes "�Ƃɂ����A���񂾁B";
			close;
		}
		else if(GOD_3QUE == 2) {
			mes "[�G�����R�E�P�[��]";
			mes "����A�l���Ă݂������H";
			mes "�܂��������Ă���Ȃ��̂��c�c";
			mes "�d�������Ă����Ε�V��";
			mes "�\���ɂ�������肾�B";
			mes "�ǂ����H";
			next;
			if(select("��͂茙�ł�","�󂯂܂�") == 1) {
				mes "[�G�����R�E�P�[��]";
				mes "���`�ށc�c�B";
				mes "�˗����畷���Ă����Ƃ́c�c";
				mes "�������Ȃ��A���������邪";
				mes "�܂��C���ς������";
				mes "���ł��K�˂Ă��Ȃ����B";
				close;
			}
			mes "[�G�����R�E�P�[��]";
			mes "�����A����͖{�����ˁI";
			mes "����ł͑������B";
			mes "�܂���������Ă���B";
			next;
			mes "- �N���Ƃ����w�҂�";
			mes "���ɓ����Ă���";
			mes "���锒���ď����Ȍ�����";
			mes "�����Ă��ꂽ�B";
			mes "����͂܂�Ŕ������[�X�҂݂�";
			mes "�悤�ɂ������A�ƂĂ��₽������ -";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "����́A��̌������B";
			mes "���̖͗l�͂܂���������Ȃ̂��B";
			mes "���̕ӂɂ��悤�A������Ƃ����Ȃ��B";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "���N���O�ɁA����`���Ƃ̐N��";
			mes "�s�v�c�ȕ����E�����ƌ�����";
			mes "���ɂ�������ꂽ�񂾁B";
			mes "�����A���ꂪ���Ȃ̂���";
			mes "�܂������킩��Ȃ������c�c";
			mes "���͒m�肽���񂾁B����̐��̂��B";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�����l��T���Ă���ƌ��������ȁH";
			mes "�����A�܂��Ɏ��ɂ��̌��������ꂽ";
			mes "���̐N�̂Ƃ���ɍs���ė~�����B";
			mes "���O�́c�c�������ȁc�c";
			mes "�ǂ����ɏ�����Ă����͂������c�c";
			mes "�������B�G�[���~�b�g�E�V���������B";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�ނ̂Ƃ���ɒ�������A�������";
			mes "�����n���ė~�����B";
			mes "��������Ĕނ�����K�˂Ă���邩";
			mes "�N��ʂ��Ă���ɑ΂��铚����";
			mes "�`���Ă����΂����B";
			mes "����ł́A���񂾁B";
			next;
			mes "^4d4dff - �G�����R�E�P�[����";
			mes "���Ȃ��ɐԂ��낤������";
			mes "������������������o�����B";
			mes "����ɂ�";
			mes "�u�G�[���~�b�g�E�V�������ցv��";
			mes "������Ă���B -^000000";
			set GOD_3QUE,3;
			close;
		}
		else if(GOD_3QUE == 1) {
			mes "[�G�����R�E�P�[��]";
			mes "�Ȃ񂾁H�@�����I�N���I";
			mes "���O�́c�c";
			mes strcharinfo(0)+ "���ˁH";
			mes "�l�����I�b�h�����";
			mes "�����A����������Ă����B";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�����ɖ��ɗ��ǂ��l����";
			mes "�Љ�Ă������ĂˁB";
			mes "�����܂ŗ���̂͑�ς������낤�c�c";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�����A�N���炢�̖`���ƂȂ�";
			mes "�W���m�[�ɗ��邭�炢���₷�����B";
			mes "���̃J�v���c�c";
			mes "�����A�J�v���T�[�r�X�ł�";
			mes "�����Ƃ����Ԃɒ����ȁI";
			mes "�n�b�n�b�n�I";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�����N�ɗ��݂����̂́A";
			mes "���̌�������`�����Ƃ��B";
			mes "��̓I�Ɍ����ƁA���̌�����";
			mes "�K�v�Ȃ���l����T���Ă���";
			mes "�~�����̂��B";
			next;
			mes "[�G�����R�E�P�[��]";
			mes "�N�͖`���Ƃ̒��ł����Ȃ�ǂ�";
			mes "�f���������Ă���񂶂�Ȃ����H";
			mes "�l�����I�b�h���N�����Ȃ�L�\��";
			mes "�`���Ƃ��ƌ����Ă�����łˁB";
			next;
			switch(select("�l�{���͂�����Ɓc�c","�����{���܂�!!")) {
			case 1:
				mes "[�G�����R�E�P�[��]";
				mes "�������c�c";
				mes "��`���Ă����Ɗm�M���Ă�����";
				mes "���������炵�����Ȃ��c�c";
				mes "���̖`���Ƃ�T���Ă݂邩�c�c";
				mes "�������������Ⴏ��Ύ�����";
				mes "�T�����̂��c�c";
				next;
				mes "[�G�����R�E�P�[��]";
				mes "�������C���ς������";
				mes "���ł��K�˂Ă��Ȃ����B";
				mes "�����܂ő����^�΂��Ă��܂Ȃ������B";
				mes "����ł͌��C�łȁB";
				set GOD_3QUE,2;
				close;
			case 2:
				mes "[�G�����R�E�P�[��]";
				mes "�����A����͖{�����ˁI";
				mes "����ł͑������B";
				mes "�܂���������Ă���B";
				next;
				mes "- �N���Ƃ����w�҂�";
				mes "���ɓ����Ă���";
				mes "���锒���ď����Ȍ�����";
				mes "�����Ă��ꂽ�B";
				mes "����͂܂�Ŕ������[�X�҂݂�";
				mes "�悤�ɂ������A�ƂĂ��₽������ -";
				next;
				mes "[�G�����R�E�P�[��]";
				mes "����́A��̌������B";
				mes "���̖͗l�͂܂���������Ȃ̂��B";
				mes "���̕ӂɂ��悤�A������Ƃ����Ȃ��B";
				next;
				mes "[�G�����R�E�P�[��]";
				mes "���N���O�ɁA����`���Ƃ̐N��";
				mes "�s�v�c�ȕ����E�����ƌ�����";
				mes "���ɂ�������ꂽ�񂾁B";
				mes "�����A���ꂪ���Ȃ̂���";
				mes "�܂������킩��Ȃ������c�c";
				mes "���͒m�肽���񂾁B����̐��̂��B";
				next;
				mes "[�G�����R�E�P�[��]";
				mes "�����l��T���Ă���ƌ��������ȁH";
				mes "�����A�܂��Ɏ��ɂ��̌��������ꂽ";
				mes "���̐N�̂Ƃ���ɍs���ė~�����B";
				mes "���O�́c�c�������ȁc�c";
				mes "�ǂ����ɏ�����Ă����͂������c�c";
				mes "�������B�G�[���~�b�g�E�V���������B";
				next;
				mes "[�G�����R�E�P�[��]";
				mes "�ނ̂Ƃ���ɒ�������A�������";
				mes "�����n���ė~�����B";
				mes "��������Ĕނ�����K�˂Ă���邩";
				mes "�N��ʂ��Ă���ɑ΂��铚����";
				mes "�`���Ă����΂����B";
				mes "����ł́A���񂾁B";
				next;
				mes "^4d4dff - �G�����R�E�P�[����";
				mes "���Ȃ��ɐԂ��낤������";
				mes "������������������o�����B";
				mes "����ɂ�";
				mes "�u�G�[���~�b�g�E�V�������ցv��";
				mes "������Ă���B -^000000";
				set GOD_3QUE,3;
				close;
			}
		}
		mes "[�G�����R�E�P�[��]";
		mes "���̗p�ŗ����̂��m���";
		mes "���ƂĂ��Z�����̂��B";
		mes "�ז����Ȃ��ł��ꂽ�܂��B";
		close;
	}
	mes "[�������̊w��]";
	mes "�ԃ|�[�V�����͂ǂ������";
	mes "����邩�m���Ă��邩�ˁH";
	mes "�ԃn�[�u�����肨�낵�A";
	mes "�K�ʂ𐅂̒��ł����ƐU��B";
	next;
	mes "[�������̊w��]";
	mes "������|�p�̋��n�Ɏ����";
	mes "�ԃ|�[�V�������V�����";
	mes "�z���͂��Ȃ񂾂��c�c";
	close;
}

prt_church.gat,113,103,1	script	�F��N	86,{
	if($GodMagingiorde < 50) {
		mes "[�F��N]";
		mes "�c�c�u�c�u�c�u�c�c�c";
		mes "�F���K���ɕ�点�܂��悤�Ɂc�c";
		mes "�����w�������Â�������";
		mes "�哖�肵�܂��悤�Ɂc�c";
		close;
	}
	if($GodBrysinggamen == 100) {
		mes "[�F��N]";
		mes "�������x�U��Ԃ�A����̉ߋ���";
		mes "�ǂ��������̂��A�����Ė�����";
		mes "�ǂ��Ȃ�̂����l����K�v������܂��B";
		next;
		mes "[�F��N]";
		mes "�c�c���͗����~�܂�ׂ����A";
		mes "�ꏏ�ɋF��܂��傤�B";
		close;
	}
	if(GOD_3QUE > 34) {
		mes "^4d4dff- �ނ͖ڂ��Ԃ苹�Ɏ�����āA";
		mes "�F�������Ă����B�������c�c";
		mes "�߂��������B -^000000";
		close;
	}
	else if(GOD_3QUE == 34) {
		mes "[�G�[���~�b�g�E�V������]";
		mes "�c�c�́c�c�͂͂́c�c";
		mes "�����A���@���n���֍s�����̂ł����B";
		mes "����͏j��Ȃ����Ⴂ���Ȃ��ł��ˁB";
		mes "���[�E�F���c�c���[�E�F���c�c";
		mes "�c�c�������ɂ����";
		mes "�l�������Ȃ������ł��ˁc�c";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "��������A���������Ƃ�����܂��B";
		mes "�ޏ���2�N�ԁA�f�r���Ă��܂����̂�";
		mes "���ǁA�l���ޏ��𐶂���������ł��ˁB";
		mes "���������瓦�����Ă��܂�������c�c";
		mes "�c�c���́A�͂͂́c�c";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "�Ȃ̂ɂǂ����āA�l�����ނ̂ł͂Ȃ�";
		mes "���̑S�Ă���������l�Ŕw�����Ȃ�āB";
		mes "�h���������낤�Ɂc�c";
		mes "�Ȃ�Łc�c�l�̂��߂Ɂc�c";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "�c�c�����Ėl�́A�����ޏ���";
		mes "�炤��݂����Ȃ��́H";
		mes "�ŏ����炻�̒��x�ɂ����v����";
		mes "���炦�Ȃ������̂ł��ˁc�c";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "�͂́c�c�͂͂́c�c";
		mes "�ł��A�������肵�܂����B";
		mes "���������Ȃ��A�����K�v��";
		mes "�����Ă��܂������H";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "���������A�G�����R�ɓ`���Ă��������B";
		mes "���X�u����v�͍����É����M���h�Ԃ�";
		mes "�^����A�C�e���̈�������ƁB";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "�l�Ԃ̔\�͂ł͌����ĉ�͂ł��Ȃ�";
		mes "�_��̃A�C�e���B���ꂪ�����Ӗ����邩";
		mes "�m��܂��񂪁c�c�w�҂�����������A";
		mes "���̗͂𓾂��邲���ꕔ�̎҂�";
		mes "�����Ď�ɓ���悤�Ƃ���Ȃǁc�c";
		mes "����ȕ��Ɉ����镨�̂悤�ł��B";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "�c�c���͖l������ł����̂ł���";
		mes "���Ă���Ƌ��낵���Ȃ��Ă����̂�";
		mes "�G�����R�ɂ����܂����B";
		mes "�c�c�u����v�������Ă���1�N�ԁA";
		mes "���������ƃh�L�h�L���Ă���ł���B";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "�����Ă���ɓ�����c�c";
		mes "�H�蒅������́A�Ⴊ�~�葱��";
		mes "��̊X���e�B�G�ł����B";
		mes "�C�����Ɠ��̏�ɂ��������";
		mes "�Ⴊ�ς����Ă��܂����B";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "�����̋���n��A��ŕ���ꂽ";
		mes "�u��o�������̂��Ƃł��B";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "�l�́A�}�ɖ󂪕�����Ȃ����|��";
		mes "�P���A�̂��k���������̂ł��B";
		mes "����Ŗl�͍Q�Ăē����܂����B";
		mes "�b�͈ȏ�ł��B";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "�c�c����܂�����ˁH";
		mes "����������A�����s���Ă��������B";
		mes "�ӂ��`�c�c";
		set GOD_3QUE,35;
		close;
	}
	else if(GOD_3QUE > 19 && GOD_3QUE < 34) {
		mes "[�G�[���~�b�g�E�V������]";
		mes "�c�c�҂��܂��B";
		mes "�N��M���đ҂��܂��B";
		mes "�ޏ���2�N�Ԃ̑��Ղ��A���H�̌�����";
		mes "�����Ă����ƐM���đ҂��܂��傤�B";
		close;
	}
	else if(GOD_3QUE == 12) {
		mes "[�G�[���~�b�g�E�V������]";
		mes "�c�c���G���E�y���V���H";
		mes "�N�ł��傤���c�c���̕��́H";
		mes "�l�̈˗������l�̓��G���ł͂Ȃ�";
		mes "���[�E�F���ł��B";
		mes "���[�E�F���E�G���i�I";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "��ς�������܂��񂪂��肢���܂��B";
		mes "�c�c�ł͂܂���قǁB";
		set GOD_3QUE,10;
		close;
	}
	else if(GOD_3QUE == 11) {
		mes "[�G�[���~�b�g�E�V������]";
		mes "�R�ł��c�c�ޏ������񂾂Ȃ�āc�c";
		mes "����Șb�����邱�ƈʁA�l��";
		mes "�m���Ă��܂��B�ޏ��̑�����";
		mes "���܂�������ˁB�������d�v�Ȃ̂�";
		mes "����͕K�������^���ł͂Ȃ�";
		mes "�Ƃ������Ƃł��B";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "�Q�t�F���ŏ�����������";
		mes "�ޏ������̕�n�ɖ���܂�";
		mes "2�N�̍Ό���������܂����B";
		mes "�l�̌����������Ƃ�����܂����H";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "�ޏ��̑S�Ă�m�肽���c�c";
		mes "�c�c���ɂ��̋󔒂�2�N�ԁB";
		mes "�ޏ��������}�����̂͂Ȃ����A";
		mes "�����m�肽����ł��B";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "�ǂ����Ĕޏ��������Ȃ���";
		mes "���܂����̂��c�c";
		mes "�N�����߂���Ƃ����̂��c�c";
		mes "�l�̋C����������܂����H";
		set GOD_3QUE,20;
		close;
	}
	else if(GOD_3QUE == 10) {
		mes "[�G�[���~�b�g�E�V������]";
		mes "�c�c�ޏ��Ɋւ�����ł��ˁB";
		mes "�_�Ɏd����R�m�A����ɔ�������";
		mes "�c�c�����A�m���ޏ���";
		mes "�N���Z�C�_�[�ł����B";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "�ޏ��̓i�C�g��ڎw���Ă����͂�";
		mes "�Ȃ̂ɁA�}�ɃN���Z�C�_�[�ɂȂ���";
		mes "���͂�����������������܂��B";
		mes "�c�c�����čŌ�Ɍ��������̂�";
		mes "�Q�t�F���^���[�ł����B";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "�{���ɂ��肢���܂�!!";
		mes "�ޏ��Ɋւ��邱�ƂȂ牽�ł������̂�";
		mes "�肪����������Ă�������!!";
		close;
	}
	else if(GOD_3QUE == 5) {
		if(rand(4)) {
			mes "[�G�[���~�b�g�E�V������]";
			mes "�c�c�c�c";
			mes "�c�c�����c�c���߂�Ȃ���";
			mes "���߂�Ȃ����A���[�E�F���B";
			mes "�l�����������c�c";
			mes "�c�c���������Ȃ��̂��߂�";
			mes "���F��������B";
			close;
		}
		mes "[�G�[���~�b�g�E�V������]";
		mes "�܂��s���Ȃ���ł����H";
		mes "����Ƃ��l�̘b��^����";
		mes "�����C�ɂł��Ȃ����̂ł����H";
		next;
		switch(select("���ŕ����܂�","�������܂�")) {
		case 1:
			mes "[�G�[���~�b�g�E�V������]";
			mes "���肪�Ƃ��������܂��B";
			mes "���Ƃ��ʂ肷����ł����Ă�";
			mes "�b�𕷂��Ă����l��";
			mes "���肪�����ł��B";
			mes "�c�c����́A�Â��b�ł��B";
			next;
			mes "[�G�[���~�b�g�E�V������]";
			mes "�́A��l�ڂ����̕n�������N��";
			mes "���܂����B";
			next;
			mes "[�G�[���~�b�g�E�V������]";
			mes "���̏��N�ɂ͗��e�����Ȃ���A";
			mes "�Ƃ�����܂���ł����B���N��";
			mes "�V�[�t�M���h�⃍�[�O�M���h��";
			mes "�g�ɂ������Ƃ𐶂�����";
			mes "�������Ȃ�����A��������l��";
			mes "��������Ɏ����߂����Ă��܂����B";
			next;
			mes "[�G�[���~�b�g�E�V������]";
			mes "�܂��c�������̂ŁA���N�͂��̓���";
			mes "�������������Ő���t�������̂ł��B";
			mes "����ȏ��N�ɂ��A����̐l�͂��܂����B";
			mes "�c�c���ۂ̂Ƃ���A����Ȃ̂�";
			mes "���Ȃ̂��͕�����܂���ł������B";
			next;
			mes "[�G�[���~�b�g�E�V������]";
			mes "���N���ޏ����v���Ă������Ƃ��A";
			mes "���̔ޏ��͒m��܂���ł����B";
			mes "�_��M���A�����܂������ɕ���ł���";
			mes "�����Ƃ͈Ⴄ���ꂢ�Ȕޏ��B";
			next;
			mes "[�G�[���~�b�g�E�V������]";
			mes "���N�͉�������ޏ������Ă��邾����";
			mes "�ƂĂ��K���ł����c�c";
			mes "����Ȃ�����c�c�߂��ɂ����";
			mes "�ޏ��͏����Ă��܂����̂ł��B";
			next;
			mes "[�G�[���~�b�g�E�V������]";
			mes "�ޏ��͋A���Ă��܂���ł����B";
			mes "�����ď��N�́A�����Ƃ��F���";
			mes "���Ă��܂��B��l�ɂȂ�������";
			mes "�吹���̋��Ŕޏ��̂��߂�";
			mes "�����ƋF���Ă��܂��B";
			next;
			mes "[�G�[���~�b�g�E�V������]";
			mes "�c�c�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c";
			next;
			mes "[�G�[���~�b�g�E�V������]";
			mes "�c�c�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�����c�c�c�c";
			mes "�{���Ă��������B";
			mes "�c�c�ޏ����A���[�E�F�����c�c";
			mes "�c�c�V�N�V�N�c�c";
			next;
			mes "[�G�[���~�b�g�E�V������]";
			mes "�N�c�c";
			mes "�G�����R�Ɏd�����˗����ꂽ�̂ł����H";
			mes "�Ȃ�A�l�̏�񂪕K�v�ł���ˁB";
			mes "�c�c�c�c�c�c";
			mes "�Ⴂ�܂����H";
			next;
			mes "[�G�[���~�b�g�E�V������]";
			mes "�c�c�l�̗��݂𕷂��Ă����΁A";
			mes "�l�����ꑊ���̏���񋟂��܂��B";
			mes "����ł��Ȃ����ǂ����邩��";
			mes "�m��܂��񂪁c�c";
			next;
			mes "[�G�[���~�b�g�E�V������]";
			mes "�l�̗��ݎ��͊ȒP�ł��B";
			mes "�c�c�ޏ����A���[�E�F����";
			mes "�{���Ă��������B�ޏ��̕i���A";
			mes "���ՁA�b�c�c�ޏ��Ɋւ��邱�ƂȂ�";
			mes "���ł������ł��B";
			next;
			switch(select("���A���[��c�c","�f��܂�","�ޏ����Ō�Ɍ����̂͂ǂ��ł��H")) {
			case 1:
				mes "[�G�[���~�b�g�E�V������]";
				mes "�c�c�N�A�b�𕷂������ł�";
				mes "�l�̗��݂𕷂��Ă���܂��񂩁H";
				mes "������x�l���Ă݂ė~�����B";
				mes "�N�̓��[�E�F����{���A";
				mes "�l�͌N�ɏ���^����B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�N���G�����R�̎d�����I�������̂Ȃ�";
				mes "�l�̏�񂪕K�v�ɂȂ�ł��傤�B";
				mes "�Ȃ�Ζl�̗��݂𕷂��̂�������";
				mes "�N���g�̂��߂ɂȂ�ł���H";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�c�c�悭�l���Ă��������B";
				mes "�N�͋����n���̖`���Ƃ݂���������";
				mes "���̒��x�̂��Ƃ͊ȒP�ł��傤�H";
				mes "�N�ɖY��邱�Ƃ��ł��Ȃ��l�������";
				mes "�l�̍��̋C������������܂��ˁB";
				mes "�ޏ����A���[�E�F����{���Ă��������B";
				next;
				switch(select("�c�c������܂���","��͂�C���i�݂܂���")) {
				case 1:
					mes "["+strcharinfo(0)+"]";
					mes "�����ł��傤�B";
					mes "���̂ł������̂��Ƃ͂��܂��傤�B";
					mes "�{���ė~�����ƌ������́A";
					mes "���[�E�F���Ƃ��������ɂ���";
					mes "���������ڂ��������Ă��������B";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "�ޏ��͐_�Ɏd����R�m�c�c";
					mes "�l���ޏ����Ō�Ɍ����̂́A";
					mes "���[�����̃Q�t�F���^���[�ł��B";
					mes "�����Ԃ�O�ɐ��R�m�B��";
					mes "�Q�t�F���^���[�̃����X�^�[��";
					mes "�������ɍs���܂����B";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "���ꂪ�c�c���̎����A";
					mes "�ޏ��̍Ō�ł��B";
					mes "�ޏ��́A�ޏ��Ɋւ��邠������̂�";
					mes "�{���Ă��������B���肢���܂�!!";
					set GOD_3QUE,10;
					close;
				case 2:
					mes "[�G�[���~�b�g�E�V������]";
					mes "�c�c�c�c";
					mes "�c�c�c�c�c�c";
					mes "�c�c�c�c�c�c�ӂ��`�c�c";
					mes "���ꂶ��A�d������܂���ˁB";
					mes "���͌���ł��B";
					set GOD_3QUE,9;
					close;
				}
			case 2:
				mes "[�G�[���~�b�g�E�V������]";
				mes "�₯�ɂ�������ƒf��܂��ˁB";
				mes "�������͂���Ȃɐ؎��Ȃ̂Ɂc�c";
				mes "�c�c�����ŒT���Ȃ��̂����āH";
				mes "�c�c�c�c����́c�c";
				mes "�c�c�c�c�c�c";
				mes "�|���Ăł��܂���B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�ޏ��͖l���o���Ă���̂ł��傤���H";
				mes "�l�𑞂ނ̂ł͂Ȃ��ł��傤���H";
				mes "���낵���A���낵���ł��B";
				mes "�ޏ����l���ǂ��v���Ă���̂��A";
				mes "����������Ȃ������A";
				mes "�����͊F�c�c���낵���ł��B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�E�C���Ȃ��ƌ����̂ł����B";
				mes "�̂��ʂ��Ȃ��ƌ����̂ł����B";
				mes "�����A�㒎�ł���A�l�́B";
				mes "�c�c����Ȗl�ɗB��ł��邱�Ƃ�";
				mes "���F��c�c�����F�邾���ł��B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�l�͎キ�Ďキ�Ă������ア�ł��B";
				mes "�c�c�c�c";
				mes "�ޏ��������Ȃ����Ƃ�����Ȃ�";
				mes "�h���Ƃ͎v���܂���ł����B";
				mes "�c�c�F��܂��傤�B";
				mes "���ꂪ�B��A�l�ɂł��邱�Ƃł�����B";
				set GOD_3QUE,9;
				close;
			case 3:
				mes "[�G�[���~�b�g�E�V������]";
				mes "�ޏ��͐_�Ɏd����R�m�c�c";
				mes "�l���ޏ����Ō�Ɍ����̂́A";
				mes "���[�����̃Q�t�F���^���[�ł��B";
				mes "�����Ԃ�O�ɁA���R�m�B��";
				mes "�Q�t�F���^���[�̃����X�^�[��";
				mes "�������ɍs�������Ƃ�����܂��B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�Q�t�F���^���[�̒n���ɉB����Ă���";
				mes "���{�A����͂ƂĂ����낵�������ł��B";
				mes "�������S�āA���X�͐l�Ԃ������";
				mes "���̂ł��傤���c�c��������S�ł����B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�����炱���A�����l�Ԃ̎��";
				mes "�n�����Ȃ���΂Ȃ�Ȃ���";
				mes "�v�����̂�������܂���ˁB";
				mes "�_�̋R�m�B�͂����֐i��ł����܂����B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "���ꂪ�c�c���̎����A";
				mes "�ޏ��̍Ō�ł��B";
				mes "�ޏ��́A�ޏ��Ɋւ��邠������̂�";
				mes "�{���Ă��������B���肢���܂�!!";
				set GOD_3QUE,10;
				close;
			}
		case 2:
			mes "[�G�[���~�b�g�E�V������]";
			mes "�c�c���̐l�͂����ł���ˁB";
			mes "�����Ƃ͊֌W�Ȃ��l�́c�c";
			mes "�������ʔ����Ȃ��b�Ȃ�āB";
			mes "�c�c�ނ��낻��Șb��i���";
			mes "�����l�̕����ςɎv����A";
			mes "���ꂪ���ԂƂ������̂ł���ˁB";
			next;
			mes "[�G�[���~�b�g�E�V������]";
			mes "�������ʂȘb�Ɏ��Ԃ��g���̂�";
			mes "��߂܂��傤�B�c�c�c�c�ނ�";
			mes "�����A�G�����R�̕����́A����";
			mes "�b��^���ɕ����C��������ɂł�";
			mes "�n���Ă��������B";
			set GOD_3QUE,5;
			close;
		}
	}
	else if(GOD_3QUE == 4) {
		mes "[�G�[���~�b�g�E�V������]";
		mes "�l�ɉ����p�ł������ł����H";
		mes "���[�O�M���h���痈���̂ł����H";
		mes "������߂ė~�����Ɠ`���Ă��������B";
		mes "�l�ɍ\��Ȃ��ł��������B";
		next;
		switch(select("���΂炭�����Ă���","�G�����R�̕�����n��")) {
		case 1:
			mes "- �Ȃ����͔���Ȃ����A����";
			mes "���������Ȃ������悳�������B";
			mes "��ł܂��K�˂邱�Ƃɂ��悤�B -";
			set GOD_3QUE,4;
			close;
		case 2:
			mes "[�G�[���~�b�g�E�V������]";
			mes "�c�c����c�c���̎莆�́c�c";
			mes "�����A������܂����B";
			mes "�ł��A����łǂ�����ƁH";
			next;
			mes "- �G�[���~�b�g�͈�ǂ�����";
			mes "������܂��ĕԂ��Ă����B -";
			next;
			mes "[�G�[���~�b�g�E�V������]";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�ӂ��`�c�c";
			next;
			mes "[�G�[���~�b�g�E�V������]";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�N�A�悯��Ζl�̘b��";
			mes "������ƕ����Ă���܂����H";
			next;
			switch(select("���ŕ����܂�","�������܂�")) {
			case 1:
				mes "[�G�[���~�b�g�E�V������]";
				mes "���肪�Ƃ��������܂��B";
				mes "���Ƃ��ʂ肷����ł����Ă�";
				mes "�b�𕷂��Ă����l��";
				mes "���肪�����ł��B";
				mes "�c�c����́A�Â��b�ł��B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�́A��l�ڂ����̕n�������N��";
				mes "���܂����B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "���̏��N�ɂ͗��e�����Ȃ���A";
				mes "�Ƃ�����܂���ł����B���N��";
				mes "�V�[�t�M���h�⃍�[�O�M���h��";
				mes "�g�ɂ������Ƃ𐶂�����";
				mes "�������Ȃ�����A��������l��";
				mes "��������Ɏ����߂����Ă��܂����B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�܂��c�������̂ŁA���N�͂��̓���";
				mes "�������������Ő���t�������̂ł��B";
				mes "����ȏ��N�ɂ��A����̐l�͂��܂����B";
				mes "�c�c���ۂ̂Ƃ���A����Ȃ̂�";
				mes "���Ȃ̂��͕�����܂���ł������B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "���N���ޏ����v���Ă������Ƃ��A";
				mes "���̔ޏ��͒m��܂���ł����B";
				mes "�_��M���A�����܂������ɕ���ł���";
				mes "�����Ƃ͈Ⴄ���ꂢ�Ȕޏ��B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "���N�͉�������ޏ������Ă��邾����";
				mes "�ƂĂ��K���ł����c�c";
				mes "����Ȃ�����c�c�߂��ɂ����";
				mes "�ޏ��͏����Ă��܂����̂ł��B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�ޏ��͋A���Ă��܂���ł����B";
				mes "�����ď��N�́A�����Ƃ��F���";
				mes "���Ă��܂��B��l�ɂȂ�������";
				mes "�吹���̋��Ŕޏ��̂��߂�";
				mes "�����ƋF���Ă��܂��B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�c�c�c�c�c�c�c�c�c�c";
				mes "�c�c�c�c�c�c�c�c";
				mes "�c�c�c�c";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�c�c�c�c�c�c�c�c�c�c";
				mes "�c�c�c�c�����c�c�c�c";
				mes "�{���Ă��������B";
				mes "�c�c�ޏ����A���[�E�F�����c�c";
				mes "�c�c�V�N�V�N�c�c";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�N�c�c";
				mes "�G�����R�Ɏd�����˗����ꂽ�̂ł����H";
				mes "�Ȃ�A�l�̏�񂪕K�v�ł���ˁB";
				mes "�c�c�c�c�c�c";
				mes "�Ⴂ�܂����H";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�c�c�l�̗��݂𕷂��Ă����΁A";
				mes "�l�����ꑊ���̏���񋟂��܂��B";
				mes "����ł��Ȃ����ǂ����邩��";
				mes "�m��܂��񂪁c�c";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�l�̗��ݎ��͊ȒP�ł��B";
				mes "�c�c�ޏ����A���[�E�F����";
				mes "�{���Ă��������B�ޏ��̕i���A";
				mes "���ՁA�b�c�c�ޏ��Ɋւ��邱�ƂȂ�";
				mes "���ł������ł��B";
				next;
				switch(select("���A���[��c�c","�f��܂�","�ޏ����Ō�Ɍ����̂͂ǂ��ł��H")) {
				case 1:
					mes "[�G�[���~�b�g�E�V������]";
					mes "�c�c�N�A�b�𕷂������ł�";
					mes "�l�̗��݂𕷂��Ă���܂��񂩁H";
					mes "������x�l���Ă݂ė~�����B";
					mes "�N�̓��[�E�F����{���A";
					mes "�l�͌N�ɏ���^����B";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "�N���G�����R�̎d�����I�������̂Ȃ�";
					mes "�l�̏�񂪕K�v�ɂȂ�ł��傤�B";
					mes "�Ȃ�Ζl�̗��݂𕷂��̂�������";
					mes "�N���g�̂��߂ɂȂ�ł���H";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "�c�c�悭�l���Ă��������B";
					mes "�N�͋����n���̖`���Ƃ݂���������";
					mes "���̒��x�̂��Ƃ͊ȒP�ł��傤�H";
					mes "�N�ɖY��邱�Ƃ��ł��Ȃ��l�������";
					mes "�l�̍��̋C������������܂��ˁB";
					mes "�ޏ����A���[�E�F����{���Ă��������B";
					next;
					switch(select("�c�c������܂���","��͂�C���i�݂܂���")) {
					case 1:
						mes "["+strcharinfo(0)+"]";
						mes "�����ł��傤�B";
						mes "���̂ł������̂��Ƃ͂��܂��傤�B";
						mes "�{���ė~�����ƌ������́A";
						mes "���[�E�F���Ƃ��������ɂ���";
						mes "���������ڂ��������Ă��������B";
						next;
						mes "[�G�[���~�b�g�E�V������]";
						mes "�ޏ��͐_�Ɏd����R�m�c�c";
						mes "�l���ޏ����Ō�Ɍ����̂́A";
						mes "���[�����̃Q�t�F���^���[�ł��B";
						mes "�����Ԃ�O�ɐ��R�m�B��";
						mes "�Q�t�F���^���[�̃����X�^�[��";
						mes "�������ɍs���܂����B";
						next;
						mes "[�G�[���~�b�g�E�V������]";
						mes "���ꂪ�c�c���̎����A";
						mes "�ޏ��̍Ō�ł��B";
						mes "�ޏ��́A�ޏ��Ɋւ��邠������̂�";
						mes "�{���Ă��������B���肢���܂�!!";
						set GOD_3QUE,10;
						close;
					case 2:
						mes "[�G�[���~�b�g�E�V������]";
						mes "�c�c�c�c";
						mes "�c�c�c�c�c�c";
						mes "�c�c�c�c�c�c�ӂ��`�c�c";
						mes "���ꂶ��A�d������܂���ˁB";
						mes "���͌���ł��B";
						set GOD_3QUE,9;
						close;
					}
				case 2:
					mes "[�G�[���~�b�g�E�V������]";
					mes "�₯�ɂ�������ƒf��܂��ˁB";
					mes "�������͂���Ȃɐ؎��Ȃ̂Ɂc�c";
					mes "�c�c�����ŒT���Ȃ��̂����āH";
					mes "�c�c�c�c����́c�c";
					mes "�c�c�c�c�c�c";
					mes "�|���Ăł��܂���B";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "�ޏ��͖l���o���Ă���̂ł��傤���H";
					mes "�l�𑞂ނ̂ł͂Ȃ��ł��傤���H";
					mes "���낵���A���낵���ł��B";
					mes "�ޏ����l���ǂ��v���Ă���̂��A";
					mes "����������Ȃ������A";
					mes "�����͊F�c�c���낵���ł��B";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "�E�C���Ȃ��ƌ����̂ł����B";
					mes "�̂��ʂ��Ȃ��ƌ����̂ł����B";
					mes "�����A�㒎�ł���A�l�́B";
					mes "�c�c����Ȗl�ɗB��ł��邱�Ƃ�";
					mes "���F��c�c�����F�邾���ł��B";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "�l�͎キ�Ďキ�Ă������ア�ł��B";
					mes "�c�c�c�c";
					mes "�ޏ��������Ȃ����Ƃ�����Ȃ�";
					mes "�h���Ƃ͎v���܂���ł����B";
					mes "�c�c�F��܂��傤�B";
					mes "���ꂪ�B��A�l�ɂł��邱�Ƃł�����B";
					set GOD_3QUE,9;
					close;
				case 3:
					mes "[�G�[���~�b�g�E�V������]";
					mes "�ޏ��͐_�Ɏd����R�m�c�c";
					mes "�l���ޏ����Ō�Ɍ����̂́A";
					mes "���[�����̃Q�t�F���^���[�ł��B";
					mes "�����Ԃ�O�ɁA���R�m�B��";
					mes "�Q�t�F���^���[�̃����X�^�[��";
					mes "�������ɍs�������Ƃ�����܂��B";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "�Q�t�F���^���[�̒n���ɉB����Ă���";
					mes "���{�A����͂ƂĂ����낵�������ł��B";
					mes "�������S�āA���X�͐l�Ԃ������";
					mes "���̂ł��傤���c�c��������S�ł����B";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "�����炱���A�����l�Ԃ̎��";
					mes "�n�����Ȃ���΂Ȃ�Ȃ���";
					mes "�v�����̂�������܂���ˁB";
					mes "�_�̋R�m�B�͂����֐i��ł����܂����B";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "���ꂪ�c�c���̎����A";
					mes "�ޏ��̍Ō�ł��B";
					mes "�ޏ��́A�ޏ��Ɋւ��邠������̂�";
					mes "�{���Ă��������B���肢���܂�!!";
					set GOD_3QUE,10;
					close;
				}
			case 2:
				mes "[�G�[���~�b�g�E�V������]";
				mes "�c�c���̐l�͂����ł���ˁB";
				mes "�����Ƃ͊֌W�Ȃ��l�́c�c";
				mes "�������ʔ����Ȃ��b�Ȃ�āB";
				mes "�c�c�ނ��낻��Șb��i���";
				mes "�����l�̕����ςɎv����A";
				mes "���ꂪ���ԂƂ������̂ł���ˁB";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�������ʂȘb�Ɏ��Ԃ��g���̂�";
				mes "��߂܂��傤�B�c�c�c�c�ނ�";
				mes "�����A�G�����R�̕����́A����";
				mes "�b��^���ɕ����C��������ɂł�";
				mes "�n���Ă��������B";
				set GOD_3QUE,5;
				close;
			}
		}
	}
	else if(GOD_3QUE == 3) {
		mes "[�߂��݂̐N]";
		mes "�c�c�c�c";
		mes "�����c�c���߂�Ȃ����A";
		mes "���߂�Ȃ����A���[�E�F���B";
		mes "�l�����������c�c";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "���́A���݂܂���A";
		mes "�l��{���Ă���̂ł����c�c";
		mes "�G�[���~�b�g�Ƃ�������";
		mes "�������ł��傤���H";
		next;
		mes "[�G�[���~�b�g�E�V������]";
		mes "�c�c�c�c";
		mes "�c�c�ǂȂ��ł��H";
		mes "�l���G�[���~�b�g�ł��B";
		mes "���ɑ厖�ȗp���łȂ��̂Ȃ�";
		mes "�����Ƃ��Ă����Ă���܂��H";
		next;
		switch(select("���΂炭�����Ă���","�G�����R�̕�����n��")) {
		case 1:
			mes "- �Ȃ����͔���Ȃ����A����";
			mes "���������Ȃ������悳�������B";
			mes "��ł܂��K�˂邱�Ƃɂ��悤�B -";
			set GOD_3QUE,4;
			close;
		case 2:
			mes "[�G�[���~�b�g�E�V������]";
			mes "�c�c����c�c���̎莆�́c�c";
			mes "�����A������܂����B";
			mes "�ł��A����łǂ�����ƁH";
			next;
			mes "- �G�[���~�b�g�͈�ǂ�����";
			mes "������܂��ĕԂ��Ă����B -";
			next;
			mes "[�G�[���~�b�g�E�V������]";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�ӂ��`�c�c";
			next;
			mes "[�G�[���~�b�g�E�V������]";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�N�A�悯��Ζl�̘b��";
			mes "������ƕ����Ă���܂����H";
			next;
			switch(select("���ŕ����܂�","�������܂�")) {
			case 1:
				mes "[�G�[���~�b�g�E�V������]";
				mes "���肪�Ƃ��������܂��B";
				mes "���Ƃ��ʂ肷����ł����Ă�";
				mes "�b�𕷂��Ă����l��";
				mes "���肪�����ł��B";
				mes "�c�c����́A�Â��b�ł��B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�́A��l�ڂ����̕n�������N��";
				mes "���܂����B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "���̏��N�ɂ͗��e�����Ȃ���A";
				mes "�Ƃ�����܂���ł����B���N��";
				mes "�V�[�t�M���h�⃍�[�O�M���h��";
				mes "�g�ɂ������Ƃ𐶂�����";
				mes "�������Ȃ�����A��������l��";
				mes "��������Ɏ����߂����Ă��܂����B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�܂��c�������̂ŁA���N�͂��̓���";
				mes "�������������Ő���t�������̂ł��B";
				mes "����ȏ��N�ɂ��A����̐l�͂��܂����B";
				mes "�c�c���ۂ̂Ƃ���A����Ȃ̂�";
				mes "���Ȃ̂��͕�����܂���ł������B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "���N���ޏ����v���Ă������Ƃ��A";
				mes "���̔ޏ��͒m��܂���ł����B";
				mes "�_��M���A�����܂������ɕ���ł���";
				mes "�����Ƃ͈Ⴄ���ꂢ�Ȕޏ��B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "���N�͉�������ޏ������Ă��邾����";
				mes "�ƂĂ��K���ł����c�c";
				mes "����Ȃ�����c�c�߂��ɂ����";
				mes "�ޏ��͏����Ă��܂����̂ł��B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�ޏ��͋A���Ă��܂���ł����B";
				mes "�����ď��N�́A�����Ƃ��F���";
				mes "���Ă��܂��B��l�ɂȂ�������";
				mes "�吹���̋��Ŕޏ��̂��߂�";
				mes "�����ƋF���Ă��܂��B";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�c�c�c�c�c�c�c�c�c�c";
				mes "�c�c�c�c�c�c�c�c";
				mes "�c�c�c�c";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�c�c�c�c�c�c�c�c�c�c";
				mes "�c�c�c�c�����c�c�c�c";
				mes "�{���Ă��������B";
				mes "�c�c�ޏ����A���[�E�F�����c�c";
				mes "�c�c�V�N�V�N�c�c";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�N�c�c";
				mes "�G�����R�Ɏd�����˗����ꂽ�̂ł����H";
				mes "�Ȃ�A�l�̏�񂪕K�v�ł���ˁB";
				mes "�c�c�c�c�c�c";
				mes "�Ⴂ�܂����H";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�c�c�l�̗��݂𕷂��Ă����΁A";
				mes "�l�����ꑊ���̏���񋟂��܂��B";
				mes "����ł��Ȃ����ǂ����邩��";
				mes "�m��܂��񂪁c�c";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�l�̗��ݎ��͊ȒP�ł��B";
				mes "�c�c�ޏ����A���[�E�F����";
				mes "�{���Ă��������B�ޏ��̕i���A";
				mes "���ՁA�b�c�c�ޏ��Ɋւ��邱�ƂȂ�";
				mes "���ł������ł��B";
				next;
				switch(select("���A���[��c�c","�f��܂�","�ޏ����Ō�Ɍ����̂͂ǂ��ł��H")) {
				case 1:
					mes "[�G�[���~�b�g�E�V������]";
					mes "�c�c�N�A�b�𕷂������ł�";
					mes "�l�̗��݂𕷂��Ă���܂��񂩁H";
					mes "������x�l���Ă݂ė~�����B";
					mes "�N�̓��[�E�F����{���A";
					mes "�l�͌N�ɏ���^����B";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "�N���G�����R�̎d�����I�������̂Ȃ�";
					mes "�l�̏�񂪕K�v�ɂȂ�ł��傤�B";
					mes "�Ȃ�Ζl�̗��݂𕷂��̂�������";
					mes "�N���g�̂��߂ɂȂ�ł���H";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "�c�c�悭�l���Ă��������B";
					mes "�N�͋����n���̖`���Ƃ݂���������";
					mes "���̒��x�̂��Ƃ͊ȒP�ł��傤�H";
					mes "�N�ɖY��邱�Ƃ��ł��Ȃ��l�������";
					mes "�l�̍��̋C������������܂��ˁB";
					mes "�ޏ����A���[�E�F����{���Ă��������B";
					next;
					switch(select("�c�c������܂���","��͂�C���i�݂܂���")) {
					case 1:
						mes "["+strcharinfo(0)+"]";
						mes "�����ł��傤�B";
						mes "���̂ł������̂��Ƃ͂��܂��傤�B";
						mes "�{���ė~�����ƌ������́A";
						mes "���[�E�F���Ƃ��������ɂ���";
						mes "���������ڂ��������Ă��������B";
						next;
						mes "[�G�[���~�b�g�E�V������]";
						mes "�ޏ��͐_�Ɏd����R�m�c�c";
						mes "�l���ޏ����Ō�Ɍ����̂́A";
						mes "���[�����̃Q�t�F���^���[�ł��B";
						mes "�����Ԃ�O�ɐ��R�m�B��";
						mes "�Q�t�F���^���[�̃����X�^�[��";
						mes "�������ɍs���܂����B";
						next;
						mes "[�G�[���~�b�g�E�V������]";
						mes "���ꂪ�c�c���̎����A";
						mes "�ޏ��̍Ō�ł��B";
						mes "�ޏ��́A�ޏ��Ɋւ��邠������̂�";
						mes "�{���Ă��������B���肢���܂�!!";
						set GOD_3QUE,10;
						close;
					case 2:
						mes "[�G�[���~�b�g�E�V������]";
						mes "�c�c�c�c";
						mes "�c�c�c�c�c�c";
						mes "�c�c�c�c�c�c�ӂ��`�c�c";
						mes "���ꂶ��A�d������܂���ˁB";
						mes "���͌���ł��B";
						set GOD_3QUE,9;
						close;
					}
				case 2:
					mes "[�G�[���~�b�g�E�V������]";
					mes "�₯�ɂ�������ƒf��܂��ˁB";
					mes "�������͂���Ȃɐ؎��Ȃ̂Ɂc�c";
					mes "�c�c�����ŒT���Ȃ��̂����āH";
					mes "�c�c�c�c����́c�c";
					mes "�c�c�c�c�c�c";
					mes "�|���Ăł��܂���B";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "�ޏ��͖l���o���Ă���̂ł��傤���H";
					mes "�l�𑞂ނ̂ł͂Ȃ��ł��傤���H";
					mes "���낵���A���낵���ł��B";
					mes "�ޏ����l���ǂ��v���Ă���̂��A";
					mes "����������Ȃ������A";
					mes "�����͊F�c�c���낵���ł��B";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "�E�C���Ȃ��ƌ����̂ł����B";
					mes "�̂��ʂ��Ȃ��ƌ����̂ł����B";
					mes "�����A�㒎�ł���A�l�́B";
					mes "�c�c����Ȗl�ɗB��ł��邱�Ƃ�";
					mes "���F��c�c�����F�邾���ł��B";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "�l�͎キ�Ďキ�Ă������ア�ł��B";
					mes "�c�c�c�c";
					mes "�ޏ��������Ȃ����Ƃ�����Ȃ�";
					mes "�h���Ƃ͎v���܂���ł����B";
					mes "�c�c�F��܂��傤�B";
					mes "���ꂪ�B��A�l�ɂł��邱�Ƃł�����B";
					set GOD_3QUE,9;
					close;
				case 3:
					mes "[�G�[���~�b�g�E�V������]";
					mes "�ޏ��͐_�Ɏd����R�m�c�c";
					mes "�l���ޏ����Ō�Ɍ����̂́A";
					mes "���[�����̃Q�t�F���^���[�ł��B";
					mes "�����Ԃ�O�ɁA���R�m�B��";
					mes "�Q�t�F���^���[�̃����X�^�[��";
					mes "�������ɍs�������Ƃ�����܂��B";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "�Q�t�F���^���[�̒n���ɉB����Ă���";
					mes "���{�A����͂ƂĂ����낵�������ł��B";
					mes "�������S�āA���X�͐l�Ԃ������";
					mes "���̂ł��傤���c�c��������S�ł����B";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "�����炱���A�����l�Ԃ̎��";
					mes "�n�����Ȃ���΂Ȃ�Ȃ���";
					mes "�v�����̂�������܂���ˁB";
					mes "�_�̋R�m�B�͂����֐i��ł����܂����B";
					next;
					mes "[�G�[���~�b�g�E�V������]";
					mes "���ꂪ�c�c���̎����A";
					mes "�ޏ��̍Ō�ł��B";
					mes "�ޏ��́A�ޏ��Ɋւ��邠������̂�";
					mes "�{���Ă��������B���肢���܂�!!";
					set GOD_3QUE,10;
					close;
				}
			case 2:
				mes "[�G�[���~�b�g�E�V������]";
				mes "�c�c���̐l�͂����ł���ˁB";
				mes "�����Ƃ͊֌W�Ȃ��l�́c�c";
				mes "�������ʔ����Ȃ��b�Ȃ�āB";
				mes "�c�c�ނ��낻��Șb��i���";
				mes "�����l�̕����ςɎv����A";
				mes "���ꂪ���ԂƂ������̂ł���ˁB";
				next;
				mes "[�G�[���~�b�g�E�V������]";
				mes "�������ʂȘb�Ɏ��Ԃ��g���̂�";
				mes "��߂܂��傤�B�c�c�c�c�ނ�";
				mes "�����A�G�����R�̕����́A����";
				mes "�b��^���ɕ����C��������ɂł�";
				mes "�n���Ă��������B";
				set GOD_3QUE,5;
				close;
			}
		}
	}
	mes "[�߂��݂̐N]";
	mes "�c�c�c�c";
	mes "�c�c�����c�c���߂�Ȃ���";
	mes "���߂�Ȃ����A���[�E�F���B";
	mes "�l�����������c�c";
	mes "�c�c���������Ȃ��̂��߂�";
	mes "���F��������B";
	close;
}

prt_castle.gat,80,52,0	script	�l����	111,{
	if($GodMagingiorde < 50 || $GodBrysinggamen >= 100) {
		mes "[�i��]";
		mes "�����ŉ������Ă����ł����H";
		mes "�ނ�݂Ɏ��G��Ȃ��ł��������I";
		close;
	}
	if(GOD_3QUE == 26) {
		mes "["+strcharinfo(0)+"]";
		mes "�悵�A���̂����Ɂc�c";
		mes "����H�@���̒��ӕ\���͉����낤�c�c";
		mes "�ɔ�H�@�ӂށc�c�������肻�����ȁB";
		mes "������ƌ��Ă݂悤�B";
		next;
		if(rand(3)) {
			mes "[�i��]";
			mes "�t�j���t�j���c�c�͂�!!";
			mes "�����ŉ������Ă����ł���?!";
			mes "�����ɏo�čs���Ȃ���!!";
			close2;
			warp "prt_castle.gat",94,37;
			end;
		}
		mes "- �c�c��2����������";
		mes "���[�E�F���E�G���i��";
		mes "������������3����ɕ��A�����B";
		mes "��풆�A�ޏ��̕s�݂ɂ����";
		mes "�����������ɂ��Ă�";
		mes "�ʓr�A�ӔC�ǋ��̍ٔ���݂����B -";
		next;
		mes "- �����Ō��d�ȏ�������������";
		mes "���肳�ꂽ���A����������";
		mes "�ޖ�[�u�Ɋm��B����ɂ��";
		mes "�ޏ��̐_���ȗ͂𕕈󂵂��B -";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�͂𕕈󂵂đޖ��H";
		mes "���ꂶ�Ⴀ�A������̒Ǖ���";
		mes "���獷���Ȃ���B�����܂�";
		mes "�d�������͔ޏ��ɂƂ���";
		mes "����Ӗ��A���Y���h�����낤�c�c";
		mes "���̏�Ȃ��p�J��������������Ȃ��B";
		next;
		mes "- �c�c�������������2�N��A";
		mes "���[�E�F���E�G���i�̈�i�Ǝv����";
		mes "�b�h�Ɗ��ꂽ���A�g�̂܂��̕i����";
		mes "�`���ƏW�c�ɂ���Ĕ������ꂽ�B";
		mes "����������āA���[�E�F���E�G���i��";
		mes "���S�����Ƃ���B -";
		next;
		mes "- �Ȃ��A�{���͊֌W�҂̂�";
		mes "�c�����Ă��鎖���ł���B";
		mes "�����L�^��́A��풆�̎��S";
		mes "�Ƃ���Ă���B -";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "�c�c�N���Z�C�_�[�̖��_��";
		mes "���Ă������ƍl����ꂽ�̂��B";
		mes "���ƂȂ������䂢�ȁc�c";
		mes "�ɂ��Ă��A������ǂ��`����΁c�c";
		mes "�������I�@�ޏ��ɂ�����x";
		mes "����Ă݂悤�B";
		next;
		mes "[�i��]";
		mes "�t�j���t�j���c�c�͂�!!";
		mes "�����ŉ������Ă����ł���?!";
		mes "�����ɏo�čs���Ȃ���!!";
		set GOD_3QUE,30;
		close2;
		warp "prt_castle.gat",94,37;
		end;
	}
	else if(GOD_3QUE == 25) {
		mes "- �i��������������Ă���B";
		mes "���̌��ɋL�^��T�����Ƃɂ����B";
		mes "�c�c����ƁA�N���Z�C�_�[�B��";
		mes "�g�����L�ڂ��ꂽ������������B";
		mes "���̒��Ɂu���[�E�F���E�G���i�v";
		mes "�Ƃ������́A��l�����������B -";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "- ���[�E�F���E�G���i�B";
		mes "XX�����A��2�����A22�Ώ����B -";
		mes "�c�c�m�肽���̂͂���Ȃ���";
		mes "����Ȃ��̂Ɂc�c����H";
		mes "- XX�N���H -> ���S�����B -";
		mes "�����A�i���ɕ��������e�Ɠ������B";
		next;
		mes "[�i��]";
		mes "�t�j���t�j���c�c�͂�!!";
		mes "�����ŉ������Ă����ł���?!";
		mes "�����ɏo�čs���Ȃ���!!";
		set GOD_3QUE,26;
		close2;
		warp "prt_castle.gat",94,37;
		end;
	}
	mes "[�i��]";
	mes "�����ŉ������Ă����ł����H";
	mes "�ނ�݂Ɏ��G��Ȃ��ł��������I";
	close;
}

prt_castle.gat,84,51,5	script	�i��	105,{
	if($GodMagingiorde < 50 || $GodBrysinggamen >= 100) {
		mes "[�i��]";
		mes "�����ŉ������Ă����ł����H";
		mes "�ނ�݂Ɏ��G��Ȃ��ł��������I";
		close;
	}
	if(GOD_3QUE > 24 && GOD_3QUE < 27) {
		mes "[�i��]";
		mes "�c�c�c�c";
		mes "�c�c�c�c�t���c�c";
		mes "�t�j���t�j���c�c";
		mes "�X�[�X�[�c�c";
		next;
		mes "- �����肵�Ă���悤���B";
		mes "�o�^���ꂽ�N���Z�C�_�[�B��";
		mes "�L�^������A��D�̃`�����X!!";
		mes "�N�����Ȃ��悤�ɋC�����悤�B -";
		close;
	}
	else if(GOD_3QUE == 10) {
		mes "[�i��]";
		mes "������͉����̐l���Ɋւ���";
		mes "�L�^���ނ�ۊǂ��Ă��鏊�ł��B";
		mes "�\���󂠂�܂��񂪁A���Ȃ��ɂ�";
		mes "�{���������������܂���B";
		next;
		mes "[�i��]";
		mes "�c�c�͂��H";
		mes "�l���m�F�݂̂�����]�ł����H";
		mes "�ł�����A���{���̕��̂����O��";
		mes "���֌W������������Ă��������B";
		next;
		switch(select("���[�E�F���F�Ƒ�","���[�E�F���F���l","���G���F�w","���G���F�F�B")) {
		case 1:
			if(Sex) {
				mes "[�i��]";
				mes "�R�����Ȃ��ł�������!!";
				mes "���[�E�F���Ƃ������ɂ�";
				mes "�j���̉Ƒ��͂���܂���B";
				mes "�c�c�͂�!!�@���A�����Ɓc�c";
				mes "�c�c�c�c";
				next;
				mes "[�i��]";
				mes "�c�c�������Ă���̂ł��H";
				mes "��������肭������!!";
				close;
			}
			else {
				mes "[�i��]";
				mes "�{���Ƀ��[�E�F������̂��Ƒ��ł����H";
				mes "���Ƒ��̕��Ȃ�ǂ����āA�������";
				mes "�{���ɂ���������̂ł����H";
				mes "�c�c�͂��H�@�ʁX�ɕ邵�ĂāA";
				mes "�A�������΂炭�Ȃ������Ɓc�c";
				mes "�����A�m���ɔޏ��̓N���Z�C�_�[�ł��B";
				next;
				mes "[�i��]";
				mes "�Ȃ�قǁA����܂����B";
				mes "�c�c���́A�ǂ��\���グ��΂悢��";
				mes "����܂��񂪁A�������Ȃ���";
				mes "���{���̕������[�E�F���E�G���i";
				mes "�ł�����c�c���߂Ă��������B";
				next;
				mes "[�i��]";
				mes "���N�O�̃Q�t�F���n����������";
				mes "���H�A���̌㕜�c�c����";
				mes "���S�����ƂȂ��Ă���܂��B";
				mes "���C�̓łł����c�c";
				mes "�̐l�̖��������F�肵�܂��B";
				mes "�c�c�ȏ�ƂȂ�܂��B";
				set GOD_3QUE,11;
				close;
			}
		case 2:
			if(Sex) {
				mes "[�i��]";
				mes "�����Ȃ̂ł���?!";
				mes "�����̋��ɗ��l�����܂���B";
				mes "�ӂӂӂ��c�c";
				mes "���A�����Ɓc�c���[�E�F���ł��ˁH";
				mes "���X�A���҂����������B";
				mes "����ʂȂ炷���Ɂc�c����H";
				next;
				mes "[�i��]";
				mes "�c�c�N���Z�C�_�[�ł�����ˁH";
				mes "���₢���킹�̕��̃t���l�[����";
				mes "���[�E�F���E�G���i�ł�����";
				mes "�{�����Ƃ���߂Ă��������B";
				mes "�ǂ��\���グ��΂悢���c�c";
				next;
				mes "[�i��]";
				mes "���������ĕ����Ă��������B";
				mes "���[�E�F���E�G���i";
				mes "�Q�t�F���n��������풆���H";
				mes "���̌㕜�c�c�͂�!!";
				mes "���̕����͋ɔ邾�����c�c";
				mes "���̕��͎��S�����ƂȂ��Ă��܂��B";
				next;
				mes "[�i��]";
				mes "����Ȍ��ʂɂȂ��Ă��܂���";
				mes "�ƂĂ��c�O�ł��B";
				mes "���C���o���Ă��������I";
				set GOD_3QUE,11;
				close;
			}
			else {
				mes "[�i��]";
				mes "�Ђ������`��!!";
				mes "�\���󂠂�܂���I";
				mes "�\���󂠂�܂���!!";
				mes "���̏펯�ł͗����ł��܂���!!";
				mes "���̒��ɂ͗l�X�ȕ������܂���";
				mes "���܂ňꏏ�ɂ��Ȃ��ł�������!!";
				next;
				mes "[�i��]";
				mes "�Ђ������`��!!";
				mes "��A���͂܂������Ȃ̂ŁA";
				mes "��₩���Ȃ��ł��������`!!";
				close;
			}
		case 3:
			mes "[�i��]";
			mes "�c�c�w�A�ł����H";
			mes "���G���Ƃ������͊m���ɂ��܂����c�c";
			mes "�{���ɉ����̂��֌W�ł����H";
			mes "�c�c�\���󂠂�܂���";
			mes "�������������邱�Ƃ͂ł��܂���B";
			close;
		case 4:
			mes "[�i��]";
			mes "���[�ށc�c���F�l�ł����c�c�H";
			mes "���G���c�c";
			mes "���G���E�y���V�������܂��ˁB";
			mes "���N�O�A���{�l�̊�]�ɂ��";
			mes "�ޖ����ꂽ���ł��B���Z�܂���";
			mes "�c�O�Ȃ���s���ł��B";
			set GOD_3QUE,12;
			close;
		}
	}
	else if(GOD_3QUE > 10 && GOD_3QUE < 13) {
		mes "[�i��]";
		mes "�����������ł��邱�Ƃ�";
		mes "�����������܂���B";
		mes "��������肭������!!";
		close;
	}
	mes "[�i��]";
	mes "������͉����̐l���Ɋւ���";
	mes "�L�^���ނ�ۊǂ��Ă��鏊�ł��B";
	mes "�\���󂠂�܂��񂪁A���Ȃ��ɂ�";
	mes "�{���������������܂���B";
	close;
}

prontera.gat,260,354,4	script	����	101,{
	if($GodMagingiorde < 50 || $GodBrysinggamen >= 100) {
		mes "[����]";
		mes "����c�c���Ȃ������U���H";
		mes "�ł��U���ɂ��ẮA�������";
		mes "�R�[�X���O��Ă܂���c�c";
		close;
	}
	if(GOD_3QUE > 33) {
		mes "[���[�T�E�G���i]";
		mes "�c�c����A�ȑO������܂�����ˁH";
		mes "���́A���ƌ����΂����̂��c�c";
		mes "�Ƃ肠�����A����������Ă��������B";
		mes "�����A���[�E�F���̕��ł��B";
		mes "�c�c���Ȃ��̂������̂悤�ł��ˁB";
		mes "�{���ɂ��肪�Ƃ��������܂��B";
		close;
	}
	else if(GOD_3QUE == 21) {
		mes "[���[�T�E�G���i]";
		mes "���ł��傤�H";
		mes "�c�c���[�E�F������̓`���H";
		mes "���H";
		mes "���̎q�܂�����Ȃ��Ƃ��Ă�́c�c";
		mes "���ŁA���Łc�c�ǂ�����";
		mes "����ł܂ł���ȏ��ɂ���̂�!!";
		next;
		mes "[���[�T�E�G���i]";
		mes "���ɓ`���Ă�������!!";
		mes "�������Ȃ��̂��߂ɋ���������悤��";
		mes "���Ƃ͂��Ȃ�����A���S����";
		mes "���炩�ɖ���Ȃ������āI";
		mes "�S���A���̎q�͂ǂ����Ă��̐���";
		mes "�������c���Ă���񂾂��c�c";
		next;
		mes "[���[�T�E�G���i]";
		mes "���ꂩ��吹���ɂ��邠�̔n���ɂ�";
		mes "�`���Ă�������!!�@���܂Ŏ�����";
		mes "�ӂߑ��������Ȃ̂����āI";
		mes "���͂��Ȃ����ǂ�Ȑl���m��܂���c�c";
		mes "�ł��A���[�E�F����m��l�����炱��";
		mes "���b���܂��傤�B";
		next;
		mes "[���[�T�E�G���i]";
		mes "���[�E�F���́c�c";
		mes "�Z�̏d���œ|�ꂻ���ɂȂ�ق�";
		mes "�̂̎ア�q�ł����B";
		next;
		mes "[���[�T�E�G���i]";
		mes "�����炻�̕��A���l��艽�{����";
		mes "�w�͂����āA����ƌP���ɂ���";
		mes "�������Ƃ��ł��Ă����̂ł��c�c";
		mes "���|��Ă����������Ȃ����̑̂�";
		mes "�����Ɋ撣���Ă��܂����c�c";
		next;
		mes "[���[�T�E�G���i]";
		mes "���ꂪ�ǂ����Ă��͔���Ȃ��ł����A";
		mes "�}�ɃN���Z�[�_�[�ɂȂ����̂ł��c�c";
		mes "�m���ɐc�͂܂������Ő_���ȗ͂�";
		mes "�󂯓���₷�������̂ł��傤���c�c";
		mes "�����āc�c�Q�t�F���n�������X�^�[";
		mes "������풆�ɓˑR�A�p�������܂����B";
		next;
		mes "[���[�T�E�G���i]";
		mes "���ꂩ��2�N��A���͂���";
		mes "��n�ɖ���܂����B";
		mes "�c�c�`���Ƃɔ������ꂽ�̂ł��B";
		mes "��ꂽ�Z�A�����炯�̃��{���c�c";
		mes "����炪���̌��֋A���Ă��܂����B";
		next;
		mes "[���[�T�E�G���i]";
		mes "���ɂ́A���̐g�ɉ����N�����̂�";
		mes "�m��܂���B�c�c�V�������͖���";
		mes "�ƂĂ�����Ă��܂����B�����";
		mes "���̎��̃V���b�N���傫�������̂��A";
		mes "����ȗ������ƁA����Ȋ����Ȃ̂ł��B";
		mes "�c�c���Ɖ����������̂�������܂���B";
		next;
		mes "[���[�T�E�G���i]";
		mes "�B���ꂽ���������肻���ł����c�c";
		mes "�N���Z�C�_�[�B�̎d������ʐl��";
		mes "�m�邱�Ƃ͂ł��܂���B";
		mes "���Ƃ����āA�肪����͂����c�c";
		mes "�̂̂��Ƃł�����ˁc�c";
		next;
		mes "[���[�T�E�G���i]";
		mes "�c�c���킢���Ȃ��b��";
		mes "�����Ă���Ă��肪�Ƃ��B";
		mes "�������܂����̎q�ɉ������A";
		mes "���͑��v������A�s���ׂ�����";
		mes "�s���Ȃ����ƁA�`���Ă��������B";
		set GOD_3QUE,25;
		close;
	}
	else if(GOD_3QUE > 9 && GOD_3QUE < 20) {
		mes "[���[�T�E�G���i]";
		mes "���̕�n�̎��m�肽���̂ł����H";
		mes "�c�c��́c�c���̖��ł��B";
		mes "���傤�ǂ����ꏊ�Ȃ̂ŁA";
		mes "�悭�U���ɗ��܂��B";
		mes "�c�c���H�@�����ł��B";
		mes "���̓��[�E�F���ƌ����܂��B";
		next;
		mes "[���[�T�E�G���i]";
		mes "���Ȃ��̓��[�E�F���̂��F�B�ł����H";
		mes "����H�@�吹���̒j�H�@�����`";
		mes "�V�������̂��Ƃł��ˁB���̒j��";
		mes "�������Ƃ͖������Ă��������B���̎���";
		mes "�����̂������Ǝv���Ă����ł���B";
		mes "�V���b�N���傫�������̂ł��傤�B";
		next;
		mes "[���[�T�E�G���i]";
		mes "�������̂��Ƃ͖Y��āA�����̐�����";
		mes "�߂��Ă����Ƃ����̂Ɂc�c";
		mes "�c�c�ǂȂ����͑����܂��񂪁A�킴�킴";
		mes "�K�˂Ă��Ă���Ă��肪�Ƃ��B";
		mes "���[�E�F���͎���ł���ɗ��Ă����";
		mes "���F�B�����Ă悩������B";
		set GOD_3QUE,11;
		close;
	}
	mes "[���[�T�E�G���i]";
	mes "�c�c�c�c";
	mes "���͘b������������܂���B";
	mes "��l�ɂ��Ă����Ă��������B";
	close;
}

prontera.gat,262,353,0	script	���	111,{
	if($GodMagingiorde >= 50) {
		if(GOD_3QUE > 33) {
			mes "�@�@�@�@���[�E�F���E�G���i";
			mes "�@";
			mes "�@�@�@�@�@XXXX. XX. XX.";
			mes "�@�@";
			mes "�@�@�@�@�@�����ȍ���";
			mes "�@�@�@�@�@���@���L���[���҂�";
			mes "�@�@�@�@�@���n�֗�������";
			close;
		}
		mes "- ������������Ă���";
		mes "�ǂ߂Ȃ��B -";
		close;
	}
	mes "- ���ʂ̐΂ō��ꂽ��肾�B -";
	close;
}

gef_dun01.gat,89,192,0	script	#���[�E�F���̐�1	111,3,3,{
	if($GodMagingiorde < 50 || $GodBrysinggamen >= 100) {
		mes "- �Â��͂�؂��B -";
		close;
	}
	if(GOD_3QUE > 20 && GOD_3QUE < 34) {
		mes "- �ޏ����Ăт܂����H -";
		next;
		if(select("�Ă�","��߂�") == 2) {
			close;
		}
		input '@str$;
		if('@str$ != "���[�E�F��") {
			close;
		}
		if(GOD_3QUE == 30) {
			mes "[���[�E�F���E�G���i]";
			mes "�c�c���A���Ȃ��́c�c";
			mes "�����c�c�キ�Ȃ��Ă��܂��c�c";
			mes "����́c�c�c���v�O�Ɠ������́c�c";
			mes "���������A�����������֗��Ă��������B";
			mes "�����������̂�����܂��c�c";
			next;
			mes "- �ޏ��̐��͂܂��܂��������Ȃ�";
			mes "����ȏ�͕������Ȃ������B -";
			close;
		}
		else if(GOD_3QUE == 25) {
			mes "[���[�E�F���E�G���i]";
			mes "�܂�������܂����ˁB";
			mes "�c�c���[�T�ɂ͉�܂������H";
			mes "�c�c�ӂӂӁc�c�o����炵���ł��ˁB";
			mes "�`���Ă���Ă��肪�Ƃ��B";
			mes "�c�c�{���́A�����������Ă��������";
			mes "�ǂ��̂ł����c�c";
			next;
			mes "[���[�E�F���E�G���i]";
			mes "���c�c��Ȃ��ł���B";
			mes "�����͂ƂĂ��댯�ȏꏊ�ł��B";
			mes "���Ȃ�������`���ł��Ȃ��̂�";
			mes "�ƂĂ���Ȃ��ł��c�c";
			mes "�C�����Ă��������ˁB";
			close;
		}
		else if(GOD_3QUE == 21) {
			mes "[���[�E�F���E�G���i]";
			mes "�c�c�o�ɁA���̐S�z�͂��Ȃ���";
			mes "�Ɠ`���Ă��������B���[�T�͂�����";
			mes "���̕���������Ă��܂��B";
			mes "�c�c�ł��A�����x��ŗ~����";
			mes "�Ɠ`���Ă��������B";
			close;
		}
		mes "[���[�E�F���E�G���i]";
		mes "�p���Ȃ��̂ɌĂ΂Ȃ��ł��������B";
		mes "�����́c�c�댯�ȏꏊ�ł���c�c";
		close;
	}
	else if(GOD_3QUE == 20) {
		mes "[�����̐�]";
		mes "�c�c��Ȃ��c�c";
		mes "��Ȃ��ł���c�c";
		next;
		if(select("��������","���̂��ƁH") == 1) {
			close;
		}
		mes "[�����̐�]";
		mes "�c�c�܂����c�c���Ȃ�";
		mes "���̐�����������̂ł����H";
		mes "�c�c����A����Ȃ킯�́c�c";
		mes "�ł��A�����{���Ȃ�c�c";
		mes "��낵����΁A���̘b��";
		mes "���������Ă��������܂��H";
		next;
		if(select("���߂�A���͂�����Ɩ���!!","���A�N?!") == 1) {
			close;
		}
		mes "[�����̐�]";
		mes "���A���������Ă��������B";
		mes "�����g���т����肵�܂������c�c";
		mes "���ɂ́c�c���̂�����܂���c�c";
		mes "�����c�c���ł��c�c";
		mes "�����Ɯf�r���Ă��܂����B";
		next;
		mes "[���[�E�F��]";
		mes "���̐��ɖ���������̂ł��B";
		mes "��낵����΁c�c";
		mes "���̎o�A���[�T�ɓ`���Ă��������B";
		mes "���������Ȃ��Łc�c���v������c�c";
		mes "���[�E�F���͂������v������Ɓc�c";
		next;
		mes "[���[�E�F��]";
		mes "����A���ɉ������΁A�傫�Ȑ���";
		mes "���̖����Ă�ł��������B";
		mes "�u���[�E�F���v�Ɓc�c";
		set GOD_3QUE,21;
		close;
	}
	mes "- �C���������˂��ꂽ�Â��͂�؂��B";
	mes "���X�����Â����͋C���Y���Ă���B";
	mes "�����ĂȂ����A���߂�������������B -";
	close;
OnTouch:
	if(GOD_3QUE > 9 && GOD_3QUE < 34)
		emotion 0,"";
	end;
}

gef_dun01.gat,203,48,0	script	#���[�E�F���̐�2	111,3,3,{
	if($GodMagingiorde < 50 || $GodBrysinggamen >= 100) {
		mes "- �Â��͂�؂��B -";
		close;
	}
	if(GOD_3QUE > 20 && GOD_3QUE < 34) {
		mes "- �ޏ����Ăт܂����H -";
		next;
		if(select("�Ă�","��߂�") == 2) {
			close;
		}
		input '@str$;
		if('@str$ != "���[�E�F��") {
			close;
		}
		if(GOD_3QUE == 31) {
			mes "[���[�E�F���E�G���i]";
			mes "�܂����Ă���܂����ˁB";
			mes "�c�c�܂��ꏏ�ɍs���Ă��������܂����H";
			mes "���ЁA���肢���܂��B";
			next;
			if(select("�������ł�","���݂܂���A�������܂�") == 2) {
				mes "[���[�E�F���E�G���i]";
				mes "�c�c�����ł����B";
				mes "�m���ɐg�̈��S�����ł���ˁB";
				close;
			}
			mes "[���[�E�F���E�G���i";
			mes "���肪�Ƃ��A���肪�Ƃ��c�c";
			close2;
			warp "que_god02.gat",47,53;
			end;
		}
		else if(GOD_3QUE == 30) {
			mes "[���[�E�F���E�G���i]";
			mes "�����c�c������܂��c�c";
			mes "���Ȃ��̋C�����A���̂��Ƃ�";
			mes "�������悤�Ƃ��Ă����C�����A";
			mes "������������܂��B����Ȃ�";
			mes "���̐��𕷂��Ă�������Ȃ�āA";
			mes "�ƂĂ��s�v�c�ł��B";
			next;
			mes "[���[�E�F���E�G���i]";
			mes "�����ł��ˁc�c";
			mes "��A�̘b�����Ă����܂��傤�B";
			close2;
			warp "que_god02.gat",47,53;
			end;
		}
		else if(GOD_3QUE == 25) {
			mes "[���[�E�F���E�G���i]";
			mes "�܂�������܂����ˁB";
			mes "�c�c���[�T�ɂ͉�܂������H";
			mes "�c�c�ӂӂӁc�c�o����炵���ł��ˁB";
			mes "�`���Ă���Ă��肪�Ƃ��B";
			mes "�c�c�{���́A�����������Ă��������";
			mes "�ǂ��̂ł����c�c";
			next;
			mes "[���[�E�F���E�G���i]";
			mes "���c�c��Ȃ��ł���B";
			mes "�����͂ƂĂ��댯�ȏꏊ�ł��B";
			mes "���Ȃ�������`���ł��Ȃ��̂�";
			mes "�ƂĂ���Ȃ��ł��c�c";
			mes "�C�����Ă��������ˁB";
			close;
		}
		mes "[���[�E�F���E�G���i]";
		mes "�p���Ȃ��̂ɌĂ΂Ȃ��ł��������B";
		mes "�����́c�c�댯�ȏꏊ�ł���c�c";
		close;
	}
	else if(GOD_3QUE == 20) {
		mes "[�����̐�]";
		mes "�c�c��Ȃ��c�c";
		mes "��Ȃ��ł���c�c";
		next;
		if(select("��������","���̂��ƁH") == 1) {
			close;
		}
		mes "[�����̐�]";
		mes "�c�c�܂����c�c���Ȃ�";
		mes "���̐�����������̂ł����H";
		mes "�c�c����A����Ȃ킯�́c�c";
		mes "�ł��A�����{���Ȃ�c�c";
		mes "��낵����΁A���̘b��";
		mes "���������Ă��������܂��H";
		next;
		if(select("���߂�A���͂�����Ɩ���!!","���A�N?!") == 1) {
			close;
		}
		mes "[�����̐�]";
		mes "���A���������Ă��������B";
		mes "�����g���т����肵�܂������c�c";
		mes "���ɂ́c�c���̂�����܂���c�c";
		mes "�����c�c���ł��c�c";
		mes "�����Ɯf�r���Ă��܂����B";
		next;
		mes "[���[�E�F��]";
		mes "���̐��ɖ���������̂ł��B";
		mes "��낵����΁c�c";
		mes "���̎o�A���[�T�ɓ`���Ă��������B";
		mes "���������Ȃ��Łc�c���v������c�c";
		mes "���[�E�F���͂������v������Ɓc�c";
		next;
		mes "[���[�E�F��]";
		mes "����A���ɉ������΁A�傫�Ȑ���";
		mes "���̖����Ă�ł��������B";
		mes "�u���[�E�F���v�Ɓc�c";
		set GOD_3QUE,21;
		close;
	}
	mes "- �C���������˂��ꂽ�Â��͂�؂��B";
	mes "���X�����Â����͋C���Y���Ă���B";
	mes "�����ĂȂ����A���߂�������������B -";
	close;
OnTouch:
	if(GOD_3QUE > 9 && GOD_3QUE < 34)
		emotion 0,"";
	end;
}

que_god02.gat,48,55,3	script	���[�E�F���E�G���i	745,{
	if(GOD_3QUE == 30) {
		mes "[���[�E�F���E�G���i]";
		mes "�c�c���̎p��������̂ł����H";
		mes "���c�c���̂悤�ł��ˁc�c";
		mes "�c�c����́A���̉ߋ��ɂȂ�܂��B";
		mes "�܂����������������B";
		next;
		mes "[���[�E�F���E�G���i]";
		mes "�����̓Q�t�F���^���[�̉��[���B";
		mes "���B�͎׈��ȋC���򉻂��邽��";
		mes "�����Q�t�F���֗��܂����B";
		mes "�c�c���͔߂����A�ƂĂ��߂����ł��B";
		mes "�ǂ����Ă����Ɏc���Ă���̂ł��傤�B";
		next;
		mes "[���[�E�F���E�G���i]";
		mes "�s�����Ƃ��ł��Ȃ������̂ł��B";
		mes "�S�Ƃ͗����ɁA�����𔭂��Ƃ�";
		mes "�ł��Ȃ������̂ł��B";
		next;
		mes "[���[�E�F���E�G���i]";
		mes "�����Ă���Ȏ��̂����ŁA";
		mes "�����̒��ԒB�����ɂ܂����B";
		mes "�c�c�ނ�̂��Ƃ��v���ƁA����";
		mes "����ɂ����Ƃ��ł��܂���ł����B";
		next;
		switch(select("���񂾒��ԒB�͍���ł���ł��傤��","�������������̂ł���")) {
		case 1:
			mes "[���[�E�F���E�G���i]";
			mes "���ԒB�̍��݁c�c";
			mes "�������߂́A�ނ炪�������ނ�";
			mes "�v���܂����B������ނ�̂��߂�";
			mes "���ɏo�܂����B�����Ƃ����܂����c�c";
			mes "�w���Ƃ낤�Ǝv�������Ƃ�";
			mes "����܂����B";
			next;
			mes "[���[�E�F���E�G���i]";
			mes "2�N�߂��A���񂾒��ԒB��";
			mes "���O�𐰂炻���ƁA�����Ȃ��";
			mes "�w�͂����܂����c�c�c�c";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�c�c��편�s��A��l�����";
			mes "�����X�^�[�ɗ������������́H";
			next;
			mes "[���[�E�F���E�G���i]";
			mes "�͂��A���̂Ƃ���ł��B";
			mes "���́A���ꂪ���ԒB��";
			mes "�]�݂Ǝv��������ł��B";
			mes "�Ƃ��낪�c�c";
			mes "�c�c�c�c�c�c�c�c";
			mes "����Ȏp�ɂȂ��Ă���c�c";
			next;
			mes "[���[�E�F���E�G���i]";
			mes "�ނ�ɉ�܂����B";
			mes "�c�c���Ȃ��͎��҂̊X";
			mes "�j�u���w�C�����������ł����H";
			mes "���͂����Ő̂̒��ԒB�ɉ�܂����B";
			next;
			mes "[���[�E�F���E�G���i]";
			mes "����ǁA�ނ�̒��ɂ͒N���c�c";
			mes "�������ގ҂͂��Ȃ������̂ł��c�c";
			mes "�F�A�����C���������c�c";
			next;
			menu "�ǂ����āH",-;
			mes "[���[�E�F���E�G���i]";
			mes "������܂���B";
			mes "�F�A���炩�Ȗ���ɂ��܂����B";
			mes "�F�A���炪�s���ׂ����֍s���܂����B";
			mes "�c�c�ނ炪�j�u���w�C���ɂ����̂�";
			mes "������������A����҂��Ă�����";
			mes "��������܂���c�c�c�c";
			next;
			mes "[���[�E�F���E�G���i]";
			mes "���������͑��v�ł���A";
			mes "�����ĒN������ł��Ȃ����Ƃ�";
			mes "�m�点���������̂�������܂���B";
			mes "�c�c�ނ�̓��@���L���[�̌��֍s��";
			mes "�������܂����B�������A����";
			mes "�s�����Ƃ��ł��܂���B";
			next;
			mes "[���[�E�F���E�G���i]";
			mes "�Ȃ��A�Ȃ��ł��傤���H";
			close;
		case 2:
			mes "[���[�E�F���E�G���i]";
			mes "�����c�c";
			mes "���̐��ɑ΂��関���H";
			mes "����͂���܂���B";
			mes "����c�c";
			mes "������܂���c�c";
			next;
			mes "[���[�E�F���E�G���i]";
			mes "�j�u���w�C���ŉ�����̂̒��ԒB��";
			mes "�F�A���@���L���[�̌��֋A��܂����B";
			mes "���ꂪ�N���Z�C�_�[�ɂƂ��Ẳh�_�B";
			mes "�������������A��Ȃ��̂́c�c";
			mes "��͂莄�ɂ͂��̎��i��";
			mes "�Ȃ��̂ł��傤�B";
			next;
			menu "�����A��̂���`���܂��I",-;
			mes "[���[�E�F���E�G���i]";
			mes "���Ȃ����c�c�H";
			mes "�ǂ�����āc�c�H";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�����͉ߋ��ł���ˁH";
			mes "���Ȃ��̐S�͎��Ƌ��ɂ���܂��B";
			mes "�����玄���ꏏ�ɐ킢�܂��B";
			mes "�����ĐS�̍��������A";
			mes "����ɂ��Ă��������B";
			mes "�����č����Ă͂����܂���B";
			next;
			mes "[���[�E�F���E�G���i]";
			mes "�c�c�c�c�c�c�c�c";
			mes "�c�c�����A���肪�Ƃ��B";
			mes "�{���ɂ��肪�Ƃ��B";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "����ł͍s���܂��傤�I";
			set GOD_3QUE,31;
			close;
		}
	}
	else if(GOD_3QUE == 31) {
		mes "[���[�E�F���E�G���i]";
		mes "������̊K�i���~��Ă��������B";
		mes "�c�c���͂��Ȃ��̐S�Ƌ��ɂ���܂��B";
		mes "�����Ă��ꂩ�猻��鎄�̎p�́A";
		mes "�ߋ��̂��̂ł��c�c�c�c";
		close;
	}
	mes "[���[�E�F���E�G���i]";
	mes "�ǂ����Ă��Ȃ��͂����Ɂc�c�B";
	close2;
	warp "geffen.gat",120,101;
	end;
}

que_god02.gat,54,64,4	script	���m#1_brising	105,1,1,{
	if(GOD_3QUE != 31) {
		mes "[���m]";
		mes "�댯�ł��I";
		mes "����ȏ�͐i���s�ł�!";
		close;
	}
	mes "[���m]";
	mes "�����X�^�[��������";
	mes "�Q��������ł��ˁB";
	mes "�������s���܂����H";
	next;
	switch(select("�͂��A�s���܂��I","������Ə������Ă��܂�")) {
	case 1:
		mes "[���m]";
		mes "����ł͂��������A";
		mes "�߂��ɗ��Ă��������B";
		mes "���ɋ߂Â��Ă��������B";
		close;
	case 2:
		mes "[���m]";
		mes "�������ł��܂�����A";
		mes "���z�����������B";
		close;
	}
OnTouch:
	if(GOD_3QUE != 31) {
		mes "[���m]";
		mes "�댯�ł��B";
		mes "�������Ă�������";
		close2;
		warp "que_god02.gat",51,59;
		end;
	}
	warp "que_god02.gat",174,49;
	donpcevent "���m#2_brising::OnStart";
	end;
}

que_god02.gat,55,64,4	script	���m#2_brising	105,1,1,{
	mes "[���m]";
	mes "�댯�ł��I";
	mes "����ȏ�͐i���s�ł��I";
	close;
OnStart:
	hideonnpc "���m#1_brising";
	hideoffnpc "���m#2_brising";
	initnpctimer;
	end;
OnTimer420000:
	announce "�c���v�O����܂��Ă��܂��B",0x9,0x70dbdb;
	end;
OnTimer480000:
	announce "�ߋ��̎��̗���͂������������܂��B",0x9,0x70dbdb;
	end;
OnTimer540000:
	announce "�c���v�O�ō��ꂽ�ߋ��͏��ł��܂��B",0x9,0x70dbdb;
	end;
OnTimer542000:
	areawarp "que_god02.gat",15,125,185,131,"geffen.gat",120,100;
	end;
OnTimer550000:
	donpcevent "#brising����::OnReset";
	end;
OnTimer550500:
	stopnpctimer;
	end;
OnInit:
	hideonnpc "���m#2_brising";
	end;
}

que_god02.gat,174,49,0	script	#���[�E�F���̉ߋ�	139,0,0,{
OnTouch:
	mes "["+strcharinfo(0)+"]";
	mes "�ǂ�?!�@������?!";
	mes "�����A������2�N�O�̖��̏ꏊ���B";
	mes "�Ȃ�قǁc�c";
	next;
	mes "[���[�E�F���E�G���i]";
	mes "�͂��A����͉ߋ����Č����Ă��܂��B";
	mes "�����A�ǂ�Ȏ����������̂��A";
	mes "���̐g�ɂ͉����N���Ă����̂��c�c���B";
	next;
	mes "[���[�E�F���E�G���i]";
	mes "�c�c�����܂ł͏����ł����B";
	mes "���͂��̎��ł��c�c";
	next;
	announce "�c�c�ǁA�h�b�y���Q���K�[!!",0x9,0x9cff00;
	mes "["+strcharinfo(0)+"]";
	mes "�����[!!";
	mes "�h�b�y���Q���K�[?!";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "���c�c����͉��H";
	mes "���Ȃ��͂���Ɛ�����̂ł����H";
	mes "�c�c����A������Ɠ����Ă��������I";
	mes "�c�c�c�c������!!";
	hideoffnpc " #�h�b�y���Q���K�[1";
	hideoffnpc " #���[�E�F��";
	hideoffnpc " #�R�m1";
	hideoffnpc " #�R�m2";
	hideoffnpc " #�R�m3";
	next;
	mes "[���[�E�F���E�G���i]";
	mes "�����c�c";
	mes "�����A�����c�c";
	mes "���̎��A�c�������߂������̂ł��c�c";
	mes "���̌�c�c�ˑR�A��΂���āc�c";
	next;
	announce "�F!!�@�Q�Ă��ɐ��񂵂�!!",0x9,0x9cff00;
	mes "^4E2F2F[���R�m�c�c��]";
	mes "�e������I�@�U��΂��!";
	mes "�߂��ɂ���҂��搧���ē����𕕂���I";
	mes "��q�͑O�q������!!^000000";
	emotion 27," #���[�E�F��";
	emotion 27," #�R�m1";
	emotion 27," #�R�m2";
	emotion 27," #�R�m3";
	emotion 0," #�h�b�y���Q���K�[1";
	mes "[���[�E�F���E�G���i]";
	mes "�c�c�����c�c���߂�c�c";
	mes "�����Ă͂����Ȃ��c�c";
	next;
	mes "- ���̏u�Ԃ����܂����s�����������B";
	mes "����������Ȃ���΂Ȃ�Ȃ��Ƃ���";
	mes "�������Ɨ}������Ȃ����̋���B";
	mes "2�N�O�̔ޏ��̐k����S��";
	mes "�܂��܂��Ɗ�����B -";
	next;
	mes "^4E2F2F[���R�m�c�c��]";
	mes "�U������A���[�E�F��!!";
	mes "�O�����h�N���X�𔭓�����!!^000000";
	next;
	misceffect 58," #���[�E�F��";
	announce "�N�b�c�c�N�b�N�b�N�c�c�����҂�c�c",0x9,0xa8a8a8;
	emotion 0," #���[�E�F��";
	emotion 0," #�R�m1";
	emotion 0," #�R�m2";
	emotion 0," #�R�m3";
	hideonnpc " #�h�b�y���Q���K�[1";
	hideoffnpc " #�h�b�y���Q���K�[2";
	mes "["+strcharinfo(0)+"]";
	mes "?!";
	next;
	misceffect 58," #�h�b�y���Q���K�[2";
	mes "[�j�̋��ѐ�]";
	mes "���A���킟���`!!";
	close2;
	warp "que_god02.gat",120,52;
	hideonnpc " #�h�b�y���Q���K�[2";
	hideonnpc " #���[�E�F��";
	hideonnpc " #�R�m1";
	hideonnpc " #�R�m2";
	hideonnpc " #�R�m3";
	end;
}

que_god02.gat,173,58,4	script	 #�h�b�y���Q���K�[1	739,{}
que_god02.gat,175,55,4	script	 #�h�b�y���Q���K�[2	739,{}
que_god02.gat,175,54,1	script	 #���[�E�F��	745,{}
que_god02.gat,178,49,1	script	 #�R�m1	751,{}
que_god02.gat,168,53,7	script	 #�R�m2	734,{}
que_god02.gat,167,58,4	script	 #�R�m3	752,{}

que_god02.gat,124,59,7	script	 #�G�[���~�b�g	798,{}

que_god02.gat,120,52,0	script	 #�Ɣ�	139,0,0,{
OnTouch:
	mes "["+strcharinfo(0)+"]";
	mes "�����͂ǂ��H";
	mes "�c�c���[��c�c";
	mes "���̐l�́c�c�H";
	mes "�c�c�V�������A";
	mes "�G�[���~�b�g�E�V�������H";
	next;
	mes "[�G�[���~�b�g�E�V������]";
	mes "�����c�c���߁A���߂��B";
	mes "�o����A�����Ȃ���!!";
	mes "�o����Ă��܂��c�c";
	mes "�����邱�Ƃ��ł��Ȃ��c�c";
	next;
	mes "[�G�[���~�b�g�E�V������]";
	mes "�O�����h�N���X���Ȃ�āc�c";
	mes "���ʋC�Ȃ̂�?!";
	mes "�o�J�A�o�J�o�J�o�J�`!!";
	next;
	announce "�N�b�c�c�N�b�N�b�N�c�c�����҂�c�c",0x9,0xa8a8a8;
	mes "[�G�[���~�b�g�E�V������]";
	mes "���c�c���߂��I";
	mes "���A���킟���`!!";
	next;
	hideonnpc " #�G�[���~�b�g";
	mes "["+strcharinfo(0)+"]";
	mes "����H�@�ǂ��֍s�����񂾁H";
	mes "����́c�c�ނ̐S�H";
	announce "�ȁA���[�E�F����������!!",0x9,0x9cff00;
	next;
	mes "[���[�E�F���E�G���i]";
	mes "�c�c�c�c�c�c";
	mes "�c�c������ł��傤�H";
	mes "����Łc�c";
	mes "�ǂ����Ă����Ȃ��Ă��܂����̂��c�c";
	close2;
	warp "que_god02.gat",18,127;
	end;
}

que_god02.gat,21,127,3	script	���[�E�F���E�G���i#2	745,{
	mes "[���[�E�F���E�G���i]";
	mes "�����n���ł����B�������";
	mes "�V���������v���o���܂����ˁB";
	mes "�����̎��́A�s�v�c�ȗ͂ɂ����";
	mes "���̏��E�o���Ă��܂��܂����B";
	mes "�����ĉ�ɕԂ������́A���΂ɂ�";
	mes "�N�����܂���ł����B";
	next;
	mes "[���[�E�F���E�G���i]";
	mes "��l���������c���Ă��܂���������";
	mes "����������݂܂����B���ԒB��";
	mes "�ꏏ�Ɏ��ʂ��Ƃ���ł����c�c";
	mes "������𗧂����̐l�ԂƂ���";
	mes "�v���Ȃ������̂ł��B";
	next;
	mes "[���[�E�F���E�G���i]";
	mes "�����͋C�Â��Ȃ���������ǁA";
	mes "�ł����Ȃ番����܂��B";
	mes "����厖�Ɏv���Ă����l�X��";
	mes "�������񂢂�Ƃ������Ƃ��B";
	next;
	mes "[���[�E�F���E�G���i]";
	mes "��������3����A���͎���c����";
	mes "�K�˂܂����B�c�c�ł������ł����B";
	mes "���̎��̎��́A�����̂��Ƃ�";
	mes "�퓬���瓦���o�����ڋ��҂Ƃ���";
	mes "�l���Ă��Ȃ������̂ł��B";
	next;
	mes "[���[�E�F���E�G���i]";
	mes "���낵���ċ��낵���āc�c�����ƓG��";
	mes "�O�ɂ��āA�����o���Ă��܂����̂��ƁB";
	mes "���̓����A��w���ł͐ӔC�𕉂킹��";
	mes "�����{���Ă��܂����B�����ł��A";
	mes "�ǂ�Ȏd���ł��������Ԃ����������";
	mes "�N�������̐ӂ߂𕉂����ƂɂȂ�܂��B";
	next;
	mes "[���[�E�F���E�G���i]";
	mes "�䂪�q�A�F�l�A�������������l�X��";
	mes "�s����̂Ȃ��{��̐n�́A����";
	mes "���ւƌ������܂����B";
	mes "�c�c�����Ă����邱�ƁA�����A";
	mes "�R�m�Ƃ��Ă̑S�Ă���߂Ȃ����";
	mes "�Ȃ�Ȃ������̂ł��B";
	next;
	mes "[���[�E�F���E�G���i]";
	mes "�ǂ����Ă����Ɠ��X�ƁA�����̎v����";
	mes "�\�ɏo���Ȃ������̂��c�c�ł����̎���";
	mes "��������������͔����󂯂�̂�";
	mes "���R���Ǝv�����̂ł��B�܂�����";
	mes "���ԒB�̋w���Ƃ����ł����c�c";
	mes "�����Ď���̒n�ʂ����߂����Ɓc�c";
	next;
	mes "[���[�E�F���E�G���i]";
	mes "�������֖߂�܂����B";
	mes "����Ă܂�����āc�c";
	mes "���ɗ͂͂���܂���ł�����";
	mes "�K���ɐ킢�܂����B";
	mes "�܂��F�߂Ă��炤���߂Ɂc�c";
	next;
	announce "�Ȃ�ΐ킢�Ȃ����c�c���������z����̂ł��c�c",0x9,0x70db93;
	mes "[���[�E�F���E�G���i]";
	mes "���c�c���̐��́c�c�H";
	next;
	mes "[���[�E�F���E�G���i]";
	mes "���̎��ɋ@�����������̂ł����H";
	mes "�c�c�{���ł����H";
	mes "�������c�c���ɂ͂���";
	mes "�����ɓ��̂͂���܂���B";
	next;
	mes "["+strcharinfo(0)+"]";
	mes "�����ꏏ�ɐ키�I";
	mes "�����A�s����!!";
	close2;
	donpcevent "#brising����::OnSummon";
	end;
}

que_god02.gat,17,127,0	script	#brising����	139,{
OnInit:
	hideonnpc " #�h�b�y���Q���K�[1";
	hideonnpc " #�h�b�y���Q���K�[2";
	hideonnpc " #�R�m1";
	hideonnpc " #�R�m2";
	hideonnpc " #�R�m3";
	hideonnpc " #���[�E�F��";
	hideonnpc "���@���L���[#1";
	hideoffnpc " #�G�[���~�b�g";
	end;
OnSummon:
	hideonnpc "���[�E�F���E�G���i#2";
	hideoffnpc "#brising����";
	monster "que_god02.gat",34,128," ",1015,1,"#brising����::OnKilled";
	monster "que_god02.gat",34,127," ",1015,1,"#brising����::OnKilled";
	monster "que_god02.gat",80,127," ",1015,1,"#brising����::OnKilled";
	monster "que_god02.gat",102,128," ",1036,1,"#brising����::OnKilled";
	monster "que_god02.gat",130,128," ",1036,1,"#brising����::OnKilled";
	monster "que_god02.gat",62,128," ",1041,1,"#brising����::OnKilled";
	monster "que_god02.gat",64,127," ",1041,1,"#brising����::OnKilled";
	monster "que_god02.gat",150,127," ",1041,1,"#brising����::OnKilled";
	monster "que_god02.gat",176,127," ",1041,1,"#brising����::OnKilled";
	end;
OnKilled:
	set '@count,getmapmobs("que_god02.gat","#brising����::OnKilled");
	if('@count == 0) {
		set GOD_3QUE,31;
		hideoffnpc "���@���L���[#1";
	}
	end;
OnReset:
	hideonnpc " #�h�b�y���Q���K�[1";
	hideonnpc " #�h�b�y���Q���K�[2";
	hideonnpc " #�R�m1";
	hideonnpc " #�R�m2";
	hideonnpc " #�R�m3";
	hideonnpc " #���[�E�F��";
	hideoffnpc "���m#1_brising";
	hideonnpc "���m#2_brising";
	hideoffnpc " #�G�[���~�b�g";
	hideoffnpc "���[�E�F���E�G���i#2";
	hideonnpc "���@���L���[#1";
	killmonster "que_god02.gat","#brising����::OnKilled";
	end;
}

que_god02.gat,178,127,3	script	���@���L���[#1	811,{
	if(GOD_3QUE == 31) {
		mes "[���@���L���[]";
		mes "�Ƃ��Ƃ����z���܂����ˁA";
		mes "������c�c";
		mes "���܂莞�Ԃ͂���܂���B";
		mes "�ߋ��̎��͒Z�������悢�ł��傤�B";
		mes "�ł́A�Ō�ɖ₢�܂��B";
		next;
		mes "[���@���L���[]";
		mes "���Ȃ��́A�S�𔛂���̂���";
		mes "�������܂������H";
		mes "���͂��Ȃ���������";
		mes "�҂��Ă��܂�����B";
		next;
		switch(select("�͂��A���Ȃ��ɂ��Ă��܂�","�N�ɕ����Ă���́H")) {
		case 1:
			mes "[���@���L���[]";
			mes "���[�E�F���E�G���i�A�߂��݂̋R�m��B";
			mes "���Ȃ��̐S�͂��낭";
			mes "������������Ă����c�c";
			mes "�ł��A�������v�Ȃ悤�ł��ˁB";
			mes "��_�̌��ɁA���Ȃ��𑗂�܂��傤�B";
			next;
			mes "[���@���L���[]";
			mes "���Ȃ��̐S�A�����Đ��_�́A";
			mes "���̃��@���n���Ŏ�_�̂��߂ɁA";
			mes "���Ȃ�������ł������̓��̂��Ƃ�";
			mes "�c�c����ɔ�������m��";
			mes "���܂�ς��Ȃ����c�c";
			misceffect 91,"";
			next;
			mes "[���@���L���[]";
			mes "�c�c�����āA�l�Ԃ̎q��B";
			mes "���Ȃ��͂ǂ����Ă����ɂ���̂ł��H";
			next;
			mes "- ���̔��[�ƂȂ���";
			mes "�n���Ȃ���̌����̂��Ƃ���";
			mes "����܂ł̂��Ƃ�S��";
			mes "���@���L���[�ɘb�����B -";
			next;
			mes "[���@���L���[]";
			mes "���Ȃ��������������Ƃ͂悭";
			mes "������܂����B�c�c����͑���";
			mes "���̉����̂̓��̂��Ƃł��ˁB";
			mes "���ƈ��̏��_�A�������t���C����";
			mes "���Ƃł��傤�B";
			next;
			mes "[���@���L���[]";
			mes "���_���������܂͔�������΂ƂȂ�";
			mes "�c�c���_�̗܂����݂��񂾗₽�����";
			mes "����̑��݂����c�c";
			next;
			mes "[���@���L���[]";
			mes "���Ȃ����{���ׂ����̂͏��_�̐Ղł��B";
			mes "�c�c��N�̕��a���I���̂ł��ˁB";
			mes "���͐l�ԒB�����̏I���܂ŁA�_�X��";
			mes "�h���S������Ȃ����Ƃ��肢�܂��B";
			next;
			mes "[���@���L���[]";
			mes "���Ȃ��ɉ�������Ƃ��A����";
			mes "�\�肳��Ă�������������܂���ˁB";
			mes "�_�X���c��������ȗ́c�c�����";
			mes "���Ȃ������������g�����Ƃ�M���A";
			mes "���̌��������܂��傤�B";
			next;
			mes "[���@���L���[]";
			mes "�K�˂Ȃ����B";
			mes "���_���������₽���ᓹ�B";
			mes "���_���n�������񂾐�B";
			mes "���_���ʂ�߂��������Ȉ�{���B";
			mes "���_���o������l�l�̃h���[�t�B�c�c";
			next;
			mes "[���@���L���[]";
			mes "^4d4dff�����ƐL�т����̑���";
			mes "�킵�����̔���";
			mes "�P�����̓���";
			mes "���͐S�A���������^000000";
			next;
			mes "[���@���L���[]";
			mes "���̉̂��悭�o���Ă����Ȃ����B";
			mes "�ł́A���Ȃ������̐��E�֋A���܂��B";
			set GOD_3QUE,34;
			next;
			mes "[���@���L���[]";
			mes "�I�[�f�B���̂�������c�c";
			close2;
			hideonnpc " #�h�b�y���Q���K�[1";
			hideonnpc " #�h�b�y���Q���K�[2";
			hideonnpc " #�R�m1";
			hideonnpc " #�R�m2";
			hideonnpc " #�R�m3";
			hideonnpc " #���[�E�F��";
			hideoffnpc "���m#1_brising";
			hideonnpc "���m#2_brising";
			hideoffnpc " #�G�[���~�b�g";
			hideoffnpc "���[�E�F���E�G���i#2";
			hideonnpc "���@���L���[#1";
			warp "geffen.gat",120,101;
			end;
		case 2:
			mes "[���@���L���[]";
			mes "���������c�c";
			mes "���͂��Ȃ��̐g���؂��";
			mes "�ߋ��𗝉������z����������";
			mes "�΂��Ė₤���̂ł��B";
			mes "�c�c������A�����Ȃ����B";
			next;
			mes "[���@���L���[]";
			mes "���[�E�F���E�G���i�A�߂��݂̋R�m��B";
			mes "���Ȃ��̐S�͂��낭";
			mes "������������Ă����c�c";
			mes "�ł��A�������v�Ȃ悤�ł��ˁB";
			mes "��_�̌��ɁA���Ȃ��𑗂�܂��傤�B";
			next;
			mes "[���@���L���[]";
			mes "���Ȃ��̐S�A�����Đ��_�́A";
			mes "���̃��@���n���Ŏ�_�̂��߂ɁA";
			mes "���Ȃ�������ł������̓��̂��Ƃ�";
			mes "�c�c����ɔ�������m��";
			mes "���܂�ς��Ȃ����c�c";
			misceffect 91,"";
			next;
			mes "[���@���L���[]";
			mes "�c�c�����āA�l�Ԃ̎q��B";
			mes "���Ȃ��͂ǂ����Ă����ɂ���̂ł��H";
			next;
			mes "- ���̔��[�ƂȂ���";
			mes "�n���Ȃ���̌����̂��Ƃ���";
			mes "����܂ł̂��Ƃ�S��";
			mes "���@���L���[�ɘb�����B -";
			next;
			mes "[���@���L���[]";
			mes "���Ȃ��������������Ƃ͂悭";
			mes "������܂����B�c�c����͑���";
			mes "���̉����̂̓��̂��Ƃł��ˁB";
			mes "���ƈ��̏��_�A�������t���C����";
			mes "���Ƃł��傤�B";
			next;
			mes "[���@���L���[]";
			mes "���_���������܂͔�������΂ƂȂ�";
			mes "�c�c���_�̗܂����݂��񂾗₽�����";
			mes "����̑��݂����c�c";
			next;
			mes "[���@���L���[]";
			mes "���Ȃ����{���ׂ����̂͏��_�̐Ղł��B";
			mes "�c�c��N�̕��a���I���̂ł��ˁB";
			mes "���͐l�ԒB�����̏I���܂ŁA�_�X��";
			mes "�h���S������Ȃ����Ƃ��肢�܂��B";
			next;
			mes "[���@���L���[]";
			mes "���Ȃ��ɉ�������Ƃ��A����";
			mes "�\�肳��Ă�������������܂���ˁB";
			mes "�_�X���c��������ȗ́c�c�����";
			mes "���Ȃ������������g�����Ƃ�M���A";
			mes "���̌��������܂��傤�B";
			next;
			mes "[���@���L���[]";
			mes "�K�˂Ȃ����B";
			mes "���_���������₽���ᓹ�B";
			mes "���_���n�������񂾐�B";
			mes "���_���ʂ�߂��������Ȉ�{���B";
			mes "���_���o������l�l�̃h���[�t�B�c�c";
			next;
			mes "[���@���L���[]";
			mes "^4d4dff�����ƐL�т����̑���";
			mes "�킵�����̔���";
			mes "�P�����̓���";
			mes "���͐S�A���������^000000";
			next;
			mes "[���@���L���[]";
			mes "���̉̂��悭�o���Ă����Ȃ����B";
			mes "�ł́A���Ȃ������̐��E�֋A���܂��B";
			set GOD_3QUE,34;
			next;
			mes "[���@���L���[]";
			mes "�I�[�f�B���̂�������c�c";
			close2;
			hideonnpc " #�h�b�y���Q���K�[1";
			hideonnpc " #�h�b�y���Q���K�[2";
			hideonnpc " #�R�m1";
			hideonnpc " #�R�m2";
			hideonnpc " #�R�m3";
			hideonnpc " #���[�E�F��";
			hideoffnpc "���m#1_brising";
			hideonnpc "���m#2_brising";
			hideoffnpc " #�G�[���~�b�g";
			hideoffnpc "���[�E�F���E�G���i#2";
			hideonnpc "���@���L���[#1";
			warp "geffen.gat",120,101;
			end;
		}
	}
}

xmas.gat,38,105,0	script	 #brisindwarf1	111,3,3,{
	if($GodMagingiorde < 50 || $GodBrysinggamen >= 100) {
		mes "- �Ⴊ���Ȃ�ς����Ă���B -";
		close;
	}
	if(GOD_3QUE > 39 && GOD_3QUE < 50) {
		mes "- �Ⴊ�~���Ă��邾���ɂ݂��邪";
		mes "�������ڂɈ�a����������c�c -";
		next;
		switch(select("�܂Ԃ����������Ă݂�","�ڂ�˕t���Ă݂�","�ς����Ă�����˕t���Ă݂�","�������Ȃ�")) {
		case 1:
			mes "- �܂Ԃ����S�V�S�V�������Ă݂��B";
			mes "����A��ɂ��Ă����Ⴊ�c�c";
			mes "���G�ꂽ�r�[�A�n���n�߂���";
			mes "�ꕔ�A�n���Ȃ��Ŏc���Ă��镔����";
			mes "����B�����͉����̕����̂悤��";
			mes "������c�c -";
			next;
			if(select("�������q���Ă݂�","��߂�") == 2) {
				mes "["+strcharinfo(0)+"]";
				mes "�����N����Ȃ��c�c";
				mes "�C�̂������c�c";
				close;
			}
			mes "["+strcharinfo(0)+"]";
			mes "������ƕ��͂�����Ă݂悤���ȁc�c";
			next;
			switch(select("���͐S�A����","�킵�����̔���","������","�����ƐL�т����̑���","�P�����̓���")) {
			case 1:
				mes "["+strcharinfo(0)+"]";
				mes "���͐S�A����";
				break;
			case 2:
				mes "["+strcharinfo(0)+"]";
				mes "�킵�����̔���";
				break;
			case 3:
				mes "["+strcharinfo(0)+"]";
				mes "������";
				break;
			case 4:
				mes "["+strcharinfo(0)+"]";
				mes "�����ƐL�т����̑���";
				set '@point,'@point + 1;
				break;
			case 5:
				mes "["+strcharinfo(0)+"]";
				mes "�P�����̓���";
				break;
			}
			switch(select("���͐S�A����","�킵�����̔���","������","�����ƐL�т����̑���","�P�����̓���")) {
			case 1:
				mes "���͐S�A����";
				break;
			case 2:
				mes "�킵�����̔���";
				set '@point,'@point + 1;
				break;
			case 3:
				mes "������";
				break;
			case 4:
				mes "�����ƐL�т����̑���";
				break;
			case 5:
				mes "�P�����̓���";
				break;
			}
			switch(select("���͐S�A����","�킵�����̔���","������","�����ƐL�т����̑���","�P�����̓���")) {
			case 1:
				mes "���͐S�A����";
				break;
			case 2:
				mes "�킵�����̔���";
				break;
			case 3:
				mes "������";
				break;
			case 4:
				mes "�����ƐL�т����̑���";
				break;
			case 5:
				mes "�P�����̓���";
				set '@point,'@point + 1;
				break;
			}
			switch(select("���͐S�A����","�킵�����̔���","������","�����ƐL�т����̑���","�P�����̓���")) {
			case 1:
				mes "���͐S�A����";
				set '@point,'@point + 1;
				break;
			case 2:
				mes "�킵�����̔���";
				break;
			case 3:
				mes "������";
				break;
			case 4:
				mes "�����ƐL�т����̑���";
				break;
			case 5:
				mes "�P�����̓���";
				break;
			}
			switch(select("���͐S�A����","�킵�����̔���","������","�����ƐL�т����̑���","�P�����̓���")) {
			case 1:
				mes "���͐S�A����";
				break;
			case 2:
				mes "�킵�����̔���";
				break;
			case 3:
				mes "������";
				set '@point,'@point + 1;
				break;
			case 4:
				mes "�����ƐL�т����̑���";
				break;
			case 5:
				mes "�P�����̓���";
				break;
			}
			next;
			if('@point > 4) {
				hideoffnpc "�A���t���b�O#1";
				mes "[�V�����h���[�t]";
				mes "�ǂ�����?!";
				mes "�킵���Ăяo�����z��!!";
				close;
			}
			mes "- �c�c�����N���Ȃ������B -";
			close;
		case 2:
			mes "["+strcharinfo(0)+"]";
			mes "�C�^�b!!";
			mes "��������Ă��?!";
			close;
		case 3:
			mes "- �؂̍��ɐς����Ă�����";
			mes "�w��˂����ĂĂ݂�ƁA";
			mes "�����d�����ɂԂ������B";
			mes "�c�c�����\���������ɂ݂�";
			mes "������!! -";
			emotion 23,"";
			percentheal -20,0;
			close;
		case 4:
			close;
		}
	}
	mes "- �؂ɐႪ�ς����Ă���B -";
	close;
OnTouch:
	if(GOD_3QUE > 39) {
		emotion 0;
	}
	end;
}

xmas.gat,36,103,4	script	�A���t���b�O#1	826,{
	if(GOD_3QUE == 49) {
		mes "[�A���t���b�O]";
		mes "�c�c�������������!!";
		mes "�_�X�ɂ΂ꂽ�獢��񂶂�!!";
		mes "��������ʂɂ��Ă���I";
		close2;
		hideonnpc "�A���t���b�O#1";
		end;
	}
	else if(GOD_3QUE == 48) {
		mes "[�A���t���b�O]";
		mes "���̗p���A���m�H";
		mes "�킵��͑S���ڊo�߂��B�����K��";
		mes "���̎�������ƐM���Ă������B";
		mes "�l�X�ȗ͂����킳��A�����񂹂���";
		mes "�ω����悤�Ƃ��Ă���B";
		next;
		switch(select("���A�ɂ��܂���","�u���[�V���K�����̍ޗ���m�肽��")) {
		case 1:
			mes "[�A���t���b�O]";
			mes "�{�C���H";
			mes "�킵�͐l�Ԃ̂��������i�����킩���B";
			mes "�킵�͉B��Ă��Ȃ���΂Ȃ�ʁB";
			mes "�I�[�f�B���̃J���X��";
			mes "�����肽���Ȃ��񂶂��I";
			next;
			mes "[�A���t���b�O]";
			mes "�������֍s���I";
			mes "��������!!";
			close2;
			hideonnpc "�A���t���b�O#1";
			end;
		case 2:
			mes "[�A���t���b�O]";
			mes "�u���[�V���K�����̍ޗ����ƁH";
			mes "�J�b�J�b�J�b�J�c�c";
			mes "���O���W�߂�̂��H";
			mes "�܂��A�l�ԗp�ɍ��u���[�V���K����";
			mes "�Ȃ�c�c�\���������B";
			next;
			mes "[�A���t���b�O]";
			mes "��N�O�A�����Ƃ̐킢�ŁA�_�X�̕����";
			mes "�ꕔ���n��ɗ������c�c";
			mes "�u���[�V���K�����̔j�ЂƌĂ΂�����";
			mes "�c�c�܂�A�u���[�V���K�����̗͂�";
			mes "��߂����̂��ޗ��ɂȂ�B";
			next;
			mes "[�A���t���b�O]";
			mes "����́c�c";
			mes "^4d4dff�t���C���̕��";
			mes "��̑���";
			mes "��̌���";
			mes "�Â��Ȕg";
			mes "������C^000000����B";
			next;
			mes "[�A���t���b�O]";
			mes "�t���C���l�̎����̂悤��";
			mes "�u���[�V���K�����̗͂ƂȂ���̂�";
			mes "��߂����̂�����񂶂�B";
			next;
			mes "[�A���t���b�O]";
			mes "��{�ƂȂ�l�b�N���X�͂�����񂶂Ⴊ";
			mes "�����Ƃ��đ������邽�߂�";
			mes "�T�t�@�C�A�̂悤�ȕ�΂��K�v����B";
			mes "������^���I�p�[���A�����ċ����͂�";
			mes "�����ꂽ���r�[�Ȃǂȁc�c";
			next;
			mes "[�A���t���b�O]";
			mes "�J�b�J�b�J�b�J�c�c";
			mes "�l�Ԃ̂��߂ł͂Ȃ��B";
			mes "�t���C���l�̂��߂�";
			mes "������x�Ȃ𕱂����I";
			mes "�킵��Z��b�艮�̕Ƃ���I";
			mes "�c�c�J�b�J�b�J�c�c";
			next;
			mes "[�A���t���b�O]";
			mes "��\�����悤�B";
			mes "�킵��͖ڊo�߂��B";
			mes "������l�ԋ��͂����K��";
			mes "�u���[�V���K������";
			mes "��ɓ���邾�낤�B";
			mes "�J�b�J�b�J�c�c";
			next;
			mes "[�A���t���b�O]";
			mes "�킩������A�������ƍs��!!";
			set GOD_3QUE,49;
			close2;
			hideonnpc "�A���t���b�O#1";
			end;
		}
	}
	else if(GOD_3QUE == 40) {
		mes "[�A���t���b�O]";
		mes "���́[�A�����A�ǂꂭ�炢";
		mes "�����Ă��������̂��B";
		mes "�����A�ǂ�Ȑ��ӋC�ȏ��m��";
		mes "���̃A���t���b�O���N�������񂶂�H";
		mes "���O���H�@";
		next;
		mes "[�A���t���b�O]";
		mes "�N���킵�̋��ꏊ���������H";
		mes "���L���H�@�w�C���_�����H";
		mes "����Ƃ��t���C���H";
		next;
		switch(select("�����֗��������łǂ����āc�c","���́A���@���L���[���c�c")) {
		case 1:
			mes "[�A���t���b�O]";
			mes "���킯!!";
			mes "���ꂾ����l�Ԃ��ēz��!!";
			mes "���R�ŁA���̕��͂������";
			mes "�v���Ă���̂�?!";
			mes "�{���̂��Ƃ������A���m�I";
			next;
			switch(select("���̓��@���L���[���c�c","�P�Ȃ���R�ł��I")) {
			case 1:
				mes "[�A���t���b�O]";
				mes "�c�c���@���L���[�A���@���L���[!!";
				mes "�I�[�f�B���̖��A���̐푈���������I";
				mes "�I�[�f�B�����킵��_���Ă���̂�?!";
				mes "�킵�́A�Ԉ���ĂȂ��A";
				mes "�������Ă����!!";
				next;
				mes "- �I�[�f�B��������k����";
				mes "�A���t���b�O�ɁA�����ɗ���܂ł�";
				mes "�o�܂��������B -";
				next;
				mes "[�A���t���b�O]";
				mes "�c�c����Ȃ��Ƃ�������̂��B";
				mes "�l�Ԃ��_�̗̈�ɂ́c�c�N�b�N�c�c";
				mes "�J�b�J�b�J�c�c�����͂����B";
				mes "�������A���O�����߂Ă�����̂�";
				mes "�����́A�킵��Z�킪��������̂���B";
				next;
				mes "[�A���t���b�O]";
				mes "�N�b�N�b�N�b�N�A�J�[�b�J�b�J�b�J�I";
				mes "����Ă݂邩�I";
				mes "�N�b�N�A�J�b�J�b�J�A�������A�������I";
				mes "���̃A���t���b�O�A�l�Ԃɋ��͂��悤�B";
				mes "���L��w�C���_���ɋs�߂�����";
				mes "�}�V���Ⴂ�I";
				next;
				mes "[�A���t���b�O]";
				mes "���������΁A�t���C�͂ǂ������H";
				mes "���������ĂȂ��̂��H";
				mes "�܂��A�����c�c�J�J�J�c�c";
				mes "�����A�l�Ԃ̏��m�B�m�肽���Ȃ����H";
				mes "����P�������A���_�t���C���l��";
				mes "�����̂��Ƃ��B";
				next;
				mes "[�A���t���b�O]";
				mes "�������A���̐��ŗB�ꖳ��̑��݁A";
				mes "�u���[�V���K�����̂��Ƃ���B";
				mes "�킵��ꑰ�Ȃ�A�Ăт��̔���";
				mes "���̐��ɐ��ݏo�����Ƃ��o����B";
				mes "�f�������З͂��߂��A������ȁB";
				next;
				mes "[�A���t���b�O]";
				mes "�킵�́A������x���̌����������I";
				mes "���������̂��߂ɂ́A�����炵�����L��";
				mes "�I�[�f�B���̂����Ŗ���ɂ���";
				mes "�Z���S���A�ڊo�߂����˂΂Ȃ�܂��B";
				next;
				mes "[�A���t���b�O]";
				mes "�ӂ�A�w�C���_���̓z�߂����X�����I";
				mes "�������A�킵��Z���";
				mes "�S���N�����񂶂�I";
				mes "�����āA���̒��ɂ�����x";
				mes "�_�X�̕���𐶂ݏo���̂���I";
				next;
				mes "[�A���t���b�O]";
				mes "�����A�_�Ƌ��l���C�t���O��";
				mes "�䂪��h���@�������N�����̂���!!";
				set GOD_3QUE,41;
				close2;
				hideonnpc "�A���t���b�O#1";
				end;
			case 2:
				mes "[�A���t���b�O]";
				mes "�c�c���R�H�@���R���ƁH";
				mes "����I";
				mes "��x�Ɨ����!!";
				mes "�z��c�c�z�炪�C�����Ă͂Ȃ��I";
				mes "�킵�́A�ڊo�߂ĂȂ񂩂Ȃ����I";
				close2;
				hideonnpc "�A���t���b�O#1";
				end;
			}
		case 2:
			mes "[�A���t���b�O]";
			mes "�c�c���@���L���[�A���@���L���[!!";
			mes "�I�[�f�B���̖��A���̐푈���������I";
			mes "�I�[�f�B�����킵��_���Ă���̂�?!";
			mes "�킵�́A�Ԉ���ĂȂ��A";
			mes "�������Ă����!!";
			next;
			mes "- �I�[�f�B��������k����";
			mes "�A���t���b�O�ɁA�����ɗ���܂ł�";
			mes "�o�܂��������B -";
			next;
			mes "[�A���t���b�O]";
			mes "�c�c����Ȃ��Ƃ�������̂��B";
			mes "�l�Ԃ��_�̗̈�ɂ́c�c�N�b�N�c�c";
			mes "�J�b�J�b�J�c�c�����͂����B";
			mes "�������A���O�����߂Ă�����̂�";
			mes "�����́A�킵��Z�킪��������̂���B";
			next;
			mes "[�A���t���b�O]";
			mes "�N�b�N�b�N�b�N�A�J�[�b�J�b�J�b�J�I";
			mes "����Ă݂邩�I";
			mes "�N�b�N�A�J�b�J�b�J�A�������A�������I";
			mes "���̃A���t���b�O�A�l�Ԃɋ��͂��悤�B";
			mes "���L��w�C���_���ɋs�߂�����";
			mes "�}�V���Ⴂ�I";
			next;
			mes "[�A���t���b�O]";
			mes "���������΁A�t���C�͂ǂ������H";
			mes "���������ĂȂ��̂��H";
			mes "�܂��A�����c�c�J�J�J�c�c";
			mes "�����A�l�Ԃ̏��m�B�m�肽���Ȃ����H";
			mes "����P�������A���_�t���C���l��";
			mes "�����̂��Ƃ��B";
			next;
			mes "[�A���t���b�O]";
			mes "�������A���̐��ŗB�ꖳ��̑��݁A";
			mes "�u���[�V���K�����̂��Ƃ���B";
			mes "�킵��ꑰ�Ȃ�A�Ăт��̔���";
			mes "���̐��ɐ��ݏo�����Ƃ��o����B";
			mes "�f�������З͂��߂��A������ȁB";
			next;
			mes "[�A���t���b�O]";
			mes "�킵�́A������x���̌����������I";
			mes "���������̂��߂ɂ́A�����炵�����L��";
			mes "�I�[�f�B���̂����Ŗ���ɂ���";
			mes "�Z���S���A�ڊo�߂����˂΂Ȃ�܂��B";
			next;
			mes "[�A���t���b�O]";
			mes "�ӂ�A�w�C���_���̓z�߂����X�����I";
			mes "�������A�킵��Z���";
			mes "�S���N�����񂶂�I";
			mes "�����āA���̒��ɂ�����x";
			mes "�_�X�̕���𐶂ݏo���̂���I";
			next;
			mes "[�A���t���b�O]";
			mes "�����A�_�Ƌ��l���C�t���O��";
			mes "�䂪��h���@�������N�����̂���!!";
			set GOD_3QUE,41;
			close2;
			hideonnpc "�A���t���b�O#1";
			end;
		}
	}
	else if(GOD_3QUE == 41) {
		mes "[�A���t���b�O]";
		mes "�ǂ����Ă܂������ɂ���H";
		mes "�h���@�������N�����Ă����I";
		next;
		switch(select("�h���@�����͂ǂ��ɂ���́H","�u���[�V���K�����������ƒm�肽��")) {
		case 1:
			mes "[�A���t���b�O]";
			mes "�����A�������������B";
			mes "���킢�����Ȃ킵�̒�A�h���@�����c�c";
			mes "�ǂ��Ŗ����Ă��������ȁc�c�H";
			next;
			mes "[�A���t���b�O]";
			mes "�킵��͏��_��J���߂��Ƃ������R��";
			mes "�I�[�f�B���ƃw�C���_���ɔ�����ꂽ�B";
			mes "�������A�S�Ă̓t���C���l�̋��h�S��";
			mes "���L�̂�������ŋN����������";
			mes "���Ⴊ�ȁc�c";
			next;
			mes "[�A���t���b�O]";
			mes "�c�c�킵��͏��_������������";
			mes "�B�ꂽ�B�܂��A�킵���";
			mes "�킵�炪���������_�̑�����";
			mes "����ɂ����Ƃ����󂶂�c�c";
			next;
			mes "[�A���t���b�O]";
			mes "�h���@�����́A���̈�{���̕���";
			mes "����͂�����B���_�̍��肪";
			mes "���܂��Ă���ꏊ����B";
			break;
		case 2:
			mes "[�A���t���b�O]";
			mes "�u���[�V���K�����́A�킵��";
			mes "�Z�킪�S���𒍂��A���o����";
			mes "�����������̂��Ƃ���B";
			mes "������̂��́A�ĂёS��������";
			mes "���邩�ǂ����A�����킩���B";
			next;
			mes "[�A���t���b�O]";
			mes "�c�c�h���[�t�����_���������̂�";
			mes "�߂��������̂��낤���H";
			mes "�t���C���l�̓I�[�f�B�������łȂ��A";
			mes "�S�Ă̐_�X�������鏗�_���������̂��B";
			next;
			mes "[�A���t���b�O]";
			mes "�c�c�{���̃u���[�V���K������";
			mes "����͂ł��ʂ��c�c�����Ȃ��b����B";
			mes "�J�b�J�b�J�c�c";
			next;
			mes "[�A���t���b�O]";
			mes "���_�̗͂�������Ɛ��ɕ�΁c�c";
			mes "���ׂĂ̗͂��������鎞�I";
			mes "��[���͂��͂���!!";
			mes "���̎����y���݂���킢�I";
			next;
			mes "[�A���t���b�O]";
			mes "�h���@�����͓��̈�{���ɖ����Ă���B";
			mes "���_�̍��肪���܂�A���̏ꏊ�ɂȁI";
			next;
			mes "[�A���t���b�O]";
			mes "�c�c�킵��͏��_������������";
			mes "�B�ꂽ�B�܂��A�킵���";
			mes "�킵�炪���������_�̑�����";
			mes "����ɂ����Ƃ����󂶂�c�c";
			next;
			mes "[�A���t���b�O]";
			break;
		}
		mes "���Ɠ�l�̒�ɂ��ẮA";
		mes "�c�O���Ⴊ�o���Ă����B";
		mes "�����Ă��̉̂͊o���Ă����B";
		next;
		mes "[�A���t���b�O]";
		mes "^4d4dff���ɏ�肵�F����";
		mes "���ނ��ї���邻�̗܂�";
		mes "���f�ɐk���邻�̐Ԃ��O��";
		mes "���͐g���S��";
		mes "���̑S�Ă�^����B^000000";
		set GOD_3QUE,42;
		close2;
		hideonnpc "�A���t���b�O#1";
		end;
	}
	else if(GOD_3QUE == 42) {
		mes "[�A���t���b�O]";
		mes "�͂₭�I";
		mes "���L�I�@�w�C���_���I�@�I�[�f�B���I";
		mes "�z�炪�C�����O�ɁA�h���@������";
		mes "�N�����Ă���!!";
		close2;
		hideonnpc "�A���t���b�O#1";
		end;
	}
	else if(GOD_3QUE > 42 && GOD_3QUE < 48) {
		mes "[�A���t���b�O]";
		mes "�����A�Z�킪�S���ڊo�߂��ȁI";
		mes "�n�b�n�n�n�n�I";
		mes "�l�Ԃ̍�関���͊y���݂���̂��I";
		close2;
		hideonnpc "�A���t���b�O#1";
		end;
	}
	mes "[�A���t���b�O]";
	mes "�c�c�c�c�c�c";
	mes "�c�c���O�ɗp�͂Ȃ��B";
	close2;
	hideonnpc "�A���t���b�O#1";
	end;
OnInit:
	hideonnpc "�A���t���b�O#1";
	end;
}

prt_fild02.gat,185,269,0	script	 #brisindwarf2	111,3,3,{
	if($GodMagingiorde < 50 || $GodBrysinggamen >= 100) {
		mes "- ���}�Ȋ₾�B -";
		close;
	}
	if(GOD_3QUE > 41) {
		mes "- �؁X���΂��āA�A����ԔZ��";
		mes "�Ȃ��Ă���ꏊ�ɍd���₪����B";
		mes "���̊�̒����͕������Ȃ��Ă���B -";
		next;
		switch(select("�����Ă݂�","��ŕ\�ʂ��ӂ��Ă݂�","�w�ŕ\�ʂ��������Ă݂�","��̕��Œ@���Ă݂�")) {
		case 1:
			mes "- ����ȕ�����������";
			mes "�₪�����Č����ł����B";
			mes "�c�c�����Ă݂悤�B -";
			close2;
			warp "prt_fild02.gat",165,224;
			end;
		case 2:
			mes "- �\�ʂ̓y��ۂ���̕���";
			mes "�ӂ��Ă݂��B����ƁA�ۂ�";
			mes "�����Ȃ������g�Q�Ŏ��";
			mes "�؂��Ă��܂����B -";
			emotion 0,"";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�C�^�b�I";
			mes "�����o��������c�c";
			close;
		case 3:
			mes "- �w�ŕ\�ʂ��������Ă݂��B";
			mes "�f�R�{�R���Ă��邪�A�悭";
			mes "���Ă݂�ƁA���������܂�Ă���";
			mes "�悤���B�\�ʂ̑ۂ������";
			mes "�X�ɒ��ׂĂ݂�ƁA��������";
			mes "������������B -";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�����̃p�Y���H";
			mes "���������āA�A���t���b�O��";
			mes "�����Ă������́c�c�H";
			mes "�悵�A���͂�����Ă݂悤�B";
			next;
			switch(select("���ނ��тɗ���邻�̗܂�","���ɏ�肵�F����","���͐g���S��","���f�ɐk���邻�̐Ԃ��O��","���̑S�Ă�^����")) {
			case 1:
				mes "["+strcharinfo(0)+"]";
				mes "���ނ��тɗ���邻�̗܂�";
				break;
			case 2:
				mes "["+strcharinfo(0)+"]";
				mes "���ɏ�肵�F����";
				set '@point,'@point + 1;
				break;
			case 3:
				mes "["+strcharinfo(0)+"]";
				mes "���͐g���S��";
				break;
			case 4:
				mes "["+strcharinfo(0)+"]";
				mes "���f�ɐk���邻�̐Ԃ��O��";
				break;
			case 5:
				mes "["+strcharinfo(0)+"]";
				mes "���̑S�Ă�^����";
				break;
			}
			switch(select("���ނ��тɗ���邻�̗܂�","���ɏ�肵�F����","���͐g���S��","���f�ɐk���邻�̐Ԃ��O��","���̑S�Ă�^����")) {
			case 1:
				mes "���ނ��тɗ���邻�̗܂�";
				set '@point,'@point + 1;
				break;
			case 2:
				mes "���ɏ�肵�F����";
				break;
			case 3:
				mes "���͐g���S��";
				break;
			case 4:
				mes "���f�ɐk���邻�̐Ԃ��O��";
				break;
			case 5:
				mes "���̑S�Ă�^����";
				break;
			}
			switch(select("���ނ��тɗ���邻�̗܂�","���ɏ�肵�F����","���͐g���S��","���f�ɐk���邻�̐Ԃ��O��","���̑S�Ă�^����")) {
			case 1:
				mes "���ނ��тɗ���邻�̗܂�";
				break;
			case 2:
				mes "���ɏ�肵�F����";
				break;
			case 3:
				mes "���͐g���S��";
				break;
			case 4:
				mes "���f�ɐk���邻�̐Ԃ��O��";
				set '@point,'@point + 1;
			case 5:
				mes "���̑S�Ă�^����";
				break;
			}
			switch(select("���ނ��тɗ���邻�̗܂�","���ɏ�肵�F����","���͐g���S��","���f�ɐk���邻�̐Ԃ��O��","���̑S�Ă�^����")) {
			case 1:
				mes "���ނ��тɗ���邻�̗܂�";
				break;
			case 2:
				mes "���ɏ�肵�F����";
				break;
			case 3:
				mes "���͐g���S��";
				set '@point,'@point + 1;
				break;
			case 4:
				mes "���f�ɐk���邻�̐Ԃ��O��";
				break;
			case 5:
				mes "���̑S�Ă�^����";
				break;
			}
			switch(select("���ނ��тɗ���邻�̗܂�","���ɏ�肵�F����","���͐g���S��","���f�ɐk���邻�̐Ԃ��O��","���̑S�Ă�^����")) {
			case 1:
				mes "���ނ��тɗ���邻�̗܂�";
				break;
			case 2:
				mes "���ɏ�肵�F����";
				break;
			case 3:
				mes "���͐g���S��";
				break;
			case 4:
				mes "���f�ɐk���邻�̐Ԃ��O��";
				break;
			case 5:
				mes "���̑S�Ă�^����";
				set '@point,'@point + 1;
				break;
			}
			next;
			if('@point > 4) {
				hideoffnpc "�h���@����#1";
				mes "[�h���@����]";
				mes "����!!";
				mes "�A���t���b�O��?!";
				close;
			}
			mes "- �c�c�����N���Ȃ������B -";
			close;
		case 4:
			mes "["+strcharinfo(0)+"]";
			mes "�S�z���S�z���I";
			mes "�S�z�b�A�ق��肪���c�c";
			close;
		}
	}
	mes "- ��̕\�ʂɂт������";
	mes "�ۂ������Ă���B -";
	close;
OnTouch:
	if(GOD_3QUE > 41) {
		emotion 0;
	}
	end;
}

prt_fild02.gat,185,270,3	script	�h���@����#1	826,{
	if(GOD_3QUE > 43) {
		mes "[�h���@����]";
		mes "�c�c���O�A�Ȃ��킵����N�����H";
		mes "�Ȃ��u���[�V���K�����̗͂�]�ށH";
		mes "���ꂾ���͊̂ɖ����Ă����B";
		mes "�킵��̃u���[�V���K������";
		mes "�t���C���l�̂��߂ɂ̂ݑ��݂���B";
		next;
		mes "[�h���@����]";
		mes "�c�c�l�X�͂킵�炪�������G�T��";
		mes "�t���C���l�����܂����ƌ����B";
		mes "�����A�����ė~�����B";
		mes "�킵��͏����ɏ��_���������̂��B";
		close2;
		hideonnpc "�h���@����#1";
		end;
	}
	else if(GOD_3QUE == 42) {
		mes "[�h���@����]";
		mes "�Ȃ�?!";
		mes "�A���t���b�O�ł͂Ȃ��ȁI";
		mes "���O�͉��҂��H";
		mes "����Ȃ���΁A���̎�͂˂Ă����!!";
		next;
		switch(select("������!!","�A���t���b�O�ɗ��܂�܂���!!")) {
		case 1:
			mes "[�h���@����]";
			mes "�Ƃ��ƂƏ�����!!";
			close2;
			hideonnpc "�h���@����#1";
			end;
		case 2:
			mes "[�h���@����]";
			mes "���c�c�Z�M���H";
			mes "�����ƁH";
			mes "�u���[�V���K����?!";
			mes "�t���C���l�Ƃ܂����̂�?!";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "�����A�����ł͂Ȃ��āc�c";
			next;
			mes "[�h���@����]";
			mes "�c�c�������B";
			mes "�c�c�c�c�c�c�c�c";
			mes "�t���C���l�ƍĂщ�Ȃ��Ƃ�";
			mes "���߂ău���[�V���K���������ł�";
			mes "�Ăь�����̂Ȃ�c�c";
			next;
			mes "[�h���@����]";
			mes "�A���A�����܂Ńu���[�V���K������";
			mes "�U�������̂Ȃ�΍\��ʁB";
			mes "�����U���Ƃ͂����A���_�̗͂͏h��B";
			mes "�������A�킵��̗͕͂K�v���B";
			next;
			mes "[�h���@����]";
			mes "�c�c�c�c�c�c";
			mes "�킵�́A�Ăт��̐��ɖڊo�߂�";
			mes "�ޏ��̈������߂Ă��ǂ��̂��낤���c�c";
			next;
			mes "[�h���@����]";
			mes "�c�c�킩���B";
			mes "�������A�킵�͒m�肽���B";
			mes "�_�̗͂����������l�Ԃ��ǂ��Ȃ�̂��B";
			next;
			mes "[�h���@����]";
			mes "�A���t���b�O�����͂���̂Ȃ�";
			mes "�킵�����͂��悤�B";
			mes "�悵�A���O�ɁA��x�[�����O�̂��Ƃ�";
			mes "�����悤�B";
			next;
			mes "[�h���@����]";
			mes "�킵��́A����t���C���l�̒ʂ�������";
			mes "�B�ꂽ�B�����́A�ߋ��Ƀt���C���l��";
			mes "�����������Ȉ�{���B";
			next;
			mes "[�h���@����]";
			mes "�Â��ɗ�����C�́A���̍��̂܂�";
			mes "�t���C���l�̍�����c���Ă���B";
			mes "���̕��ɔޏ��̗͂�������c�c";
			mes "���O��l�Ԃ����������͂�";
			mes "�~����̂��낤�B";
			next;
			mes "[�h���@����]";
			mes "�킵�͐_���������B";
			mes "���l���������B";
			mes "�����A�l�Ԃ͂������������Ȃ��B";
			mes "���O��͔j��A�����čĐ�������ȁB";
			next;
			mes "[�h���@����]";
			mes "�킵�炪�ڊo�߂邱�ƂŐ��ݏo�����";
			mes "���̂��A�ǂ̂悤�ɂȂ�̂��m�肽���B";
			next;
			mes "[�h���@����]";
			mes "�~�����j�[���R���ɘA�Ȃ�ꏊ�c�c";
			mes "�������琼�A�t���C���l�̗܂�";
			mes "���܂�ꏊ�Ƀx�[�����O�������Ă���B";
			next;
			mes "[�h���@����]";
			mes "���̒����琺������������";
			mes "�����邪�����B";
			mes "�����t�H�@���m�ɂ͒m���B";
			mes "�����t�̃q���g�H";
			mes "����̓I�[�f�B�����t���C���l��";
			mes "���������߂��B";
			next;
			mes "[�h���@����]";
			mes "���@���L���[�炪���@���n����";
			mes "�A��čs�����ҒB�c�c�ނ��";
			mes "���炩�Ȗ���ɂ����Ƃ�";
			mes "�V���Ȑ��𓾂邱�Ƃ��o���Ȃ��B";
			mes "�킵��������̂͂����܂ł��B";
			next;
			mes "[�h���@����]";
			mes "���Ƃ͂��O���l���邱�Ƃ��B";
			mes "���̌��Ƃ͈�̂Ȃɂ��c�c";
			mes "�n�n�n�b!!";
			set GOD_3QUE,43;
			close2;
			hideonnpc "�h���@����#1";
			end;
		}
	}
	else if(GOD_3QUE == 43) {
		mes "[�h���@����]";
		mes "�Ȃ��������x���Ăяo���񂾁H";
		mes "�킵�͂�����ڂ��ʂ������B";
		mes "���ɂ��O�ɂ͌��̌��Ђ�^�����B";
		mes "������g�����̂Ă�����O���悾�B";
		next;
		mes "[�h���@����]";
		mes "�x�[�����O���N�����������B";
		mes "�t�t�c�c�q�q�c�c";
		close2;
		hideonnpc "�h���@����#1";
		end;
	}
	end;
OnInit:
	hideonnpc "�h���@����#1";
	end;
}

mjolnir_09.gat,85,129,0	script	 #brisindwarf3	111,3,3,{
	if($GodMagingiorde < 50 || $GodBrysinggamen >= 100) {
		mes "- �Y��Ȑ����B-";
		mes "- ���߂Ă��邾���ŗ��ށB -";
		close;
	}
	if(GOD_3QUE > 42 && GOD_3QUE < 50) {
		misceffect 116;
		mes "[�����Ȑ�]";
		mes "�c�c�m�F�c�c�m�F�c�c";
		mes "�c�c�A���t���b�O�c�c�m�F";
		mes "�c�c�h���@�����c�c�m�F";
		mes "��߂�ꂵ�^���̎��Ԃ�";
		mes "�����o���܂����B";
		next;
		mes "[�����Ȑ�]";
		mes "�N�A�����Ă��������B";
		mes "�I�[�f�B���́A�������t���C����";
		mes "�����܂����B���̂��߃t���C����";
		mes "�l�Ԃɖ��@�������Ȃ����";
		mes "�����܂���ł����B";
		next;
		mes "[�����Ȑ�]";
		mes "���_�t���C���̖��@�ɂ����";
		mes "����ł��Ăѐ����Ԃ�A";
		mes "�i���ɑ������J��Ԃ����l�Ԃ�";
		mes "�ʂ����ĉ��l�ł��傤�H";
		next;
		if(select("20�l���I","�킩��Ȃ��c�c","40�l���I","42�l���I") != 4) {
			misceffect 116;
			mes "[�����Ȑ�]";
			mes "�c�c�c�c";
			mes "�G���[�B�G���[�B";
			close;
		}
		misceffect 116;
		mes "[�����Ȑ�]";
		mes "�c�c�c�c�F���B";
		mes "�����A�����B";
		next;
		hideoffnpc "�x�[�����O#1";
		mes "[�x�[�����O]";
		mes "�v�n�[�I�@�M�ꎀ�ʂ��Ǝv�����I";
		mes "�킵���N�������̂͒N���H";
		close;
	}
	mes "- �����񂾗₽�������B-";
	close;
OnTouch:
	if(GOD_3QUE > 42) {
		emotion 0;
	}
	end;
}

mjolnir_09.gat,87,129,3	script	�x�[�����O#1	826,{
	if(GOD_3QUE > 44) {
		mes "[�x�[�����O]";
		mes "�Ƃ��Ƃ��킵��Z�킪�ڊo�߂�̂��c�c";
		mes "�t�n�n�n�n�n�b!!";
		mes "�Ăуt���C���l���A���̔��������_��";
		mes "�����邱�Ƃ��ł���c�c";
		next;
		mes "[�x������]";
		mes "�N�̂��������B";
		mes "�n�n�n�c�c";
		mes "�N��l�Ԃ̊肢�������A";
		mes "�����͂���ɓ���邱�Ƃ�";
		mes "�ł���Ƃ����ȁB�撣���I";
		close2;
		hideonnpc "�x�[�����O#1";
		end;
	}
	else if(GOD_3QUE == 43) {
		mes "[�x�[�����O]";
		mes "�����c�c���킟������!!";
		mes "���́c�c���₟������!!";
		mes "������N�͉��҂��H";
		next;
		switch(select("�h���@�����ɂ��Ȃ����N�����ƌ���ꂽ","�����������Ȃ��͒N�H")) {
		case 1:
			mes "[�x�[�����O]";
			mes "�c�c�������āH";
			mes "�h���@����������?!";
			mes "�������N�������Ă��Ƃ́A";
			mes "�A���t���b�O���N�����̂��H";
			mes "�Ȃ�ŁH�@�ǂ�����??";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "���́A�J�N�J�N�V�J�W�J�c�c";
			mes "���̂悤�Ȃ��Ƃ�����܂��āA";
			mes "���Ȃ��B�Z�킪�S���ڊo�߂���";
			mes "�t���C���l�̗͂��h����";
			mes "�u���[�V���K�����������";
			mes "�������܂����B";
			next;
			mes "[�x�[�����O]";
			mes "�����A����!!";
			mes "�t���C���l�c�c�킵�̑̂������A";
			mes "�S�Ă��������������������_��I";
			mes "�킵�炪�ޏ��ɕ������A���̋P��";
			mes "�������Ăэ��Ƃ����̂��c�c�H";
			next;
			mes "[�x�[�����O]";
			mes "�t�n�n�n�n�n�b�I";
			mes "�S�_�X�̗͂𓾂��Ƃ��Ă��A";
			mes "�S���������̂���邱�Ƃ͂ł���B";
			next;
			menu "�����A��������Ȃ��āc�c",-;
			mes "[�x�[�����O]";
			mes "�����`!!�@���������B";
			mes "�����������Ƃ��B�t���C���l��";
			mes "�u���[�V���K������������ɍ��";
			mes "�l�ԗp�̃u���[�V���K�������B";
			mes "����ł����̈З͂�";
			mes "���܂������낤�c�c";
			next;
			mes "[�x�[�����O]";
			mes "�c�c�c�c�����A�t���C���l�B";
			mes "���̐�܂Ŕ����������t���C���l�c�c";
			mes "�ޏ����킸���ɂł������邱�Ƃ�";
			mes "�ł��̂ł���΁A�킵�͊���";
			mes "��`�����B";
			next;
			mes "[�x�[�����O]";
			mes "�ޏ�������������̂��������";
			mes "�����قǁA�킵�̐S�͖��B";
			mes "�킵�̎�́A�ޏ������邽�߂Ȃ�";
			mes "���ł����グ�邾�낤�B";
			next;
			mes "[�x�[�����O]";
			mes "�l�Ԃɂ��A�t���C���l�̂��̂܂Ԃ���";
			mes "�������������Ă�肽���킢�B";
			mes "���̂��߂Ȃ�A�킵�͂ǂ�ȘJ�͂�";
			mes "�ɂ��܂�B";
			next;
			mes "[�x�[�����O]";
			mes "�킵��́A�Ō�̌Z����N�����Ă���I";
			mes "���킢�����ȃO���[���c�c";
			mes "�܂����_�̂��߂ɍ̌@�𑱂���";
			mes "����̂��낤�c�c���ꂽ�B����";
			mes "�@�葱���Ă���̂��낤�c�c";
			next;
			mes "[�x�[�����O]";
			mes "�O���[���̖ڂ��o�܂��Ă���B";
			mes "�N�ɁA���_�������������̗܂�";
			mes "�����悤�B�O���[���Ȃ�A������";
			mes "�������Ă���邾�낤�c�c";
			next;
			mes "[�x�[�����O]";
			mes "�����A�ނ��N��M���Ȃ��悤�Ȃ�";
			mes "���̉̂��S���Ă���B";
			mes "�������H";
			next;
			mes "[�x�[�����O]";
			mes "^4d4dff���̗킵�����͂ǂ̋����ł��^������^000000";
			next;
			mes "[�x�[�����O]";
			mes "^4d4dff�S��łƂ͉��̐S�������@��^000000";
			next;
			mes "[�x�[�����O]";
			mes "^4d4dff���̎w��͊肤�A�P��������^000000";
			next;
			mes "[�x�[�����O]";
			mes "^4d4dff���͊肤�A���������̏��_��^000000";
			next;
			mes "[�x�[�����O]";
			mes "^4d4dff���͎l���l�ӁA�K���ł�����^000000";
			next;
			mes "[�x�[�����O]";
			mes "�o�������H";
			mes "�O���[���������Ă�܂Ȃ�";
			mes "���_�̗܂̉̂��B";
			mes "���ށA�O���[���̖ڂ��o�܂��Ă���I";
			misceffect 84,"";
			set GOD_3QUE,44;
			close2;
			hideonnpc "�x�[�����O#1";
			end;
		case 2:
			mes "[�x�[�����O]";
			mes "���₢�₢��A���̂��Ƃł����H";
			mes "�h���[�t�Ⴂ�ł���I";
			mes "�킵�H";
			mes "���܂񂪁A�m��Ȃ��z��";
			mes "�����閼�O�ȂǂȂ��I";
			next;
			mes "["+strcharinfo(0)+"]";
			mes "���́A�ł��c�c";
			next;
			mes "[�x�[�����O]";
			mes "��������!!";
			mes "�m���m���!!";
			close2;
			hideonnpc "�x�[�����O#1";
			end;
		}
	}
	else if(GOD_3QUE == 44) {
		mes "[�x�[�����O]";
		mes "�̂�Y�ꂽ�̂��H";
		mes "�܂������Ă�邩��A";
		mes "������Ɗo�����B";
		next;
		mes "[�x�[�����O]";
		mes "^4d4dff���̗킵�����͂ǂ̋����ł��^������^000000";
		next;
		mes "[�x�[�����O]";
		mes "^4d4dff�S��łƂ͉��̐S�������@��^000000";
		next;
		mes "[�x�[�����O]";
		mes "^4d4dff���̎w��͊肤�A�P��������^000000";
		next;
		mes "[�x�[�����O]";
		mes "^4d4dff���͊肤�A���������̏��_��^000000";
		next;
		mes "[�x�[�����O]";
		mes "^4d4dff���͎l���l�ӁA�K���ł�����^000000";
		close2;
		hideonnpc "�x�[�����O#1";
		end;
	}
	end;
OnInit:
	hideonnpc "�x�[�����O#1";
	end;
}

mjo_dun02.gat,126,36,0	script	 #brisindwarf4	111,3,3,{
	if($GodMagingiorde < 50 || $GodBrysinggamen >= 100) {
		mes "["+strcharinfo(0)+"]";
		mes "�����r�؂�Ă���c�c";
		close;
	}
	if(GOD_3QUE > 45 && GOD_3QUE < 50) {
		mes "[�O���[��]";
		mes "�킵���Ă񂾂��H";
		hideoffnpc "�O���[��#1";
		close;
	}
	else if(GOD_3QUE == 45) {
		mes "- �ؖ�����A�Ƃ������Ƌ���";
		mes "�����ȖؒY����~���Ă����B";
		mes "�����������Ƃ����̂��c�c�H -";
		next;
		mes "["+strcharinfo(0)+"]";
		mes "��H";
		mes "���������������Ƃ��낪����B";
		mes "������Ə����Ă݂悤�B";
		mes "�ł́A�܂��́c�c";
		next;
		input '@song1$;
		if('@song1$ == "���̗킵�����͂ǂ̋����ł��^������")
			set '@point,'@point + 1;
		mes "["+strcharinfo(0)+"]";
		mes " " + '@song1$;
		mes "�Łc�c";
		mes "���́c�c";
		next;
		input '@song2$;
		if('@song2$ == "�S��łƂ͉��̐S�������@��")
			set '@point,'@point + 1;
		mes "["+strcharinfo(0)+"]";
		mes " " + '@song2$;
		mes "�Łc�c";
		mes "�O�Ԗڂ́c�c";
		next;
		input '@song3$;
		if('@song3$ == "���̎w��͊肤�A�P��������")
			set '@point,'@point + 1;
		mes "["+strcharinfo(0)+"]";
		mes " " + '@song3$;
		mes "�Łc�c";
		mes "�l�Ԗڂ́c�c";
		next;
		input '@song4$;
		if('@song4$ == "���͊肤�A���������̏��_��")
			set '@point,'@point + 1;
		mes "["+strcharinfo(0)+"]";
		mes " " + '@song4$;
		mes "�Łc�c";
		mes "�ܔԖڂ́c�c";
		next;
		input '@song5$;
		if('@song5$ == "���͎l���l�ӁA�K���ł�����")
			set '@point,'@point + 1;
		mes "["+strcharinfo(0)+"]";
		mes " " + '@song5$;
		mes "���ȁB";
		mes "�悵�A������x�m�F���Ă݂悤�B";
		next;
		mes "["+strcharinfo(0)+"]";
		mes '@song1$;
		mes '@song2$;
		mes '@song3$;
		mes '@song4$;
		mes '@song5$;
		next;
		if('@point > 4) {
			hideoffnpc "�O���[��#1";
			mes "[�O���[��]";
			mes "�ق��`�A�m���ɁB";
			set GOD_3QUE,46;
			stopnpctimer;
			close;
		}
		mes "[�O���[��]";
		mes "�c�c�Ⴄ!!";
		mes "�M�p�ł���B";
		close2;
		warp "mjo_dun02.gat",118,56;
		end;
	}
	mes "- �ΒY�Ɠy�����ł܂��Ă���c�c -";
	close;
OnTouch:
	if($GodMagingiorde < 50 || $GodBrysinggamen >= 100) {
		mes "["+strcharinfo(0)+"]";
		mes "�����r�؂�Ă���c�c";
		close;
	}
	if(GOD_3QUE == 44) {
		emotion 0,"";
		mes "[�j�̐�]";
		mes "���A�߂Â���!!";
		mes "���́A���O����t���C���l��";
		mes "�ʂ����肪��������̂�!?";
		next;
		switch(select("�x�[�����O�����������܂���","����A�т����肵���c�c")) {
		case 1:
			mes "[�j�̐�]";
			mes "���c�c���A����́c�c";
			mes "�Z�x�[�����O�������ɂ�����";
			mes "�ޏ��̂ʂ�����c�c�H";
			mes "�ʁA�Ȃ�΁A������ؖ����Ă݂�I";
			set GOD_3QUE,45;
			initnpctimer;
			close;
		case 2:
			mes "[�j�̐�]";
			mes "��������!!";
			close;
		}
	}
	else if(GOD_3QUE == 45) {
		mes "[�j�̐�]";
		mes "�ؖ����Ă݂�ƌ��������낤�H";
		mes "����Ƃ��o���Ȃ��̂��H";
		mes "�c�c�킵�͋���@��Ȃ���΁c�c";
		mes "����c�c";
		initnpctimer;
		close;
	}
	warp "mjo_dun02.gat",118,56;
	end;

OnTimer1000:
	announce "�O���[��:�������Ɨ��Ȃ��ƁA�ǂ��o�����B��������̂���I",0x9,0x70dbdb;
	end;
OnTimer240000:
	announce "�O���[��:�҂������тꂽ�̂��B",0x9,0x70dbdb;
	end;
OnTimer298000:
	announce "����Ȃ炶��A�l�ԁB",0x9,0x70dbdb;
	end;
OnTimer300000:
	hideoffnpc "#�p�z���[�vbri";
	hideonnpc "�O���[��#1";
	hideonnpc "#�p�z���[�vbri";
	end;
OnTimer301000:
	stopnpctimer;
	end;
}

mjo_dun02.gat,124,36,0	script	 #�p�z���[�vbri	139,2,2,{
	warp "mjo_dun02.gat",118,56;
	end;
}

mjo_dun02.gat,126,34,1	script	�O���[��#1	826,{
	if(GOD_3QUE > 47) {
		mes "[�O���[��]";
		mes "�Z��̗\���ʂ�A";
		mes "�����u���[�V���K������";
		mes "�l�Ԃ�̑O�Ɍ�����B";
		mes "���āA���V�͋�׍H�ł����邩�̂��B";
		mes "�t�n�n�n�n�b�c�c";
		close2;
		hideonnpc "�O���[��#1";
		end;
	}
	else if(GOD_3QUE == 46) {
		mes "[�O���[��]";
		mes "�킵�̓O���[���B";
		mes "�t�n�n�n�n�b�c�c";
		mes "�킵�Ń��X�g�̂悤����ȁB";
		mes "����A�܂���������Ă��Ȃ��̂��B";
		next;
		mes "[�O���[��]";
		mes "�ق��`�A���_�ɂ͉�������������ƁH";
		mes "�ӂށA�m���ɂ��̌��͑f�G����B";
		mes "�ł��ȁA�ޏ���������������ɂ�";
		mes "��̂悤�Ȃ������Ȍ����悢�B";
		mes "���̕����ޏ��̋����͂��P���̂���B";
		next;
		mes "[�O���[��]";
		mes "�t�n�n�n�n�b�c�c�l��";
		mes "�ʔ����Ƃ����Ă�̂��B";
		mes "�����A�l�Ԃ̎d�Ƃł͂Ȃ����A";
		mes "�ޏ��̖ʉe����������̂�";
		mes "�悢���Ƃ���B";
		next;
		mes "[�O���[��]";
		mes "�Z�킪����ł��ׂďW�܂�̂��B";
		mes "���肪�Ƃ��A�l�Ԃ�B";
		mes "�����N����A�_�̌��Ђɒ��킷��";
		mes "�����ȗ͂Ƃ������̂����邾�낤�B";
		next;
		mes "[�O���[��]";
		mes "�ł́A��׍H�����邩�B";
		mes "�������P�ɋP�������Ȃ�";
		mes "����Ȃ��B����ґS�Ă��Ђ����A";
		mes "���ꎩ�̂�����������ɂ��ݏo��";
		mes "�f���炵����������B";
		next;
		mes "[�O���[��]";
		mes "�c�c�����p�͍ς񂾂����H";
		mes "�����ɗ������邪�悢�I";
		set GOD_3QUE,47;
		close2;
		hideonnpc "�O���[��#1";
		end;
	}
	else if(GOD_3QUE == 47) {
		mes "[�O���[��]";
		mes "�t�n�n�n�n�b�c�c";
		mes "�܂������̂��B";
		mes "�b�͂����ς񂾂���낤�H";
		mes "����ȏケ���ɂ��Ă����ʂ���B";
		mes "�����ɗ������邪�悢�I";
		close2;
		hideonnpc "�O���[��#1";
		end;
	}
	mes "[�O���[��]";
	mes "���҂���?!";
	close2;
	hideonnpc "�O���[��#1";
	end;
OnInit:
	hideonnpc "�O���[��#1";
	end;
}

//============================================================
// �_��4�� �~�����j�[���̕���N�G�X�g
//- Registry -------------------------------------------------
// GOD_4QUE -> 0�`11
// GOD_4QUE_SUB1 �` GOD_4QUE_SUB4 -> �e�h���[�t�i�s
//------------------------------------------------------------
prontera.gat,124,297,3	script	�V�A���r�B	706,{
	if(checkitemblank() == 0) {
		mes "- �����A�C�e���̎�ސ��� -";
		mes "- �������߁A�A�C�e�����󂯂Ƃ� -";
		mes "- ���Ƃ��ł��܂���B -";
		mes "- �����A�C�e�������炵�Ă��� -";
		mes "- �ēx�b�������Ă��������B -";
		close;
	}
	if(MaxWeight - Weight < 5000) {
		mes "- �����d�ʂ��������߁A�A�C�e���� -";
		mes "- �󂯂Ƃ邱�Ƃ��ł��܂���B -";
		mes "- �����A�C�e�������炵�Ă��� -";
		mes "- �ēx�b�������Ă��������B -";
		close;
	}
	if($GodBrysinggamen < 50) {
		cutin "god_tialpi01",2;
		mes "[�V�A���r�B]";
		mes "�������܂��c�c���̑嗤�̂ǂ�����";
		mes "�傫�ȗ͂�����悤�Ƃ��Ă��܂��c�c";
		mes "�M�����܂���I";
		mes "�Ȃɂ����N���낤�Ƃ��Ă��܂��I";
		next;
		mes "[�V�A���r�B]";
		mes "�ł��c�c�܂������������Ԃ͂����肻��";
		mes "�ł��B���������A�����N���낤�Ƃ���";
		mes "����̂ł��傤�c�c�B�ʂ����āA�����";
		mes "�ǂ����ƂȂ̂��c�c�������ƂȂ̂��c�c";
		close2;
		cutin "god_tialpi01",255;
		end;
	}
	if(GOD_4QUE == 11) {
		cutin "god_tialpi01",2;
		mes "[�V�A���r�B]";
		mes "�l�̖����A���łȂ��Ȃ�̂ł��ˁc�c";
		mes "�g�[���l�̗����~������y���݂�";
		mes "���Ă��܂��B";
	}
	else if(GOD_4QUE == 10) {
		if(countitem(756) < 50 || countitem(757) < 50) {
			cutin "god_tialpi01",2;
			mes "[�V�A���r�B]";
			mes "�I���f�I�R�����΂ƃG���j�E�����΂�";
			mes "50�����肢�ł��܂����B";
			mes "��낵�����肢���܂��B";
			close2;
			cutin "god_tialpi01",255;
			end;
		}
		set '@gift,0;
		if(getbaseclass(Class,2) == CLASS_KN) {
			set '@gift,1;
		}
		else if(getbaseclass(Class,2) == CLASS_PR) {
			set '@gift,2;
		}
		else if(getbaseclass(Class,2) == CLASS_WZ){
			set '@gift,3;
		}
		else if(getbaseclass(Class,2) == CLASS_BS){
			set '@gift,4;
		}
		else if(getbaseclass(Class,2) == CLASS_HT){
			set '@gift,5;
		}
		else if(getbaseclass(Class,2) == CLASS_AS){
			set '@gift,6;
		}
		else if(getbaseclass(Class,2) == CLASS_CR){
			set '@gift,7;
		}
		else if(getbaseclass(Class,2) == CLASS_MO){
			set '@gift,8;
		}
		else if(getbaseclass(Class,2) == CLASS_SA){
			set '@gift,9;
		}
		else if(getbaseclass(Class,2) == CLASS_AM){
			set '@gift,10;
		}
		else if(getbaseclass(Class,2) == CLASS_RG){
			set '@gift,11;
		}
		else if(getbaseclass(Class,2) == CLASS_BA){
			set '@gift,12;
		}
		else if(getbaseclass(Class,2) == CLASS_DC){
			set '@gift,13;
		}
		else {
			set '@gift,rand(1,13);
		}
		cutin "god_tialpi01",2;
		mes "[�V�A���r�B]";
		mes "����ɁA���Ƃɓ`���󕨂������グ";
		mes "�܂��B����c�l���A�����Ƌ�����";
		mes "�����Ǝv���܂����B";
		next;
		mes "[�V�A���r�B]";
		mes "�ł́A�I��ł��������B";
		mes "�����̂��߂ɖ𗧂��̂��ǂ��ł����H";
		mes "���̐l�̂��߂ɖ𗧂Ă����ł����H";
		next;
		switch(select("�����̂���","���̐l�̂���")) {
		case 1:
			mes "[�V�A���r�B]";
			mes "�킩��܂����B";
			mes "�`���җl�̖��ɗ����̂ł��ˁB";
			mes "���[��A�ǂꂪ�������ȁH";
			mes "����͂ǂ����낤�H";
			mes "����A�������̕����c�c";
			break;
		case 2:
			set '@gift,rand(1,13);
			mes "[�V�A���r�B]";
			mes "�킩��܂����B���̐l�̂��߂��Ȃ��";
			mes "�Ȃ�ėǂ��l�Ȃ�ł��傤�B";
			mes "���[��A�ǂꂪ�������ȁH";
			mes "����͂ǂ����낤�H";
			mes "����A�������̕����c�c";
			break;
		}
		next;
		mes "[�V�A���r�B]";
		mes "�c�c�c�c";
		mes "����A���ꂪ�����ł��傤�B";
		next;
		delitem 756,50;
		delitem 757,50;
		set GOD_4QUE,11;
		if('@gift == 1) {
			getitem 1471,1; // �w���t�@�C�A
		}
		else if('@gift == 2) {
			getitem 1526,1; // �X���b�V��
		}
		else if('@gift == 3) {
			getitem 1231,1; // �o�[�����h
		}
		else if('@gift == 4) {
			getitem 1367,1; // �X���[�^�[
		}
		else if('@gift == 5) {
			getitem 1722,1; // �o���X�^
		}
		else if('@gift == 6) {
			getitem 1230,1; // ��
		}
		else if('@gift == 7) {
			getitem 1141,1; // ���`��
		}
		else if('@gift == 8) {
			getitem 1813,1; // �J�C�U�[�i�b�N��
		}
		else if('@gift == 9) {
			getitem 1557,1; // �َ��^
		}
		else if('@gift == 10) {
			getitem 1235,1; // �A�]�[�g
		}
		else if('@gift == 11) {
			getitem 1227,1; // �E�B�[�_�[�i�C�t
		}
		else if('@gift == 12) {
			getitem 1913,1; // �G���L�M�^�[
		}
		else if('@gift == 13) {
			getitem 1963,1; // ���v�`���[���[�Y
		}
		cutin "god_tialpi01",2;
		mes "[�V�A���r�B]";
		mes "�����l�ł����B";
		mes "�ǂ����A��������𗧂Ă��������B";
		next;
		mes "[�V�A���r�B]";
		mes "����x�A���̐��Ńg�[���l�̗���";
		mes "������������܂��悤�Ɂc�c";
		mes "�l�̖����A�����̖��ŏI���܂���";
		mes "�悤�Ɂc�c";
	}
	else if(GOD_4QUE_SUB1 == 2 && GOD_4QUE_SUB2 == 2 && GOD_4QUE_SUB3 == 2 && GOD_4QUE_SUB4 == 2) {
		if(GodMjolnir >= 100) {
			cutin "god_tialpi01",2;
			mes "[�V�A���r�B]";
			mes "�������܂��c�c���̑嗤�̂ǂ�����";
			mes "�傫�ȗ͂������悤�Ƃ��Ă��܂��c�c";
			mes "�M�����܂���I";
			mes "�Ȃɂ����N���낤�Ƃ��Ă��܂��I";
			close2;
			cutin "god_tialpi01",255;
			end;
		}
		cutin "god_tialpi01",2;
		mes "[�V�A���r�B]";
		mes "�l�l�̒b�艮�ɉ�����̂ł��ˁB";
		mes "�C������B���ƕ����Ă���̂ł����c";
		mes "����ȕ��B�Ƃ��b�����Ă��ꂽ�Ȃ�āA";
		mes "����ς�`���җl�͐������ł��I";
		next;
		mes "[�V�A���r�B]";
		mes "�l�̖��͎�������̂ł��傤���H";
		mes "�g�[���l�̃~�����j�[�����A�{����";
		mes "�����悤�Ƃ��Ă���̂ł��傤���H";
		next;
		mes "[�V�A���r�B]";
		mes "���݂𕷂��Ă���āA�{���ɂ��肪�Ƃ�";
		mes "�������܂��B�債�����̂ł͂���܂���";
		mes "���A���Ƃɓ`���󕨂������グ�܂��B";
		mes "�������A����͓��Ɛ�c��X�̕i�Ȃ̂�";
		mes "�グ��ƂȂ�ƁA���̐e���ɂ����k";
		mes "���Ȃ��Ɓc�c�B";
		next;
		mes "[�V�A���r�B]";
		mes "�`���җl�A�l���e�ʂ݂̂�Ȃ�";
		mes "���k���Ă���ԁA";
		mes "�I���f�I�R�����΂�50�A";
		mes "�G���j�E�����΂�50��";
		mes "�������Ă��炦�܂��񂩁H";
		next;
		mes "[�V�A���r�B]";
		mes "���A�����B�������A�����ɂƂ�";
		mes "�����܂��񂪁B���̕����e�ʂ�����";
		mes "���₷���̂ŁA�ǂ������肢�ł���";
		mes "���񂩁H";
		if($GodMjolnir < 100) {		// ��t��
			set $GodMjolnir,$GodMjolnir+1;
			if($GodMjolnir == 50) {
				announce "�����嗤��[�~�����j�[��]�̕��󂪎p�������܂����B����",0;
			} else if($GodMjolnir == 100) {
				if($GodSleipnir == 100 && $GodMagingiorde == 100 && $GodBrysinggamen == 100 && $GodMjolnir == 100)
					announce "����[�~�����j�[��]�̕��󂪉��������Ƃɂ��S�Ă̕��󂪉����A�_��̍쐬���ł���悤�ɂȂ�܂����B����",0;
				else
					announce "����[�~�����j�[��]�̕��󂪉����܂����B����",0;
			}
		}
		set GOD_4QUE,10;
		set GOD_4QUE_SUB1,0;
		set GOD_4QUE_SUB2,0;
		set GOD_4QUE_SUB3,0;
		set GOD_4QUE_SUB4,0;
	}
	else if(GOD_4QUE_SUB1 == 3 || GOD_4QUE_SUB2 == 3 || GOD_4QUE_SUB3 == 3 || GOD_4QUE_SUB4 == 3) {
		cutin "god_tialpi01",2;
		mes "[�V�A���r�B]";
		mes "�h���[�t�̒b�艮�����{�点�Ă��܂�";
		mes "���̂ł����H�@����͗ǂ��Ȃ��ł��c�c";
		mes "���̏����𕷂��Ȃ������̂ł����H";
		mes "�h���[�t�͂ƂĂ���V�ɂ��邳���ł��B";
		mes "�ł�����A�����|���鎞�͍אS�̒��ӂ�";
		mes "�K�v�ł��B";
		next;
		mes "[�V�A���r�B]";
		mes "�ł��A���S���Ă��������B�l�B�l�Ԃ�";
		mes "�h���[�t�l�l�̋�ʂ�����悤��";
		mes "�h���[�t���l�Ԃ̋�ʂ������ł��B";
		mes "���΂炭���Ԃ������āA������x���";
		mes "�s���Α��v�ł��傤�B";
		next;
		mes "[�V�A���r�B]";
		mes "�ł��A���̑O�ɕK������K�ˁA������";
		mes "�h���[�t�̂��b�𕷂��Ă��������ˁB";
		set GOD_4QUE_SUB1,0;
		set GOD_4QUE_SUB2,0;
		set GOD_4QUE_SUB3,0;
		set GOD_4QUE_SUB4,0;
	}
	else if(GOD_4QUE == 1 || GOD_4QUE == 2) {
		cutin "god_tialpi01",2;
		mes "[�V�A���r�B]";
		mes "��낵�����肢���܂��B";
		mes "�撣���Ă��������Ƃ��������Ȃ��̂�";
		mes "�ƂĂ��������ł��c�c";
	}
	else if(GOD_4QUE == 0) {
		if($GodMjolnir >= 100) {
			cutin "god_tialpi01",2;
			mes "[�V�A���r�B]";
			mes "�������܂��c�c���̑嗤�̂ǂ�����";
			mes "�傫�ȗ͂������悤�Ƃ��Ă��܂��c�c";
			mes "�M�����܂���I";
			mes "�Ȃɂ����N���낤�Ƃ��Ă��܂��I";
			close2;
			cutin "god_tialpi01",255;
			end;
		}
		else if(BaseLevel < 70) {
			cutin "god_tialpi02",2;
			mes "[�V�A���r�B]";
			mes "�l�̂���c�ɁA�g�[���l�̗��̂�����";
			mes "�����������������ł��B����ς�A";
			mes "�M�����܂����ˁB�����āA�l�Ԃ�";
			mes "�_�l�ƈꏏ�ɗ������Ȃ�āB";
			close2;
			cutin "god_tialpi01",255;
			end;
		}
		cutin "god_tialpi01",2;
		mes "[�V�A���r�B]";
		mes "�`���җl�A�`���җl�A�l�̘b�𕷂���";
		mes "���������B���A�Ƃ��Ă��s�v�c�Ȗ���";
		mes "������ł��B";
		next;
		mes "[�V�A���r�B]";
		mes "���̒��ŁA�l�̓g�[���l�ƈꏏ�ł����B";
		mes "���̕��Ɏd���A�͂邩�����A���l��";
		mes "�嗤�֌������ė����Ă��܂����B";
		next;
		mes "[�V�A���r�B]";
		mes "�����āA�v���o�����̂ł��B";
		mes "�_�X�̘b�A�嗤�̓`�����c�c";
		mes "�ڂ����v���o���Ȃ��̂��c�O�ł��B";
		next;
		mes "[�V�A���r�B]";
		mes "����ȋL���̒��ɁA�g�[���l�̕���";
		mes "�~�����j�[��������܂����B";
		mes "���̋����ׂ��\�͂ƁA�~�����j�[����";
		mes "���ɂ����`���̋L���c�c";
		next;
		mes "[�V�A���r�B]";
		mes "�����ăh���[�t�ł��B";
		mes "�����m�ł����H�@�_�X�̕���͂قƂ��";
		mes "�h���[�t�����������ł��B";
		mes "�����ŁA�C�ɂȂ�b���c�c";
		next;
		mes "[�V�A���r�B]";
		mes "��ɍL����A�g�[���l�̕���Ɠ���";
		mes "���O�̎R���c�c�����֌W���Ȃ��̂�";
		mes "���傤���H�@���ƁA�~�����j�[���R��";
		mes "�ɁA�h���[�t�̒b�艮���Z��ł����";
		mes "�����܂����B";
		next;
		mes "[�V�A���r�B]";
		mes "���́A�����ȗ��݂Ƃ����̂͏[��";
		mes "���m�ł��B�ł��A�����ǂ�������";
		mes "�~�����j�[���R���֍s����";
		mes "����܂��񂩁B";
		next;
		mes "[�V�A���r�B]";
		mes "�킩���Ă��܂��A�����������Ă���";
		mes "�̂́B�ł��l�A���ꂪ�����̉ߋ���";
		mes "�L���Ȃ̂��A���Ȃ̂��m�肽����ł��B";
		mes "�ǂ����A�l�̗��݂𕷂��Ă��������B";
		next;
		switch(select("�f��","�����󂯂�")) {
		case 1:
			cutin "god_tialpi02",2;
			mes "[�V�A���r�B]";
			mes "�c�c�l�̂��b�𕷂��Ă��ꂽ�����ł�";
			mes "���肪�Ƃ��������܂��B�����ǂ�����";
			mes "�܂�����ł�����������ł��B";
			break;
		case 2:
			cutin "god_tialpi01",2;
			mes "[�V�A���r�B]";
			mes "���肪�Ƃ��������܂��I";
			mes "�{���ɂ��肪�Ƃ��������܂��I";
			mes "�����A�`���җl�ɉ�ėǂ������I";
			next;
			mes "[�V�A���r�B]";
			mes "���̊X�̖k�ɁA�l�̖����Z��ł��܂��B";
			mes "�h���[�t�ɂ��ẮA�l���ڂ����̂�";
			mes "�b�𕷂��ɍs���Ă���܂����H";
			next;
			mes "[�V�A���r�B]";
			mes "���ɕ����΁A�ǂ��Ńh���[�t�ɉ������";
			mes "�����Ă����Ǝv���܂��B�`���җl�A";
			mes "�ǂ�����낵�����肢�v���܂��B";
			set GOD_4QUE,rand(1,2);
			break;
		}
	}
	close2;
	cutin "god_tialpi02",255;
	end;
}

prt_fild01.gat,196,47,3	script	���X�N���@	703,{
	if(GOD_4QUE == 1) {
		mes "[���X�N���@]";
		mes "�h���[�t�̒b�艮�́A��V�ƋK����";
		mes "��D���ł��B������A���b���������Ȃ�";
		mes "�Ƃ��Ă��Ƃ��Ă��Ƃ��Ă����ӂ���";
		mes "����̂Ȃ��悤�ɁB�����ł����H";
		next;
		mes "[���X�N���@]";
		mes "�����͑��z�̕���������������c�c";
		mes "������n�߂āA�k�ɉ���Ă��������B";
		mes "���������ԈႦ�Ă��܂�����A�Z�����";
		mes "�K�˂�Ƃ����ł��傤�B";
		close;
	}
	else if(GOD_4QUE == 2) {
		mes "[���X�N���@]";
		mes "�h���[�t�̒b�艮�́A��V�ƋK����";
		mes "��D���ł��B������A���b���������Ȃ�";
		mes "�Ƃ��Ă��Ƃ��Ă��Ƃ��Ă����ӂ���";
		mes "����̂Ȃ��悤�ɁB�����ł����H";
		next;
		mes "[���X�N���@]";
		mes "�����͑��z�̕�����������������c�c";
		mes "�k����n�߂āA���ɉ���Ă��������B";
		mes "���������ԈႦ�Ă��܂�����A�Z�����";
		mes "�K�˂�Ƃ����ł��傤�B";
		close;
	}
	mes "[���X�N���@]";
	mes "�����́A���̗��e�Ƃ̎v���o�̏ꏊ�B";
	mes "�O�́A�����ɂ������ς��l�����܂����c";
	mes "�y�������ƁA�߂������Ɓc�c";
	mes "�����ς�����܂����B";
	next;
	mes "[���X�N���@]";
	mes "������ꂳ����A�ǂ������ŐF�X�Ȑl��";
	mes "�o������ƌ����Ă܂����B�ł��A����";
	mes "��������ꂳ����A�F�B���A�݂��";
	mes "�����āc�c���������֍s���Ă��܂�";
	mes "�܂����c�c�B";
	next;
	mes "[���X�N���@]";
	mes "������c�c�������₵��������̂���";
	mes "����܂���c�c";
	close;
}

mjolnir_11.gat,149,247,5	script	�h���[�t�̒b�艮#��	826,{
	if($GodBrysinggamen < 50) {
		mes "[�A�E�X�g��]";
		mes "�嗤�̂ǂ����ŁA�������N���낤��";
		mes "���Ă���c�c�₯�ɃI�I�J�~�ǂ���";
		mes "���������c�c";
		close;
	}
	if($GodMjolnir >= 100) {
		mes "[�A�E�X�g��]";
		mes "�嗤�̂ǂ����ŁA�������N���낤��";
		mes "���Ă���c�c�₯�ɃI�I�J�~�ǂ���";
		mes "���������c�c";
		close;
	}
	if(GOD_4QUE == 11) {
		mes "[�A�E�X�g��]";
		mes "���Ԃ��ߋ��̋L����T�����A�M�`����";
		mes "�l�Ԃɕ񂢂邱�Ƃ��o����͂��c�c";
		mes "���̎����͋߂��c�c�m���Ɂc�c";
		close;
	}
	else if(GOD_4QUE == 10) {
		mes "[�A�E�X�g��]";
		mes "�₟���m�B�����p���H";
		mes "���̎q���̐�c�̘b���낤�B";
		mes "�ǂ�ȓ���b�ł��t���������B";
		close;
	}
	else if(GOD_4QUE == 1) {
		if(GOD_4QUE_SUB1 == 3 || GOD_4QUE_SUB2 == 3 || GOD_4QUE_SUB3 == 3 || GOD_4QUE_SUB4 == 3) {
			mes "[�A�E�X�g��]";
			mes "���O�݂����ȗ�V�m�炸�Ƙb������";
			mes "�ȂǂȂ��I�@�Ƃ��ƂƋA��I";
			close;
		}
		else if(GOD_4QUE_SUB1 == 2) {
			mes "[�A�E�X�g��]";
			mes "�Ȃ񂶂�B";
			mes "����ȏ�A�b�����͂Ȃ����B";
			close;
		}
		else if(GOD_4QUE_SUB2 != 0 || GOD_4QUE_SUB3 != 0 || GOD_4QUE_SUB4 != 0) {
			mes "[�A�E�X�g��]";
			mes "�����p���H";
			next;
			switch(select("���ł��Ȃ��ł�","�h���[�t���c�c")) {
			case 1:
				mes "[�A�E�X�g��]";
				mes "�c�c�ςȓz����B";
				close;
			case 2:
				mes "[�A�E�X�g��]";
				mes "����ȁI";
				mes "�Ƃ��ƂƋA��I";
				set GOD_4QUE_SUB1,3;
				close;
			}
		}
		else if(GOD_4QUE_SUB1 == 1) {
			mes "[�A�E�X�g��]";
			mes "�����p���H";
			next;
			switch(select("���ł��Ȃ��ł�","���́A�ǂ���΂���c�c")) {
			case 1:
				mes "[�A�E�X�g��]";
				mes "�c�c�ςȓz����B";
				close;
			case 2:
				if(countitem(1005) == 0) {
					mes "[�A�E�X�g��]";
					mes "���������A�����Ƃ͂����蒝����";
					mes "�������񂼁B�b�艮�̐S���m�肽�����";
					mes "���ꑊ���̕i�������Ă���񂾂ȁB";
					close;
				}
				mes "[�A�E�X�g��]";
				mes "���������A�����Ƃ͂����蒝����";
				mes "�������񂼁B�܂������B";
				mes "�����͋C���������B";
				mes "�v���Ԃ�ɉ��������b�ł����悤���B";
				next;
				while(1) {
					if('@talk_to == 0) {
						mes "[�A�E�X�g��]";
						mes "���������������Ƃ͂��邩�H";
						next;
						switch(select("�c�c","�~�����j�[���ɂ���")) {
						case 1:
							set '@talk_not,1;
							break;
						case 2:
							break;
						}
					}
					else if('@talk_to == 1) {
						mes "[�A�E�X�g��]";
						mes "�~�����j�[�����B�`���̃~�����j�[����";
						mes "�g�[���l���g�������܂�������B��x";
						mes "�U��܂킷�����ŁA�������A��n��";
						mes "�ӂ�킹���B";
						next;
						mes "[�A�E�X�g��]";
						mes "���̃~�����j�[�������A���͎��̐�c��";
						mes "������B���āA�~�����j�[���̕���";
						mes "�ǂ����ĒZ�����c�c�b�𕷂��������H";
						next;
						switch(select("�c�c","�͂��I","�͂��H")) {
						default:
							set '@talk_not,1;
							break;
						case 2:
							break;
						}
					}
					else if('@talk_to == 2) {
						mes "[�A�E�X�g��]";
						mes "������A���L�l���K�˂Ă��āA�s�v�c��";
						mes "3�̕󕨂��A����c�Ɍ����Ă��ꂽ�B";
						mes "�����āA���̕󕨂��ǂ����̂�";
						mes "���Ȃ����낤�Ƃ�����������B";
						next;
						mes "[�A�E�X�g��]";
						mes "���́A���L�l�̕󕨂�����c�̈ꑰ��";
						mes "��������̂������񂾂��B����";
						mes "���荇���Ă��܂��ĂȁB����c�l��";
						mes "3�󕨂�����Ă��܂����B";
						mes "�����Ă��邩�H";
						next;
						switch(select("�c�c","�͂��H","�͂��I")) {
						default:
							set '@talk_not,1;
							break;
						case 3:
							break;
						}
					}
					else if('@talk_to == 3) {
						mes "[�A�E�X�g��]";
						mes "����3�̕󕨂����A�Ō�Ƀ~����";
						mes "�j�[��������Ă������B�����r���A�ς�";
						mes "�����ז��������ĂȁB�������Ŏ肪";
						mes "�����ĕ����Z���Ȃ��Ă��܂����c�c�B";
						mes "�c�O���Ǝv��Ȃ����H";
						next;
						switch(select("�c�c","�͂��H","�͂��I")) {
						default:
							set '@talk_not,1;
							break;
						case 3:
							break;
						}
					}
					else if('@talk_to == 4) {
						mes "[�A�E�X�g��]";
						mes "�������A����c��������~�����j�[����";
						mes "�g�[���l�̗��������͂ƂȂ����B����";
						mes "���܂����͋��l�̈ꑰ�ɂ��������ꂽ";
						mes "�قǂ��B";
						next;
						mes "[�A�E�X�g��]";
						mes "�v���΁A�����Z�������������ŁA";
						mes "�g�[���l�̓~�����j�[�������݂ɐU��";
						mes "�񂷂��Ƃ��o�����ƌ�����B";
						mes "�ǂ����A�b�艮�Ƃ��Ă��b��̂�����";
						mes "�d�����Ǝv��Ȃ����H";
						next;
						switch(select("�c�c","�͂��I","�͂��H")) {
						default:
							set '@talk_not,1;
							break;
						case 2:
							break;
						}
					}
					else if('@talk_to == 5) {
						mes "[�A�E�X�g��]";
						mes "�����āA���̎R�����~�����j�[����";
						mes "�Ăԗ��R�c�c�B��N�O�A�g�[���l��";
						mes "�����Ɛ�������A�~�����j�[����n�ʂ�";
						mes "�U�藎�Ƃ������Ƃ��������B���̎���";
						mes "�o�����̂��~�����j�[���R�����B";
						next;
						mes "[�A�E�X�g��]";
						mes "��x�U�肩�����������ŁA��n������A";
						mes "���n��k�킹�A�V�����R����������";
						mes "�قǂ̗́c�c�B�������A���S�����B";
						mes "����̓g�[���l�����炱���g������B";
						mes "�l�Ԃɂ͑傫������͂��Ǝv��Ȃ����H";
						next;
						switch(select("�c�c","�͂��H","�͂��I")) {
						default:
							set '@talk_not,1;
							break;
						case 3:
							break;
						}
					}
					else if('@talk_to == 6) {
						mes "[�A�E�X�g��]";
						mes "�h���[�t�����A�Ăт��̂悤�ȕ󕨂�";
						mes "���邩�����B������ꂽ�Ƃ��Ă�";
						mes "����̓g�[���l�̃~�����j�[���Ƃ͎���";
						mes "��Ȃ���́B�g�[���l�̃~�����j�[����";
						mes "�l�ԂɈ�����i�ł͂Ȃ��B";
						next;
						mes "[�A�E�X�g��]";
						mes "�������ȁc�c�����Č����΁A�l�Ԃ�";
						mes "���킹���~�����j�[���Ȃ�c�c";
						mes "�������A����ł������̂͗e�Ղ�";
						mes "�Ȃ��낤�B�킩�邩�H";
						next;
						switch(select("�c�c","�͂��I","�͂��H")) {
						default:
							set '@talk_not,1;
							break;
						case 2:
							break;
						}
					}
					else if('@talk_to == 7) {
						mes "[�A�E�X�g��]";
						mes "���������������A���̘b�������܂ł��B";
						mes "����ȏ�͂킵���h���[�t�ł��m���B";
						mes "�����ŋ߁A���E�ɑ傫�ȕω���";
						mes "�N���悤�Ƃ��Ă���B";
						next;
						mes "[�A�E�X�g��]";
						mes "���̕ω����A�嗤�ɂǂ̂悤�ȉe����";
						mes "�y�ڂ����c�c�_�X�Ȃ�m���Ă��邩��";
						mes "����񂪁B�킵�B�h���[�t���A���܂���";
						mes "�l�Ԃ��A�[���ɐS�\���Ƃ��Ƃ�����B";
						next;
						switch(select("�c�c","�͂��H","�͂��I")) {
						default:
							set '@talk_not,1;
							break;
						case 3:
							break;
						}
					}
					else if('@talk_to == 8) {
						mes "[�A�E�X�g��]";
						mes "����ł������H";
						mes "����A�킵�̌Z����K�˂Ă݂Ă���B";
						mes "�����C��t���ĂȁB";
						set GOD_4QUE_SUB1,2;
						close;
					}
					if('@talk_not == 1) {
						mes "[�A�E�X�g��]";
						mes "�c�c�l�̘b��S�R�����Ă����ȁB";
						mes "�ӂ�A�C����������B�Ƃ��Ԃ�A�l�Ԃ�";
						mes "�b���̂͂܂��҂炲�߂�!!";
						mes "�A�����A�����I";
						set GOD_4QUE_SUB1,3;
						close;
					} else {
						set '@talk_to,'@talk_to + 1;
					}
				}
			}
		}
		else if(GOD_4QUE_SUB1 == 0) {
			mes "[�A�E�X�g��]";
			mes "�����p���H";
			next;
			switch(select("���ł��Ȃ��ł�","���݂܂���A�������b���c�c")) {
			case 1:
				mes "[�A�E�X�g��]";
				mes "�c�c�ςȓz����B";
				close;
			case 2:
				mes "[�A�E�X�g��]";
				mes "�b�艮�Ƃ����̂́A�����̒ȂƋ��~��";
				mes "�厖�ɂ�����̂��B�킵�̘b�𕷂�����";
				mes "�Ȃ�A�b�艮�̐S�𗝉������B";
				next;
				mes "[�A�E�X�g��]";
				mes "�b�艮�̐S�𗝉��ł����ƁA�킵��";
				mes "�ؖ��ł�����A��b�����Ă�낤�B";
				set GOD_4QUE_SUB1,1;
				close;
			}
		}
	}
	else if(GOD_4QUE == 2) {
		if(GOD_4QUE_SUB1 == 3 || GOD_4QUE_SUB2 == 3 || GOD_4QUE_SUB3 == 3 || GOD_4QUE_SUB4 == 3) {
			mes "[�A�E�X�g��]";
			mes "���O�݂����ȗ�V�m�炸�Ƙb������";
			mes "�ȂǂȂ��I�@�Ƃ��ƂƋA��I";
			close;
		}
		else if(GOD_4QUE_SUB4 == 2) {
			mes "[�A�E�X�g��]";
			mes "�Ȃ񂶂�B";
			mes "����ȏ�A�b�����͂Ȃ����B";
			close;
		}
		else if(GOD_4QUE_SUB1 == 0 || GOD_4QUE_SUB1 == 1 || GOD_4QUE_SUB2 == 0 || GOD_4QUE_SUB2 == 1 || GOD_4QUE_SUB3 == 0 || GOD_4QUE_SUB3 == 1) {
			mes "[�A�E�X�g��]";
			mes "�����p���H";
			next;
			switch(select("���ł��Ȃ��ł�","�h���[�t���c�c")) {
			case 1:
				mes "[�A�E�X�g��]";
				mes "�c�c�ςȓz����B";
				close;
			case 2:
				mes "[�A�E�X�g��]";
				mes "����ȁI";
				mes "�Ƃ��ƂƋA��I";
				set GOD_4QUE_SUB4,3;
				close;
			}
		}
		else if(GOD_4QUE_SUB4 == 1) {
			mes "[�A�E�X�g��]";
			mes "�����p���H";
			next;
			switch(select("���ł��Ȃ��ł�","���́A�ǂ���΂���c�c")) {
			case 1:
				mes "[�A�E�X�g��]";
				mes "�c�c�ςȓz����B";
				close;
			case 2:
				if(countitem(1005) == 0) {
					mes "[�A�E�X�g��]";
					mes "���������A�����Ƃ͂����蒝����";
					mes "�������񂼁B�b�艮�̐S���m�肽�����";
					mes "���ꑊ���̕i�������Ă���񂾂ȁB";
					close;
				}
				mes "[�A�E�X�g��]";
				mes "���������A�����Ƃ͂����蒝����";
				mes "�������񂼁B�܂������B";
				mes "�����͋C���������B";
				mes "�v���Ԃ�ɉ��������b�ł����悤���B";
				next;
				while(1) {
					if('@talk_to == 0) {
						mes "[�A�E�X�g��]";
						mes "���������������Ƃ͂��邩�H";
						next;
						switch(select("�c�c","�~�����j�[���ɂ���")) {
						case 1:
							set '@talk_not,1;
							break;
						case 2:
							break;
						}
					}
					else if('@talk_to == 1) {
						mes "[�A�E�X�g��]";
						mes "�~�����j�[�����B�`���̃~�����j�[����";
						mes "�g�[���l���g�������܂�������B��x";
						mes "�U��܂킷�����ŁA�������A��n��";
						mes "�ӂ�킹���B";
						next;
						mes "[�A�E�X�g��]";
						mes "���̃~�����j�[�������A���͎��̐�c��";
						mes "������B���āA�~�����j�[���̕���";
						mes "�ǂ����ĒZ�����c�c�b�𕷂��������H";
						next;
						switch(select("�c�c","�͂��H","�͂��I")) {
						default:
							set '@talk_not,1;
							break;
						case 3:
							break;
						}
					}
					else if('@talk_to == 2) {
						mes "[�A�E�X�g��]";
						mes "������A���L�l���K�˂Ă��āA�s�v�c��";
						mes "3�̕󕨂��A����c�Ɍ����Ă��ꂽ�B";
						mes "�����āA���̕󕨂��ǂ����̂�";
						mes "���Ȃ����낤�Ƃ�����������B";
						next;
						mes "[�A�E�X�g��]";
						mes "���́A���L�l�̕󕨂�����c�̈ꑰ��";
						mes "��������̂������񂾂��B����";
						mes "���荇���Ă��܂��ĂȁB����c�l��";
						mes "3�󕨂�����Ă��܂����B";
						mes "�����Ă��邩�H";
						next;
						switch(select("�c�c","�͂��I","�͂��H")) {
						default:
							set '@talk_not,1;
							break;
						case 2:
							break;
						}
					}
					else if('@talk_to == 3) {
						mes "[�A�E�X�g��]";
						mes "����3�̕󕨂����A�Ō�Ƀ~����";
						mes "�j�[��������Ă������B�����r���A�ς�";
						mes "�����ז��������ĂȁB�������Ŏ肪";
						mes "�����ĕ����Z���Ȃ��Ă��܂����c�c�B";
						mes "�c�O���Ǝv��Ȃ����H";
						next;
						switch(select("�c�c","�͂��I","�͂��H")) {
						default:
							set '@talk_not,1;
							break;
						case 2:
							break;
						}
					}
					else if('@talk_to == 4) {
						mes "[�A�E�X�g��]";
						mes "�������A����c��������~�����j�[����";
						mes "�g�[���l�̗��������͂ƂȂ����B����";
						mes "���܂����͋��l�̈ꑰ�ɂ��������ꂽ";
						mes "�قǂ��B";
						next;
						mes "[�A�E�X�g��]";
						mes "�v���΁A�����Z�������������ŁA";
						mes "�g�[���l�̓~�����j�[�������݂ɐU��";
						mes "�񂷂��Ƃ��o�����ƌ�����B";
						mes "�ǂ����A�b�艮�Ƃ��Ă��b��̂�����";
						mes "�d�����Ǝv��Ȃ����H";
						next;
						switch(select("�c�c","�͂��H","�͂��I")) {
						default:
							set '@talk_not,1;
							break;
						case 3:
							break;
						}
					}
					else if('@talk_to == 5) {
						mes "[�A�E�X�g��]";
						mes "�����āA���̎R�����~�����j�[����";
						mes "�Ăԗ��R�c�c�B��N�O�A�g�[���l��";
						mes "�����Ɛ�������A�~�����j�[����n�ʂ�";
						mes "�U�藎�Ƃ������Ƃ��������B���̎���";
						mes "�o�����̂��~�����j�[���R�����B";
						next;
						mes "[�A�E�X�g��]";
						mes "��x�U�肩�����������ŁA��n������A";
						mes "���n��k�킹�A�V�����R����������";
						mes "�قǂ̗́c�c�B�������A���S�����B";
						mes "����̓g�[���l�����炱���g������B";
						mes "�l�Ԃɂ͑傫������͂��Ǝv��Ȃ����H";
						next;
						switch(select("�c�c","�͂��I","�͂��H")) {
						default:
							set '@talk_not,1;
							break;
						case 2:
							break;
						}
					}
					else if('@talk_to == 6) {
						mes "[�A�E�X�g��]";
						mes "�h���[�t�����A�Ăт��̂悤�ȕ󕨂�";
						mes "���邩�����B������ꂽ�Ƃ��Ă�";
						mes "����̓g�[���l�̃~�����j�[���Ƃ͎���";
						mes "��Ȃ���́B�g�[���l�̃~�����j�[����";
						mes "�l�ԂɈ�����i�ł͂Ȃ��B";
						next;
						mes "[�A�E�X�g��]";
						mes "�������ȁc�c�����Č����΁A�l�Ԃ�";
						mes "���킹���~�����j�[���Ȃ�c�c";
						mes "�������A����ł������̂͗e�Ղ�";
						mes "�Ȃ��낤�B�킩�邩�H";
						next;
						switch(select("�c�c","�͂��I","�͂��H")) {
						default:
							set '@talk_not,1;
							break;
						case 2:
							break;
						}
					}
					else if('@talk_to == 7) {
						mes "[�A�E�X�g��]";
						mes "���������������A���̘b�������܂ł��B";
						mes "����ȏ�͂킵���h���[�t�ł��m���B";
						mes "�����ŋ߁A���E�ɑ傫�ȕω���";
						mes "�N���悤�Ƃ��Ă���B";
						next;
						mes "[�A�E�X�g��]";
						mes "���̕ω����A�嗤�ɂǂ̂悤�ȉe����";
						mes "�y�ڂ����c�c�_�X�Ȃ�m���Ă��邩��";
						mes "����񂪁B�킵�B�h���[�t���A���܂���";
						mes "�l�Ԃ��A�[���ɐS�\���Ƃ��Ƃ�����B";
						next;
						switch(select("�c�c","�͂��I","�͂��H")) {
						default:
							set '@talk_not,1;
							break;
						case 2:
							break;
						}
					}
					else if('@talk_to == 8) {
						mes "[�A�E�X�g��]";
						mes "����ł������H";
						mes "����A�킵�̌Z����K�˂Ă݂Ă���B";
						mes "�����C��t���ĂȁB";
						set GOD_4QUE_SUB4,2;
						close;
					}
					if('@talk_not == 1) {
						mes "[�A�E�X�g��]";
						mes "�c�c�l�̘b��S�R�����Ă����ȁB";
						mes "�ӂ�A�C����������B�Ƃ��Ԃ�A�l�Ԃ�";
						mes "�b���̂͂܂��҂炲�߂�!!";
						mes "�A�����A�����I";
						set GOD_4QUE_SUB4,3;
						close;
					} else {
						set '@talk_to,'@talk_to + 1;
					}
				}
			}
		}
		else if(GOD_4QUE_SUB4 == 0) {
			mes "[�A�E�X�g��]";
			mes "�����p���H";
			next;
			switch(select("���ł��Ȃ��ł�","���݂܂���A�������b���c�c")) {
			case 1:
				mes "[�A�E�X�g��]";
				mes "�c�c�ςȓz����B";
				close;
			case 2:
				mes "[�A�E�X�g��]";
				mes "�b�艮�Ƃ����̂́A�����̒ȂƋ��~��";
				mes "�厖�ɂ�����̂��B�킵�̘b�𕷂�����";
				mes "�Ȃ�A�b�艮�̐S�𗝉������B";
				next;
				mes "[�A�E�X�g��]";
				mes "�b�艮�̐S�𗝉��ł����ƁA�킵��";
				mes "�ؖ��ł�����A��b�����Ă�낤�B";
				set GOD_4QUE_SUB4,1;
				close;
			}
		}
	}
	mes "[�A�E�X�g��]";
	mes "�����������Ȉ���ɂȂ肻������!!";
	mes "��C�͐���ł��邵�A����₩��";
	mes "���������A����͂��́B";
	mes "���āA���������~�ƈꏏ�ɕ����";
	mes "���B�ł����邩�I";
	close;
}

mjolnir_09.gat,209,341,3	script	�h���[�t�̒b�艮#��	826,{
	if($GodBrysinggamen < 50) {
		mes "[�X�h��]";
		mes "�E�I�I�I�I�I�I�I�I ";
		mes "�����Ƌ�������Ɛ���Ă݂�����!!";
		mes "�E�I�I�I�I�I�I�I�I�I�H!!!!";
		close;
	}
	if($GodMjolnir >= 100) {
		mes "[�X�h��]";
		mes "���͐���Ă�ꍇ����Ȃ��ȁB";
		mes "���������c�����������c�c�B";
		mes "�����ԁA�҂��Ă����c�c���Ɨ܂ɂ��";
		mes "���������܂�鎞���c�c�c�c";
		close;
	}
	if(GOD_4QUE == 11) {
		mes "[�X�h��]";
		mes "�E�I�I�I�I�I�I�I�I ";
		mes "�����Ƌ�������Ɛ���Ă݂�����!!";
		mes "�E�I�I�I�I�I�I�I�I�I�H!!!!";
		close;
	}
	else if(GOD_4QUE_SUB10 == 10) {
		mes "[�X�h��]";
		mes "�t�t�t�c�c�l�Ԃ��낤�ƁA�e�͂͂���I";
		mes "�c�c���A�e�͂���ł��A���O�ɂ�";
		mes "����������ȁB�킵���܂��܂����I";
		mes "�E�I�I�I�I�I�I�I�I�I�H!!!!";
		close;
	}
	else if(GOD_4QUE == 1) {
		if(GOD_4QUE_SUB1 == 3 || GOD_4QUE_SUB2 == 3 || GOD_4QUE_SUB3 == 3 || GOD_4QUE_SUB4 == 3) {
			mes "[�X�h��]";
			mes "�n�[�u�E�݂ɂł������̂��H";
			close;
		}
		else if(GOD_4QUE_SUB2 == 2) {
			mes "[�X�h��]";
			mes "�f�������킢�������I";
			mes "�E�I�I�I�I�I�I�I�I�I�H!!!!";
			close;
		}
		else if(GOD_4QUE_SUB1 == 0 || GOD_4QUE_SUB1 == 1 || GOD_4QUE_SUB3 != 0 || GOD_4QUE_SUB4 != 0) {
			mes "[�X�h��]";
			mes "�����p���H";
			next;
			switch(select("���ł��Ȃ��ł�","�h���[�t���c�c")) {
			case 1:
				mes "[�X�h��]";
				mes "����ȏ��Œׂ����Ԃ���������";
				mes "�F�B�Ƃł�����Ă��B";
				close;
			case 2:
				mes "[�X�h��]";
				mes "���A���Č������H";
				mes "�킵�̋M�d�Ȏ��Ԃ��ז�����Ƃ�";
				mes "�����x�����B�����A�A�����A�����I";
				set GOD_4QUE_SUB2,3;
				close;
			}
		}
		else if(GOD_4QUE_SUB2 == 1) {
			mes "[�X�h��]";
			mes "�悵�A�킢��!! ��邺!!";
			next;
			set '@n_vit,200;
			set '@p_vit,100;
			while(1) {
				mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
				mes "�X�h�� : �c��HP�@" +'@n_vit;
				mes strcharinfo(0)+ " : �c��HP�@" +'@p_vit;
				mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
				mes "";
				mes strcharinfo(0)+ "�̍U��!!";
				next;
				switch(select("�H�I","�����U��!!","�����U��!!","�����U��!!","1��x��!!")) {
				case 1:
					set '@p_atk,0;
					break;
				case 2:
					set '@p_atk,1;
					break;
				case 3:
					set '@p_atk,2;
					break;
				case 4:
					set '@p_atk,3;
					break;
				case 5:
					set '@p_atk,4;
					break;
				}
				set '@n_def,rand(1,3);
				set '@damage,rand(15,25);
				if('@p_atk == 1) {
					mes strcharinfo(0)+ "�͓��֍U��!!";
				}
				else if('@p_atk == 2) {
					mes strcharinfo(0)+ "�͓��ɍU��!!";
				}
				else if('@p_atk == 3) {
					mes strcharinfo(0)+ "�͑��ɍU��!!";
				}
				else if('@p_atk == 4) {
					mes strcharinfo(0)+ "�͋x�e����!!";
				}
				else {
					mes strcharinfo(0)+ "�͓]��ł��܂���!!";
				}
				if('@p_atk == '@n_def) {
					misceffect 336;
					if('@n_def == 1) {
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "�������A�X�h���͏������̂����܂�";
						mes "���p���čU�������킵���I";
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "";
						mes strcharinfo(0)+ "�̍U���͓�����Ȃ������I";
					}
					else if('@n_def == 2) {
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "�������A�X�h���͋��x�ȗ��r��";
						mes "�U�����󂯎~�߂��I";
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "";
						mes strcharinfo(0)+ "�̍U���͓�����Ȃ������I";
					}
					else if('@n_def == 3) {
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "�������A�X�h���͏�����ɑ��ւ�";
						mes "�U����������I";
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "";
						mes strcharinfo(0)+ "�̍U���͓�����Ȃ������I";
					}
				}
				else if('@p_atk == 4) {
					misceffect 312,"";
					set '@p_vit,'@p_vit + 10;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes strcharinfo(0)+ "�̗̑͂� 10 ��!!";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
				}
				else if('@p_atk == 1) {
					misceffect 4;
					set '@n_vit,'@n_vit - '@damage;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "�X�h���̓��ɍU���������I";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "";
					mes "�X�h���̗̑͂� " +'@damage+ " ������!!";
				}
				else if('@p_atk == 2) {
					misceffect 1;
					set '@n_vit,'@n_vit - '@damage;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "�X�h���̓��ɍU���������I";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "";
					mes "�X�h���̗̑͂� " +'@damage+ " ������!!";
				}
				else if('@p_atk == 3) {
					misceffect 3;
					set '@n_vit,'@n_vit - '@damage;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "�X�h���̑��ɍU���������I";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "";
					mes "�X�h���̗̑͂� " +'@damage+ " ������!!";
				}
				else if('@p_atk == 0) {
					misceffect 4,"";
					set '@p_vit,'@p_vit - 10;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "�X�L����I�X�h���̔���!!";
					mes "�������Ȃ�!!";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "";
					mes strcharinfo(0)+ "�̗̑͂� 10 ������!!";
					if('@p_vit < 1) {
						mes strcharinfo(0)+ "�̔s�k!!";
						next;
						break;
					}
				}
				if('@n_vit < 1) {
					mes "�X�h����|����!!";
					next;
					break;
				}
				next;
				mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
				mes "�X�h�� : �c��HP�@" +'@n_vit;
				mes strcharinfo(0)+ " : �c��HP�@" +'@p_vit;
				mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
				mes "";
				mes "�X�h���̍U��!!";
				next;
				switch(select("�H�I","������!!","�h��!!","����!!","����!!")) {
				case 1:
					set '@p_def,0;
					break;
				case 2:
					set '@p_def,1;
					break;
				case 3:
					set '@p_def,2;
					break;
				case 4:
					set '@p_def,3;
					break;
				case 5:
					set '@p_def,4;
					break;
				}
				set '@n_atk,rand(1,3);
				set '@damage,rand(20,25);
				if('@n_atk == 1) {
					mes "�X�h���͓��ɂނ����čU�����Ă���!!";
				}
				else if('@n_atk == 2) {
					mes "�X�h���͓��߂����čU�����Ă���!!";
				}
				else {
					mes "�X�h���͑���_���čU�����Ă���!!";
				}
				if('@n_atk == '@p_def) {
					misceffect 336,"";
					if('@p_def == 1) {
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes strcharinfo(0)+ "�͑f�����������I";
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "";
						mes "�X�h���̍U���͓�����Ȃ������I";
					}
					else if('@p_def == 2) {
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes strcharinfo(0)+ "�͖h�䂵���I";
						mes "�X�h���̍U�������낤���Ď󂯎~�߂��I";
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "";
						mes "�X�h���̍U���͓�����Ȃ������I";
					}
					else if('@p_def == 3) {
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes strcharinfo(0)+ "�̓W�����v�����I";
						mes "�X�h���̑����������킵���I";
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "";
						mes "�X�h���̍U���͓�����Ȃ������I";
					}
				}
				else if('@p_def == 4) {
					set '@count,rand(1,4);
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes strcharinfo(0)+ "�̔���!!";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					if('@count == 1) {
						misceffect 131,"";
						misceffect 17;
						set '@n_vit,'@n_vit - 20;
						mes "�N���X�J�E���^�[!!";
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						next;
						mes "�X�h���̗̑͂� 20 ������!!";
						if('@n_vit < 1) {
							mes "�X�h����|����!!";
							next;
							break;
						}
					}
					else {
						misceffect 102,"";
						set '@p_vit,'@p_vit - 30;
						mes "�X�L���o���āA��������Ă��܂����I";
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						next;
						mes strcharinfo(0)+ "�̗̑͂� 30 ������!!";
					}
				}
				else if('@n_atk == 1) {
					misceffect 4,"";
					set '@p_vit,'@p_vit - '@damage;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "�X�h���̍U���� " +strcharinfo(0)+ "��";
					mes "���ɓ˂���������!!";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "";
					mes strcharinfo(0)+ "��HP�� " +'@damage+ " ������!!";
				}
				else if('@n_atk == 2) {
					misceffect 1,"";
					set '@p_vit,'@p_vit - '@damage;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "����ȍU���� " +strcharinfo(0)+ "��";
					mes "���ɐH�����񂾁I";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "";
					mes strcharinfo(0)+ "��HP�� " +'@damage+ " ������!!";
				}
				else if('@n_atk == 3) {
					misceffect 3,"";
					set '@p_vit,'@p_vit - '@damage;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "�f������������" +strcharinfo(0)+ "��";
					mes "�̐��������!!";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "";
					mes strcharinfo(0)+ "��HP�� " +'@damage+ " ������!!";
				}
				else if('@n_atk == 0) {
					misceffect 1,"";
					set '@p_vit,'@p_vit - '@damage;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "����ȍU���� " +strcharinfo(0)+ "��";
					mes "���ɐH�����񂾁I";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "";
					mes strcharinfo(0)+ "��HP�� " +'@damage+ " ������!!";
				}
				if('@p_vit < 1) {
					mes strcharinfo(0)+ "�̔s�k!!";
					next;
					break;
				}
				next;
			}
			if('@p_vit < '@n_vit) {
				mes "[�X�h��]";
				mes "�n�b�n�b�n�b�A�܂��܂��͕s�����I";
				mes "�킵�̎ς������錌���܂���z��";
				mes "�����̂����I�����Ɨ͂����Ă����I";
				mes "����͂��͂��͂��́[�I";
				close;
			}
			else if('@n_vit < '@p_vit) {
				mes "[�X�h��]";
				mes "�v������肸���Ƌ����ȁc�c";
				mes "����ȋ����l�Ԃ�����Ƃ͂ȁc�c";
				mes "����͂��́[�I�@�����A�����I";
				mes "�悵�A�킵�̌Z��ɂ��A���܂��̎���";
				mes "�����Ă����Ă�낤�B";
				mes "�B�҂łȁA�����l�Ԃ�I";
				set GOD_4QUE_SUB2,2;
				close;
			}
		}
		else if(GOD_4QUE_SUB2 == 0) {
			mes "[�X�h��]";
			mes "�����p���H";
			next;
			switch(select("���ł��Ȃ��ł�","���݂܂���A�������b���c�c")) {
			case 1:
				mes "[�X�h��]";
				mes "����ȏ��Œׂ����Ԃ���������";
				mes "�F�B�Ƃł�����Ă��B";
				close;
			case 2:
				mes "[�X�h��]";
				mes "�ق��A�l�Ԃɂ��Ă̓C�C������ȁB";
				mes "����ȘV���ڂ�ɕ����������Ƃł�";
				mes "����̂��H�@�����A�킵�͌��t��";
				mes "�b����������͂Ȃ����B";
				next;
				mes "[�X�h��]";
				mes "�킵�ƌ�荇���Ȃ畐��͎̂Ă�I";
				mes "�����������I�@���ƌ��̂Ԃ��荇���A";
				mes "���̍s���ɂ����^��������I";
				mes "�ǂ����A�Ό����邩�H�@��H";
				next;
				switch(select("�c�c","���肢���܂�","�����A�|���ł�")) {
				case 1:
					mes "[�X�h��]";
					mes "�Ԏ������Ȃ��Ƃ͉������H";
					mes "�ӂ�A����ɂ����B����Ȗ𗧂����̂�";
					mes "���Ɠ�x�Ɖ�����Ȃ��킢�B";
					set GOD_4QUE_SUB2,3;
					close;
				case 2:
					mes "[�X�h��]";
					mes "�悵�A�ǂ����������I";
					mes "�������鎞�Ԃ����B";
					mes "�p�ӂ��o������A�������I";
					mes "�C�C���A�������菀�����ė�����B";
					set GOD_4QUE_SUB2,1;
					close;
				case 3:
					mes "[�X�h��]";
					mes "�E�C������Ȃ����A�Ⴂ�l�ԁB";
					mes "����ȔN��肪���낵�����H";
					mes "���[�b�n�b�n�b�n�b�n!!";
					mes "�Ȃ�A��ɂ��O����U�������Ă�낤�B";
					mes "�������o�������킾�I";
					set GOD_4QUE_SUB2,1;
					close;
				}
			}
		}
	}
	else if(GOD_4QUE == 2) {
		if(GOD_4QUE_SUB1 == 3 || GOD_4QUE_SUB2 == 3 || GOD_4QUE_SUB3 == 3 || GOD_4QUE_SUB4 == 3) {
			mes "[�X�h��]";
			mes "�n�[�u�E�݂ɂł������̂��H";
			close;
		}
		else if(GOD_4QUE_SUB3 == 2) {
			mes "[�X�h��]";
			mes "�f�������킢�������I";
			mes "�E�I�I�I�I�I�I�I�I�I�H!!!!";
			close;
		}
		else if(GOD_4QUE_SUB1 == 0 || GOD_4QUE_SUB1 == 1 || GOD_4QUE_SUB2 == 0 || GOD_4QUE_SUB2 == 1 || GOD_4QUE_SUB4 != 0) {
			mes "[�X�h��]";
			mes "�����p���H";
			next;
			switch(select("���ł��Ȃ��ł�","�h���[�t���c�c")) {
			case 1:
				mes "[�X�h��]";
				mes "����ȏ��Œׂ����Ԃ���������";
				mes "�F�B�Ƃł�����Ă��B";
				close;
			case 2:
				mes "[�X�h��]";
				mes "���A���Č������H";
				mes "�킵�̋M�d�Ȏ��Ԃ��ז�����Ƃ�";
				mes "�����x�����B�����A�A�����A�����I";
				set GOD_4QUE_SUB3,3;
				close;
			}
		}
		else if(GOD_4QUE_SUB3 == 1) {
			mes "[�X�h��]";
			mes "�悵�A�킢��!! ��邺!!";
			next;
			set '@n_vit,200;
			set '@p_vit,100;
			while(1) {
				mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
				mes "�X�h�� : �c��HP�@" +'@n_vit;
				mes strcharinfo(0)+ " : �c��HP�@" +'@p_vit;
				mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
				mes "";
				mes strcharinfo(0)+ "�̍U��!!";
				next;
				switch(select("�H�I","�����U��!!","�����U��!!","�����U��!!","1��x��!!")) {
				case 1:
					set '@p_atk,0;
					break;
				case 2:
					set '@p_atk,1;
					break;
				case 3:
					set '@p_atk,2;
					break;
				case 4:
					set '@p_atk,3;
					break;
				case 5:
					set '@p_atk,4;
					break;
				}
				set '@n_def,rand(1,3);
				set '@damage,rand(15,25);
				if('@p_atk == 1) {
					mes strcharinfo(0)+ "�͓��֍U��!!";
				}
				else if('@p_atk == 2) {
					mes strcharinfo(0)+ "�͓��ɍU��!!";
				}
				else if('@p_atk == 3) {
					mes strcharinfo(0)+ "�͑��ɍU��!!";
				}
				else if('@p_atk == 4) {
					mes strcharinfo(0)+ "�͋x�e����!!";
				}
				else {
					mes strcharinfo(0)+ "�͓]��ł��܂���!!";
				}
				if('@p_atk == '@n_def) {
					misceffect 336;
					if('@n_def == 1) {
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "�������A�X�h���͏������̂����܂�";
						mes "���p���čU�������킵���I";
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "";
						mes strcharinfo(0)+ "�̍U���͓�����Ȃ������I";
					}
					else if('@n_def == 2) {
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "�������A�X�h���͋��x�ȗ��r��";
						mes "�U�����󂯎~�߂��I";
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "";
						mes strcharinfo(0)+ "�̍U���͓�����Ȃ������I";
					}
					else if('@n_def == 3) {
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "�������A�X�h���͏�����ɑ��ւ�";
						mes "�U����������I";
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "";
						mes strcharinfo(0)+ "�̍U���͓�����Ȃ������I";
					}
				}
				else if('@p_atk == 4) {
					misceffect 312,"";
					set '@p_vit,'@p_vit + 10;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes strcharinfo(0)+ "�̗̑͂� 10 ��!!";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
				}
				else if('@p_atk == 1) {
					misceffect 4;
					set '@n_vit,'@n_vit - '@damage;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "�X�h���̓��ɍU���������I";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "";
					mes "�X�h���̗̑͂� " +'@damage+ " ������!!";
				}
				else if('@p_atk == 2) {
					misceffect 1;
					set '@n_vit,'@n_vit - '@damage;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "�X�h���̓��ɍU���������I";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "";
					mes "�X�h���̗̑͂� " +'@damage+ " ������!!";
				}
				else if('@p_atk == 3) {
					misceffect 3;
					set '@n_vit,'@n_vit - '@damage;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "�X�h���̑��ɍU���������I";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "";
					mes "�X�h���̗̑͂� " +'@damage+ " ������!!";
				}
				else if('@p_atk == 0) {
					misceffect 4,"";
					set '@p_vit,'@p_vit - 10;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "�X�L����I�X�h���̔���!!";
					mes "�������Ȃ�!!";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "";
					mes strcharinfo(0)+ "�̗̑͂� 10 ������!!";
					if('@p_vit < 1) {
						mes strcharinfo(0)+ "�̔s�k!!";
						next;
						break;
					}
				}
				if('@n_vit < 1) {
					mes "�X�h����|����!!";
					next;
					break;
				}
				next;
				mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
				mes "�X�h�� : �c��HP�@" +'@n_vit;
				mes strcharinfo(0)+ " : �c��HP�@" +'@p_vit;
				mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
				mes "";
				mes "�X�h���̍U��!!";
				next;
				switch(select("�H�I","������!!","�h��!!","����!!","����!!")) {
				case 1:
					set '@p_def,0;
					break;
				case 2:
					set '@p_def,1;
					break;
				case 3:
					set '@p_def,2;
					break;
				case 4:
					set '@p_def,3;
					break;
				case 5:
					set '@p_def,4;
					break;
				}
				set '@n_atk,rand(1,3);
				set '@damage,rand(20,25);
				if('@n_atk == 1) {
					mes "�X�h���͓��ɂނ����čU�����Ă���!!";
				}
				else if('@n_atk == 2) {
					mes "�X�h���͓��߂����čU�����Ă���!!";
				}
				else {
					mes "�X�h���͑���_���čU�����Ă���!!";
				}
				if('@n_atk == '@p_def) {
					misceffect 336,"";
					if('@p_def == 1) {
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes strcharinfo(0)+ "�͑f�����������I";
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "";
						mes "�X�h���̍U���͓�����Ȃ������I";
					}
					else if('@p_def == 2) {
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes strcharinfo(0)+ "�͖h�䂵���I";
						mes "�X�h���̍U�������낤���Ď󂯎~�߂��I";
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "";
						mes "�X�h���̍U���͓�����Ȃ������I";
					}
					else if('@p_def == 3) {
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes strcharinfo(0)+ "�̓W�����v�����I";
						mes "�X�h���̑����������킵���I";
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						mes "";
						mes "�X�h���̍U���͓�����Ȃ������I";
					}
				}
				else if('@p_def == 4) {
					set '@count,rand(1,4);
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes strcharinfo(0)+ "�̔���!!";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					if('@count == 1) {
						misceffect 131,"";
						misceffect 17;
						set '@n_vit,'@n_vit - 20;
						mes "�N���X�J�E���^�[!!";
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						next;
						mes "�X�h���̗̑͂� 20 ������!!";
						if('@n_vit < 1) {
							mes "�X�h����|����!!";
							next;
							break;
						}
					}
					else {
						misceffect 102,"";
						set '@p_vit,'@p_vit - 30;
						mes "�X�L���o���āA��������Ă��܂����I";
						mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
						next;
						mes strcharinfo(0)+ "�̗̑͂� 30 ������!!";
					}
				}
				else if('@n_atk == 1) {
					misceffect 4,"";
					set '@p_vit,'@p_vit - '@damage;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "�X�h���̍U���� " +strcharinfo(0)+ "��";
					mes "���ɓ˂���������!!";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "";
					mes strcharinfo(0)+ "��HP�� " +'@damage+ " ������!!";
				}
				else if('@n_atk == 2) {
					misceffect 1,"";
					set '@p_vit,'@p_vit - '@damage;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "����ȍU���� " +strcharinfo(0)+ "��";
					mes "���ɐH�����񂾁I";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "";
					mes strcharinfo(0)+ "��HP�� " +'@damage+ " ������!!";
				}
				else if('@n_atk == 3) {
					misceffect 3,"";
					set '@p_vit,'@p_vit - '@damage;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "�f������������" +strcharinfo(0)+ "��";
					mes "�̐��������!!";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "";
					mes strcharinfo(0)+ "��HP�� " +'@damage+ " ������!!";
				}
				else if('@n_atk == 0) {
					misceffect 1,"";
					set '@p_vit,'@p_vit - '@damage;
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "����ȍU���� " +strcharinfo(0)+ "��";
					mes "���ɐH�����񂾁I";
					mes "�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|�|";
					mes "";
					mes strcharinfo(0)+ "��HP�� " +'@damage+ " ������!!";
				}
				if('@p_vit < 1) {
					mes strcharinfo(0)+ "�̔s�k!!";
					next;
					break;
				}
				next;
			}
			if('@p_vit < '@n_vit) {
				mes "[�X�h��]";
				mes "�n�b�n�b�n�b�A�܂��܂��͕s�����I";
				mes "�킵�̎ς������錌���܂���z��";
				mes "�����̂����I�����Ɨ͂����Ă����I";
				mes "����͂��͂��͂��́[�I";
				close;
			}
			else if('@n_vit < '@p_vit) {
				mes "[�X�h��]";
				mes "�v������肸���Ƌ����ȁc�c";
				mes "����ȋ����l�Ԃ�����Ƃ͂ȁc�c";
				mes "����͂��́[�I�@�����A�����I";
				mes "�悵�A�킵�̌Z��ɂ��A���܂��̎���";
				mes "�����Ă����Ă�낤�B";
				mes "�B�҂łȁA�����l�Ԃ�I";
				set GOD_4QUE_SUB3,2;
				close;
			}
		}
		else if(GOD_4QUE_SUB3 == 0) {
			mes "[�X�h��]";
			mes "�����p���H";
			next;
			switch(select("���ł��Ȃ��ł�","���݂܂���A�������b���c�c")) {
			case 1:
				mes "[�X�h��]";
				mes "����ȏ��Œׂ����Ԃ���������";
				mes "�F�B�Ƃł�����Ă��B";
				close;
			case 2:
				mes "[�X�h��]";
				mes "�ق��A�l�Ԃɂ��Ă̓C�C������ȁB";
				mes "����ȘV���ڂ�ɕ����������Ƃł�";
				mes "����̂��H�@�����A�킵�͌��t��";
				mes "�b����������͂Ȃ����B";
				next;
				mes "[�X�h��]";
				mes "�킵�ƌ�荇���Ȃ畐��͎̂Ă�I";
				mes "�����������I�@���ƌ��̂Ԃ��荇���A";
				mes "���̍s���ɂ����^��������I";
				mes "�ǂ����A�Ό����邩�H�@��H";
				next;
				switch(select("�c�c","���肢���܂�","�����A�|���ł�")) {
				case 1:
					mes "[�X�h��]";
					mes "�Ԏ������Ȃ��Ƃ͉������H";
					mes "�ӂ�A����ɂ����B����Ȗ𗧂����̂�";
					mes "���Ɠ�x�Ɖ�����Ȃ��킢�B";
					set GOD_4QUE_SUB3,3;
					close;
				case 2:
					mes "[�X�h��]";
					mes "�悵�A�ǂ����������I";
					mes "�������鎞�Ԃ����B";
					mes "�p�ӂ��o������A�������I";
					mes "�C�C���A�������菀�����ė�����B";
					set GOD_4QUE_SUB3,1;
					close;
				case 3:
					mes "[�X�h��]";
					mes "�E�C������Ȃ����A�Ⴂ�l�ԁB";
					mes "����ȔN��肪���낵�����H";
					mes "���[�b�n�b�n�b�n�b�n!!";
					mes "�Ȃ�A��ɂ��O����U�������Ă�낤�B";
					mes "�������o�������킾�I";
					set GOD_4QUE_SUB3,1;
					close;
				}
			}
		}
	}
	mes "[�X�h��]";
	mes "�킢�Ƃ́A�Ȃ̑S�Ă�q���A�����";
	mes "�����̑��݂��ؖ����鐒���ȍs�ׁB";
	mes "���O�͂���ȐS�������Ă��邩�A�l�ԁH";
	close;
}

mjolnir_01.gat,35,136,7	script	�h���[�t�̒b�艮#��	826,{
	if($GodBrysinggamen < 50) {
		mes "[�x�X�g��]";
		mes "�����̖��͎����̂��́c�c�~����Ȃ�";
		mes "���̎�ł��܂˂΂Ȃ�Ȃ��c�c�B";
		mes "���̒N�����ƌ������Ƃ��A���ꂪ������";
		mes "�ӎv�Ȃ�΁A���ʂ��Ȃ���΁B";
		mes "�����v��Ȃ��H";
		close;
	}
	if($GodMjolnir >= 100) {
		mes "[�x�X�g��]";
		mes "�����͐��B�ǂ��낶��Ȃ��������c�c";
		mes "���ꂩ���A�Ƃ�ł��Ȃ����Ƃ����悤��";
		mes "���Ă����c�c";
		close;
	}
	if(GOD_4QUE == 11) {
		mes "[�x�X�g��]";
		mes "�ꐶ������������̊����čō��[!!";
		mes "���ꂱ�������b��!!";
		mes "�����v��Ȃ��H";
		close;
	}
	else if(GOD_4QUE == 10) {
		mes "[�x�X�g��]";
		mes "�����̖��͎����̂��́c�c�~����Ȃ�";
		mes "���̎�ł��܂˂΂Ȃ�Ȃ��c�c�B";
		mes "���̒N�����ƌ������Ƃ��A���ꂪ������";
		mes "�ӎv�Ȃ�΁A���ʂ��Ȃ���΁B";
		mes "�����v��Ȃ��H";
		close;
	}
	else if(GOD_4QUE == 1) {
		if(GOD_4QUE_SUB1 == 3 || GOD_4QUE_SUB2 == 3 || GOD_4QUE_SUB3 == 3 || GOD_4QUE_SUB4 == 3) {
			mes "[�x�X�g��]";
			mes "���ɗ���l�Ԃ́A������Ƃ̓}�V����";
			mes "�ǂ��ȁ`�B�ǂ����������A��G�c��";
			mes "�Ă������A�������������Č������`�B";
			close;
		}
		else if(GOD_4QUE_SUB3 == 2) {
			mes "[�x�X�g��]";
			mes "���ׂĂ������ɏ����ł����Ƃ��Ă��A";
			mes "�^���̏��_�������ۂ������΁A�S��";
			mes "�䖳���B�ł��ˁA��邱�Ƃ𐸈�t";
			mes "���Ȃ��ƁA�^���̏��_�͎����̂ق���";
			mes "���邱�Ƃ��������Ⴍ��Ȃ��񂾂�B";
			close;
		}
		else if(GOD_4QUE_SUB1 == 0 || GOD_4QUE_SUB1 == 1 || GOD_4QUE_SUB2 == 0 || GOD_4QUE_SUB2 == 1 || GOD_4QUE_SUB4 != 0) {
			mes "[�x�X�g��]";
			mes "�����p�H";
			next;
			switch(select("���ł��Ȃ��ł�","�h���[�t���c�c")) {
			case 1:
				mes "[�x�X�g��]";
				mes "�~�������͎����ŒT���I";
				mes "�����āA�����Ŏ�ɓ����I";
				close;
			case 2:
				mes "[�x�X�g��]";
				mes "���̑ԓx�͉��l�̂���?!";
				mes "���񂽂Ȃ񂩂́A�z���O�������x��";
				mes "�����������I";
				set GOD_4QUE_SUB3,3;
				close;
			}
		}
		else if(GOD_4QUE_SUB3 == 1) {
			mes "[�x�X�g��]";
			mes "�悵!!�@���𐸘B����H";
			mes "���̃h�L�h�L�c�c�}���邱�ƂȂ��";
			mes "�o���₵�Ȃ��I";
			next;
			set '@part,select(getequipname(1),getequipname(2),getequipname(3),getequipname(4),getequipname(5),
						getequipname(6),getequipname(7),getequipname(8),getequipname(9),getequipname(10));
			if(getequipisequiped('@part) == 0)
				close;
			if(getequipisenableref('@part) == 0) {
				mes "[�x�X�g��]";
				mes "����A���B�ł��Ȃ�����Ȃ����B";
				mes "��������������ǂ�����ƁH";
				close;
			}
			if(getequiprefinerycnt('@part) >= 10) {
				mes "[�x�X�g��]";
				mes "����ȏ�̐��B�͖�������B";
				close;
			}
			if(getequippercentrefinery('@part) == 100) {
				mes "[�x�X�g��]";
				mes "�I�C�I�C�I ����͐��B����ɂ�";
				mes "�ȒP������I�@��������A���킾��";
				mes "���E��E���E���E��!!";
				mes "�������͒�������߂Ă�񂾁I";
				close;
			}
			if((getequipweaponlv('@part) <= 1) && (getequipweaponlv('@part) >= 3 )){
				mes "[�x�X�g��]";
				mes "����͂����������B���������x����";
				mes "���킶��Ȃ��ˁB���x��4�̕����";
				mes "�����Ă��ȁI";
				close;
			}
			if(getequipweaponlv('@part) == 0){
				mes "[�x�X�g��]";
				mes "����́A�h���Ȃ����I";
				mes "���������A������Č��������낤�B";
				mes "���x��4�̕���������Ă��ȁI";
				close;
			}
			mes "[�x�X�g��]";
			mes "�悵�A�Ō�Ɋm�F���B";
			mes "���B���ĉ��Ă��܂��ƁA���̕����";
			mes "��x�Ɩ߂��Ă��Ȃ����Ĕ����Ă�ȁH";
			mes "����ɕt�������J�[�h�⑮���Ȃ񂩂�";
			mes "^ff0000�S���������Ⴄ^000000�B���̊o�傪����Ȃ�A";
			mes "�����̓r�V���ƒ��킵�悤����Ȃ����I";
			next;
			if(select("���킵�܂�!!","�c�c��߂܂��B") == 2) {
				mes "[�x�X�g��]";
				mes "����ȈӋC�n�Ȃ��ŁA�悭���̌�����";
				mes "���̒���n���Ă����ˁB";
				mes "���������A��߂��߂��܂��B";
				close;
			}
			if(countitem(984) > 0) {
				delitem 984,1;
			}
			else {
				mes "[�x�X�g��]";
				mes "���A��{�I�Ȃ��Ƃ��h�Y�ꂵ�Ă��B";
				mes "���x��4����̐��B�ɂ̓I���f�I";
				mes "�R�����K�v���B";
				mes "�����Ǝ����Ă���悤�ɁB";
				close;
			}
			if(getequippercentrefinery('@part) > rand(100)) {
				mes "[�x�X�g��]";
				mes "�n�b�I�n�b!!�n�b�I�n�b!!�n�b�I";
				successrefitem '@part;
				next;
				emotion 18;
				mes "[�x�X�g��]";
				mes "���b�n�b�n�b�n�b�A���������Ă΍ō��I";
				mes "���O������������A�ȁA�ȁH";
			}
			else {
				mes "[�x�X�g��]";
				mes "�n�b�I�n�b!!�n�b�I�n�b!!�n�b�I";
				failedrefitem '@part;
				next;
				emotion 23;
				mes "[�x�X�g��]";
				mes "�E�A�A�A�A�A�A�A�A�A�[�b!!";
				next;
				mes "[�x�X�g��]";
				mes "���A����A���v�B";
				mes "�����͉^�������݂����B";
				mes "�ӁA�ł������Ȃ��I���ꂱ�����B��!!";
			}
			next;
			mes "[�x�X�g��]";
			mes "���������o����̂͂����܂ł��B";
			mes "�������̌Z��ɂ�������A���C��";
			mes "����Ă���ē`���Ă���Ă�B";
			mes "���܂����A����܂薳������Ȃ�B";
			mes "���Ⴀ�ȁB";
			set GOD_4QUE_SUB3,2;
			close;
		}
		else if(GOD_4QUE_SUB3 == 0) {
			mes "[�x�X�g��]";
			mes "�����p�H";
			next;
			switch(select("���ł��Ȃ��ł�","���݂܂���A�������b���c�c")) {
			case 1:
				mes "[�x�X�g��]";
				mes "�~�������͎����ŒT���I";
				mes "�����āA�����Ŏ�ɓ����I";
				close;
			case 2:
				mes "[�x�X�g��]";
				mes "�c�c�c�c��H";
				mes "���A�ǂ��������Ȃ������񂾂��ǁB";
				mes "�����ƒ����͂�H�ׂĂ�H";
				mes "�������́A���Ă̒ʂ�b�艮���B";
				mes "�ł��ˁA�b��������ƍD���Ȃ��Ƃ�";
				mes "���������̂��B";
				next;
				mes "[�x�X�g��]";
				mes "����́c�c���킷�邱�ƁI";
				mes "�Ⴆ�΁A���ɐ��B���ꂽ�����";
				mes "�����Ƃ����Ɛ��B����Ƃ��A�{���{����";
				mes "�h��𐸘B����Ƃ��A���E�܂Ŏg��ꂽ";
				mes "�����c�c";
				next;
				mes "[�x�X�g��]";
				mes "���[�A���ق�B�Ƃɂ����I";
				mes "�������͐��E�Ő��B����ԍD���I";
				mes "���E�ɒ��ނ��̃h�L�h�L���I";
				mes "���ꂪ���B�I";
				next;
				mes "[�x�X�g��]";
				mes "�悵�A���܂��ɉ�����̂������̉��B";
				mes "�����������ʂɂ��O�̕���𐸘B����";
				mes "�����悤�I�@�����������ŁI";
				mes "����Ɛ��B�ޗ�������������΂�����B";
				mes "�����b����H";
				next;
				mes "[�x�X�g��]";
				mes "�������I�h�L�h�L�̂Ȃ����B�͂��Ȃ��B";
				mes "�������͋��ɂ̃��N���N���~����!!";
				mes "����𖞂����̂̓��x��4����̂݁I";
				mes "���̕���́A�ǂ��̒N�ł����B�ł���";
				mes "����ˁB";
				set GOD_4QUE_SUB3,1;
				close;
			}
		}
	}
	else if(GOD_4QUE == 2) {
		if(GOD_4QUE_SUB1 == 3 || GOD_4QUE_SUB2 == 3 || GOD_4QUE_SUB3 == 3 || GOD_4QUE_SUB4 == 3) {
			mes "[�x�X�g��]";
			mes "���ɗ���l�Ԃ́A������Ƃ̓}�V����";
			mes "�ǂ��ȁ`�B�ǂ����������A��G�c��";
			mes "�Ă������A�������������Č������`�B";
			close;
		}
		else if(GOD_4QUE_SUB2 == 2) {
			mes "[�x�X�g��]";
			mes "���ׂĂ������ɏ����ł����Ƃ��Ă��A";
			mes "�^���̏��_�������ۂ������΁A�S��";
			mes "�䖳���B�ł��ˁA��邱�Ƃ𐸈�t";
			mes "���Ȃ��ƁA�^���̏��_�͎����̂ق���";
			mes "���邱�Ƃ��������Ⴍ��Ȃ��񂾂�B";
			close;
		}
		else if(GOD_4QUE_SUB1 == 0 || GOD_4QUE_SUB1 == 1 || GOD_4QUE_SUB3 != 0 || GOD_4QUE_SUB4 != 0) {
			mes "[�x�X�g��]";
			mes "�����p�H";
			next;
			switch(select("���ł��Ȃ��ł�","�h���[�t���c�c")) {
			case 1:
				mes "[�x�X�g��]";
				mes "�~�������͎����ŒT���I";
				mes "�����āA�����Ŏ�ɓ����I";
				close;
			case 2:
				mes "[�x�X�g��]";
				mes "���̑ԓx�͉��l�̂���?!";
				mes "���񂽂Ȃ񂩂́A�z���O�������x��";
				mes "�����������I";
				set GOD_4QUE_SUB2,3;
				close;
			}
		}
		else if(GOD_4QUE_SUB2 == 1) {
			mes "[�x�X�g��]";
			mes "�悵!!�@���𐸘B����H";
			mes "���̃h�L�h�L�c�c�}���邱�ƂȂ��";
			mes "�o���₵�Ȃ��I";
			next;
			set '@part,select(getequipname(1),getequipname(2),getequipname(3),getequipname(4),getequipname(5),
						getequipname(6),getequipname(7),getequipname(8),getequipname(9),getequipname(10));
			if(getequipisequiped('@part) == 0)
				close;
			if(getequipisenableref('@part) == 0) {
				mes "[�x�X�g��]";
				mes "����A���B�ł��Ȃ�����Ȃ����B";
				mes "��������������ǂ�����ƁH";
				close;
			}
			if(getequiprefinerycnt('@part) >= 10) {
				mes "[�x�X�g��]";
				mes "����ȏ�̐��B�͖�������B";
				close;
			}
			if(getequippercentrefinery('@part) == 100) {
				mes "[�x�X�g��]";
				mes "�I�C�I�C�I ����͐��B����ɂ�";
				mes "�ȒP������I�@��������A���킾��";
				mes "���E��E���E���E��!!";
				mes "�������͒�������߂Ă�񂾁I";
				close;
			}
			if((getequipweaponlv('@part) <= 1) && (getequipweaponlv('@part) >= 3 )){
				mes "[�x�X�g��]";
				mes "����͂����������B���������x����";
				mes "���킶��Ȃ��ˁB���x��4�̕����";
				mes "�����Ă��ȁI";
				close;
			}
			if(getequipweaponlv('@part) == 0){
				mes "[�x�X�g��]";
				mes "����́A�h���Ȃ����I";
				mes "���������A������Č��������낤�B";
				mes "���x��4�̕���������Ă��ȁI";
				close;
			}
			mes "[�x�X�g��]";
			mes "�悵�A�Ō�Ɋm�F���B";
			mes "���B���ĉ��Ă��܂��ƁA���̕����";
			mes "��x�Ɩ߂��Ă��Ȃ����Ĕ����Ă�ȁH";
			mes "����ɕt�������J�[�h�⑮���Ȃ񂩂�";
			mes "^ff0000�S���������Ⴄ^000000�B���̊o�傪����Ȃ�A";
			mes "�����̓r�V���ƒ��킵�悤����Ȃ����I";
			next;
			if(select("���킵�܂�!!","�c�c��߂܂��B") == 2) {
				mes "[�x�X�g��]";
				mes "����ȈӋC�n�Ȃ��ŁA�悭���̌�����";
				mes "���̒���n���Ă����ˁB";
				mes "���������A��߂��߂��܂��B";
				close;
			}
			if(countitem(984) > 0) {
				delitem 984,1;
			}
			else {
				mes "[�x�X�g��]";
				mes "���A��{�I�Ȃ��Ƃ��h�Y�ꂵ�Ă��B";
				mes "���x��4����̐��B�ɂ̓I���f�I";
				mes "�R�����K�v���B";
				mes "�����Ǝ����Ă���悤�ɁB";
				close;
			}
			if(getequippercentrefinery('@part) > rand(100)) {
				mes "[�x�X�g��]";
				mes "�n�b�I�n�b!!�n�b�I�n�b!!�n�b�I";
				successrefitem '@part;
				next;
				emotion 18;
				mes "[�x�X�g��]";
				mes "���b�n�b�n�b�n�b�A���������Ă΍ō��I";
				mes "���O������������A�ȁA�ȁH";
			}
			else {
				mes "[�x�X�g��]";
				mes "�n�b�I�n�b!!�n�b�I�n�b!!�n�b�I";
				failedrefitem '@part;
				next;
				emotion 23;
				mes "[�x�X�g��]";
				mes "�E�A�A�A�A�A�A�A�A�A�[�b!!";
				next;
				mes "[�x�X�g��]";
				mes "���A����A���v�B";
				mes "�����͉^�������݂����B";
				mes "�ӁA�ł������Ȃ��I���ꂱ�����B��!!";
			}
			next;
			mes "[�x�X�g��]";
			mes "���������o����̂͂����܂ł��B";
			mes "�������̌Z��ɂ�������A���C��";
			mes "����Ă���ē`���Ă���Ă�B";
			mes "���܂����A����܂薳������Ȃ�B";
			mes "���Ⴀ�ȁB";
			set GOD_4QUE_SUB2,2;
			close;
		}
		else if(GOD_4QUE_SUB2 == 0) {
			mes "[�x�X�g��]";
			mes "�����p�H";
			next;
			switch(select("���ł��Ȃ��ł�","���݂܂���A�������b���c�c")) {
			case 1:
				mes "[�x�X�g��]";
				mes "�~�������͎����ŒT���I";
				mes "�����āA�����Ŏ�ɓ����I";
				close;
			case 2:
				mes "[�x�X�g��]";
				mes "�c�c�c�c��H";
				mes "���A�ǂ��������Ȃ������񂾂��ǁB";
				mes "�����ƒ����͂�H�ׂĂ�H";
				mes "�������́A���Ă̒ʂ�b�艮���B";
				mes "�ł��ˁA�b��������ƍD���Ȃ��Ƃ�";
				mes "���������̂��B";
				next;
				mes "[�x�X�g��]";
				mes "����́c�c���킷�邱�ƁI";
				mes "�Ⴆ�΁A���ɐ��B���ꂽ�����";
				mes "�����Ƃ����Ɛ��B����Ƃ��A�{���{����";
				mes "�h��𐸘B����Ƃ��A���E�܂Ŏg��ꂽ";
				mes "�����c�c";
				next;
				mes "[�x�X�g��]";
				mes "���[�A���ق�B�Ƃɂ����I";
				mes "�������͐��E�Ő��B����ԍD���I";
				mes "���E�ɒ��ނ��̃h�L�h�L���I";
				mes "���ꂪ���B�I";
				next;
				mes "[�x�X�g��]";
				mes "�悵�A���܂��ɉ�����̂������̉��B";
				mes "�����������ʂɂ��O�̕���𐸘B����";
				mes "�����悤�I�@�����������ŁI";
				mes "����Ɛ��B�ޗ�������������΂�����B";
				mes "�����b����H";
				next;
				mes "[�x�X�g��]";
				mes "�������I�h�L�h�L�̂Ȃ����B�͂��Ȃ��B";
				mes "�������͋��ɂ̃��N���N���~����!!";
				mes "����𖞂����̂̓��x��4����̂݁I";
				mes "���̕���́A�ǂ��̒N�ł����B�ł���";
				mes "����ˁB";
				set GOD_4QUE_SUB2,1;
				close;
			}
		}
	}
	mes "[�x�X�g��]";
	mes "����͂��́A���O�̃h���𐸘B����";
	mes "��낤�����H�@����͂��͂���!!";
	mes "��k�A��k����B";
	next;
	mes "[�x�X�g��]";
	mes "���B�`���B�`�� ���B���͊y�������ȁ�";
	mes "���s�`���Ă��A���������Ċ撣��́`��";
	mes "���������B�A���������B�A�ō��̑�����";
	mes "���ݏo���́`��";
	close;
}

mjolnir_12.gat,18,18,7	script	�h���[�t�̒b�艮#�k	826,{
	if($GodBrysinggamen < 50) {
		mes "[�m�X�g��]";
		mes "�l�Ԃɒ񋟂���G���j�E����";
		mes "�I���f�I�R���͂Ȃ��I";
		mes "�����āA�����āA�x�X�g�����S��";
		mes "�����Ă���������񂾂���I";
		close;
	}
	if($GodMjolnir >= 100) {
		mes "[�m�X�g��]";
		mes "�����낤�c�c���̂ɂ������ς�����c�c";
		mes "�[�����A�̒��ŁA�܂ǂ��ł���悤��";
		mes "�c�c�Ȃ񂾂낤�c�c�c�c";
		close;
	}
	if(GOD_4QUE == 11) {
		mes "[�m�X�g��]";
		mes "�w�w�w�B�h���[�t�͐l�Ԃ��˔\��";
		mes "����̂��B�_�l���A�l�Ԃ���Ȃ���";
		mes "���B�ꑰ�ɕ���̈˗����������Ă��Ƃ�";
		mes "�ؖ����Ă���ł��傤�H";
		mes "�����玄�B�͕������葱����́I";
		close;
	}
	else if(GOD_4QUE == 10) {
		mes "[�m�X�g��]";
		mes "�l�Ԃɒ񋟂���G���j�E����";
		mes "�I���f�I�R���͂Ȃ��I";
		mes "�����āA�����āA�x�X�g�����S��";
		mes "�����Ă���������񂾂���I";
		close;
	}
	else if(GOD_4QUE == 1) {
		if(GOD_4QUE_SUB1 == 3 || GOD_4QUE_SUB2 == 3 || GOD_4QUE_SUB3 == 3 || GOD_4QUE_SUB4 == 3) {
			mes "[�m�X�g��]";
			mes "�������`�@�������`�@�����������`��";
			mes "�������~�����j�[�����Y�킾�ȁ`��";
			mes "�G���Ȃ�ĕ������Ȃ��`�@�����`��";
			mes "�N���C�ɂȂ�Ȃ��`�@�������`��";
			close;
		}
		else if(GOD_4QUE_SUB4 == 2) {
			mes "[�m�X�g��]";
			mes "�o�i�i�����������G�߂��ˁ`�B";
			mes "���A�ł��J�{�`��������������ˁI";
			mes "�ˁA�ˁA�ˁH";
			close;
		}
		else if(GOD_4QUE_SUB1 == 0 || GOD_4QUE_SUB1 == 1 || GOD_4QUE_SUB2 == 0 || GOD_4QUE_SUB2 == 1 || GOD_4QUE_SUB3 == 0 || GOD_4QUE_SUB3 == 1){
			mes "[�m�X�g��]";
			mes "�����p�`�H";
			next;
			switch(select("���ł��Ȃ��ł�","�h���[�t���c�c")) {
			case 1:
				mes "[�m�X�g��]";
				mes "�ςȂ́`�B";
				mes "����ȏ��ŗV��ł��Ⴞ�߂�`�B";
				close;
			case 2:
				mes "[�m�X�g��]";
				mes "�������`�@�������`�@�����������`��";
				mes "�������~�����j�[�����Y�킾�ȁ`��";
				mes "�G���Ȃ�ĕ������Ȃ��`�@�����`��";
				mes "�N���C�ɂȂ�Ȃ��`�@�������`��";
				set GOD_4QUE_SUB4,3;
				close;
			}
		}
		else if(GOD_4QUE_SUB4 == 1) {
			if(countitem(501) == 0) {
				mes "[�m�X�g��]";
				mes "�������A�A���������`�B";
				mes "����A�ǂ��ɒu�������ȁH";
				mes "���̑厖�Ȑԃ|�[�V�����c�c";
				mes "�����ς肵�������͐ԃ|�[�V�����I";
				close;
			}
			delitem 501,1;
			mes "[�m�X�g��]";
			mes "����`�A���肪�Ƃ��I";
			mes "���̑�D���ȑ�D���Ȑԃ|�[�V�����`�I";
			mes "����A����ɑ厖�Ȑ̘b�����Ă�����B";
			mes "�Ƃ��Ă��ʔ����񂾂�B";
			next;
			while(1) {
				if('@talk_to == 0) {
					mes "[�m�X�g��]";
					mes "�g�[���l�����l�̑嗤�ɗ�����������";
					mes "���b�ł��B�E�g�K���h�ɒH�蒅����";
					mes "�g�[���l��s�́A���l�̊قŁA���l��";
					mes "���Ə��������܂����B";
					next;
					mes "[�m�X�g��]";
					mes "1�Ԗڂ̏����͐H�ה�ׁB";
					mes "�g�[���l�͂��łɂ�������H�ׂ�";
					mes "�ゾ�����̂ŁA����Ƀ��L�l��";
					mes "�������󂯂܂����B";
					next;
					mes "[�m�X�g��]";
					mes "�ł��A����͂ǂꂾ���H�ׂĂ�";
					mes "�����玟�ւƐH�ו��ǂ��납�A���M��";
					mes "�y�����ƈ��ݍ���ł��܂����̂ł��B";
					mes "���L�l�͕����Ă��܂��܂����B";
					next;
					mes "[�m�X�g��]";
					mes "���́A���l�͖��@���g���āA���������";
					mes "���ۂƂ͈Ⴄ�҂Ɍ����Ă����̂ł����B";
					mes "���āA�����玟�ւƉ��ł����ݍ��ގ҂�";
					mes "���̂͂Ȃ�ł��傤�H";
					next;
					switch(select("�~�]","�C","��","��")) {
					default:
						set '@talk_not,1;
						break;
					case 3:
						break;
					}
				}
				else if('@talk_to == 1) {
					mes "[�m�X�g��]";
					mes "�ȁ[��ƁA�΂������́I";
					next;
					mes "[�m�X�g��]";
					mes "���āA���̏����͂��������B";
					mes "�g�[���l�̏��g���������N�V�A�����B��";
					mes "�������܂����B�V�A���r�B���l�ԂƂ�";
					mes "�����A�g�[���l�ƈꏏ�ɗ����ė����g�B";
					mes "������͂��Ȃ��̂ɁA�ǂ����Ă������";
					mes "�ǂ��z���܂���B";
					next;
					mes "[�m�X�g��]";
					mes "���񑖂��Ă��A�V�A���r�B�͏����Ƃ�";
					mes "�o���܂���ł����B���Ă��āA���N��";
					mes "���������A���Ƃ����������Ă����̂�";
					mes "���傤�H";
					next;
					switch(select("���t","�v�l","��","�I�I�J�~")) {
					default:
						set '@talk_not,1;
						break;
					case 2:
						break;
					}
				}
				else if('@talk_to == 2) {
					mes "[�m�X�g��]";
					mes "�Ȃ��`��ƁA�����̎v�l��";
					mes "�����������Ă��́I";
					next;
					mes "[�m�X�g��]";
					mes "���A���l�͎����̂��k������";
					mes "�������Ȃ����ƌ����܂����B";
					mes "������󂯂ė������̂��g�[���l�I";
					mes "�g�[���l���N���ɕ�����Ȃ��";
					mes "�l�����܂�����!?";
					next;
					mes "[�m�X�g��]";
					mes "�ł��ˁA�g�[���l�͂��k�����Ƃ�";
					mes "�͔�ׂɕ����āA�n�ɕG������";
					mes "���܂����́B";
					next;
					mes "[�m�X�g��]";
					mes "��������l�̖��@�������񂾂��ǁB";
					mes "���k����̎p�����Ă�������ǁA";
					mes "���k���񂶂�Ȃ������́B";
					mes "�����A�N�ɂ��ł����������Ƃ�";
					mes "�o���Ȃ����݁c�c�Ȃ񂾂�����H";
					next;
					switch(select("��","��n","�S","�V��")) {
					default:
						set '@talk_not,1;
						break;
					case 4:
						break;
					}
				}
				else if('@talk_to == 3) {
					mes "[�m�X�g��]";
					mes "�����A�V���I";
					mes "�N�����ĕK���N�����񂾂���A";
					mes "�V���ɂ͏��ĂȂ��́B";
					next;
					mes "[�m�X�g��]";
					mes "���ǁA�S�Ă̏����ɔs�ꂽ�g�[���l��";
					mes "���̒n�����邱�ƂɂȂ����񂾂��ǁA";
					mes "���l�̉��͍Ō�ɐ^�����������̂ˁB";
					mes "�������A�g�[���l�͌��{�����񂾂���";
					mes "���̎��ɂ́A���l�̉��͊ق���";
					mes "������������񂾂��āc�c";
					next;
					mes "[�m�X�g��]";
					mes "���̂��b�ő厖�Ȃ̂�2�B";
					mes "1�́A�ڂɌ����邱�Ƃ΂��肪";
					mes "�S�Ă���Ȃ����ƁB";
					mes "�����āA���̒��ɂ͎�����苭���҂�";
					mes "�����ς����邩��A�ߐM���������ꂸ�A";
					mes "�w�͂���p����Y��Ȃ����ƁB";
					next;
					mes "[�m�X�g��]";
					mes "�����ɑ��݂��Ă��邩����āA";
					mes "����΂��肪���̒��S�Ă���Ȃ��B";
					mes "������������A����͌���������Ȃ��B";
					next;
					mes "[�m�X�g��]";
					mes "�����A���߂񂲂߂�B";
					mes "�����b������������B";
					mes "���̂ˁA����ǂ����߂�l��������";
					mes "���̂��b�����Ă����āB���l�̌���";
					mes "����ĕ������A�g�[���l�̘b�c�c";
					set GOD_4QUE_SUB4,2;
					close;
				}
				if('@talk_not == 1) {
					mes "[�m�X�g��]";
					mes "����`�A����`�B�Ȃ�̘b�������H";
					mes "�܁A�������B";
					mes "�܂���Őԃ|�[�V�����ł����݂Ȃ���";
					mes "�����肵�悤�ˁ`�B";
					close;
				}
				else {
					set '@talk_to,'@talk_to + 1;
				}
			}
		}
		else if(GOD_4QUE_SUB4 == 0) {
			mes "[�m�X�g��]";
			mes "�����p�`�H";
			next;
			switch(select("���ł��Ȃ��ł�","���݂܂���A�������b���c�c")) {
			case 1:
				mes "[�m�X�g��]";
				mes "�ςȂ́`�B";
				mes "����ȏ��ŗV��ł��Ⴞ�߂�`�B";
				close;
			case 2:
				mes "[�m�X�g��]";
				mes "���[��A�Ȃ�ł��ȁB";
				mes "�ŋ߁A���̂Ƃ���ɂ₽���";
				mes "�l�Ԃ�����悤�ȁH�@���̂ق���";
				mes "�ދ����Ȃ�����A�劽�}�����ǂˁ`�B";
				next;
				mes "[�m�X�g��]";
				mes "�ł��A�����肷��ƍA�������񂾂�ˁB";
				mes "����ς�A�C�����悭���b�����������B";
				mes "�˂��˂��A��D���Ȑԃ|�[�V������";
				mes "�������Ă��ꂽ��A�Ƃ��Ă��ʔ���";
				mes "���b�������Ă�����`�B";
				set GOD_4QUE_SUB4,1;
				close;
			}
		}
	}
	else if(GOD_4QUE == 2) {
		if((GOD_4QUE_SUB1 == 3) || (GOD_4QUE_SUB2 == 3) || (GOD_4QUE_SUB3 == 3) || (GOD_4QUE_SUB4 == 3)){
			mes "[�m�X�g��]";
			mes "�������`�@�������`�@�����������`��";
			mes "�������~�����j�[�����Y�킾�ȁ`��";
			mes "�G���Ȃ�ĕ������Ȃ��`�@�����`��";
			mes "�N���C�ɂȂ�Ȃ��`�@�������`��";
			close;
		}
		else if(GOD_4QUE_SUB1 == 2) {
			mes "[�m�X�g��]";
			mes "�o�i�i�����������G�߂��ˁ`�B";
			mes "���A�ł��J�{�`��������������ˁI";
			mes "�ˁA�ˁA�ˁH";
			close;
		}
		else if(GOD_4QUE_SUB2 != 0 || GOD_4QUE_SUB3 != 0 || GOD_4QUE_SUB4 != 0) {
			mes "[�m�X�g��]";
			mes "�����p�`�H";
			next;
			switch(select("���ł��Ȃ��ł�","�h���[�t���c�c")) {
			case 1:
				mes "[�m�X�g��]";
				mes "�ςȂ́`�B";
				mes "����ȏ��ŗV��ł��Ⴞ�߂�`�B";
				close;
			case 2:
				mes "[�m�X�g��]";
				mes "�������`�@�������`�@�����������`��";
				mes "�������~�����j�[�����Y�킾�ȁ`��";
				mes "�G���Ȃ�ĕ������Ȃ��`�@�����`��";
				mes "�N���C�ɂȂ�Ȃ��`�@�������`��";
				set GOD_4QUE_SUB1,3;
				close;
			}
		}
		else if(GOD_4QUE_SUB1 == 1) {
			if(countitem(501) == 0) {
				mes "[�m�X�g��]";
				mes "�������A�A���������`�B";
				mes "����A�ǂ��ɒu�������ȁH";
				mes "���̑厖�Ȑԃ|�[�V�����c�c";
				mes "�����ς肵�������͐ԃ|�[�V�����I";
				close;
			}
			delitem 501,1;
			mes "[�m�X�g��]";
			mes "����`�A���肪�Ƃ��I";
			mes "���̑�D���ȑ�D���Ȑԃ|�[�V�����`�I";
			mes "����A����ɑ厖�Ȑ̘b�����Ă�����B";
			mes "�Ƃ��Ă��ʔ����񂾂�B";
			next;
			while(1) {
				if('@talk_to == 0) {
					mes "[�m�X�g��]";
					mes "�`���ɂ��ƁA���B�h���[�t�̂���c��";
					mes "�ƂĂ��E�܂����������������񂾂��āB";
					mes "���O�̓A�����B�X�B�}���ق̂悤��";
					mes "�m���������ς��ŁA�W�[�N�t���[�h��";
					mes "�悤�ɗE�܂��������Ƃ��B";
					next;
					mes "[�m�X�g��]";
					mes "�Ƃ��낪�A�A�����B�X�͓͂��Ȃ�����";
					mes "���Ă��܂��܂����B�Ȃ�ƁA�_�X��";
					mes "�����b�������Ԃ�ɁA�g�[���l�̖���";
					mes "�����������ƌ�������ł��I";
					mes "�������A�g�[���l�͑唽�΁I";
					mes "�ł��A�A�����B�X�͋����܂���ł����B";
					next;
					mes "[�m�X�g��]";
					mes "�����ŁA�g�[���l�̓A�����B�X������";
					mes "�����������e�X�g����Ƃ����A�����";
					mes "���܂����B���ƁA�Ȃ񂾂����c�c";
					mes "���A�������������B";
					mes "�u���B������ł��邱�̒n���A";
					mes "�l�Ԃ͉��ƌĂԂ��H�v";
					next;
					switch(select("���~���̓���","��n","�y","�n��")) {
					default:
						set '@talk_not,1;
						break;
					case 2:
						break;
					}
				}
				else if('@talk_to == 1) {
					mes "[�m�X�g��]";
					mes "�����A��n�ł��B";
					mes "�����ăg�[���l�͎��̎�������܂����B";
					mes "�u��n�𕢂��Ă���ۂ����̂��A";
					mes "���l�͉��ƌĂԂ��H�v";
					next;
					switch(select("���~���̓�","��","�_","������")) {
					default:
						set '@talk_not,1;
						break;
					case 4:
						break;
					}
				}
				else if('@talk_to == 2) {
					mes "[�m�X�g��]";
					mes "���������A�����Ƃ��Č�����ł����āI";
					mes "���l�͑傫������A���������ӂ���";
					mes "�������ł��傤�ˁ`�B�����āA";
					mes "�g�[���l�͂������������܂����B";
					mes "�u���ӁA��ɕ����Ԋۂ����̂��A";
					mes "�_�X�͉��ƌĂԂ��H�v";
					next;
					switch(select("�^�C��","��","�U���̑��z","���l")) {
					default:
						set '@talk_not,1;
						break;
					case 3:
						break;
					}
				}
				else if('@talk_to == 3) {
					mes "[�m�X�g��]";
					mes "�����Ȃ�ł���`�I";
					mes "�_�X�͌����A�U���̑��z�ƌĂт܂��B";
					next;
					mes "[�m�X�g��]";
					mes "�A�����B�X�́A�g�[���l�̎��₪";
					mes "���܂�ɊȒP�����āA���f���Ă��܂���";
					mes "�̂ł��傤�ˁ`�B�Ȃ�ƁA�g�[���l��";
					mes "���₵�Ă���ԂɁA���z�������Ă���";
					mes "�����̂ł��B�h���[�t�͑��z�̌��𒼐�";
					mes "���т�ƁA�΂ɂȂ��Ă��܂��̂ł��c�c";
					next;
					mes "[�m�X�g��]";
					mes "���̂��b�ő厖�Ȃ̂�2�B";
					mes "1�́A�傫�����閲�����Ȃ����ƁB";
					mes "����1�́A���S���Ȃ����Ɓc�c����H";
					mes "���̒��������̎v���ʂ�ɂȂ�Ȃ��";
					mes "��ԈႢ�Ȃ񂾂���B";
					next;
					mes "[�m�X�g��]";
					mes "�����̓x�ʂɑ���������炷�̂���ԁB";
					mes "�^���̎��͒�����������Ȃ����ǁA";
					mes "����͂��؂�邩����Ȃ��񂾂���B";
					next;
					mes "[�m�X�g��]";
					mes "�����A���߂񂲂߂�B";
					mes "�����b������������B";
					mes "���̂ˁA���S����������l��������";
					mes "���̂��b�����Ă����āB�����ŋ���";
					mes "�������A���̂���c���܂̂��b�c�c";
					set GOD_4QUE_SUB1,2;
					close;
				}
				if('@talk_not == 1) {
					mes "[�m�X�g��]";
					mes "����`�A����`�B�Ȃ�̘b�������H";
					mes "�܁A�������B";
					mes "�܂���Őԃ|�[�V�����ł����݂Ȃ���";
					mes "�����肵�悤�ˁ`�B";
					close;
				}
				else {
					set '@talk_to,'@talk_to + 1;
				}
			}
		}
		else if(GOD_4QUE_SUB1 == 0) {
			mes "[�m�X�g��]";
			mes "�����p�`�H";
			next;
			switch(select("���ł��Ȃ��ł�","���݂܂���A�������b���c�c")) {
			case 1:
				mes "[�m�X�g��]";
				mes "�ςȂ́`�B";
				mes "����ȏ��ŗV��ł��Ⴞ�߂�`�B";
				close;
			case 2:
				mes "[�m�X�g��]";
				mes "���[��A�Ȃ�ł��ȁB";
				mes "�ŋ߁A���̂Ƃ���ɂ₽���";
				mes "�l�Ԃ�����悤�ȁH�@���̂ق���";
				mes "�ދ����Ȃ�����A�劽�}�����ǂˁ`�B";
				next;
				mes "[�m�X�g��]";
				mes "�ł��A�����肷��ƍA�������񂾂�ˁB";
				mes "����ς�A�C�����悭���b�����������B";
				mes "�˂��˂��A��D���Ȑԃ|�[�V������";
				mes "�������Ă��ꂽ��A�Ƃ��Ă��ʔ���";
				mes "���b�������Ă�����`�B";
				set GOD_4QUE_SUB1,1;
				close;
			}
		}
	}
	mes "[�m�X�g��]";
	mes "���̓h���[�t�̒b�艮�A�m�X�g���B";
	mes "�ꑰ�̒��ŁA�k�̒b�艮����B";
	mes "���������́A���̋��𓾂Ȃ���";
	mes "�ʂ��܂���I";
	next;
	mes "[�m�X�g��]";
	mes "���ւցA��k��k�B";
	close;
}

//====================================================================
// �_��쐬�N�G�X�g
//====================================================================
-	script	�O�����u���e�B#created	-1,{
	mes "[�h���[�t�E�O�����u���e�B]";
	mes "�t���I�@�l�ԁA���̗p���H";
	mes "�̋��̒n�𗣂�A�͂邩��������";
	mes "�~�b�h�K���h�ŕ�炳�Ȃ��Ⴂ���Ȃ�";
	mes "�Ȃ�Ė{���ɋ�ɂ�!!�@����������";
	mes "�܂��l�Ԃ̑�������Ȃ���";
	mes "�����Ȃ���!?";
	next;
	switch(select("�h���[�t�ɂ��Ēm�肽��","�����ŉ����Ă�́H","�������˗�������","�b����߂�")) {
	case 1:
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�t���I�@�ʓ|���ˁB";
		mes "�l�Ԃ��킵��h���[�t�̂��Ƃ�m����";
		mes "�ǂ�����񂾁H�@�l�Ԃƈ���Ă킵���";
		mes "���̑ދ��ȃ~�b�h�K���h�Ƃ͔�r��";
		mes "�Ȃ�Ȃ��قǕs�тȒn�Ő����Ă���";
		mes "�푰�Ȃ񂾂��B";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�M�l�炪�ւ�Z�p�ƒm���́A���X�S��";
		mes "�킵��̕��������B���������ꂾ��";
		mes "����Ȃ��B�͂邩�́A�_�X���g����";
		mes "������S�Ă킵��̐�c�l��";
		mes "��������̂��B";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�킵��h���[�t�́A�����������D�ꂽ";
		mes "�m����Z�p�������Ă����c�c����";
		mes "�^���ɏ]���A���l���Z�ޕs�тȒn��";
		mes "�����邱�Ƃɂ����񂾁B";
		close;
	case 2:
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�����ŉ����Ă邩���āH";
		mes "�t�n�n�n�n�b�I";
		mes "���Ȃ��Ƃ��M�l�ɉ���߂���Ȃ��B";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "���O�݂����ȓz�𑊎�ɂ���̂�";
		mes "�킵�̒p������ȁB�����A";
		mes "�|����Ȃ��Ă������B�t�n�n�b�I";
		mes "�ア�����ɁA���ꂼ�ꎩ���̕���������";
		mes "�֎���������Ȏ푰����A�l�Ԃ́B";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�s�тȒn�c�c�킵�̌̋��B���ƂȂ��Ă�";
		mes "���̃~�b�h�K���h����͍s���Ȃ������B";
		mes "�킵�̌̋��֒ʂ���B��̓���";
		mes "�C�O�h���V���̎��ɂ������B";
		mes "�����A1000�N�O�̑傫�Ȑ푈�ȗ��A";
		mes "���̓�������Ȃ��Ȃ��Ă��܂����c�c";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�s�{�ӂł͂��邪�A���̃~�b�h�K���h��";
		mes "��炷�����Ȃ��c�c���߂Ă킵�̌̋���";
		mes "�������Ă��邱�̓��A�łȁB";
		close;
	case 3:
		if($GodSleipnir < 100 || $GodMagingiorde < 100 || $GodBrysinggamen < 100 || $GodMjolnir < 100) {
			if($GodSleipnir >= 50 && $GodMagingiorde >= 50 && $GodBrysinggamen >= 50 && $GodMjolnir >= 50 && getcharid(0) == getguildmasterid(getcharid(2))) {
				mes "[�h���[�t�E�O�����u���e�B]";
				mes "�t���A�d���Ȃ��B";
				mes "���ʂɍޗ��������Ă��B";
				mes "���ɂ��Ēm�肽���񂾁H";
				next;
				switch(select("�u���[�V���K����","���M���M�����h","�X���C�v�j�[��","�~�����j�[��")) {
				case 1:
					mes "[�h���[�t�E�O�����u���e�B]";
					mes "^0000FF�t���C���̕�� 4��";
					mes "��̑��� 4��";
					mes "��̌��� 3��";
					mes "�Â��Ȕg 3��";
					mes "������C 3��";
					mes "�T�t�@�C�A 2��^000000";
					next;
					mes "[�h���[�t�E�O�����u���e�B]";
					mes "^0000FF�^�� 3��";
					mes "�I�p�[�� 10��";
					mes "���ꂽ���r�[ 5��";
					mes "���� 20��";
					mes "�l�b�N���X 1��^000000";
					break;
				case 2:
					mes "[�h���[�t�E�O�����u���e�B]";
					mes "^0000FF�O���C�v�j�[�� 1��";
					mes "���� 20��";
					mes "�T�t�@�C�A 10��";
					mes "�I���f�I�R�� 10��";
					mes "�x���g 1��^000000";
					break;
				case 3:
					mes "[�h���[�t�E�O�����u���e�B]";
					mes "^0000FF���m�̎��� 3��";
					mes "�V�g�̉H�� 5��";
					mes "���̍� 3��";
					mes "���z�_�̏ے� 4��";
					mes "���̑��� 3��";
					mes "���� 20��";
					next;
					mes "[�h���[�t�E�O�����u���e�B]";
					mes "�G���j�E�� 10��";
					mes "�u�[�c[1] 1��^000000";
					break;
				case 4:
					mes "[�h���[�t�E�O�����u���e�B]";
					mes "^0000FF�g�[���̃O���[�u 2��";
					mes "�A�C�A�����C�f�� 4��";
					mes "���@���L���[�̓{�� 5��";
					mes "���̒��� 5��";
					mes "�����񂹂�g 5��";
					mes "�I���f�I�R�� 20��";
					next;
					mes "[�h���[�t�E�O�����u���e�B]";
					mes "�G���j�E�� 5��";
					mes "���� 40��";
					mes "�X�^�i�[ 1��^000000";
					break;
				}
				next;
				mes "[�h���[�t�E�O�����u���e�B]";
				mes "�ȏオ�K�v�Ȃ��̂��B";
				mes "���Ƃ��ޗ����������Ƃ��Ă��A";
				mes "��ʂɍ���킯����Ȃ��B";
				mes "�܂������n���Ȃ���΂ł���B";
				mes "�l�ԁA���������H";
				mes "�t�n�n�n�b�I";
				close;
			}
			mes "[�h���[�t�E�O�����u���e�B]";
			mes "�܂��l�Ԃɂ킵��ꑰ�̋Z�p��";
			mes "��������킯���Ȃ�!!�@�����";
			mes "�����S�������悤�Ȏ��Ȃ񂼂ł���I";
			mes "�ז����A�ǂ��������I�@�M�l�炪";
			mes "�D���ȃ����X�^�[�Ƃł��V��ł�!!";
			close;
		}
		if(getcharid(0) != getguildmasterid(getcharid(2))) {
			mes "[�h���[�t�E�O�����u���e�B]";
			mes "�܂��l�ԁA�������M���h�}�X�^�[";
			mes "�ł���Ȃ��z�ɁA�킵��ꑰ�̋Z�p��";
			mes "��������킯���Ȃ�!!�@�M�l��";
			mes "^0000FF�M���h�}�X�^�[^000000��A��Ă���񂾂ȁI";
			close;
		}
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�܂��l�Ԃɂ킵��ꑰ�̋Z�p��";
		mes "�����鎖�́A�����S���������c�c";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�M���h�}�X�^�[�ł���A����������";
		mes "�S�ĉ��������Ȃ�΁A��`���Ă���Ă�";
		mes "�������낤�B";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "���̑O�ɁA�_��A�C�e�������̂�";
		mes "�K�v�ȍޗ���S�Ď����Ă��邩";
		mes "�m�F����I�@���ʂȓz���킵��";
		mes "��Ǝ��ɓ��ꂽ���͂Ȃ�����ȁB";
		next;
		if(getcharid(0) == getguildmasterid(getcharid(2))) {
			if(countitem(7073)>=4 && countitem(7077)>=4 && countitem(7088)>=3 && countitem(7090)>=3 && countitem(7092)>=3 && countitem(726)>=2 && countitem(722)>=3 && countitem(727)>=10 && countitem(724)>=5 && countitem(969)>=20 && countitem(2603)>=1) {
				set '@gain,2630;
				break;
			}
			if(countitem(7058)>=1 && countitem(969)>=20 && countitem(726)>=10 && countitem(984)>=10 && countitem(2627)>=1) {
				set '@gain,2629;
				break;
			}
			if(countitem(7076)>=3 && countitem(7079)>=5 && countitem(7083)>=3 && countitem(7086)>=4 && countitem(7087)>=3 && countitem(969)>=20 && countitem(985)>=10 && countitem(2406)>=1) {
				set '@gain,2410;
				break;
			}
			if(countitem(7074)>=2 && countitem(7075)>=4 && countitem(7078)>=5 && countitem(7089)>=5 && countitem(7091)>=5 && countitem(984)>=20 && countitem(985)>=5 && countitem(969)>=40 && countitem(1522)>=1) {
				set '@gain,1530;
				break;
			}
		}
		break;
	case 4:
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�t�n�n�n�[�I";
		mes "�A���ă}�}�ɂł��~���N��";
		mes "���炤�񂾂ȁI";
		close;
	}
	if('@gain) {
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�t�����c�c";
		mes "^0000FF" +getitemname('@gain)+ "^000000�������肾�ȁB";
		mes "�������c�c";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�䂪�g�����v�������邪";
		mes "���m�ȋM�l�����킢����������";
		mes "���ʂɐ���˗����󂯂Ă��B";
		mes "�������֍s�����炷����";
		mes "^0000FF�n����Ǝ�^000000�֗����I";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�����A�s���I";
		mes "^0000FF�S�Ă̕��󂪉�����������^000000";
		mes "^FF0000�_��A�C�e�������^000000";
		mes "���邩��ȁB�}���񂾁I";
		close2;
		warp "que_god01.gat",214,62;
		end;
	}
	mes "[�h���[�t�E�O�����u���e�B]";
	mes "�c�c�c�c";
	next;
	mes "[�h���[�t�E�O�����u���e�B]";
	mes "�c�c�c�c";
	next;
	mes "[�h���[�t�E�O�����u���e�B]";
	mes "�c�c�c�c";
	next;
	mes "[�h���[�t�E�O�����u���e�B]";
	mes "����?!�@�ޗ�������Ȃ�����Ȃ���!?";
	mes "�܂��������K�v��������Ȃ��̂��H";
	mes "�d���Ȃ��A�ޗ��������Ă�낤�I";
	next;
	switch(select("�u���[�V���K����","���M���M�����h","�X���C�v�j�[��","�~�����j�[��")) {
	case 1:
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "^0000FF�t���C���̕�� 4��";
		mes "��̑��� 4��";
		mes "��̌��� 3��";
		mes "�Â��Ȕg 3��";
		mes "������C 3��";
		mes "�T�t�@�C�A 2��^000000";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "^0000FF�^�� 3��";
		mes "�I�p�[�� 10��";
		mes "���ꂽ���r�[ 5��";
		mes "���� 20��";
		mes "�l�b�N���X 1��^000000";
		break;
	case 2:
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "^0000FF�O���C�v�j�[�� 1��";
		mes "���� 20��";
		mes "�T�t�@�C�A 10��";
		mes "�I���f�I�R�� 10��";
		mes "�x���g 1��^000000";
		break;
	case 3:
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "^0000FF���m�̎��� 3��";
		mes "�V�g�̉H�� 5��";
		mes "���̍� 3��";
		mes "���z�_�̏ے� 4��";
		mes "���̑��� 3��";
		mes "���� 20��";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�G���j�E�� 10��";
		mes "�u�[�c[1] 1��^000000";
		break;
	case 4:
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "^0000FF�g�[���̃O���[�u 2��";
		mes "�A�C�A�����C�f�� 4��";
		mes "���@���L���[�̓{�� 5��";
		mes "���̒��� 5��";
		mes "�����񂹂�g 5��";
		mes "�I���f�I�R�� 20��";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�G���j�E�� 5��";
		mes "���� 40��";
		mes "�X�^�i�[ 1��^000000";
		break;
	}
	next;
	mes "[�h���[�t�E�O�����u���e�B]";
	mes "�ȏオ�K�v�Ȃ��̂��B";
	mes "��������Ȃ��Ƃ𕷂��Ă�Ȃ��";
	mes "�x�����I�@���̋@��𓦂���";
	mes "�����邩�킩���!!";
	mes "�ق�A�}��!!";
	close;
}
gld_dun01.gat,28,85,0	duplicate(�O�����u���e�B#created)	�O�����u���e�B	826
gld_dun02.gat,85,84,0	duplicate(�O�����u���e�B#created)	�O�����u���e�B	826
gld_dun03.gat,92,105,0	duplicate(�O�����u���e�B#created)	�O�����u���e�B	826
gld_dun04.gat,268,230,0	duplicate(�O�����u���e�B#created)	�O�����u���e�B	826

que_god01.gat,215,127,3	script	�n����Ǝ�����::cquegod	111,{
	mes "[�����ē�]";
	mes "��ԑ����l�A��l�������_�l�ɋ߂Â���";
	close;
OnInit:
	waitingroom "�n����Ǝ�����",2,"cquegod::OnWarp",1;
	end;
OnWarp:
	disablewaitingroomevent;
	warpwaitingpc "que_god01.gat",155,62,1;
	initnpctimer "�O�����u���e�B#god";
	end;
}

que_god01.gat,154,112,4	script	�O�����u���e�B#god	826,{
	if($GodSleipnir < 100 || $GodMagingiorde < 100 || $GodBrysinggamen < 100 || $GodMjolnir < 100) {
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�_��A�C�e���͊��ɒa�����Ă��邼�B";
		mes "�V���Ȑ_��A�C�e�������ɂ�";
		mes "���󂪍Ăщ�����̂�҂����Ȃ��I";
		mes "�܂�A���͍��Ȃ����Ă��Ƃ��I";
		mes "�t�n�n�n�b�I";
		close;
	}
	if(getcharid(0) != getguildmasterid(getcharid(2))) {
		// ������
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�����ւ͂ǂ�����ē������H";
		mes "�M�l�̓M���h�}�X�^�[�ł͂Ȃ����낤�B";
		mes "�o�čs���������I";
		close;
	}
	mes "[�h���[�t�E�O�����u���e�B]";
	mes "�䂪�g�����v�������邪";
	mes "���m�ȋM�l�����킢����������";
	mes "���ʂɐ���˗����󂯂Ă��B";
	next;
	mes "[�h���[�t�E�O�����u���e�B]";
	mes "�A���A��قǍ�Ǝ��ɓ�����������";
	mes "^FF000010���ȓ�^000000�ɐ��������������񂾁B";
	mes "�킵�͖Z�������A^0000FF���󂪉����Ă���";
	mes "���Ԃ����܂蒷���Ȃ�^000000����ȁB";
	next;
	mes "[�h���[�t�E�O�����u���e�B]";
	mes "�܂��A�M�l�����ԉ҂��������Ƃ��Ă�";
	mes "���l�ɐ���z����邾�������ȁB";
	mes "�����A�ǂ̕������肽���񂾁H";
	next;
	switch(select("�u���[�V���K����","���M���M�����h","�X���C�v�j�[��","�~�����j�[��")) {
	case 1:
		// ������
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�u���[�V���K����!!";
		mes "�܂��l�Ԃ����̋M�����";
		mes "��ɓ���悤�Ƃ���Ƃ́I";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�u���[�V���K�����͂��̐́A���_";
		mes "�t���C������ɂ����Ă��������B";
		mes "����ȋM�������t���C���ȊO�̎҂�";
		mes "�g�ɂ���Ȃ�Ė{���A�L�蓾�Ȃ�";
		mes "���Ƃ��I";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�����A�󎩂��l��I������B";
		mes "�܂�A��ԑ厖�Ȃ̂�";
		mes "�u���[�V���K�������g��";
		mes "�M�l��I�Ԃ��ǂ������ȁB";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�킵�Ȃ�킵��̈̂���c�l�̂悤��";
		mes "�u���[�V���K��������邱�Ƃ��ł���B";
		mes "�{���ɍ���ė~�����̂��H";
		mes "���Ȃ݂ɍޗ��͎��̒ʂ肾�B";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "^0000FF�t���C���̕�� 4��^000000";
		mes "^0000FF��̑��� 4��^000000";
		mes "^0000FF��̌��� 3��^000000";
		mes "^0000FF�Â��Ȕg 3��^000000";
		mes "^0000FF������C 3��^000000";
		mes "^0000FF�T�t�@�C�A 2��^000000";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "^0000FF�^�� 3��^000000";
		mes "^0000FF�I�p�[�� 10��^000000";
		mes "^0000FF���ꂽ���r�[ 5��^000000";
		mes "^0000FF���� 20��^000000";
		mes "^0000FF�l�b�N���X 1��^000000";
		setarray '@need,7073,7077,7088,7090,7092,726,722,727,724,969,2603;
		setarray '@amount,4,4,3,3,3,2,3,10,5,20,1;
		set '@gain,2630;
		break;
	case 2:
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "���M���M�����h!!";
		mes "�܂��l�Ԃ����̋M�����";
		mes "��ɓ���悤�Ƃ���Ƃ́I";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "���M���M�����h�͂��̐́A�E�҂Ȑ_";
		mes "�g�[�����g�ɂ��Ă��������B";
		mes "����ȋM�������g�[���ȊO�̎҂�";
		mes "�g�ɂ���Ȃ�Ė{���A�L�蓾�Ȃ�";
		mes "���Ƃ��I";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�����A�󎩂��l��I������B";
		mes "�܂�A��ԑ厖�Ȃ̂�";
		mes "���M���M�����h���g��";
		mes "�M�l��I�Ԃ��ǂ������ȁB";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�킵�Ȃ�킵��̈̂���c�l�̂悤��";
		mes "���M���M�����h����邱�Ƃ��ł���B";
		mes "�{���ɍ���ė~�����̂��H";
		mes "���Ȃ݂ɍޗ��͎��̒ʂ肾�B";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "^0000FF�O���C�v�j�[�� 1��^000000";
		mes "^0000FF���� 20��^000000";
		mes "^0000FF�T�t�@�C�A 10��^000000";
		mes "^0000FF�I���f�I�R�� 10��^000000";
		mes "^0000FF�x���g 1��^000000";
		setarray '@need,7058,969,726,984,2627;
		setarray '@amount,1,20,10,10,1;
		set '@gain,2629;
		break;
	case 3:
		// ������
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�X���C�v�j�[��!!";
		mes "�܂��l�Ԃ���_�I�[�f�B���̈��n";
		mes "�X���C�v�j�[����]�ނ̂��I";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�������̂킵�ł��A��������邱�Ƃ�";
		mes "�ł��Ȃ��B�����A�X���C�v�j�[���̗l��";
		mes "�D�ꂽ�r�͂��������Ȃ��邱�Ƃ�";
		mes "�ł���B";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "������񂻂ꂾ���ł��M�l�ɂ�";
		mes "�\���߂����̂͂����B";
		mes "�{���ɍ���ė~�����̂��H";
		mes "���Ȃ݂ɍޗ��͎��̒ʂ肾�B";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "^0000FF���m�̎��� 3��^000000";
		mes "^0000FF�V�g�̉H�� 5��^000000";
		mes "^0000FF���̍� 3��^000000";
		mes "^0000FF���z�_�̏ے� 4��^000000";
		mes "^0000FF���̑��� 3��^000000";
		mes "^0000FF���� 20��^000000";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�G���j�E�� 10��";
		mes "�u�[�c[1] 1��";
		setarray '@need,7076,7079,7083,7086,7087,969,985,2406;
		setarray '@amount,3,5,3,4,3,20,10,1;
		set '@gain,2410;
		break;
	case 4:
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�~�����j�[��!!";
		mes "�󒆂̕�B�_�X���狰���";
		mes "�����̕����]�ނ̂�!?";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "����Ă���Ă��������A�M�l��";
		mes "�����������̂Ȃ̂��H";
		mes "�ŋ��̗E�m�g�[���̖��ɕ����Ȃ�";
		mes "���M�ł�����̂��H";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�t�n�n�n�b�I";
		mes "�l�Ԃ��×~�����炱���A�����";
		mes "���̉߂����肢�������̂��낤�ȁB";
		mes "�܂������A���ۂɎ�ɓ����";
		mes "�Ȃ̌��E���킩�邾�낤�B";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�{���ɍ���ė~�����̂��H";
		mes "���Ȃ݂ɍޗ��͎��̒ʂ肾�B";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "^0000FF�g�[���̃O���[�u 2��^000000";
		mes "^0000FF�A�C�A�����C�f�� 4��^000000";
		mes "^0000FF���@���L���[�̓{�� 5��^000000";
		mes "^0000FF���̒��� 5��^000000";
		mes "^0000FF�����񂹂�g 5��^000000";
		mes "^0000FF�I���f�I�R�� 20��^000000";
		next;
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�G���j�E�� 5��";
		mes "���� 40��";
		mes "�X�^�i�[ 1��";
		setarray '@need,7074,7075,7078,7089,7091,984,985,969,1522;
		setarray '@amount,2,4,5,5,5,20,5,40,1;
		set '@gain,1530;
		break;
	}
	next;
	if(select(getitemname('@gain)+ "�����","������") == 2) {
		// ������
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�������H";
		mes "��x�_����쐬������A";
		mes "�܂������n���Ȃ���΂ł��񂼁B";
		close;
	}
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {
			// ������
			mes "[�h���[�t�E�O�����u���e�B]";
			mes "�M�l���~�����_��͖{���ɂ��ꂩ?!";
			mes "�킵�͖Z����!!";
			mes "�M�l�̓s���ɕt�������ɂ͖����I";
			mes "���Ԃ������B�����m���߂�I";
			close;
		}
	}
	mes "[�h���[�t�E�O�����u���e�B]";
	mes "�t�n�n�b�I";
	mes "�l�Ԃ̂��߂ɂ��̋Z�p��";
	mes "�g�����ƂɂȂ�Ƃ͂�!!";
	mes "�t���I�@�����҂��Ă�I";
	next;
	if(Weight*100/MaxWeight >= 50) {
		mes "�]�����A�C�e���̏d�ʂ��d����";
		mes "�@�댯�ł��B";
		mes "�@�����A�C�e�������炵�Ă���A";
		mes "�@�ēx�b�������Ă��������]";
		close;
	}
	if($GodSleipnir < 100 || $GodMagingiorde < 100 || $GodBrysinggamen < 100 || $GodMjolnir < 100) {
		mes "[�h���[�t�E�O�����u���e�B]";
		mes "�_��A�C�e���͊��ɒa�����Ă��邼�B";
		mes "�V���Ȑ_��A�C�e�������ɂ�";
		mes "���󂪍Ăщ�����̂�҂����Ȃ��I";
		mes "�܂�A���͍��Ȃ����Ă��Ƃ��I";
		mes "�t�n�n�n�b�I";
		close;
	}
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1)
		delitem '@need['@i],'@amount['@i];
	getitem '@gain,1;
	set $GodSleipnir,0;
	set $GodMagingiorde,0;
	set $GodBrysinggamen,0;
	set $GodMjolnir,0;
	announce "�M���h[" + GetGuildName(getcharid(2)) + "]�̃M���h�}�X�^�[[" + getguildmaster(getcharid(2)) + "]�ɂ���āA�_��A�C�e��[" +getitemname('@gain)+ "]���a�����܂����B",0;
	mes "[�h���[�t�E�O�����u���e�B]";
	mes "������!!";
	switch('@gain) {
	case 2630:	// �u���[�V���K����
		mes "�����A�_�X���������ȁB";
		mes "�������ɋM�l�̑��ݎ��̂����ށB";
		mes "�A�������ĖY���ȁB";
		break;
	case 2629:	// ���M���M�����h
		mes "�������ɏd�X�����Ќ���������B";
		mes "���Ă��邾���ł����|�����ȁB";
		mes "�A�������ĖY���ȁB";
		break;
	case 2410:	// �X���C�v�j�[��
		mes "�����A�H�����y�����I�@�����Ă�";
		mes "�قƂ�Ǐd���������Ȃ����낤�B";
		mes "�A�������ĖY���ȁB";
		break;
	case 1530:	// �~�����j�[��
		mes "�����ڂ�����������Ƃ�����";
		mes "�y�񂶂�ȁI�@���̃~�����j�[�����";
		mes "�D�ꂽ����͂��̐��ɑ��݂��Ȃ��B";
		mes "�����āA�����ĖY���ȁB";
		break;
	}
	mes "��͎����l��I�Ԃ̂����B";
	close2;
	warp "prontera.gat",156,325;
	end;
OnTimer10000:
	announce "�O�����u���e�B: �M�l�ɗ^����ꂽ���Ԃ͍�����10�����I�@���������Ă����I",0x9;
	end;
OnTimer610000:
	announce "�O�����u���e�B: �x���I�@���̓z�ɉ���Ƃɂ���B",0x9;
	end;
OnTimer612000:
	areawarp "que_god01.gat",150,60,158,89,"prontera.gat",156,324;
	areawarp "que_god01.gat",136,90,173,108,"prontera.gat",156,324;
	areawarp "que_god01.gat",136,109,173,127,"prontera.gat",156,324;
	end;
OnTimer615000:
	stopnpctimer;
	enablewaitingroomevent "cquegod";
	end;
}