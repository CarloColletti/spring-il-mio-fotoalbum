const { createApp } = Vue;

createApp({
    data() {
        return {
            //url per api
            url: "http://localhost:8080/api/v1/",
            //lista foto
            photos: [],
            // Input di ricerca dell'utente
            keyword: "",
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

        filterPhotos() {
            if (this.keyword === "") {
                return this.photos; // Restituisci tutte le foto se la keyword è vuota
            } else {
                const searchTerm = this.keyword.toLowerCase();
                return this.photos.filter((photo) =>
            photo.title.toLowerCase().includes(searchTerm)
            )}
        }
        
    },

    created() {
        this.getPhotos();
    }
}).mount('#app');