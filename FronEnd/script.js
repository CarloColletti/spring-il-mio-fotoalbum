const { createApp } = Vue;

createApp({
    data() {
        return {
            //url per api
            url: "http://localhost:8080/api/v1/",
            //lista foto
            photos: [], //lista foto
        }
    },
    
    methods: {
        async getPhotos() {
            try {
                const response = await axios.get(this.url+"photos");
                this.photos = response.data;
            } catch(error) {
                console.log(error);
            }
        },
        
    },

    created() {
        this.getPhotos();
    }
}).mount('#app');