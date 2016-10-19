# BaseActivity
基础类的总结
#功能
继承了BaseActivity之后，将拥有以下功能：    
1、TAG：显示当前Activity类名的TAG，不用再自己定义了    
2、showToast：一个点击多次，仍然会马上消失的Toast  
（PS：直接使用Toast.makeText(this, s, Toast.LENGTH_SHORT).show();并且多次点击的时候，会出现长时间不消失问题）  
3、savedInstanceState：初始化高德地图的时候可能会用上  
#Toast演示
也许会解开你的疑惑吧  
![Toast演示](https://github.com/SavinoYu/BaseActivity/blob/master/gif/Toast.gif)
