# DEMO�����ο���ʵ�ʿ�������Ҫ��Ͼ���ҵ�񳡾��޸�ʹ��
#
# ���л���:jdk1.6������
# ���渶2.0demoʹ��ǰ�ض�

# ֱ������demo��������(eclipseֱ�ӵ��빤�̼���):
1������ȷ��zfbinfo.properties�����ļ��Ƿ����������
2������Main.java�е�main����

# �������̻�ϵͳ��������(��maven���̽ṹΪ��):
1������javaĿ¼�µ�Main.java����DemoHbRunner.java,�����Ҫ���ɽ��ױ��Ͻӿڣ���ϵͳ��Դ����Ŀ¼
2����libĿ¼������jar�ļ������ϵͳ��libĿ¼�����û��alipay-trade-sdk.jar(��jar�������˵��渶�����߼��ͽ��ױ��Ͻӿ�)����TradePaySDK����Ϊ��jar��
3������resourcesĿ¼�µ������ļ���ϵͳ��classpath��Ŀ¼
4����ϵͳ����Ŀ������Main������ȷ�ϼ�������
5��ϵͳ��ʹ��main�����еĵ������������̻���ϵͳ����

Q:ɨ��֧����ͳһ�µ�+JSAPI��������̨֧����֧���ɹ��첽֪ͨ��δ���
1���̻���Ҫ��֤��֪ͨ�����е�out_trade_no�Ƿ�Ϊ�̻�ϵͳ�д����Ķ�����
2���ж�total_amount�Ƿ�ȷʵΪ�ö�����ʵ�ʽ����̻���������ʱ�Ľ�
3��У��֪ͨ�е�seller_id������seller_email) �Ƿ�Ϊ�ñʽ��׶�Ӧ�Ĳ�������һ���̻������ж��seller_id/seller_email��
4����֤�ӿڵ��÷���app_id����

# ���ױ��Ͻӿڳ�������
https://doc.open.alipay.com/doc2/detail.htm?spm=0.0.0.0.yzagzo&treeId=26&articleId=103903&docType=1

### ���渶2.0demo����ṹTradePayDemo ###
src
������ main
    ������ java
    ��   ������ com
    ��       ������ alipay
    ��           ������ demo
    ��               ������ trade
    ��                   ������ DemoHbRunner.java  # ���ױ��������ռ����ķ���ʵ�֣�������뽻�ױ��Ͻӿڣ��ο�����ʵ�֣����òο�Main����
    ��                   ������ Main.java          ######## ���渶2.0���÷��� ########
    ������ resources
    ��   ������ zfbinfo.properties  # �����ļ�������Main����֮ǰ��ȷ�������ļ��Ƿ�����ȷ����
    ������ webapp
        ������ WEB-INF
        ��   ������ lib  # �������
        ��   ��   ������ alipay-sdk-java20151021120052-source.jar
        ��   ��   ������ alipay-sdk-java20151021120052.jar
        ��   ��   ������ commons-codec-1.10.jar
        ��   ��   ������ alipay-trade-sdk.jar              # TradePaySDKģ�鴴�����ɵ�lib
        ��   ��   ������ commons-configuration-1.10.jar
        ��   ��   ������ commons-lang-2.6.jar
        ��   ��   ������ commons-logging-1.1.1.jar
        ��   ��   ������ core-2.1.jar
        ��   ��   ������ gson-2.3.1.jar
        ��   ��   ������ hamcrest-core-1.3.jar
        ��   ������ web.xml
        ������ images
        ��   ������ alipay.gif
        ��   ������ new-btn-fixed.png
        ������ index.html            # web��ʽ���õ��渶����ҳ
        ������ trade_pay.jsp         # ���渶2.0����֧��web���棬���ʺ�Main����������֧������һ��
        ������ trade_precreate.jsp   # ���渶2.0Ԥ�µ�web���棬���ʺ�Main������Ԥ�µ�����һ��
        ������ trade_query.jsp       # ���渶2.0��ѯweb���棬���ʺ�Main�����в�ѯ����һ��
        ������ trade_refund.jsp      # ���渶2.0�˻����棬���ʺ�Main�������˻�����һ��

### ���渶2.0sdk����ṹTradePaySDK ###
src
������ main
    ������ java
    ��   ������ com
    ��       ������ alipay
    ��           ������ demo
    ��               ������ trade
    ��                   ������ config
    ��                   ��   ������ Configs.java    # �����ļ�,����properties�ļ�
    ��                   ��   ������ Constants.java  # ��������
    ��                   ������ model
    ��                   ��   ������ ExtendParams.java  # ��չ����
    ��                   ��   ������ GoodsDetail.java
    ��                   ��   ������ TradeStatus.java
    ��                   ��   ������ builder  # ���渶2.0�����
    ��                   ��   ��   ������ AlipayHeartbeatSynContentBuilder.java    # �����Ͻӿ�����bizContent�ṹ��
    ��                   ��   ��   ������ AlipayTradePayContentBuilder.java        # ����֧������bizContent�ṹ��
    ��                   ��   ��   ������ AlipayTradePrecreateContentBuilder.java  # ɨ��֧��(������ά��)����bizContent�ṹ��
    ��                   ��   ��   ������ AlipayTradeQueryCententBuilder.java      # ���渶2.0��ѯ����bizContent�ṹ��
    ��                   ��   ��   ������ AlipayTradeRefundContentBuilder.java     # ���渶2.0�˿�����bizContent�ṹ��
    ��                   ��   ��   ������ RequestBuilder.java    # ���������
    ��                   ��   ������ hb  # �����Ͻӿ�����ģ��
    ��                   ��   ��   ������ EquipStatus.java           # ��������ʱ���豸״̬ö��
    ��                   ��   ��   ������ EquipStatusAdapter.java
    ��                   ��   ��   ������ ExceptionInfo.java         # �쳣��Ϣö��
    ��                   ��   ��   ������ ExceptionInfoAdapter.java
    ��                   ��   ��   ������ HbStatus.java              # ����״̬
    ��                   ��   ��   ������ PosTradeInfo.java          # ������ͬ��ʹ�õĽ��׽ṹ��
    ��                   ��   ��   ������ Product.java               # �����������豸��������֧������Ʒ
    ��                   ��   ��   ������ SysTradeInfo.java          # ϵͳ��ͬ��ʹ�õĽ��׽ṹ��
    ��                   ��   ��   ������ TradeInfo.java             # ���׽ṹ��ӿڣ���������ϵͳ�̽��׽ṹ��ͻ����̽��׽ṹ��Ĳ�ͬ
    ��                   ��   ��   ������ TradeInfoAdapter.java
    ��                   ��   ��   ������ Type.java                  # �����������豸����ö��
    ��                   ��   ������ result  ���渶2.0Ӧ���
    ��                   ��       ������ AlipayF2FPayResult.java        # ���渶2.0֧��Ӧ��
    ��                   ��       ������ AlipayF2FPrecreateResult.java  # ���渶2.0Ԥ�µ���������ά�룩Ӧ��
    ��                   ��       ������ AlipayF2FQueryResult.java      # ���渶2.0��ѯӦ��
    ��                   ��       ������ AlipayF2FRefundResult.java     # ���渶2.0�˻�Ӧ��
    ��                   ��       ������ Result.java
    ��                   ������ service
    ��                   ��   ������ AlipayMonitorService.java   # �ṩ���ױ��Ϸ���
    ��                   ��   ������ AlipayTradeService.java     # �ṩ���渶2.0����
    ��                   ��   ������ impl
    ��                   ��       ������ AbsAlipayService.java        # ����ʵ��������࣬���еķ���ʵ����ĸ���
    ��                   ��       ������ AbsAlipayTradeService.java   # ���渶����ʵ��������࣬�����˵��渶2.0Ԥ�µ�����ѯ���˻����׵ķ�װ
    ��                   ��       ������ AlipayMonitorServiceImpl.java       # ���ױ��Ϸ������ʵ��
    ��                   ��       ������ AlipayTradeServiceImpl.java         # ���渶2.0����ʵ�֣����ṩ���ױ��Ͻӿڵļ��ɣ�
    ��                   ��       ������ AlipayTradeWithHBServiceImpl.java   # ���渶2.0����ʵ�֣������˽��ױ����߼���
    ��                   ��       ������ hb  # ���ױ����߼���ش���
    ��                   ��           ������ AbsHbRunner.java    # ����Ľ��ױ��������ռ�����ϵͳ�̴����Լ������������Զ����ռ�����,�ο�DemoHbRunner
    ��                   ��           ������ HbListener.java     # ���ױ��ϼ�����ʵ�֣�ÿ��������ɺ󣬽����׺�ʱд�����
    ��                   ��           ������ HbQueue.java        # ���潻�����ݵĶ��У���Ӷ���ÿ��ֻ����1�����ף���ȡ����ÿ�ξ�������30������
    ��                   ��           ������ TradeListener.java  # ���׼����ӿڣ��ڵ��渶���������м�������߼�
    ��                   ������ utils
    ��                       ������ GsonFactory.java  # ʹ����gson���л�
    ��                       ������ Utils.java        # ���﹤����
    ��                       ������ ZxingUtils.java   # ʹ����zxing����ж�ά�������
    ������ lib # �������
        ������ alipay-sdk-java20151021120052-source.jar  # ֧�����ײ�api���õ�sdkԴ��
        ������ alipay-sdk-java20151021120052.jar
        ������ commons-codec-1.10.jar
        ������ commons-configuration-1.10.jar
        ������ commons-lang-2.6.jar
        ������ commons-logging-1.1.1.jar
        ������ core-2.1.jar
        ������ gson-2.3.1.jar
        ������ hamcrest-core-1.3.jar

# DEMO�����ο���ʵ�ʿ�������Ҫ��Ͼ���ҵ�񳡾��޸�ʹ��